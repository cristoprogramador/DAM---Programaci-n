package _05ejerciciosBuclesSimples;

import java.util.Scanner;

/**
 * Escribir un programa que muestre los tres primeros divisores de un número n
 * introducido por el usuario. Por ejemplo, si el usuario introduce el número
 * 45, el programa mostrará los divisores 1, 3 y 5. Ten en cuenta que la
 * posibilidad de que el número n tenga menos de 3 divisores. Prueba qué pasa si
 * el usuario pide, por ejemplo, los tres primeros divisores de 7.
 * 
 * @author alumno
 *
 */
public class _07Divisores {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduzca un numero entero: ");
		int num = tec.nextInt();
		int cont2 = 0;
		
		for (int cont = 1; cont <= num && cont2 < 3; cont++) {
			if (num % cont == 0) {
				cont2++;
				System.out.println(cont + " es divisor de " + num);
			}
		}
	}
}
