package _06ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * (TablaMult) Escribir un programa que permita al usuario introducir un número
 * N e imprima la tabla de multiplicar (del 0 al 10) de todos los números entre
 * 1 y N. Ejemplo: Si el usuario introduce en número 5, el programa imprimiria
 * Tabla del 1: 1 por 0, 0 1 por 1, 1 1 por 2, 2 ... 1 por 10, 10 Tabla del 2: 2
 * por 0, 0 2 por 1, 2 ....
 * 
 * @author alumno
 *
 */
public class _05TablaMult {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduzca el numero de tablas de multiplicar a mostrar");
		int tabla = tec.nextInt();
		
		for (int cont = 0; cont < tabla; cont++) {
			System.out.println("Tabla del " + (cont+1) + ":");
			
			for (int cont2 = 0; cont2 <= 10; cont2++) {
				System.out.println((cont + 1) + " por " + cont2 +", " + (cont+1)*cont2);
			}
			
			System.out.println();
			
		}
		
	}

}
