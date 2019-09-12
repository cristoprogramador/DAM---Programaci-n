package _03ejercicios._06DiccionarioIngEsp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 6. (paquete DiccionarioIngEsp)
 * - Diseñar la clase DiccionarioBilingüe para almacenar pares formados por
 * 		Palabra en castellano.
 * 		Colección de traducciones a ingles.
 * @author alumno
 *
 */
public class DiccionarioBilingue {
	//Permite almacenar una palabra y sus traducciones
	private Map<String, HashSet<String>> diccionario;
	
	/**
	 * Constructor: crea el diccionario vacio, sin palabras.
	 */
	public DiccionarioBilingue() {
		diccionario = new HashMap<>();
	}
	
	/**
	 * Añade la pareja (cast, ingl) al diccionario de forma que:
	 * 		o Si la palabra cast no estaba en el diccionario la añade, junto con su 
	 * 		traducción.
	 * 		o Si la palabra cast estaba ya en el diccionario pero no aparecía como 
	 * 		traducción la palabra ing, añade ing a su colección de traducciones.
	 * 		o Si la palabra cast estaba y la traducción ing también, no se realizarán 
	 * 		cambios.
	 * 		o El método devuelve true si se han realizado cambios en el diccionario y 
	 * 		false en caso contrario.
	 * @param cast
	 * @param ingl
	 * @return true si se han hecho cambios
	 */
	
	public boolean anyadirTraduccion(String cast, String ingl) {	
		if (diccionario.containsKey(cast)) {
			return diccionario.get(cast).add(ingl);
		} else {
			HashSet<String> hs = new HashSet<String>();
			hs.add(ingl);
			diccionario.put(cast, hs);
			return true;
		}
	}
	
	/**
	 * Quita la traducción ingl a la palabra 
	 *	cast. Si la palabra en castellano se queda sin traducciones, se elimina del 
	 *	dicicionario. Si se han producido cambios se devuelve true y en caso contrario 
	 *	false.
	 * @param cast
	 * @param ingl
	 * @return
	 */
	public boolean QuitarTraduccion(String cast, String ingl) {
		if(!diccionario.containsKey(cast))
			return false;
		else{
			boolean remove = diccionario.get(cast).remove(ingl);
			if (!remove || diccionario.get(cast).size()== 0) {
				diccionario.remove(cast);
				remove = true;
			}
			return remove;	
		}
	}
	
	/**
	 * Devuelve una colección con las traducciones de la 
	 * palabra indicada o null si la palabra no está en el diccionario.
	 * @param cast
	 * @return
	 */
	public HashSet traduccionesDe(String cast) {
		return diccionario.get(cast);
	}
	
	/**
	 * Devuelve un String con las palabras del diccionario y sus
	 *	traducciones.
	 */
	@Override
	public String toString() {
		String res = "";
		Set<String> palabras = diccionario.keySet();
		for(String palabra : palabras) {
			res += palabra + ": ";
			Set<String>traducciones = diccionario.get(palabra);
			//Recorro las traducciones
			for(String traduccion: traducciones) {
				res += traduccion + " - ";
			}
			res+= "\n";
		}
		return res;
	}
	
}
