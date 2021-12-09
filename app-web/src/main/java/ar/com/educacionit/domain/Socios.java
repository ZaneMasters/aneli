package ar.com.educacionit.domain;

public class Socios {

	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String direccion;
	private Long paisesId;
	
	public Socios(Long id, String nombre, String apellido, String mail, String direccion, Long paisesId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.direccion = direccion;
		this.paisesId = paisesId;
	}

	public Socios(String nombre, String apellido, String mail, String direccion, Long paisesId) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.direccion = direccion;
		this.paisesId = paisesId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getPaisesId() {
		return paisesId;
	}

	public void setPaisesId(Long paisesId) {
		this.paisesId = paisesId;
	}
	
	
	
	
}
