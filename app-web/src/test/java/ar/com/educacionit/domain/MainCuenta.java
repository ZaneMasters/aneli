package ar.com.educacionit.domain;

import java.lang.reflect.Field;

import ar.com.educacionit.services.impl.SociosServiceImpl;

public class MainCuenta {

	public static void main(String[] args) throws Exception {

		//quiero tomar una clase .class y setear los datos (atributos)
		//dentro de una template
		
		Cuenta miCuenta = new Cuenta (100l,"caja de ahorros",150000f);
		
		//String template = buildTemplate(Cuenta.class, miCuenta);
		String template = buildTemplate(miCuenta);
		
		//construir un string que tenga
		//Cuenta={atributo=valor|atributo2=valor|atributon = valorn}
		
		
		System.out.println(template);
		
		Socios socios = new SociosServiceImpl().getOne(1l);
		
		template = buildTemplate(socios);
		System.out.println(template);
	}
	
	public static String buildTemplate(Class clazz, Object data) throws Exception{
		
		String className = clazz.getSimpleName();//nombre de la clase
		
		StringBuffer template = new StringBuffer(className);
		
		template.append("={");
		
		//tomo los atributos de class
		Field[] fields = clazz.getDeclaredFields(); //atributos
		
		//recorro los atributos
		for(Field field : fields) {
			field.setAccessible(true);//permitir acceder al atributo
			String name = field.getName(); //nombre del atributo
			Object value = field.get(data);
			
			template.append(name).append("=");
			if(value != null) {
			template.append(value.toString());
			}
			template.append("|");
		}
		
		template.append("}");
		
		return template.toString();
	}
	
	
	public static String buildTemplate(Object data) throws Exception{
		
		Class clazz = data.getClass();
		
		String className = clazz.getSimpleName();//nombre de la clase
		
		StringBuffer template = new StringBuffer(className);
		
		template.append("={");
		
		//tomo los atributos de class
		Field[] fields = clazz.getDeclaredFields(); //atributos
		
		//recorro los atributos
		for(Field field : fields) {
			field.setAccessible(true);//permitir acceder al atributo
			String name = field.getName(); //nombre del atributo
			Object value = field.get(data);
			
			template.append(name).append("= ").append(value.toString()).append("|");
		}
		
		template.append("}");
		
		return template.toString();
	}
}
