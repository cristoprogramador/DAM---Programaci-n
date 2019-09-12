package _02ejemplos;

import java.util.Scanner;

public class _09ProblemasNextLine {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		System.out.println("Estatuta: ");
		double est = tec.nextDouble();
		
		System.out.println(nombre + " - " + edad + " - " + est);
		
		//Problema: Cuando hacemos un nextLine() despues de otro nextXXXX()
		//Solución: Hacer nextline() entre nextInt() y nextLine()
		System.out.println("Edad: ");
		int edad2 = tec.nextInt(); tec.nextLine();
		
		System.out.println("Nombre: ");
		String nombre2 = tec.nextLine();
		
		System.out.println("Estatuta: ");
		double est2 = tec.nextDouble();
		
		System.out.println(nombre2 + " - " + edad2 + " - " + est2);
	}

}
