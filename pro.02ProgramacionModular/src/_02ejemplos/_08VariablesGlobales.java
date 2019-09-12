package _02ejemplos;

import java.util.Scanner;

public class _08VariablesGlobales {
	//La variable tec es global
	//Una variable global es accesible desde cualquier parte de la clase
static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		String n = leerNombre();
		int ed = leerEdad();
		double es = leerEstatura();
		
		System.out.println(n + " - " + ed + " - " + es);
	}
	public static int leerEdad(){
		System.out.println("Introduce edad: ");
		int edad = tec.nextInt();
		return edad;
	}
	public static double leerEstatura(){
		System.out.println("Introduce estatura: ");
		double est = tec.nextDouble();
		return est;
	}
	public static String leerNombre(){
		System.out.println("introduce nombre: ");
		String nom= tec.next();
		return nom;
	}

}
