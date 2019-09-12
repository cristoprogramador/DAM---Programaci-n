package _03ejercicios;

import java.util.Scanner;

/**
 * (desplazarIzquierda) El usuario introduce una palabra, que leemos con next().
 * A continuación desplazamos el primer carácter de la palabra introducida a la
 * última posición. El método main utilizará un método
 * public static String desplazar(String texto)
 * que realice el desplazamiento
 * Ejemplo:
 * Introduce una palabra: abstracción
 * Texto desplazado: bstraccióna
 * @author Cristobal Salido
 *
 */
public class _13DesplazarIzquierda {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce una palabra:");
		String palabra = tec.next();
		System.out.println("Texto desplazado: "+desplazar(palabra));

	}
	public static String desplazar(String texto){
		char primera= texto.charAt(0);
		String desplazada=texto.substring(1)+primera;
		return desplazada;
	}

}
