package collections;

public class Cola extends EstructuraDeDatos {

    public Cola(int max) {
        super(max);
    }

    @Override
    public int extraer() {
    	// primero reviso si está vacía la cola y devuelve -1 porque no hay datos
        if (estaVacia()) {
            return -1; 
        }
        // la posición 0 en el array datos lo vamos a guardar en extraer
        int extraer = datos[0];
        // hacemos un bucle, isamos contador que está en estructuradedatos pero paramos en el penúltimo
        for (int i = 0; i < contador - 1; i++) {
        	// igualamos el valor en la posición i, con el número almacenado en la siguiente posición
            datos[i] = datos[i + 1];
        }
        // como ahora hay 1 númeor menos porque lo hemos extraido, hay que actualizar la lista 
        contador--;

        // devolvemos el número que teníamos
        return extraer;
    }
}
