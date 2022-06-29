package clase8.opp.herencia;

public final class Director extends Persona{

	private Integer empACargo;

	public Director(String nombre, String apellido, String colorpelo, Integer empACargo) {
		super(nombre, apellido, colorpelo);
		this.empACargo = empACargo;
	}

	public Integer getEmpACargo() {
		return empACargo;
	}

	public void setEmpACargo(Integer empACargo) {
		this.empACargo = empACargo;
	}
	
	public void detalle() {
		super.detalle();
		System.out.println("Empleados a cargo: " + this.getEmpACargo());
	}
	
	public static void delegar(Empleado empleado, String tarea) {
		empleado.detalle();
		System.out.println("Ejecutando tarea delegada:" + tarea);
		
	}

	
}
