package _04ejerciciosAlternativas;

import java.util.Scanner;

/**
 * (Calculadora) Escribir un programa para simular una calculadora.
 * Considera que los calculos posibles son del tipo num1 operado num2, 
 * donde num1 y num2 son dos numeros reales cualesquiera
 * y operador es una de entre: +, -, * y /. 
 * El programa pedira al usuario en primer lugar el valor num1, a
 * continuacion el operador y finalmente el valor num2. 
 * Resolver utilizando la sentencias switch.
 * 
 * @author Cristobal Salido
 */
public class _24Calculadora {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero: ");
		double num1 = tec.nextDouble();
		System.out.println("Introduzca simbolo de operacion a realizar (+, -, *, /");
		char oper = tec.next().charAt(0);
		System.out.println("Introduzca el segundo numero: ");
		double num2 = tec.nextDouble();
		
		switch (oper){
		case '+':
			System.out.println("Resultado " + (num1 + num2));
			break;
		case '-':
			System.out.println("Resultado " + (num1 - num2));
			break;
		case '*':
			System.out.println("Resultado " + (num1 * num2));
			break;
		case '/':
			System.out.println("Resultado " + (num1 / num2));
			break;
			default: System.out.println("Operador invalido");
			
		}
		}

}
