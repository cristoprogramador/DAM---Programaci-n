package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05CapturarExcepcion3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		try {
			System.out.println("Division a/ba");
			System.out.println("Introduce a: ");
			int a = tec.nextInt();
			try {
				System.out.println("Introduce b: ");
				int b = tec.nextInt();

				if (b != 0)
					System.out.println("Resultado: " + (a / b));

				else
					System.out.println("No se puede dividir");
			} catch (InputMismatchException e) {
				System.out.println("Segundo dato incorrecto");
			}
		} catch (InputMismatchException e) {
			System.out.println("Primer dato incorrecto");
		}
	}

}
