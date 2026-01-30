package agenda;

import java.util.Comparator;

public class ComparadorTelefono implements Comparator<Contacto>{
	
	@Override
    public int compare(Contacto c1, Contacto c2) {
		// hacemos  la comparación pero almacenamos el resultado no lo devolvemos de golpe
        int resultado = Integer.compare(c1.getTelefono(), c2.getTelefono());
        
        // comprobamos primero si son iguales, para ordenarlos por id de mayor a menor
        if (resultado == 0) {

            return c2.getId().compareTo(c1.getId());
        }
        // una vez ya comprobado si son o no iguales, ya si devolvemos el resultado
        return resultado;
    }
}
