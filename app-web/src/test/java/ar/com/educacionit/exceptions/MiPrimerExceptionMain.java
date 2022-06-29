package ar.com.educacionit.exceptions;

import ar.com.educacionit.domain.Categorias;
import ar.com.educacionit.domain.Socios;

public class MiPrimerExceptionMain {

	public static void main(String[] args) {

		//jvm > errores unchecked: el programador no debe preocuparse
		
		int a = 10;
		int b = 0;
		int c = a/b; //java.lang.ArithmeticException
		//corta el programa
		System.out.println(c);
		
		//ejemplo con objetos
		Socios s = null; //solucion Socios s = new Socios();
		Long id = s.getId(); //Java.lang.NullPointerException
		System.out.println(id);
		
		
		//herencia / interfaces
		Object socio = new Socios();
		Categorias cat = (Categorias)socio;// java.lang.ClassCastException
		
		System.out.println(cat.getCodigo());
		/******************************/
		
		//jvm > obliga al programador a controlar las "cheked exception"
		//no deja compilar el programa
		
		try {
			//ok
			metodoConException(10);
		}catch(Exception nombre) {
			//error
			nombre.printStackTrace();
		}
		
	}
	
	public static void metodoConException(int valor) throws Exception{
		if(valor == 0) {
			//lanzo una nueva Exception
			throw new Exception("el valor es erroneo");
		}
	}

}
