package _05ejerciciosBuclesSimples;

import java.util.Scanner;

/**
 * (Primos) Escribir un programa en el que el usuario escriba un número entero y
 * se le diga si se trata o no de un número primo. Recuerda que un nº primo es
 * aquel que solo es divisible por 1 y por sí mismo.
 * 
 * @author Cristobal Salido
 *
 */
public class _05Primos {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Escriba un numero entero: ");
		int num = tec.nextInt();
		int cont = 0;
		do {
			cont++;
			if (num % cont == 0)
				System.out.println("El numero no es primo");
		} while (cont < num && num % cont != 0);
		if (num % cont != 0)
			System.out.println("El numero es primo");
	}
}
