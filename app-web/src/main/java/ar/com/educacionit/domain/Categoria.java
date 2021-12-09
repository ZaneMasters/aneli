package ar.com.educacionit.domain;

public class Categoria {

	//atributos
	private Long id;
	private String descripcion;
	private String codigo;
	
	public Categoria(Long id, String descripcion, String codigo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	
	public Categoria(String descripcion, String codigo) {
		super();
		this.descripcion = descripcion;
		this.codigo = codigo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", descripcion=" + descripcion + ", codigo=" + codigo + "]";
	}
	
	
	
	//constructor
	//alt+shift+s
	
	
	//metodos
	
	//get/set
	
	
}
