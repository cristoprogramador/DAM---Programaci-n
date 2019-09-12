package _02ejemplos._01Personas;

public class Alumno extends Persona {
	private int numExpediente;

	public Alumno(String nif, String nombre, int numExpediente) {
		//LA PRIMERA INSTRUCCIÓN HA DE SER UNA LLAMADA A SUPERclase
		//SI NO, DARÁ ERROR.
		super(nif, nombre);
		
		//Inicializamos la parte de alumno
		this.numExpediente = numExpediente;
	}

	//Los getter y setters de nif y nombre, no tenemos que crearlos
	//generamos los del atributo numExpediente
	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}
	
	//Dos alumnos serán iguales si tienen el mismo nif
	//por lo que el metodo equals tambien lo reciclamos de
	//la superclase Persona, al igual que el metodo compareTo
	
	//El metodo toString si que lo reescribiremos, pero podemos
	//en este caso aprobecharemos el toString de la superclase Persona
	@Override
	//Si nos equivocamos @Override nos avisa.
	public String toString() {
		return super.toString() +
				"\nNum. exp.: " + numExpediente;
	}
	
	//otra forma sería reescribirlo entero con setters
//	public String toStringk() {
//		return "Nif: " + getNif() +
//				"\nNombre: " + getNombre() + 
//				"\nNum. exp.: " + numExpediente;
//	}
}