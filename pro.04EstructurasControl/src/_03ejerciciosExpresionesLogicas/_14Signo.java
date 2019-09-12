package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (Signo) Dados dos numeros enteros, num1 y num2, realizar un programa que escriba 
 * uno de los dos mensajes:
 * 
 *  El producto de los dos numeros es positivo o nulo o bien el producto de los dos numeros es negativo.
 *  
 *  Resolverlo sin calcular el producto, sino teniendo en cuenta unicamente 
 *  el signo de los numeros a multiplicar.
 *  
 * @author Cristobal Salido
 *
 */
public class _14Signo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		int num1 = tec.nextInt();
		System.out.println("Introduzca otro numero entero: ");
		int num2 = tec.nextInt();
		
		if (num1 < 0 || num2 < 0)System.out.println("El producto de los dos numeros es negativo");
		else if (num1 == 0 || num2 == 0)System.out.println("El producto de los dos numeros es nulo");
		else System.out.println("El producto de los dos numeros es positivo");

	}

}
