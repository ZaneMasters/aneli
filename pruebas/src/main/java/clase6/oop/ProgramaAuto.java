package clase6.oop;

public class ProgramaAuto {

	public static void main(String[] args) {

		//instanciar un objeto de la clase auto
		//o para iniciarlizar
		//Ctrl+shift+i
		
		Auto miClio = null;
		
		miClio = new Auto("clio","mio",178);//constructor
		miClio.detalleAuto();
		
		miClio.encender();//f5
		miClio.detalleAuto();
		
		miClio.acelerar();
		miClio.detalleAuto();
		
		
		miClio.apagar();//f6
		miClio.detalleAuto();
		
		miClio = null;
		//miClio.detalleAuto();//falla
	}//f8

}
