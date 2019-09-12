package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (MenorDeTres) Escribir un programa que muestre el menor de tres números enteros introducidos
 * por teclado. Haz dos versiones: una utilizando los operadores lógicos necesarios (&&,||, ...)
 * y otra sin utilizar ninguno (habrá que usar sentencias if else anidadas)
 * @author alumno
 *
 */

public class _02MenorDeTres {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce entero 1: ");
		int a = tec.nextInt();	
		System.out.println("Introduce entero 2: ");
		int b = tec.nextInt();
		System.out.println("Introduce entero 3: ");
		int c = tec.nextInt();
		
		//Versión 1: Usando operadores lógicos
		
		if (a < b && a < c)
			System.out.println("El menor de los tres enteros es: " + a);
		else {
			if (b < c)
				System.out.println("El menor de los tres enteros es: " + b);
			else 
				System.out.println("El menor de los tres enteros es: " + c);
		}
		
		//Versión 2: Sin usar operadores logicos
		
		if (a < b)
			// El menor no es b
			// ¿Quien es el menor: a o c?
			if (a < c)
				System.out.println("El menor es: " + a);
			else
				System.out.println("El menor es: " + c);
		
		else 
			// El menor no es a
			// ¿Quien es el menor: b o c?
			if (c < b)
				System.out.println("El menor es: " + c);
			else
				System.out.println("El menor es: " + b);
			
				
	}

}
