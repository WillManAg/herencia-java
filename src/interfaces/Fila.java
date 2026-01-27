package interfaces;

public class Fila implements EstructuraDeDatos {

	private int[] datos;
    private int contador;

    public Fila(int max) {
        this.datos = new int[max];
        this.contador = 0;
    }
    
    @Override
    public boolean introducir(int numero) {
        if (!estaLlena()) {
            datos[contador++] = numero;
            return true;
        }
        return false;
    }

    @Override
    public int extraer() {
        if (estaVacia()) {
            return -1; 
        }

        int extraer = datos[contador - 1];

        contador--;

        return extraer;
    }
	
	@Override
    public boolean estaVacia() { 
    	return contador == 0; 
    }

    @Override
    public boolean estaLlena() { 
    	return contador == datos.length; 
    }

}