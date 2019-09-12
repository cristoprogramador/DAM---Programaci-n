package _06ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * (LetraALetra) Escribe un programa en el que se solicite al usuario un texto
 * de forma repetida hasta que el usuario introduzca la cadena vacía. Con cada
 * texto que introduzca el usuario se le mostrará carácter a carácter, cada
 * carácter en una línea Introduce texto: Hola H o l a Introduce texto: Casa C a
 * s a Introduce texto: Fin del programa
 * 
 * @author alumno
 *
 */
public class _09LetraALetra {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String texto;
		do {
			// Pedimos el texto y lo guardamos en un String
			System.out.println("Introduce texto: ");
			texto = tec.nextLine();

			// Repetimos el ciclo tantas veces como caracteres tiene
			for (int posicion = 0; posicion < texto.length(); posicion++)
				// Excrivimos con salto de linea el caracter siguiente por cilco
				System.out.println(texto.charAt(posicion));

		} while (texto.length() != 0);

	}
}
