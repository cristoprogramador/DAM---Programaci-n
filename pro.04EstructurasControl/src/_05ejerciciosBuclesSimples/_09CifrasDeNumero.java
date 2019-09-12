package _05ejerciciosBuclesSimples;

import java.util.Scanner;

/**
 * Escribir un programa en el que el usuario introduzca un número entero
 * cualquiera (positivo, negativo o cero) y se le diga cuantas cifras tiene.
 * Pistas: ¿Cuantas cifras tiene el nº 25688? ¿Cuántas veces podemos dividir el
 * nº 25688 por 10 hasta que se hace cero? Cuidado, el nº 0 tiene una cifra.
 * 
 * @author Cristobal Salido
 *
 */
public class _09CifrasDeNumero {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduzca un numero entero: ");
		int num = tec.nextInt();
		int division = Math.abs(num);
		int cifras = 0;

		do {
			division = division / 10;
			cifras++;
		} while (division > 0);
		System.out.println(num + " tiene " + cifras + " cifra/s");

	}

}
