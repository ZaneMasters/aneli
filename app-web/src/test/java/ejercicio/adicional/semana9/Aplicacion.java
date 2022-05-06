package ejercicio.adicional.semana9;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Menu menu1= new Menu();		
		Alumno lu= new Alumno();
		Materia ma=new Materia();
		boolean opcioncorrecta=true;
		int a=0;
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
		System.out.println("Inserte el numero del estudiante para inscribir materia mostrado acontinuacion:");
		int i=0;
		for (String uwu:lu.Nombre) {
			System.out.println(i+". "+uwu + " "+ lu.Apellido[i]);
			i=i+1;
		}
		int b = teclado.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Inserte el ID de la materia que desea inscribir para el estudiante: " + lu.Nombre[b]+" "+lu.Apellido[b]);
			i=0;
			for (String uwu:ma.materia) {
				System.out.println("ID:"+ma.ID[i]+" "+uwu);
				i=i+1;
			}
			
			opcioncorrecta=true;
			while(opcioncorrecta) {
				int c = teclado.nextInt();
				if(c==123 || c==265 || c==348 || c==489) {
					int aux=0;
					if(c==123)
						aux=1;
					else if(c==265)
						aux=2;
					else if(c==489)
						aux=3;
					else
						aux=4;
					
					System.out.println("El estudiante "+lu.Nombre[b]+" "+lu.Apellido[b]+" quedo inscrito en la materia: "+ma.materia[aux]);
					opcioncorrecta=false;
					break;
				}
				else
					System.out.println("Materia no reconocida, intente poner el ID correcto nuevamente...");
			}
			
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.println("Vuelva prontos");
			break;
		
		
		}
		teclado.close();
	}

}
