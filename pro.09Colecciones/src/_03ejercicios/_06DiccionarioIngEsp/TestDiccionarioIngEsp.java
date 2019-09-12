package _03ejercicios._06DiccionarioIngEsp;
/**
 * 6. (paquete DiccionarioIngEsp)
 * - Diseñar la clase DiccionarioBilingüe para almacenar pares formados por
 * 		Palabra en castellano.
 * 		Colección de traducciones a ingles.
 * La clase dispondrá de los siguientes métodos:
 * 	Constructor: crea el diccionario vacio.
 * 	anyadirTraduccion(String cast, String ingl): Añade la pareja (cast, ingl) al 
 * 	diccionario de forma que:
 * 		o Si la palabra cast no estaba en el diccionario la añade, junto con su 
 * 		traducción.
 * 		o Si la palabra cast estaba ya en el diccionario pero no aparecía como 
 * 		traducción la palabra ing, añade ing a su colección de traducciones.
 * 		o Si la palabra cast estaba y la traducción ing también, no se realizarán 
 * 		cambios.
 * 		o El método devuelve true si se han realizado cambios en el diccionario y 
 * 		false en caso contrario.
 * 
 *	QuitarTraduccion(String cast, String ingl): Quita la traducción ingl a la palabra 
 *	cast. Si la palabra en castellano se queda sin traducciones, se elimina del 
 *	dicicionario. Si se han producido cambios se devuelve true y en caso contrario 
 *	false.
 *
 *	traduccionesDe(String cast): Devuelve una colección con las traducciones de la 
 *	palabra indicada o null si la palabra no está en el diccionario.
 *	
 *	toString(): Devuelve un String con las palabras del diccionario y sus
 *	traducciones. 
 * @author alumno
 *
 */
public class TestDiccionarioIngEsp {
	public static void main(String[] args) {
		DiccionarioBilingue dic=new DiccionarioBilingue();
		
		System.out.println(dic.anyadirTraduccion("casa", "house"));
		System.out.println(dic.anyadirTraduccion("casa", "house"));
		dic.anyadirTraduccion("casa", "home");
		dic.anyadirTraduccion("hombre", "man");
		dic.anyadirTraduccion("caballo", "horse");
		System.out.println(dic.anyadirTraduccion("casa", "house"));
		
		dic.QuitarTraduccion("casa", "house");
		System.out.println(dic);
		
		dic.QuitarTraduccion("casa", "home");
		System.out.println(dic);
		
		
		}

}
