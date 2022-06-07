package practica.adicional.semana11;


public enum EnumLenguas {
	ES(new Espanol()), ING(new Ingles()), ITA(new Italiano());

	private ILengua idioma;

	private EnumLenguas(ILengua idioma) {
		this.idioma = idioma;
	}

	public ILengua getIdioma() {
		return this.idioma;
	}
}