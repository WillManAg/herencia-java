package rpg;

public class Arquero extends Personaje {

	public int rangoAtaque;

	public Arquero(int salud, int ataque, int defensa, int rangoAtaque) {
		super(salud, ataque, defensa);
		this.rangoAtaque = rangoAtaque;
	}

	public int getRangoAtaque() {
		return rangoAtaque;
	}

	public void setRangoAtaque(int rangoAtaque) {
		this.rangoAtaque = rangoAtaque;
	}

	@Override
	public String toString() {
		return "Arquero [rangoAtaque=" + rangoAtaque + ", salud=" + salud + ", ataque=" + ataque + ", defensa="
				+ defensa + "]";
	}
	
}
