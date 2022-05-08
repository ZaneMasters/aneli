package ejercicio.adicional.semana9;

public class DatosDBMemoria {
 
	Materia iwi = new Materia();
	Alumno awa = new Alumno();
	
	String[] estudiantes = {awa.Nombre[0]+" "+awa.Apellido[0],awa.Nombre[1]+" "+awa.Apellido[1],awa.Nombre[2]+" "+awa.Apellido[2],awa.Nombre[3]+" "+awa.Apellido[3]};
	String[] materias = {iwi.materia[0],iwi.materia[1],iwi.materia[2],iwi.materia[3]};
	
	String[] Datos =  new String[3];
	String[]estudiante1=new String[4];
	String[]estudiante2=new String[4];
	String[]estudiante3=new String[4];
	String[]estudiante4=new String[4];
	
	
	int i=0;
	public void DatosDBMemoria1(int idestudiante, int idmateria) {
		
	if(idestudiante==0) {
		estudiante1[0]=estudiantes[0];
		estudiante1[1]=" "+iwi.materia[idmateria];
	}
	if(idestudiante==1) {
		estudiante2[0]=estudiantes[1];
		estudiante2[1]=" "+iwi.materia[idmateria];
	}
	if(idestudiante==2) {
		estudiante3[0]=estudiantes[2];
		estudiante3[1]=" "+iwi.materia[idmateria];
	}
	if(idestudiante==3) {
		estudiante4[0]=estudiantes[3];
		estudiante4[1]=" "+iwi.materia[idmateria];
	}
	}
	
	public void propiedades(int est) {
		if(est==0) {
			System.out.println("El estudiante: "+estudiante1[0]+" "+estudiante1[1]);
		}
		if(est==1) {
			System.out.println("El estudiante: "+estudiante2[0]+" "+estudiante2[1]);
		}
		if(est==2) {
			System.out.println("El estudiante: "+estudiante3[0]+" "+estudiante3[1]);
		}
		if(est==3) {
			System.out.println("El estudiante: "+estudiante4[0]+" "+estudiante4[1]);
		}
	}
}
