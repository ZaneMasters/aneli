package clase6.oop;

public class DB {
	
	//NO TIENE ATRIBUTOS
	
	//no tiene constructor
	
	//solo tiene un metodo
	Articulo[] consultar(String claveConsultada) {
		//simular datos
		
		Articulo res = new Articulo("Figura de marvel avengers titan hero", 35940, "http://imagen.jpg",true,10,true);
		Articulo res2 = new Articulo("Figura de Accion de marvel avengeers 6 pulgadas", 35940, "http://imagen2.jpg",false,2,true);
		
		//?
		Articulo[] resultados = new Articulo[] {res, res2};//length 2 , 0 y 1
		return resultados;
	}
}
