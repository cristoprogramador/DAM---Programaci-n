package _02ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _06AtraccionFeria {

	public static void main(String[] args) {
		// En una atracci�n de feria pueden subir los ni�os mayores de 10 a�os
		// Si no son mayores de 10 a�os podr�n subir si miden mas de 1 metro

		Scanner tec = new Scanner(System.in).useLocale(Locale.US);

		// Pedimos la edad
		System.out.println("Edad: ");
		int edad = tec.nextInt();

		// si la edad es mayor que 10 ya puede subir
		if (edad > 10)
			System.out.println("Puede subir");
		// si la edad no es mayor que 10 le preguntamos la estatura
		else {
			System.out.println("Estatura: ");
			double est = tec.nextDouble();
			// Si la estatura es mayor que 1 puede subir
			if (est > 1)
				System.out.println("Puede subir");
			// Si la estatura es menor que 1 no puede subir
			else
				System.out.println("No puede subir");
		}

	}

}
