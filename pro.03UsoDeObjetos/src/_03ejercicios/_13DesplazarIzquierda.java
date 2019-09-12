package _03ejercicios;

import java.util.Scanner;

/**
 * (desplazarIzquierda) El usuario introduce una palabra, que leemos con next().
 * A continuaci�n desplazamos el primer car�cter de la palabra introducida a la
 * �ltima posici�n. El m�todo main utilizar� un m�todo
 * public static String desplazar(String texto)
 * que realice el desplazamiento
 * Ejemplo:
 * Introduce una palabra: abstracci�n
 * Texto desplazado: bstracci�na
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
