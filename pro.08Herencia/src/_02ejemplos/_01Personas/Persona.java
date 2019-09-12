package _02ejemplos._01Personas;

public class Persona {
	protected String nif; 
	//protected es un nivel en el que las subclases pueden tener acceso
	private String nombre;
	
	public Persona (String nif, String nombre) {
		this.nif = nif;
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//indicamos que vamos a reescribir un metodo eredado
	@Override
	//Si nos equivocamos @Override nos avisa.
	public String toString() {
		return "NIF: " + nif +
				"\nNombre: " + nombre;
	}
	
	@Override
	public boolean equals (Object o) {
		if (this == o) return true;
		if (!(o instanceof Persona)) return false;
		return this.nif.equals(((Persona)o).nif);
	}
	
	public int compareTo (Object o) {
		Persona p = (Persona) o;
		return this.nif.compareTo(p.nif);
	}
}
