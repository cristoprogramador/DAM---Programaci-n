package _03ejercicios._02SalonVideojuegos;

public class Juego implements Comparable<Juego> {
	protected String titulo;
	protected String fabricante;
	protected int anyo;

	public Juego(String t, String f, int a) {
		titulo = t;
		fabricante = f;
		anyo = a;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAño() {
		return anyo;
	}

	public void setAño(int año) {
		this.anyo = año;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nFabricante: " + fabricante + "\nAño: " + anyo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Juego))
			return false;
		Juego j = (Juego) o;
		return this.titulo.equals(j.titulo) && this.fabricante.equals(j.fabricante) && this.anyo == j.anyo;
	}

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
	
	public int compareTov2(Juego o) {
		if(this.titulo.compareTo(o.titulo) != 0) {
			return this.titulo.compareTo(o.titulo);
		} else if(this.fabricante.compareTo(o.fabricante) != 0) {
			return this.fabricante.compareTo(o.fabricante);
		}else {
			return this.anyo -o.anyo;
		}
	}


}
