package _03ejerciciosExpresionesLogicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Hora12) Escribir un programa que lea la hora de un dia en notación de 24
 * horas y la exprese en notación de 12 horas. Por ejemplo, si la entrada es 13
 * horas 45 minutos, la salida será 1:45 PM. La hora y los minutos se leerán de
 * teclado de forma separada, primero la hora y luego los minutos.
 * 
 * @author alumno
 *
 */
public class _08Hora12 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduzca las horas en notación de 24 horas: ");
		int horas = tec.nextInt();
		System.out.println("Introduzca los minutos");
		int minutos = tec.nextInt();

		if (horas == 0)
			System.out.format("%02d:%02d AM", 12, minutos);
		else if (horas < 12)
			System.out.format("%02d:%02d AM", horas, minutos);
		else if (horas == 12)
			System.out.format("%02d:%02d PM", horas, minutos);
		else 
			System.out.format("%02d:%02d PM", horas - 12, minutos);
			
		}
	
}
