package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * La famosa ecuaci�n de Einstein para la conversi�n de una masa m en
 * energ�a viene dada por la f�rmula E= mc2, donde c es la velocidad de la luz
 * que vale 2.997925 � 108 m/s. Escribir un programa que lea el valor de la
 * masa y obtenga la energ�a correspondiente seg�n la anterior f�rmula.
 * 
 * @author Cristobal Salido
 */
public class _18Einstein {

	public static void main(String[] args) {
		/**
		 * llamamos a la clase scanner definiendo locale us para poder usar el punto
		 * pedimos introducción de datos y definimos una variable para guardar el valor introducido
		 */
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduzca la masa del objeto en Kilogramos");
		double masa = tec.nextDouble();
		//calcula la Energia que se obtiene de una masa según la formula E=mc2
		final double c= 2.997925E8;
		double energia = masa*(c*c);
		/**
		 * mostramos el resultado por pantalla apelando
		 * el metodo energia que creamos mas adelante
		 */
		System.out.println("La energia correspondiente a un objeto de " + masa + 
				" kilogramos de masa es "+ energia + " Julios");
		
	}

}
