package _03ejercicios._02Biblioteca;

import java.util.HashSet;

/*
 * d) Diseña la clase CatalogoLibros como una colección de libros. Utiliza el tipo de colección que 
 * has elegido en los apartados a y b. Implementa los siguientes métodos:
 * 
 * - public CatalogoLibros(Libro v[]): Constructor. Para simplificar, inicializa el catálogo
 * y lo rellena con los libros del array v.
 * - public String buscar(Libro l): Dado un libro, lo busca en el Catálogo y devuelve la 
 * estantería en la que se encuentra el libro o null si el libro no está en el Catálogo.
 */
public class CatalogoLibros2 {
	private HashSet<Libro> libros;
	
	public CatalogoLibros2(Libro v[]) {
		libros = new HashSet<>();
		//Añadimos al Set los libros del arra
		for(int i = 0; i < v.length; i++) {
			libros.add(v[i]);
		}
	}
	
	public String buscar(Libro l) {
		for(Libro lib: libros) {
			if(lib.equals(l)) {
				return l.getEstanteria();
			}
		}
		return null;
		
		
	}
	
}
