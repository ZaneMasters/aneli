package clase8.opp.herencia;

public class Empleado extends Persona{
	
	//atributo propio del empleado
	private Integer id;
	
	
	public Empleado(String nombre,
			String apellido, 
			String colorPelo,
			Integer id) {
	//antes de nacer el empleado, nace la persona
	super(nombre,apellido,colorPelo);//padre
	
	//puedo "setear los atributos propios
	this.id = id;
	}
    //get/set


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	//cambiar el comportamiento del padre (reutilizar lo del padre + lo propio)
	public void detalle() {
		//al padre 
		super.detalle();
		
		//muesta la propio
		System.out.println("Id:" + this.getId());
	}
	
	
	
}
