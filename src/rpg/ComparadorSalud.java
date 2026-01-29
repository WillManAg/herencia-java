package rpg;

import java.util.Comparator;

public class ComparadorSalud implements Comparator<Arquero> {
	
	@Override
	public int compare(Arquero p1, Arquero p2) {
		return Integer.compare(p2.getSalud(), p1.getSalud());
	}

}
