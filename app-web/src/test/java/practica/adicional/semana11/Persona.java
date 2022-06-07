package practica.adicional.semana11;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.management.RuntimeErrorException;

public class Persona {

	private ILengua idiomaNativo;
	private Set<ILengua> otros;
	
	private Map<Class, ILengua> idiomas; 
	
	private String nombre;
	private String apellido;
	
	public Persona(ILengua idiomaNativo, String nombre, String apellido) {	
		this.idiomaNativo = idiomaNativo;
		this.nombre = nombre;
		this.apellido = apellido;
		
		this.otros = new HashSet<>();
		this.idiomas = new HashMap<>();
		
		idiomas.put(idiomaNativo.getClass(),idiomaNativo);
	}
	
	//puede apredender un nuevo idioma
	public void aprender(ILengua nuevoIdioma) {
		//nulo
		if(nuevoIdioma == null) {
			throw new RuntimeException("idioma invalido o nulo");
		}
		
		if(otros.contains(nuevoIdioma)) {
			throw new RuntimeException("IDIOMA YA APRENDIDO");
		}
		
		this.aprenderIdioma(nuevoIdioma);		
	}
	
	public void decir() {
		Collection<ILengua> idiomas = this.obtenerIdiomas();
		for(ILengua idioma : idiomas) {
			idioma.decir();
		}
	}
	
	public void decirEn(ILengua idioma) {
		//¿como valido?
		//mapa?
		if(this.idiomas.containsKey(idioma.getClass())) {
			ILengua idiomaAux =  this.idiomas.get(idioma.getClass());
			idiomaAux.decir();
		}else {
			throw new RuntimeException(this.nombre + " no habla " + idioma.getClass().getSimpleName());
		}
	}
	
	private Collection<ILengua> obtenerIdiomas() {
		return this.idiomas.values();
	}
	
	private void aprenderIdioma(ILengua nuevoIdioma) {
		//logica adicional
		this.otros.add(nuevoIdioma);
		this.idiomas.put(nuevoIdioma.getClass(), nuevoIdioma);
	}
}
