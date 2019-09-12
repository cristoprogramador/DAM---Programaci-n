package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04CapturarExcepcion2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		try {
			System.out.println("Division a/ba");
			System.out.println("Introduce a: ");
			int a = tec.nextInt();
			System.out.println("Introduce b: ");
			int b = tec.nextInt();

			if (b != 0)
				System.out.println("Resultado: " + (a / b));

			else
				System.out.println("No se puede dividir");
		} catch (InputMismatchException e) {
			System.out.println("Dato incorrecto");
		}
	}

}
