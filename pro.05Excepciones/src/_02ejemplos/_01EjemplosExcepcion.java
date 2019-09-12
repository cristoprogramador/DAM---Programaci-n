package _02ejemplos;

import java.util.Scanner;

public class _01EjemplosExcepcion {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("Posicion: ");
		/*
		 * tec.close(); cierra el Scanner
		 */

		// Excepcion InputMismatchException si no introduce un entero
		// No podemos evitar la excepción. Cuando se produzca la capturaremos y la
		// manejaremos.
		int pos = tec.nextInt();

		// Caracter que ocupa la posicion indicada
		// Excepcion StringIndexOutOfBounds si la posicion indicada
		// no corresponde a una posición del String
		// Evitamos la excepción con condicionantes
		if (pos < 1 || pos > alfabeto.length())
			System.out.println("Posicion incorrecta");
		else {
			char c = alfabeto.charAt(pos - 1);

			System.out.println("El caracter de la posicion " + pos + " es " + c);
		}
	}

}
