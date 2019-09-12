package _02ejemplos;

import java.util.Scanner;

public class _09WhileDescendente {

	public static void main(String[] args) {
Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int n = tec.nextInt();

		// Mostrar los numeros del 1 al n
		// primero que quiero repetir, que quiero que valga la primera? que quiero que
		// valga la siguiente?
		// segundo que concidición ha de cumplirse para que repita el bucle (menor o
		// igual)
		int num = n;
		while (num >= 1) { // TAMBIEN VALDRÍA (num != 0)
			System.out.println(num);
			num--;
		}
		System.out.println("IGNITION!!!!");

	}

}
