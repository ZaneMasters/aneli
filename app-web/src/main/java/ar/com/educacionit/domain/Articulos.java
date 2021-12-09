package ar.com.educacionit.domain;

import java.util.Date;

public class Articulos {

	private long id;
	private String titulo;
	private Date fechaCreacion;
	private String codigo;
	private Double precio;
	private Integer stock;
	private Long marcaId;
	private Long categoriaId;
	
	//hacia la db
	public Articulos(String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock, Long marcaId,
			Long categoriaId) {
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}
	
	
    //desde la db
	public Articulos(long id, String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock,
			Long marcaId, Long categoriaId) {
		this.id = id;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}
	
	//constructor
	//alt+shift+s
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public String getPrecio(String pattern) {
		//##,###,00
		return this.precio.toString();
	}


	public String getTitulo() {
		return titulo;
	}
	
	public String getTitulo(boolean isUpperCase) {
		if(isUpperCase) {
			return this.titulo.toUpperCase();
		}else {
			return this.titulo;
		}
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public Long getMarcaId() {
		return marcaId;
	}


	public void setMarcaId(Long marcaId) {
		this.marcaId = marcaId;
	}


	public Long getCategoriaId() {
		return categoriaId;
	}


	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}


	public long getId() {
		return id;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", codigo=" + codigo
				+ ", precio=" + precio + ", stock=" + stock + ", marcaId=" + marcaId + ", categoriaId=" + categoriaId
				+ "]";
	}
	
	//get/set
	//toString
	
	
	
	
}
