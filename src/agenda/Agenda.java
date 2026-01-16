package agenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

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
			// si coincid el id del contacto, modifica su telefono y devuelve true
			if (c.getId().equals(idBuscar)) {
				c.setTelefono(nuevoTelefono);
				return true;
			}
			
		}
		
		return false;
	}
	
	

	// --- Intento de hashmap ---
	
	public void empresasSector() {
		
		// Creamos un hashmap que contendrá un string que es el nombre del sector y el numero de veces que aparece
		HashMap<String, Integer> conteo = new HashMap<>();
		
		// recorremos toda la lista de contactos mirando contacto por contacto
		for (Contacto c : listaContactos) {
			
			// revisamos si el contacto es empresa
			if (c instanceof Empresa) {
				
				// transformamos contacto de vuelta a empresa, obtenemos su sector y lo almacenamos
				String sector = ((Empresa) c).getSector();
				
				// Si en el hashmap ya existe la palabra almacenada en sector (el sector de la empresa)
				if (conteo.containsKey(sector)) {
					
					conteo.put(sector, conteo.get(sector) + 1);
				} else {
					// si no, mete en conteo, el sector y un 1 para empezar el conteo
					conteo.put(sector, 1);
				}
			}
		}
		
	}
	
	
}
