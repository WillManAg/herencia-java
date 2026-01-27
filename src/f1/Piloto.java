package f1;

import java.util.ArrayList;

public class Piloto {
	
	private int numeroLicencia;
	private String nombre;
	private String nacionalidad;
	private ArrayList<Integer> puntos;
	
	public Piloto(int numeroLicencia, String nombre, String nacionalidad) {
		this.numeroLicencia = numeroLicencia;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.puntos = new ArrayList<>();
	}

}
