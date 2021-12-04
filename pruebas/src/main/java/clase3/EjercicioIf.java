package clase3;

public class EjercicioIf {

	public static void main(String[] args) {

		//determinar dado 3 numero, cual es el mayor
		// necesito 3 varriables
		// if 
		// mostrar
		
		double a,b,c;
		a = 11;
		b = 12;
		c = 13;
		//a > b y a > c caso 1
		//b > a y b > c caso 2
		//c > a y c > b 
		//a == b y a == c
		
		if(a > b && a > c) {
			System.out.println(a + "es mayor");
		}
		if(b > a && b > c) {
			System.out.println(b + "es mayor");
		}
		if(c > a && c > b) {
		  System.out.println(c + "es mayor");	
		}
		if (a == b && b == c) {
			System.out.println("iguales");
		}
		// n1 y n2 < n3
		// n1 y n3 < n2
		// n3 y n2 < n1
		if(a == b && a > c) {
			System.out.println(c + " es mayor");
		}else {
			System.out.println(c);
		}
		if(a == c && a > b) {
			System.out.println(a + " es mayor");
		}else {
			System.out.println(b);
		}
		if(b == c && b > a) {
			System.out.println(b + " es mayor");
		}else {
			System.out.println(a);
		}
		
	}

}
