package _06ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * (PrimosHastaN) Programa que solicite al usuario un numero n y muestre todos
 * los números primos menores o iguales que n.
 * 
 * @author alumno
 *
 */
public class _06PrimosHastaN {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Pedeimos el numero entero
		System.out.println("Escriba un numero entero: ");
		int num = tec.nextInt();
		int cont;
		boolean esPrimo;

		// 1 Siempre será numero primo aunque escrivamos 1
		System.out.print("1");

		// Si el numero entero es 2 o mayor
		if (num >= 2)
			System.out.print(", 2");

		// si el numero es distinto a 1 o 2 comprovamos todos los numeros hasta
		// llegar a el

		// contamos del 3 al numero n
		for (int numeros = 3; numeros <= num; numeros++) {
			// Si el numero no es par comprobamos si el numero es divisible por el resto de
			// numeros
			if (numeros % 2 != 0) {
				// Suponemos que el numero es primo
				esPrimo = true;
				// Iniciamos el contador de numeros por los que dividir
				cont = 1;
				do {
					// aumentamos el numero por el que dividir empezamos por 2
					cont ++;
					// Si el numero es divisible por otro numero...
					if (numeros % cont == 0) {
						// El numero no es primo
						esPrimo = false;
					}
					
					// Repetimos aumentando el numero por el que dividir mientras los numeros por
					// los que dividir sean menores o iguales a la mitad del numero
					// y el numero sea primo
				} while (cont <= (numeros / 2) && esPrimo);

				// si el numero es primo lo sacamos por pantalla
				if (esPrimo)
					System.out.print(", " + numeros);
			}
		}
	}

}
