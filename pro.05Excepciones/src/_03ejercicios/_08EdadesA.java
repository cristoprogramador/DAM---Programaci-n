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
public class _08EdadesA {
	public static void main(String[] args) {
		int edad, edades = 0;
		int cont = 0;
		boolean edadOk;
		Scanner tec = new Scanner(System.in);

		//////////////// VERSION A /////////////
		do {
			try {
				edadOk = true;
				System.out.println("Edad persona " + (cont + 1) + ": ");
				edad = tec.nextInt();
				cont++;
				if (edad < 0 || edad > 110) {
					System.out.println("Edad incorrecta. Vuelve a introducirla");
					edadOk = false;
					cont--;
				} else
					edades += edad;
			} catch (InputMismatchException e) {
				System.out.println("Edad incorrecta. Vuelve a introducirla");
				edadOk = false;
				tec.nextLine();
			}
		} while (!edadOk || cont < 5);

		System.out.println("Media Edad " + (double)(edades / 5) + ": ");
		
		
		//////////////// VERSION JAVI /////////////
		

	}

}
