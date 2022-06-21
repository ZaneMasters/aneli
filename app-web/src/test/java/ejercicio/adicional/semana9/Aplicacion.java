package ejercicio.adicional.semana9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import ar.com.educacionit.collections.Cliente;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Alumno> alumnos = new HashSet<>();  
		
		alumnos.add(new Alumno(1234,"carlos","cordova"));
		alumnos.add(new Alumno(5641,"fede","armaldo"));
		alumnos.add(new Alumno(5410,"karen","rojas"));
		alumnos.add(new Alumno(9845,"yeni","rido"));
		
		Set<Materia> materias = new HashSet<>();  
		
		materias.add(new Materia(12345,"Algebra",1));
		materias.add(new Materia(45621,"Ingles",1));
		materias.add(new Materia(87543,"Quimica",1));
		
		//System.out.println(alumnos);
		
		Scanner teclado = new Scanner(System.in);
		Menu menu1= new Menu();		
		boolean opcioncorrecta=true;
		int a=0;
		boolean menues=true;
		String nom="";
		int id=0;
		String ape="";
		
		do {
			while(opcioncorrecta) {
				menu1.menuprincipal();
				
				System.out.println("Seleccione una opcion: ");
				a = teclado.nextInt();
				
		        if (a<1 || a> 4)
		            System.out.println("Opción incorrecta, ingrese nuevamente... ");
		        else {
		        	System.out.println("iGracias por usar este sistema!");
		        	opcioncorrecta=false;
		        	break;
		        }
			}
			System.out.println("===============================================================");

			
			switch (a) {
			case 1:
				
				System.out.println("Inserte estudiante, id, nombre y apellido: ");
				id=teclado.nextInt();
				nom=teclado.next();
				ape=teclado.next();
				
				alumnos.add(new Alumno(id,nom,ape));
				
				System.out.println(alumnos);
				
				Iterator<Alumno> itNombres = alumnos.iterator();
				while(itNombres.hasNext()) {
					Alumno dato = itNombres.next();
					System.out.println("Dato: " + String.valueOf(dato));
				}
			
				break;
			case 2:
				
				System.out.println("Inserte el numero de la matricula del estudiante que quiere elmininar: ");
				id = teclado.nextInt();
				
				itNombres = alumnos.iterator();
				while(itNombres.hasNext()) {
					Alumno nombre = itNombres.next();
					if(nombre.equals(id)) {
						itNombres.remove();
					}
				}
				break;
			case 3:
				System.out.println("Inserte el numero de la matricula del estudiante que buscar: ");
				id = teclado.nextInt();
				
				itNombres = alumnos.iterator();
				while(itNombres.hasNext()) {
					Alumno nombre = itNombres.next();
					if(nombre.equals(id)) {
						System.out.println(nombre);
					}
				}
				
				
				
				break;
			default:
				System.out.println("Vuelva prontos");
				break;
			}
			
			System.out.println("Desea volver a ver el menu principal? 1=si 2=no ");
			int exit=teclado.nextInt();
			if (exit==1) {
				menues=true;
				opcioncorrecta=true;
			}
			else {
				menues=false;
				break;
			}
		}while(menues);
		
		System.out.println("Gracias por usar el sistema...");
		
		teclado.close();
	}
}

