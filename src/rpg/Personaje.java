package rpg;

public abstract class Personaje {

	protected int salud;
	protected int ataque;
	protected int defensa;
	
	public Personaje(int salud, int ataque, int defensa) {

		this.salud = salud;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	@Override
	public String toString() {
		return "Personaje [salud=" + salud + ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}

}
