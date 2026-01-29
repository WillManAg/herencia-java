package rpg;

import java.util.Comparator;

public class ComparadorRango implements Comparator<Arquero> {

	@Override
	public int compare(Arquero p1, Arquero p2) {
		return Integer.compare(p1.getRangoAtaque(), p2.getRangoAtaque());
	}
	
}
