package _01granTeatre;

public class Exposicion extends Evento {
	private int sala;
	private String fechaClausura;
	
	public Exposicion(String nombre, String fecha, String hora,
			int sala, String fechaClausura) {
		super(nombre, fecha, hora, 0);
		this.sala = sala;
		this.fechaClausura = fechaClausura;
	}
	
	public String toString() {
		return "EXPOSICIÓN\n" +
				super.toString() +
				"\nSala: " + this.sala +
				"\nFecha de clausura: " + this.fechaClausura;
	}
}
