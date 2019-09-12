package _02ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _17DoWhile {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		// Leer numero positivo
		int num;

		do {
			System.out.println("Intropduce numero positivo: ");
			num = tec.nextInt();
			if (num <= 0)
				System.out.println("ERROR!!!");

		} while (num <= 0);

		System.out.println("Número positivo: " + num);

		// Sumar todos los numeros impares que introduzca el ususari.
		// Terminar cuando introduca un par
		int impar;
		int sumaImpares = 0;
		do {
			System.out.println("introduce impar: ");
			impar = tec.nextInt();
			if (impar % 2 != 0) {
				sumaImpares = sumaImpares + impar;
			}
		} while (impar % 2 != 0);
		System.out.println("Suma impares : " + sumaImpares);
		
		// Las 7 y media
		double sumaCartas = 0;
		double carta;
		do {
			System.out.println("Que carta ha salido?: ");
			carta = tec.nextDouble();
			sumaCartas = sumaCartas + carta;
			
			if (sumaCartas == 7.5) System.out.println("Has ganado");
			else if (sumaCartas> 7.5) System.out.println("Has perdido");

		} while (sumaCartas < 7.5);
		
	}

}
