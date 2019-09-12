package _02ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _04If {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Edad: ");

		int edad = tec.nextInt();
		if (edad >= 18)
			System.out.println("Eres mayor de edad");

		System.out.println("Estatura: ");
		double est = tec.nextDouble();
		if (est > 2.0) {
			System.out.println("Eres muy alto");
			System.out.println("Hay poca gente que mida tanto");
		}
	}

}
