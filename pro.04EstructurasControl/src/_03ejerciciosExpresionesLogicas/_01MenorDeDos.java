package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (MenorDeDos) Escribir un programa que muestre el menor de dos números enteros introducidos
 * por teclado. (habrá que usar sentencias if else anidadas)
 * @author alumno
 *
 */
public class _01MenorDeDos {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int a = tec.nextInt();
		System.out.println("Introduce otro numero entero: ");
		int b= tec.nextInt();
		
		// añadidos el primer if para dar solución al caso que sean iguales
		// esto no lo pide el enunciado, de normal asumiremos que siempre serán distintos.
		if (a == b) System.out.println("Ambos numeros son iguales: " + a + " y " + b);
		else{
			if (a < b) System.out.println("El numero menor es: " + a);
			else System.out.println("El numero menor es: " + b);
		}

	}

}
