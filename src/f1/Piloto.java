package f1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

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
