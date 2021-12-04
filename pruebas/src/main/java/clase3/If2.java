package clase3;


public class If2 {

	public static void main(String[] args) {
	
		//Ingrese contraseña y usuario
		//si contraseña = "1234" y usuario = admin => "ok"
		// de lo contrario "fail"
		
		String usuario;
		String contrasena;
		
		usuario = "jose";
		contrasena = "12345";
		
		//primer forma
		if (usuario == "admin" && contrasena == "1234")
		{
			System.out.println("ok");
		}else {
		System.out.println("fail");	
		}
		
		//forma anidada
		if (usuario == "admin") {
			if (contrasena == "1234") {
				System.out.println("ok");
			}else {
				System.err.println("fail");
			}
		}else {
			System.err.println("fail");
		}
		
		
		
	}

}
