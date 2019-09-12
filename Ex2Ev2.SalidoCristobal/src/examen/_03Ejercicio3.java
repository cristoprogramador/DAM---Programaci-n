package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class _03Ejercicio3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int numero;
		ArrayList<Integer> numeros = new ArrayList<>();

		do {
			System.out.println("Introduzca un numero entero: ");
			numero = tec.nextInt();
			
			if (!numeros.contains(numero)){
				if (numero < 0)
					numeros.add(0, numero);
				if (numero >= 0)
					numeros.add(numero);
			}

		} while (numeros.size() != 5);
		System.out.println(numeros);

	}
}
