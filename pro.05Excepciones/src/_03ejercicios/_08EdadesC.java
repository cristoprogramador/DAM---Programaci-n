package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario la edad de cinco
 * personas y calcule la media. La edad  de una persona debe ser un valor
 * entero comprendido en el rango [0,110]. Realiza tres versiones: a.
 * Si se introduce mal la edad de una persona se vuelve a pedir la
 * edad de esa persona. b.
 * Si se introduce mal la edad de una persona, el programa muestra
 * un mensaje de error, no calcula la media y termina. c.
 * Si se introduce mal la edad de una persona, el programa vuelve a
 * solicitar la edad de las cinco personas (comienza el proceso).
 * 
 * @author alumno
 *
 */
public class _08EdadesC {
	public static void main(String[] args) {
		int edad, edades = 0;
		int cont = 0;
		boolean edadOk;
		Scanner tec = new Scanner(System.in);

		//////////////// VERSION C /////////////
		do {
			try {
				edadOk = true;
				System.out.println("Edad persona " + (cont + 1) + ": ");
				edad = tec.nextInt();
				cont++;
				if (edad < 0 || edad > 110) {
					edadOk = false;
					cont = 0;
					edades = 0;
				} else
					edades += edad;
			} catch (InputMismatchException e) {
				edadOk = false;
				cont = 0;
				edades = 0;
				tec.nextLine();
			}
			
		} while (!edadOk || cont < 5);

		System.out.println("Media Edad " + edades / 5 + ": ");

		
		//////////////// VERSION JAVI /////////////
		
		final int N = 5;
		int suma = 0;
		int i = 0;
		
		while (i < N) {
			System.out.println("Edad " + (i + 1) + ": ");
			edad = tec.nextInt();
			if (edad >= 0 && edad <= 110) {
			suma = suma + edad;
			i++;
			}else {
				System.out.println("Error. Vuelve a empezar");
				i=0;
				suma = 0;
			}
		}
		
		System.out.println("Media: " + ((double)suma/N));

	}

}
