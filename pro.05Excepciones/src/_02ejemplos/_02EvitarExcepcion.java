package _02ejemplos;

import java.util.Scanner;

public class _02EvitarExcepcion {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Raiz cuadrada de a/b ");

		System.out.println("Introduce entero a: ");
		int a = tec.nextInt(); // Excepcion si no introduce entero

		System.out.println("Introduce entero b: ");
		int b = tec.nextInt(); // Excepcion si no introduce entero

		if (b == 0)//Evitamos que la excepción se produzca si b es 0
			System.out.println("No se puede hacer el calculo");
		else {
			double res = Math.sqrt(a / b); 	// Excepcion si b es 0
											// 0 en numeros enteros se considera 0 exacto
											// 0.0 en numeros reales se considera que tiende a 0 pero no es 0
			System.out.println("Resusltado: " + res);
		}
	}
}
