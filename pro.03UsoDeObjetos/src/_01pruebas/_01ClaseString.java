package _01pruebas;

import java.util.Scanner;

public class _01ClaseString {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introdude un nombre");
		String nombre = tec.nextLine();
		
		//Devuelve el caracter de la posición [0 a .....
		System.out.println(nombre.charAt(3));
		//Devuelve el Nº de la primera posición en la que se encuentra el caracter "c"
		System.out.println(nombre.indexOf("c"));
		//Devuelve los caracteres de la posición [0 a ...[
		System.out.println(nombre.substring(6,9));
		//trim quita los espacios del principio y el final de la cadena
		System.out.println(nombre.trim());
	}

}
