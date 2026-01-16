package agenda;

public class Persona extends Contacto {
	
	private String nombre;
	private String apellido;
	
	public Persona(String id, int telefono, String email, String nombre, String apellido) {
		super(id, telefono, email);
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
