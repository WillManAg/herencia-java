package agenda;

public class Empresa extends Contacto{
	
	private String direccionPostal;
	private String sector;
	
	public Empresa(String id, int telefono, String email, String direccionPostal, String sector) {
		super(id, telefono, email);
		this.direccionPostal = direccionPostal;
		this.sector = sector;
	}

	public String getDireccionPostal() {
		return direccionPostal;
	}

	public void setDireccionPostal(String direccionPostal) {
		this.direccionPostal = direccionPostal;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	

}
