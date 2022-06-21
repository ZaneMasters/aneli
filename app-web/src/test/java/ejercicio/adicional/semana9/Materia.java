package ejercicio.adicional.semana9;

import java.util.Objects;

public class Materia {
	
	private long id;
	private String curso;
	private int turno;
	
	public Materia(long id, String curso, int turno) {
		this.id= id;
		this.curso=curso;
		this.turno=turno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return id == other.id;
	}
	
	
	
	
	
	
	//String[] materia = {"Fisica","Matematicas","Informatica","Ingles"};
	
	//int[] ID = {123,265,348,489};
}
