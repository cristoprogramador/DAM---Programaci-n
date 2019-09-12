package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _07TryCathcConBucle {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int num;
		boolean correcto = false;

		do {
			try {
				System.out.println("Introduce entero: ");
				num = tec.nextInt();
				//Si se produce error, salta enseguida y no 
				//ejecuta el cambio de valor de correcto a true
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("No es un entero");
				tec.nextLine(); // Vaciamos buffer
			}
		} while (!correcto);
	}

}
