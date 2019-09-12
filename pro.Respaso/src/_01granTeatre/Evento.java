package _01granTeatre;

public abstract class Evento {
	private String titulo;
	private String fecha;
	private String hora;
	private double precio;
	
	protected Evento(String nombre, String fecha, String hora, double precio) {
		this.titulo = nombre;
		this.fecha = fecha;
		this.hora = hora;
		this.precio = precio;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Evento))return false;
		if (this == o)return true;
		Evento e = (Evento) o;
		
		return this.titulo.equals(e.titulo) && this.fecha.equals(e.fecha);
	}
	
	@Override
	public String toString() {
		String res = "Titulo: " + titulo +
				"\nFecha: " + fecha +
				"\nHora: " + hora;
		if (precio == 0) res += "\nEntrada gratuita!!!";
		else res += "\nPrecio: " + this.precio;
		
		return res;
	}


	@Override
	public int hashCode() {
		return (this.titulo + this.fecha).hashCode();
	}

}
