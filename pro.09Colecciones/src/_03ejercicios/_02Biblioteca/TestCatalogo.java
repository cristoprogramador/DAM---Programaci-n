package _03ejercicios._02Biblioteca;

import java.util.Scanner;

public class TestCatalogo {

	public static void main(String[] args) {
		//Creamos array con objetos Libro
		Libro[] libros = {
				new Libro("Titulo1", "Autor1", "Estanteria1"),
				new Libro("Titulo2", "Autor2", "Estanteria2"),
				new Libro("Titulo3", "Autor3", "Estanteria3"),
				new Libro("Titulo4", "Autor4", "Estanteria4"),
				new Libro("Titulo5", "Autor5", "Estanteria5"),
				new Libro("Titulo6", "Autor6", "Estanteria6"),
				new Libro("Titulo7", "Autor7", "Estanteria7"),
		};
		
		//Añadimos al catalogo c el array con los objetos Libro creados
		CatalogoLibros c = new CatalogoLibros(libros);
		
		Scanner tec = new Scanner(System.in);
		String titulo;
		
		/*do {
			System.out.println("Titulo a buscar");
			titulo = tec.nextLine();
			if(!titulo.isEmpty()) {
				Libro l = c.buscar(titulo);
				if(l == null) System.out.println("Libor no existe");
				else System.out.println("Estanteria: " + l.getEstanteria());
			}
		}while(!titulo.isEmpty());*/

	}

}
