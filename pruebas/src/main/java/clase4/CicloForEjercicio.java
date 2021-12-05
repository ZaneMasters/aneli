package clase4;

import java.util.Scanner;

public class CicloForEjercicio {

	public static void main(String[] args) {

		//solicitar al usuario la cantidad de registros
		//cargar en un vector de enteros los datos ingresados por el usuario
		//contar la cantidad de numeros pares
		//contar la cantidad de numeros impares
		//sumar los numeros pares
		//sumar los numeros impares
		//promedio de los valores ingresados
		
		int cantidadRegistros;
		int[] vector;
		int cantPares=0;
		int cantImpares=0;
		int sumaPares=0;
		int sumaImpares=0;
		double promedio;
		
		//0 definir el tamaño del vector
		//1 carga de datos
		//2 procesamiento
		
		Scanner teclado = new Scanner(System.in);
		//ALT + FLECHA ARRIBA O ABAJO PARA MOVER LINEAS
		do {
			System.out.println("Ingrese la cantidad de registros a procesar:");
			cantidadRegistros = teclado.nextInt();//-1
		}while(cantidadRegistros <= 0);
		
		
		vector = new int[cantidadRegistros];
		
		//carga de datos
		for(int i=0; i < cantidadRegistros; i++) {
			System.out.println("Ingrese un dato:");
			int datoleido = teclado.nextInt();
			vector[i] = datoleido;
		}
		
		//procesamiento
		//for/while/dowhile/foreach
		
		for(int dato : vector) {
			if(dato % 2 == 0) {//es par?
				cantPares++;
				sumaPares +=dato;
			}else {
				cantImpares++;
				sumaImpares += dato;
			}
		}
		
		//ctrl+shift+i------- en el debug solo para ejecutar una linea con cambios
		promedio = (double)(sumaImpares+sumaPares)/(cantImpares+cantPares);
		
		System.out.println(java.util.Arrays.toString(vector));
		
		//mostrar los datos calculados
		
		System.out.println("Cantidad de registros:"+ cantidadRegistros);
		System.out.println("Cantidad de pares:"+ cantPares);
		System.out.println("Cantidad de impares:"+cantImpares);
		System.out.println("Suma de pares:"+sumaPares);
		System.out.println("Suma de impares:"+sumaImpares);
		System.out.println("Promedio:"+promedio);
		
		teclado.close();
		
		
	}

}
