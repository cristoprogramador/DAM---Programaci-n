package _03ejercicios;

import java.util.Scanner;

/**
 * (dosMitades) El usuario introduce un texto, lo leemos en una variable con
 * nextLine(). A continuación le mostramos la mitad del texto en una línea y la
 * otra mitad en otra linea:
 * 		Introduce un texto: En_un_lugar_de_la_mancha
 * 		Primera mitad: En_un_lugar_
 * 		Segunda mitad: de_la_mancha
 * @author Cristobal Salido
 *
 */
public class _11DosMitades {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String texto = tec.nextLine();
		int mitad = texto.length()/2;
		System.out.println(texto.substring(0,mitad));
		System.out.println(texto.substring(mitad,texto.length()));
	}

}
