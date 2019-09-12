package tema8.videoJuegos;

public class Juego implements Comparable<Juego>{
	private String titulo;
	private String fabricante;
	private int anyo;
	/**
	 * 
	 * @param t titulo
	 * @param f fabricante
	 * @param a año
	 */
	public Juego(String t, String f, int a) {
		titulo= t;
		fabricante = f;
		anyo = a;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getAnyo() {
		return anyo;
	}

	@Override
	public String toString() {
		return "Juego [titulo=" + titulo + ", fabricante=" + fabricante + ", anyo=" + anyo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juego other = (Juego) obj;
		if (anyo != other.anyo)
			return false;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Juego o) {
		
		if (this.titulo.compareTo(o.titulo) > 0)
			return 1;
		else if (this.titulo.compareTo(o.titulo) < 0)
			return -1;
		else if (this.fabricante.compareTo(o.fabricante) > 0)
			return 1;
		else if (this.fabricante.compareTo(o.fabricante) < 0)
			return -1;
		else
			return this.anyo - o.anyo;
	}

}
