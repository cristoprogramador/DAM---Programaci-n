package _02ejemplos;

import java.util.Scanner;//importación de la clase Scanner

public class _03EntradaElemental {
	public static void main (String args[]){
		Scanner tec = new Scanner(System.in);
		//Para poder utilizar la case Scanner devemos importarla o bien
		//indicar su dirección "java.util.Scanner tec = new Sanner(System.in)"
		
		System.out.println("Intoduce tu edad: ");
		int edad =tec.nextInt();
		
		System.out.println("Tienes " + edad + " años");
			
		if (edad>= 18){
		System.out.println("Eres mayor de edad");
		} else {
		System.out.println("Eres menor de edad");
		}
	}
}