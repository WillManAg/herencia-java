package interfaces;

public class Cola implements EstructuraDeDatos {
    private int[] datos;
    private int contador;

    public Cola(int max) {
        this.datos = new int[max];
        this.contador = 0;
    }

    @Override
    public boolean introducir(int numero) {
        if (!estaLlena()) {
            datos[contador] = numero;
            contador++;
            return true;
        }
        return false;
    }

    @Override
    public int extraer() {
        if (estaVacia()) return -1;
        
        int devolver = datos[0];
        for (int i = 0; i < contador - 1; i++) {
            datos[i] = datos[i + 1];
        }
        contador--;
        return devolver;
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