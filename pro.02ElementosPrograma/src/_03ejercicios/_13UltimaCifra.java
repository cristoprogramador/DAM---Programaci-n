package _03ejercicios;

import java.util.Scanner;

/*
 * (UltimaCifra) Escribir un programa que muestre la ultima cifra de un 
numero entero que introduce el usuario por teclado. Pista: ¿Que devuelve 
a%10 ? 

Introduce un numero entero:  
3761 ? 
La ultima cifra de 3661 es 1 

 */
public class _13UltimaCifra {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca un numero entero");
		int numero = tec.nextInt();
		
		int unidad = numero % 10;
		
		System.out.println("El ultimo numero de "+numero+" es "+unidad);
		
	}

}
