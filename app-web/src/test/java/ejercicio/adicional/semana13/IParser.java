package ejercicio.adicional.semana13;

public interface IParser<T> {
	public T parse() throws ParseException;
	//public Collection<T> parseFile();
}
