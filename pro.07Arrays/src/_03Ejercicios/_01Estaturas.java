package _03Ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 1. (Estaturas) Escribir un programa que lea de teclado la estatura de 10 personas y las almacene en un 
 * array. Al finalizar la introducción de datos, se mostrarán al usuario los datos introducidos con el 
 * siguiente formato: 
 * Persona 1: 1.85 m. 
 * Persona 2: 1.53 m. 
 * ... 
 * Persona 10: 1.23 m. 
 * 
 * @author alumno
 *
 */
public class _01Estaturas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		double[] arrayAlturas = new double[10];
		
		for (int i = 0; i < arrayAlturas.length; i++) {
			System.out.print("Altura " + (i+1) + ": ");
			arrayAlturas[i] = tec.nextDouble();
		}
		System.out.println("----------------");
		for (int i = 0; i < arrayAlturas.length; i++) {
			System.out.format("Persona %d: %.2f m\n", (i+1), arrayAlturas[i]);
		}

	}

}
