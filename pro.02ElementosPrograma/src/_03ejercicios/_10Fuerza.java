package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 *  (Fuerza) La fuerza de atracción entre dos masas m1 y m2 separadas por 
una distancia d, está dada por la fórmula: 

 F=(G*m1*m1)/d(Al cuadrado) donge G = 6.693 * 10 elevado a menos 11
 
Escribir un programa que lea la masa de dos cuerpos y la distancia entre 
ellos y a continuación obtenga su fuerza de atracción. 
 */

public class _10Fuerza {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		double g = 6.693E-11;
		double m1, m2, d;

		if (args.length == 3) {
			m1 = Double.parseDouble(args[0]);
			m2 = Double.parseDouble(args[1]);
			d = Double.parseDouble(args[2]);
		} else {
			// lectura de datos
			System.out.println("Masa del objeto 1 en Kilogramos");
			m1 = tec.nextDouble();
			System.out.println("Masa del objeto 2 en Kilogramsos");
			m2 = tec.nextDouble();
			System.out.println("Distancia entre ambos objetos en metros");
			d = tec.nextDouble();
		}
		// calculo de la fuerza
		double f = (g * m1 * m2) / (d * d);

		// Solución por pantalla
		System.out.println("La fuerzan entre los objetos es " + f + " Newtons");
	}
}
