package practica.adicional.semana11;

import java.util.Scanner;

public class MainIdiomas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		String apellido = "";
		String idiomaStr = "";
		ILengua iidioma; 
		boolean aber=true;
		
		do {
			System.out.println("ingrese nombre");
			nombre = teclado.next();
			
			System.out.println("ingrese apellido");
			apellido = teclado.next();

			
			System.out.println("Ingrese el Idioma Nativo de "+nombre+" "+apellido+": "+"(ING,ESP,ITA)");
			idiomaStr = teclado.next();
			EnumLenguas idiomaEnum = EnumLenguas.valueOf(idiomaStr);
			iidioma = idiomaEnum.getIdioma();
			System.out.println("Idioma nativo de "+nombre+" es "+ iidioma);
			Persona estudiante = new Persona(iidioma,nombre,apellido);
			
			
			iidioma = EnumLenguas.ITA.getIdioma();
			estudiante.aprender(iidioma);
			
			System.out.println("Desea repetir? 1=si 2=no");
			int x = teclado.nextInt();
			if (x==1) {
				aber=true;
			}else
				aber=false;
			
		}while(aber);
		
		teclado.close();
		
	}

	
}
