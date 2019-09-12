package _03Ejercicios;

import java.util.Scanner;

/**
 * (PrimerImpar) Escribir un método que, dado un array de enteros, devuelva la
 * suma de los elementos que aparecen tras el primer valor impar. Usar main para
 * probar el método.
 * 
 * @author alumno
 *
 */
public class _10PrimerImpar {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[] arrayNumeros;
		// Generamos el array mediante introducción de datos del usuario
		System.out.println("Cuantos numeros va a introducir?");
		int cantidadNumeros = tec.nextInt();
		arrayNumeros = new int[cantidadNumeros];
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Introduzca numero: ");
			arrayNumeros[i] = tec.nextInt();
		}
		boolean enc = false;
		int suma = 0;

		for (int i = 0; i < arrayNumeros.length; i++) {		
			if (enc == true) {
				suma += arrayNumeros[i];	
			}
			if ((arrayNumeros[i] % 2) != 0) {
				enc = true;
			}
		}

		System.out.println("La suma de los numeros tras el primer impar es: " + suma);

	}

}
