package tema9.listaAdmitidos;

public class Inscripcion {
	private String nif;
	private String nombre;
	private int nivel;
 
	public Inscripcion(String nif, String nombre, int nivel) {
		this.nif = nif;
		this.nombre = nombre;
		this.nivel = nivel;
	}

	public String getNif() {
		return nif;
	}

	@Override
	public int hashCode() {
			return nif.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inscripcion other = (Inscripcion) obj;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "nif=" + nif + ", nombre=" + nombre + ", nivel=" + nivel;
	}
	
	
}
