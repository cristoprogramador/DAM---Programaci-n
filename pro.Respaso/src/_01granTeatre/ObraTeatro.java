package _01granTeatre;

public class ObraTeatro extends Evento{

	private String director;
	private String interpretes;
	
	public ObraTeatro(String nombre, String fecha, String hora, double precio, 
			String director, String interpretes) {
		super(nombre, fecha, hora, precio);
		this.director = director;
		this.interpretes = interpretes;
	}

	public String toString() {
		return "TEATRO\n" +
				super.toString() +
				"\nDirector: " + director+
				"\nInterpretes: " + interpretes;
				
				
	}
}
