package ar.com.educacionit.exceptions;

public class ConnectionMain {

	public static void main(String[] args) {

		Conexion c = new Conexion();
		
		try {
			c.open();
			c.close();
			c.commit();
		} catch (ConnectionIsAlreadyOpenException|ConnectionIsNotOpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				c.close();
			} catch (ConnectionIsNotOpenException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
