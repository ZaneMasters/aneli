package clase8.opp.herencia;

public class CineMain {
	
	public static void main(String[] args) {
		
		/*
		//persona es una instancia de persona
		Persona persona = new Persona("persona1","apellido1","negro");
		//empleado es una instancia de empleado
		Persona empleado = new Empleado("empleado1","apellidoemp1","rojo",1);
		Persona efectivo = new Efectivo("nombre efectivo1","apellido efectivo1","rubio",1);
		Persona contratado = new Contratado("nombre contratado1","apellido contratado1","azul",1,6);
		
		Persona director = new Director("nombre director","apellido director","negro",10);
		
		//todas las personas puede ir al cine
		Persona[] personas = new Persona[5];
		personas[0] = persona;
		personas[1] = empleado;
		personas[2] = efectivo;
		personas[3] = contratado;
		personas[4] = director;
		
		//recorrer las personas que entrar al cine y quiero saber si son un Director
		
		for(Persona aux:personas) {
			
			//con aux tengo acceso a todos los metodos public de Persona
			
			aux.detalle();
			
			if(aux instanceof Director) {
				//toma al director que esta dentro de la persona
				Director d = (Director)aux;
				
				
				System.out.println("Director: tiene " + d.getEmpACargo() + " a cargo y va a una silla especial!!!");
			}
		}*/
		Empleado empleado = new Empleado("empleado1","apellidoemp1","rojo",1);
		
		//no hace falta crear un director porque el metodo delegar
		//no le permite a uns instancia 
		
		
	}

}
