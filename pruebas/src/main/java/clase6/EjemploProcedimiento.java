package clase6;

public class EjemploProcedimiento {

	public static void main(String[] args) {
		
		//invocar el procedimiento
		saludar("como estas?");
		
		responder("bien, gracias!");
		
		//calcular la suma de dos variables
		int a = 10;
		int b = 20;
		//int c = a + b;
		//asignar el valor de retorno de la funcion a una variable tipo int
		int c = sumar(a,b);
	}
	
	static int sumar(int a, int b) {
		return a + b;
	}
	
	private static void responder(String bien) {
		System.out.println(bien);
	}

	//un procedimiento
	static void saludar(String saludo) {
		System.out.println("hola: " + saludo );
	}

}
