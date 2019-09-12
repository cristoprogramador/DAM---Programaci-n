package _03ejerciciosExpresionesLogicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Calculadora) Escribir un programa para simular una calculadora. 
 * Considera que los calculos posibles son del tipo num1 operado num2, 
 * donde num1 y num2 son dos numeros reales cualesquiera
 * y operador es una de entre: +, -, * y /. 
 * 
 * El programa pedira al usuario en primer lugar el valor num1, 
 * acontinuacion el operador y finalmente el valor num2. 
 * 
 * Resolver utilizando instrucciones if-else
 * @author Cristobal Salido
 *
 */
public class _15Calculadora {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Primer numero");
		double num1 = tec.nextDouble();
		System.out.println("operación ( +, -, *, /");
		String oper = tec.next();
		System.out.println("segundo numero");
		double num2 = tec.nextDouble();
		
		if (oper.equals("+")) System.out.println(num1 + num2);
		else if (oper.equals("-")) System.out.println(num1 - num2);
		else if (oper.equals("*")) System.out.println(num1 * num2);
		else if (oper.equals("/")) System.out.println(num1 / num2);
		else System.out.println("Operador incorrecto");

		
	}
		
}
