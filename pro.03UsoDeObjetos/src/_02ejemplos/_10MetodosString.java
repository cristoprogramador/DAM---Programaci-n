package _02ejemplos;

public class _10MetodosString {
	public static void main(String[] args) {
		/*Metodo charAt:
		 * - Devuelve cual es el caracter que está en determinada posición
		 * del String
		 * - Elprimer caracter está en la posición 0
		 * - Si la posición es incorrecta: EXCEPCIÓN
		 */
		String nombre ="Javier";
		System.out.println("Inicial del nombre " + nombre.charAt(0));
		
		char segundaLetra = nombre.charAt(1);
		System.out.println("Segunda letra del nombre " + segundaLetra);
		
		/* Metodo indexOf:
		 * - Devuelve en que posición está el caracter o el String que le damos
		 * - Si no está, devuelve -1
		 */
		
		nombre = "Javier Garcia Jimenez";
		int pos = nombre.indexOf("J"); //Se puede buscar un caracter (Distingue entre mayusculas y minusculas)
		System.out.println("Posición de la J: " + pos);
		
		System.out.println("Posicion de Javier: " + nombre.indexOf("Javier"));
		System.out.println("Posicion de Garcia: " + nombre.indexOf("Garcia"));
		
		//Se puede buscar a partir de cirta posición
		System.out.println("Letra a: " + nombre.indexOf("a",0));
		System.out.println("Letra a: " + nombre.indexOf("a",3));
		System.out.println("Letra a: " + nombre.indexOf("a",10));
		
		/* Metodo substring:
		 * - Devuelve una subcadena, indicando la posicion de comienzo (incluido) y la de final(no incluido).
		 * - Si indicamos solo la posición de inicio devuelve hasta el final de la cadena
		 */
		String texto = "abcdefghijklmniopq";
		System.out.println("Substring: " + texto.substring(0,5));
		System.out.println("Substring: " + texto.substring(2,3));
		System.out.println("Substring: " + texto.substring(4));
		
		/* Metodo trim
		 * Elimina espacios por delante y por detrás
		 */
		System.out.println("                  aedfa alkd ñlisso                   ".trim());

	}
}
