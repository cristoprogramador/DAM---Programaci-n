package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03CapturarExcepcion1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Multiplicar por 2");
		
		try {
			//Se "intenta" (try) ejecutar las siguientes instrucciones
			//Si se produce una InputMismatchException saltará al bloque catch
		System.out.println("Introduce un numero: ");
		double num = tec.nextDouble();
		
		System.out.println("El doble de " + num + " es " + num *2);
		} catch (InputMismatchException e) {
			System.out.println("Dato de entrada incorrecto");
		}
		
		System.out.println("Fin");
	}

}
