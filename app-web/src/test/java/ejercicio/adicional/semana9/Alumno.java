package ejercicio.adicional.semana9;

import java.util.Objects;

public class Alumno {

	private int matricula;
	private String nombre;
	private String apellido;
	
	public Alumno(int matricula,String nombre, String apellido) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.apellido = apellido;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return matricula == other.matricula;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	//String[] Nombre = {"Angel","Carlos","Elisa","Maria"};
	
	//String[] Apellido = {"Rodriguez","Vargas","Sierra","Velez"};
	
	
}
