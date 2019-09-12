package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

//Esta sería la descripción de la documentación.
//Se crea a partir de /** y pulsando intro
//Con javadoc generaremos documentación web a partir de los comentarios introducidos
//tiene parametros comco @autor @param @return, etc... 
//permite utilizar etiquetas html <b></b>

/**
 * Ejercicio 10 del tema 2 (Solución modular)
 * 
 * La famosa ecuación de Einstein para la conversión de una masa m en 
 * energía viene dada por la fórmula E= mc2, donde c es la velocidad de la luz 
 * que vale 2.997925 · 108 m/s. Escribir un programa que lea el valor de la 
 * masa y obtenga la energía correspondiente según la anterior fórmula.
*/

public class _18Einstein {
	public static void main(String arg[])
	{
		/**
		 * llamamos a la clase scanner definiendo locale us para poder usar el punto
		 * pedimos introducción de datos y definimos una variable para guardar el valor introducido
		 */
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduzca la masa del objeto en Kilogramos");
		double masa = tec.nextDouble();
		/**
		 * mostramos el resultado por pantalla apelando
		 * el metodo energia que creamos mas adelante
		 */
		System.out.println("La energia correspondiente a un objeto de " + masa + 
				" kilogramos de masa es "+ energia(masa) + " Julios");
	}
/**
 * metodo que calcula la Energia que se obtiene de una masa según la formula E=mc2
 * @param masa valor de la masa si viene en kilos se obtiene julios
 * @return energia obtenida de la masa dada
 */
	public static double energia(double masa)
	{
		final double c= 2.997925E8;
		return masa*(c*c);
	}
}
