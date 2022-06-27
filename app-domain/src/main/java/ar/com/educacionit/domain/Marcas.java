package ar.com.educacionit.domain;

public class Marcas {

	private Long id;
	private String marca;
	private Long habilitada;//1 o 0
	private String codigo;
	
	public Marcas(Long id, String marca, Long habilitada, String codigo) {
		this.id = id;
		this.marca = marca;
		this.habilitada = habilitada;
		this.codigo = codigo;
	}
	
	
	public Marcas(String marca, Long habilitada, String codigo) {
		super();
		this.marca = marca;
		this.habilitada = habilitada;
		this.codigo = codigo;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Long getHabilitada() {
		return habilitada;
	}
	public void setHabilitada(Long habilitada) {
		this.habilitada = habilitada;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Marcas [id=" + id + ", marca=" + marca + ", habilitada=" + habilitada + ", codigo=" + codigo + "]";
	}
	
	
	
	
}
