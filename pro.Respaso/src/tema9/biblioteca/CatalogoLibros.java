package tema9.biblioteca;

import java.util.HashMap;

public class CatalogoLibros {
	HashMap<Libro, String> catalogo;
	

	public CatalogoLibros(Libro l[]) {
		catalogo = new HashMap<>();
		
		for(Libro li: l) {
			catalogo.put(li, li.getEstanteria());
		}
	}


	public String buscar(Libro l) {
		return this.catalogo.get(l);
	}

}
