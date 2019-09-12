package _03ejercicios._02Biblioteca;

import java.util.HashMap;
/*
 * d) Diseña la clase CatalogoLibros como una colección de libros. Utiliza el tipo de colección que 
 * has elegido en los apartados a y b. Implementa los siguientes métodos:
 * 
 * - public CatalogoLibros(Libro v[]): Constructor. Para simplificar, inicializa el catálogo
 * y lo rellena con los libros del array v.
 * - public String buscar(Libro l): Dado un libro, lo busca en el Catálogo y devuelve la 
 * estantería en la que se encuentra el libro o null si el libro no está en el Catálogo.
 */
public class CatalogoLibros {
	private HashMap<String, Libro> libros;
	
	public CatalogoLibros(Libro v[]) {
		libros = new HashMap<>();
		//Añadimos al Set los libros del arra
		for(int i = 0; i < v.length; i++) {
			libros.put(v[i].titulo, v[i]);
		}
	}

	/**
	 * Devuelve la estanteria en que se encuentra un libro
	 * Si el libro no está en el catalogo devuelve null.
	 * @param buscado Libro del que queremos averiguar la estanteria
	 * @return Estranteria en que está o null si no está
	 */
	public String buscar(Libro t) {
		String titulo = t.getTitulo();
		Libro l = libros.get(titulo);
		if (l == null) return null;
		else return l.getEstanteria();		
	}
	
}
