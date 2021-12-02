package pruebas;

public class Operadores {

	public static void main(String[] args) {
		//ctrl+d>eliminar una linea
		
		/*
		 +
		 -
		 *
		 /
		 */
		
		int edad1 = 10;
		int edad2 = 20;
		int res = edad1 + edad2;
		
		//syso+ctrl+space
		System.out.println("edad1+edad2=" + res);
		
		// aplica a tipos de datos String
		String nombre = "carlos";
		String apellido = "lopez";
		String res1 = nombre + apellido;
		
		System.out.println("nombre+apellido=" + res1);
		
		double alto = 175.5; //defecto de los numero con decimal
		
		//para los float
		float ancho = 205.7F;
		
		//obtener el resultado de una division
		//float < double
		//quedar con el flotante que esta dentro del double
		float resDiv = (float)alto/ancho;
		
		byte valor = -127; // > -128 a 127
		
		// division /
		float div0 = (float)alto / 0;
		
		System.out.println("div 0="+div0);
		
		System.out.println("fin");
		
		int a = 10;
		int b = 5;
		// D |_d_
		// 0%  2 /
		
		//mod %
		int mod = a % b;
		System.out.println(a + "%" + b + "="+mod);
		System.out.println(a + "/" + b + "="+ a/b);
		
		
		System.out.println("-------------------------");
		
		double multi = alto * ancho;
		System.out.println("*" + multi);
		
		//relaciones
		// > < >= <= != TODOS > boolean
		                   //175.5 != 205.5
		
		boolean resAltoAncho = alto != ancho; //true
		System.out.println(alto + "!= " + ancho + " = " + resAltoAncho);
		
		// logicos
		// && AND y > las dos deben ser true
		// || inclusivo OR
		// ! NOT
		// ^ exclusivo XOR
		
		// dia sea martes cond1
		// horario 19:30 cond2
		// comienza el curso cond1 y cond2
		
		boolean esMartes = true;
		boolean horario19 = false;
		boolean curso = esMartes && horario19;
		System.out.println("el valor de verdad de " + esMartes +" && " + horario19 +"="+curso);
		
		int edadAdulto = 18;
		boolean tieneCarnet = true;
		String nombre1 = "jose";
		float altura = 0.75f;
		char letra = 'M';
		
		//puedo conducir si es mayor y tiene carnet
		boolean puedeConducir = (edadAdulto >= 18) && tieneCarnet && (nombre1 == "jose") || (altura > 1.0) && (letra != 'G');
		System.out.println("Puede conducir=" + puedeConducir);
		
		boolean aux = true; // 10 > 01010
		boolean baux = false; //30>  11110
		//------------------------- 10100 > 20
		boolean resAux = aux ^ baux;
		
		byte[] datos = new byte[]{0,1,0,1,0};
		
		System.out.println("XOR resAux="+resAux);
	}

}
