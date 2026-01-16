package herencia1;

public class Main {

	public static void main(String[] args) {
		
		MountainBike montaña1;
		Bicycle bici;
		
		// montaña1 = new MountainBike (1,2,3,4);
		bici = new Bicycle(5,6,7);
		// bici = montaña1;
		
		// forma de saber lo que hay dentro de
		if (bici instanceof MountainBike) {
			System.out.println("Es una bici de montaña");
			// ((MountainBike)bici).setHeight(98); // A esto se le llama 'hacer un cast' para poder usar el metodo de mountainbike en la bici
			
			// también se puede convertir directamente si lo vas a usar muchas veces
			MountainBike m = (MountainBike)bici;
			// m.setHeight(98);
		}
		
		System.out.println(bici);

	}

}
