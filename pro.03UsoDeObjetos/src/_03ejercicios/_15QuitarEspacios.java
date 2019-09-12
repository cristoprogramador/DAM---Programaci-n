package _03ejercicios;

import java.util.Scanner;

/** QuitarEspacios
 * El usuario introduce un texto de dos palabras que leemos con
 * nextLine(). Las dos palabras pueden estar separadas por varios espacios en
 * blanco. Quitar los espacios sobrantes.
 * Introduce dos palabras separadas por varios espacios: casa grande
 * Quitando espacios sobrantes: casa      grande
 * 
 * @author Cristobal Salido
 *
 */
public class _15QuitarEspacios {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce dos palabras separadas por varios espacios: ");
		String primeraPalabra = tec.next();
		String segundaPalabra = tec.next();
		String completo = primeraPalabra+" "+segundaPalabra;
		System.out.println("Quitando espacios sobrantes: " + primeraPalabra + " " + segundaPalabra);
		System.out.println(completo);
	}

}
