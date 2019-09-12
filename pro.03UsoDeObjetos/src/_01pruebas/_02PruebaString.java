package _01pruebas;

import java.util.Scanner;

public class _02PruebaString {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String prueba = null;

		if (args.length > 1)
			System.out.println("Valores incorrectos. \nFin del programa");
		else if (args.length == 1) {
			prueba = args[0];
			System.out.println(prueba);
		} else {
			System.out.println("ingrese palabra");
			prueba = tec.next();
			System.out.println(prueba);
		}
	}
}
