package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 15. (Redondear1)
 * Math.round( x ) redondea x de manera que este queda sin
 * decimales. (Math.round(35.5289) da como resultado 35.0)
 * Trata de escribir un programa en el que el usuario introduzca
 * un numero real y a continuacion se muestre redondeado a 
 * un decimal. Pista : combinar productos, divisiones y Math.round()
 * 
 * Ejemplo de ejecucion:
 * 
 * Introduce un numero entero:
 * 35.5289 (Enter)
 * El numero, redondeado a un decimal es 35.5
**/

public class _15Redondear1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("introduce un numero real: ");
		double n = tec.nextDouble();
		
		n = Math.round(n*10);
		n = n /10;
		
		System.out.println("El numero redondeado a un decimal es: "+ n);
		
		//otra forma, al vuelo
		System.out.println(Math.round(n*10)/10.0);
	}

}
