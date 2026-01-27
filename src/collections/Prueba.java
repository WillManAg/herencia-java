package collections;

public class Prueba {

	public static void main(String[] args) {
		
		Cola datos = new Cola(5);
		
		if (datos.estaVacia()) {
			System.out.println("está vacia");
		}
		
		if(datos.extraer() == -1) {
			System.out.println("Devuelve -1");
		}
		
		datos.introducir(5);
		
		if (!datos.estaVacia()) {
			System.out.println("tiene datos");
		}
		
		datos.introducir(5);
		datos.introducir(5);
		datos.introducir(5);
		datos.introducir(5);
		
		if(datos.estaLlena()) {
			System.out.println("Está llena");
		}

	}

}
