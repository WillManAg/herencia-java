package agenda;

import java.util.ArrayList;

public class Agenda {
	
	// primero creamos el array donde guardaremos los contactos
	private ArrayList<Contacto> listaContactos;
	
	public Agenda() {
		this.listaContactos = new ArrayList<>();
	}
	
	// Método para añadir contacto nuevo al ArrayList
	public void agregarContacto(Contacto nuevo) {
		listaContactos.add(nuevo);
		System.out.println("Contacto añadido correctamente.");
	}
	
	// método para buscar un contacto y comprar su id, si son iguales lo borra y devuelve true
	public boolean eliminarContacto(String idBuscar) {
		// recorremos todo el arraylist
		for (int i = 0; i < listaContactos.size(); i++) {
			// Si obtenemos el contacto i, miramos su id, si esta es igual que idbuscar, removemos contacto i y devolvemos true
			if (listaContactos.get(i).getId().equals(idBuscar)) {
				listaContactos.remove(i);
				return true;
			}
			
		}
		
		return false;
	}
	
	
	public boolean modificarTelefono(String idBuscar, int nuevoTelefono) {
		
		// recorremos toda la lista de contactos y almacenamos cada contacto en c
		for (Contacto c : listaContactos) {
			
			if (c.getId().equals(idBuscar)) {
				c.setTelefono(nuevoTelefono);
				return true;
			}
			
		}
		
		
		return false;
	}

}
