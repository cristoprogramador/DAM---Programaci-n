package _02ejemplos;

import java.util.Scanner;

public class _12For {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = tec.nextInt();

		// Mostrar los numeros del 1 al n
		for (int num = 1; num <= n; num++)
			System.out.println(num);
	}

}
