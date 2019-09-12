package _03ejercicios;

import java.util.Scanner;

/** (longitudEntero)
 * El usuario introduce un entero largo leido con nextLong() y
 * el programa muestra la longitud del entero introducido. Para ello puedes
 * utilizar el metodo estqtico valueOf() de la clase String, que transforma
 * distintos tipos de datos a String, y posteriormente averiguar su longitud.
 * 
 * Introduce un entero largo: 654452131843165
 * Longitud: 15
 * 
 * @author Cristobal Salido
 *
 */
public class _16LongituEntero {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un entero largo: ");
		long entero = tec.nextLong();
		String cadena = null;
		cadena = cadena.valueOf(entero);
		long longitud = cadena.length();

		System.out.println("Longitud: " + longitud);

	}

}
