package clase8.opp.herencia;

public class Persona {
	
	//atributos
	private String nombre;
	protected String apellido;
	public String colorpelo;
	public final int cantidadOrejas = 2; //como constante
	
	
	//constructor
	public Persona(String nombre, String apellido, String colorpelo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.colorpelo = colorpelo;
	}
	
	public final int getCantidadOjo() {
		return 2;
	}
	
	//get/set
	//alt+shift+s
	
	//metodos
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
	public String getColorpelo() {
		return colorpelo;
	}
	public void setColorpelo(String colorpelo) {
		this.colorpelo = colorpelo;
	}
	
	
	public void detalle() {
		System.out.println(this.toString());
	}

	//metodo es del Object, pero persona le cambia el comportamiento
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", colorpelo=" + colorpelo + "]";
	}
	
	//public abstract void detallar();//no esta implementado = el/los hijos deben implementar el comportamiento
	
	

}
