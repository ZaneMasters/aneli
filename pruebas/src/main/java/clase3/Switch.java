package clase3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		
		// ingresar una opcion
		// si es 1 => alta
		// si es 2 => baja
		// si es 3 => modi
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese opcion:"
				+ "1 - alta  "
				+ "2 - baja  "
				+ "3 - modif ");
		int opcion = teclado.nextInt(); //lectura de un entero
		
		/*
		if(opcion == 1) {
			System.out.println("alta");
		}else if(opcion == 2) {
			System.out.println("baja");
		}else if(opcion == 3) {
			System.out.println("modif");
		}else {
			// ni 1,2 ni 3
			System.out.println("ninguna");
		}
		teclado.close();
		*/
		
		
		//switch
		switch(opcion) {
		case 1:
			System.out.println("alta");
			System.out.println("ingrese nombre:");
			String nombre = teclado.next(); //lectura de string
			System.out.println("Ha ingresado: " + nombre);

			break;
		case 2:
			System.out.println("baja");
			break;
		case 3:
			System.out.println("modif");
			break;
			default:
				System.out.println("ninguna en case");
				break;
		}
		teclado.close();
	}

}
