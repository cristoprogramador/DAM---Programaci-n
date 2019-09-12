package _03ejerciciosExpresionesLogicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Division) Escribir un programa que pida al usuario dos n�meros enteros 
 * y le muestre el resultado de la divisi�n. Tener en cuenta que si dividimos 
 * un n�mero por cero se producir� un error de ejecuci�n.
 * 
 * @author Cristobal Salido
 */
public class _06Division {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Introduzca un numero entero a dividir:");
		int num1 = tec.nextInt();
		System.out.println("Introduzca otro numero entero por el que dividir:");
		int num2 = tec.nextInt();
		
		if (num2 == 0)
			System.out.println("El divisor no puede ser 0 vuelva a ejecutar el programa");
		else System.out.println(num1 + " dividido entre " + num2 + " es " + num1/num2);
			
	}

}
