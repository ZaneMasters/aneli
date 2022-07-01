package ar.com.educacionit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * los servlet no tienen el metodo main, porque no son de tipo
 * consola, sino web
 *
 */
@WebServlet("/PracticServlet")
public class PracticServlet extends HttpServlet {

	@Override	
	protected void doPost(HttpServletRequest entrada, HttpServletResponse salida) throws ServletException, IOException {
		System.out.println("llegue al servlet /listado que escucha y atiende por POST");
		salida.getWriter().print("hola frontend, soy el backend y atendi tu solictud POR POST");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String documento = request.getParameter("documento");
		String email = request.getParameter("email");
		String profesion = request.getParameter("profesion");
		String rangoedad = request.getParameter("rangoEdad");
		String fecha = request.getParameter("fechaNacimiento");
		
		try {	
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>LOS DATOS</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h3>Tu nombre es: "+nombre+"</h3>");
			out.println("<h3>Tu apellido es: "+apellido+"</h3>");
			out.println("<h3>Tu documento es :"+documento+"</h3>");
			out.println("<h3>Tu email es: "+email+"</h3>");
			out.println("<h3>Tu profesion es: "+profesion+"</h3>");
			out.println("<h3>Tu rango de edad es: "+rangoedad+" años"+"</h3>");
			out.println("<h3>Tu fecha de nacimiento es: "+fecha+"</h3>");
			out.println("</body>");
			out.println("</html>");
		}finally{
			out.close();
		}
		

	}
}
