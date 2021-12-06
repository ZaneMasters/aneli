package clase5;

import java.util.Arrays;

public class Vectores {

	public static void main(String[] args) {

		//crear vectores
		//1- tipoDatos[] nombre = new tipoDeDatos[] {valor1,valor2...valorn}
		
		//2- tipoDato[] nombre = new tipoDeDato[tamaño}
		
		//crear un vector vacio
		String[] nombres = new String[] {"luz","jose","edwin","carlos","herana","samir","elisa"};//x
		//                                 0      1      2       3         4        5     6        7
		String[] nombresConE = new String[nombres.length];
		
		int j = 0;
		
		int size = nombres.length;// 6 - sabemos el tamaño del vector
		
		//buscar los nombres que inicien con e
		for (int i=0; i < size; i++) {
			String dato = nombres[i];//luz
			
			/*if(dato.substring(0,i) == "e") {
				
			}
			if(dato.charAt(0) == 'e') {
				
			}
			if(dato.indexOf("e") == 0) {// >_=0 sino -1
				
			}*/
			if(dato.startsWith("e")) {
			   nombresConE[j] = dato;
			   j++;
			}
		}
		
		System.out.println(Arrays.toString(nombresConE));
		//con un for recorriendo el vector y un if para comprar si esta null o no
		for (String nombre : nombresConE) {
			if(nombre != null) {
				System.out.println(nombre);
			}
		}
	}

}
