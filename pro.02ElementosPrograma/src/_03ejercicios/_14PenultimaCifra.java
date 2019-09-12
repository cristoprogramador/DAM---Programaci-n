package _03ejercicios;

import java.util.Scanner;

public class _14PenultimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		/*
		// Solución propia
		System.out.println("Introduzca un numero entero");
		int numero = tec.nextInt();
		
		int unidad = numero % 10;
		int centena = (numero % 100)/10;
		
		System.out.println("El ultimo numero de "+numero+" es "+unidad);
		System.out.println("El penultimo numero de "+numero+" es "+centena);
		*/
		
		// Solución Clase
		System.out.println("Introduce número entero: ");
		int num = tec.nextInt();
		
		int sinUltima =num/10;
		int penultimaCifra = sinUltima % 10;
		
		System.out.format("La penúltima cifra es %d\n", penultimaCifra);
		System.out.println("La penúltima cifra es " + penultimaCifra);
		//De otra forma, con una sola operación
		System.out.format("La penúltima cifra es %d", num /10 % 10);
		
	}


}
