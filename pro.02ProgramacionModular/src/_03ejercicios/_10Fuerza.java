package _03ejercicios;
/*
 * Hacer el ejercicio _10Fuerza de pro.02ElementosPrograma de forma modular
*/

import java.util.Locale;
import java.util.Scanner;

public class _10Fuerza {

	public static void main(String[] args) {		
		Scanner tec= new Scanner(System.in).useLocale(Locale.US);
		
		//lectura de datos
		System.out.println("Masa del objeto 1 en Kilogramos");
		double m1 = tec.nextDouble();
		System.out.println("Masa del objeto 2 en Kilogramsos");
		double m2 = tec.nextDouble();
		System.out.println("Distancia entre ambos objetos en metros");
		double d = tec.nextDouble();
	
		
		//Solución por pantalla llamando al modulo fuerza que generamos mas abajo.
		System.out.println("La fuerzan entre los objetos es " + fuerzaAtraccion(m1, m2, d) + " Newtons");
		
	}
	
	//modulo fuerza, a partir de ahora llamando a fuerza(m1,m2,d) obtendremos el resultado 
	/**
	 * 
	 * @param m1 masa del primer parametro en kilos
	 * @param m2 masa del segundo objeto en kilos
	 * @param d distancia entre los dos objetos en metros
	 * @return Fuerza de atracción en newtons
	 * 
	 */
	public static double fuerzaAtraccion (double m1, double m2, double d) {
		final double G = 6.693E-11;
		//final lo utilizamos para indicar que el numero guardado en la variable es una constante
		
		return (G*m1*m2)/(d*d);
	}

}
