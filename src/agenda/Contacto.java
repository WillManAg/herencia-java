package agenda;

public class Contacto {
	
	protected String id;
	protected int telefono;
	protected String email;
	
	public Contacto(String id, int telefono, String email) {
		
		this.id = id;
		this.telefono = telefono;
		this.email = email;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
