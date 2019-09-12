package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

public class _19Nombra {
/**
 * (Nombre) Escribir un programa en el que el usuario pueda escribir su nombre.
 * El programa le dira si la primera y la ultima letra del nombre coinciden o no. 
 * Pruebalo con Ana, ana, Angel y Amanda
 * @param args
 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduzca un nombre: ");
		String nombre = tec.nextLine();
		
		if (nombre.toUpperCase().charAt(0) == nombre.toUpperCase().charAt(nombre.length()-1))
			System.out.println("La primera y la ultima letra son iguales");
		else System.out.println("La primera y la ultima letra son distintas");
		
	}

}
