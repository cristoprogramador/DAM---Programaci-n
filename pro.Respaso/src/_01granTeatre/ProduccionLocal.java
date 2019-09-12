package _01granTeatre;

public class ProduccionLocal extends Evento {
	private String organizador;
	
	public ProduccionLocal(String nombre, String fecha, String hora,
			String organizador) {
		super(nombre, fecha, hora, 0);
		this.organizador = organizador;
	}
	
	public String toString() {
		return "PROD. LOCAL\n" +
				"Organiza: " + this.organizador +
				"\n" + super.toString();
				
	}

}
