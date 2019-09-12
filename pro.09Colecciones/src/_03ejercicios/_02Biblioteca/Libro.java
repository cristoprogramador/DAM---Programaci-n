package _03ejercicios._02Biblioteca;
/*
 * (package Biblioteca) Se quiere almacenar en una colección una serie de objetos de la clase 
 * Libro. Se sabe que la aplicación que va a manejar dicha colección añade los libros al iniciarse el 
 * programa y a partir de ese momento los usuarios realizan búsquedas para comprobar si un 
 * libro se encuentra o no en la colección. Interesa que las búsquedas por título lo más rápidas 
 * posibles pues se van a realizar muchas consultas, mientras que nunca se insertan nuevos libros 
 * durante la ejecución de la aplicación. El dato que identifica a un libro es el Titulo y se sabe que 
 * no habrá dos libros con el mismo título en la colección.
 * 
 * a) ¿Qué tipo de colección utilizaríamos? ¿List o Set? Justifica la respuesta.
 * -Set, puesto que no permitirá duplicados
 * 
 * b) ¿Qué implementación (de List o Set) usarías? Justifica la respuesta.
 * -LinkedHashSet puesto que no nos importa el orden y nos ofrecerá una busqueda mas rapida
 * 
 * c) Diseña la clase Libro con los métodos que consideres oportunos y los siguientes atributos:
 * - Titulo (String): Es el dato que identifica al libro.
 * - Autor (String)
 * - Estantería (String): Estantería de la biblioteca en la que se encuentra el libro 
 */
public class Libro implements Comparable<Libro>{
	protected String titulo;
	private String autor;
	private String estanteria;
	
	
	public Libro(String titulo, String autor, String estanteria) {
		this.titulo = titulo;
		this.autor = autor;
		this.estanteria = estanteria;

	}
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Libro)) return false;
		
		return this.titulo.equals(((Libro)o).titulo);
	}
	@Override
	public int compareTo(Libro l) {
		return this.titulo.compareTo(l.titulo);
	}
	
	@Override
	public int hashCode() {
		return this.titulo.hashCode();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(String estanteria) {
		this.estanteria = estanteria;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo +
				"\nAutor: " + autor + 
				"\nEstanteria: " + estanteria;
	}
	
}
