package _02ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _06AmbitoVariables {

	public static void main(String[] args) 
	{
		double base, altura, area; //Locales al metdo main
		/**
		 * Estas variables solo se utilizan dentro de este metodo
		 * a este tipo de variables se les denomina variables locales a un metodo
		 */
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduce base y altura: ");
		
		base = tec.nextDouble();
		altura = tec.nextDouble();
		area = areaTriangulo(base, altura);
		System.out.println("Area: " + area);

	}
	public static double areaTriangulo (double base, double alturas)		
	{
		double area = base * altura / 2; //Local al metodo areaTriangulo
		/**
		 * Estas variables solo se utilizan dentro de este metodo
		 * a este tipo de variables se les denomina variables locales a un metodo
		 * tendremos dos variables area dentro de la misma clase pero cada una dentro
		 * del area de memoria propia de cada metodo
		 */
		return area;	
	}

}
