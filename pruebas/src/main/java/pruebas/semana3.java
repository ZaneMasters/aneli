package practicaadicionalsemana3;

import java.util.Scanner;

public class semana3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese Cantidad de alumnos:");
		
		int a = teclado.nextInt();//leer un dato entero
		
		int[] nexamen = new int[a];
		String[] nombres = new String[a];
		float[] nota = new float[a];
		String[] apellidos = new String[a];
		int[]promocion = new int[a];
		int[]repetir = new int[a];
		int alto=0;
		int bajo=0;
		boolean aux=true;
				
		for(int i=1;i<=a;i++) {
			aux=true;
			System.out.println("Inserte el nombre del estudiante "+i);
			nombres[i-1]=teclado.next();
			System.out.println("Inserte el apellido del estudiante "+i);
			apellidos[i-1]=teclado.next();
			System.out.println("Numero de examen:");
			nexamen[i-1]=teclado.nextInt();			
			while(aux) {
				System.out.println("Nota del estudiante "+i);
				nota[i-1] = teclado.nextFloat();
			if(nota[i-1]>=0 && nota[i-1]<=10){
			  	aux=false;
			}else{
				System.out.println("Inserte una nota ente 0 y 10");
			}
			}
		}
		
		for(int i=1;i<=a;i++) {
			//Calificacion alta y baja
			if(i==a) {
				if(nota[i-1]>nota[0]) {
					alto=i-1;
				}
			}else {
			if(nota[i-1]>nota[i])
			{
				alto=i-1;
			}
			}
			
			if(nota[bajo]>nota[i-1])
			{
				bajo=i-1;
			}
			
			
			//Estudiantes que aprueban y repruban
			if(nota[i-1]>=7) {
				promocion[i-1]=i-1;
			}else {
				repetir[i-1]=i-1;
			}
		}
		System.out.println("El estudiante con la nota mayor es: " + nombres[alto] +" "+apellidos[alto]);
		
		System.out.println("El estudiante con la nota mas baja es: " + nombres[bajo] +" "+apellidos[bajo]);
		
		System.out.println("Alumnos que promocionan:");
		for(int i=0;i<a;i++) {
			int aux2=promocion[i];
			System.out.println(nombres[aux2]+apellidos[aux2]);
		}
		
		System.out.println("Alumnos que recursan la materia:");
		for(int i=0;i<a;i++) {
			int aux2=repetir[i];
			System.out.println(nombres[aux2]+apellidos[aux2]);
		}
		
		teclado.close();
	}
}
