package clase4;

public class CicloWhile {

	public static void main(String[] args) {

		short[] edades = new short[] {10,5,25};
		
		//defino i por fuera
		
		int i=0;
		
		//0 < 3 ? SI
		//0 < 3 ? SI
		//0 < 3 ? SI
		//3 < 3 ? NO
		while(i < edades.length) {
			System.out.println("pos:" + i + ",val:" + edades[i]);
			i++;
			//0
		}
		
		System.out.println("------------------------------");
		
		i = edades.length - 1;
		
		while(i>=0) {
			System.out.println("pos:" + i + ",val:" + edades[i]);
			i--;
		}
		System.out.println("FIN");
	}

}
