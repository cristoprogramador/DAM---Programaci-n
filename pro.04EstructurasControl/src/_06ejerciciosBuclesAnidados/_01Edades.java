package _06ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * (Edades) Programa que pida al usuario la edad de cinco personas. Si la suma
 * de las edades es inferior a 200, el programa volverá a solicitar las 5
 * edades.
 * 
 * @author alumno
 *
 */
public class _01Edades {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int sumaEdad;

		do {
			sumaEdad = 0;
			for (int cont = 0; cont < 5; cont++) {
				System.out.println("Introduzca la edad de la " + (cont + 1) + "a persona");
				int edad = tec.nextInt();
				sumaEdad += edad;
			}
			if (sumaEdad < 200) System.out.println("Las edades no suman 200. Repita el proceso");
		} while (sumaEdad < 200);
		System.out.println("La suma de las edades es " + sumaEdad);
	}

}
