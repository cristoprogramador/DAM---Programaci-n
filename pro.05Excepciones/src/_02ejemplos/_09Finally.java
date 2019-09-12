package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _09Finally {
	public static void main(String[] args) {
		try {
			Scanner tec = new Scanner(System.in);

			System.out.println("Numerador: ");
			int a = tec.nextInt();
			System.out.println("Denominador: ");
			int b = tec.nextInt();

			System.out.println("Cociente: " + a / b);
			System.out.println("Resto: " + a % b);
		} catch (InputMismatchException e) {
			System.out.println("Debes introducir enteros");
		} finally {
			System.out.println("FINALLY (esto siempre aparece)");
		}
		System.out.println("Fin del programa");
	}

}
