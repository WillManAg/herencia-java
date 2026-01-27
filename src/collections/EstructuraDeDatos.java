package collections;

public abstract class EstructuraDeDatos {

	// los protegemos para que los hijos lo puedan usar solamente
	protected int[] datos;
    protected int contador; 

    // el constructor genera el array datos con el número máximo que le demos
    public EstructuraDeDatos(int max) {
        this.datos = new int[max];
        // para empezar no tiene datos
        this.contador = 0; 
    }
    
    // si el contador tiene un número igual que el largo total del array es que está lleno
    public boolean estaLlena() {
        return contador == datos.length;
    }

    // si el contador sigue a 0 es que está vacía
    public boolean estaVacia() {
        return contador == 0;
    }

    // introducimos un número
    public boolean introducir(int numero) {
    	// revisamos si está llena
        if (!estaLlena()) {
        	// iguala la posición que tiene el contador al número introducido y añade después añade una posición al contador, devuelve true
            datos[contador] = numero;
            contador++;
            return true;
        }
        return false;
    }

    public abstract int extraer();
    
}
