package _02ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _05IfElse {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		tec.nextLine(); // para comernos el intro que deja en memoria el nextInt()

		if (edad >= 18) {
			System.out.println("Nombre: ");
			String nombre = tec.nextLine();
		} else {
			System.out.println("Menor de edad");
			System.out.println("Nombe del padre/madre: ");
			String nombrePadre = tec.nextLine();
		}

		System.out.println("Fin");

	}

}
