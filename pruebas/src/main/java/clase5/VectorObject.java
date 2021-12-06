package clase5;

public class VectorObject {

	public static void main(String[] args) {

		// la base de todos los tipos de datos en java
		Object edad = 10;
		Object nombres = "catlos";
		Object flag = true;
		Object letra = 'a';
		
		
		Object[] datos = new Object[] {edad,nombres,flag,letra};
		
		//determinar que datos son de tipo boolean ???
		
		for(Object dato: datos) {
			if(dato instanceof Boolean) {
				//tipos de datos primitivos
				//byte < short < int < long < float < double
				
				//wrapper
				//Byte, Short, Integer, long, Float, Double
	
				Integer a1 = 25;
				
				String valor = "15";
				a1 = Integer.parseInt(valor);
				//casteo
				boolean aux = (Boolean)dato;
				System.out.println("Encontre !!!" + aux);
				
			}
		}
		
	}

}
