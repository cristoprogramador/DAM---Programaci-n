package tema9.biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private String estanteria;
	
	/**
	 * 
	 * @param titulo titulo
	 * @param autor autor
	 * @param estanteria 
	 */
	public Libro(String titulo, String autor, String estanteria) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.estanteria = estanteria;
	}
	
	public String getEstanteria() {
		return estanteria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}


	
	
}
