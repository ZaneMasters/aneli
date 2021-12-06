package clase5;

public class Ejercicio {

	public static void main(String[] args) {

		// ==
		//Si se definen variables como objetos
		String edad = new String("10");
		String edad1 = new String("10");
		
		if(edad.equals(edad1)) {
			System.out.println("son iguales");
		}else {
			System.out.println("son distintos");
		}
		
	}

}
