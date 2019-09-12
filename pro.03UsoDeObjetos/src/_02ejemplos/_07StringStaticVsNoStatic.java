package _02ejemplos;

import java.util.Scanner;

public class _07StringStaticVsNoStatic {
	public static void main (String[] args){
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		//nextLine():
		// - Lee todo el texto hasta el salto de linea
		// - Es capaz de leer un salto de linea sin nada mas
		String nombre= tec.nextLine();
		
		System.out.println("Tu nombre es: " + nombre);
		
		System.out.println("Nombre de tu perro: ");
		//next():
		// - Lee el texto hasta que encuentra un delimitador (espacio, tabulador, intro)
		// - No es capaz de leer un salto de linea que no lleve texto
		String nombrePerro = tec.next();
		System.out.println("Tu perro se llama " + nombrePerro);
	}

}
