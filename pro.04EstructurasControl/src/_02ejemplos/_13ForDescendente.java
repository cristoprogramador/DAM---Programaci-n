package _02ejemplos;

import java.util.Scanner;

public class _13ForDescendente {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce un numero entero: ");
		int n = tec.nextInt();

		// Mostrar los numeros del 1 al n
		// primero que quiero repetir, que quiero que valga la primera? que quiero que
		// valga la siguiente?
		// segundo que concidición ha de cumplirse para que repita el bucle (menor o
		// igual)
		for (int num = n; num >= 1; num--)
			System.out.println(num);
		System.out.println("IGNITION!!!!");
	}

}
