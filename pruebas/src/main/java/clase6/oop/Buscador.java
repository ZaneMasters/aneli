package clase6.oop;

public class Buscador {
	
	
	//atributos
	//modificadores
	private String claveBusqueda;
	private Articulo[] resultados;
	
	private Integer cantidadResultados;
	
	//public Integer unAtributo; //NO SE HACE!!!!
	
	//CONSTRUCTOR
	public Buscador(){
		System.out.println("Creando buscador...");
	}
	
	public void buscar() {
		System.out.println("buscando..." + this.claveBusqueda);
		
		//como mi buscador necesita usar un objeto de la clase DB
		//debe instanciar un objeto de dicha clase
		DB db = new DB();
		
		this.resultados = db.consultar(claveBusqueda);
		//invocamos a un metodo interno (privado)
		this.setCantidadResultado(this.resultados.length);
	}
	/*
	void definirClaveBusqueda(String clave) {
		claveBusqueda = clave;
	}
	*/
	
	//ALT+SHIFT+S
	
	private void setCantidadResultado(int cantidad) {
		if(cantidad < 0) {
			this.cantidadResultados = 0;
		}else {
			this.cantidadResultados = cantidad;
		}
	}
	
	
	public Integer getCantidadResultado() {
		if(this.cantidadResultados == null) {
			this.setCantidadResultado(0);
		}
		
		return this.cantidadResultados;
	}
	
	
	
	
	public void mostrarResultados() {
		if(this.resultados.length>0) {
			for(Articulo aux : this.resultados) {
				aux.detalleArticulo();
			}
		}else {
			System.out.println("No hay resultados para " + this.claveBusqueda);
		}
	}

	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}

	public Articulo[] getResultados() {
		return resultados;
	}

}
