package _03ejercicios;

import java.util.Scanner;

/*
 * (desplazarDerecha) El usuario introduce una palabra, que leemos con next().
 * A continuacion desplazamos el ultimo caracter de la palabra introducida a la
 * primera posicion. El metodo main utilizar un metodo 
 * public static String desplazar(String texto) que realice el desplazamiento 
 * Ejemplo: 
 * 		Introduce una palabra: abstraccion 
 * 		Texto rotado: nabstraccin
 */
public class _14DesplazarDerecha {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
		String palabra = tec.next();
		System.out.println("Texto rotado: " + derecha(palabra));
	}

	// Metodo para desplazar a la derecha
	public static String derecha(String palabra) {
		return palabra.charAt(palabra.length() - 1) + 
				palabra.substring(0, palabra.length()-1);
	}

}
