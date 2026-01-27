package collections;

public class Fila extends EstructuraDeDatos {

	public Fila(int max) {
		super(max);
	}
	
	@Override
	public int extraer() {
		
		int extraer = datos[contador];
		
		contador --;
		
		return extraer;
	}

}
