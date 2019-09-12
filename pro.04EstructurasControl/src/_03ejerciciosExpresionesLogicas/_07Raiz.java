package _03ejerciciosExpresionesLogicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Raiz) Se desea calcular la raiz cuadrada real de un nimero real cualquiera
 * pedido inicialmente al usuario. Como dicha operaci�n no est� definida para
 * los n�meros negativos es necesario tratar, de alg�n modo, dicho posible error
 * sin que el programa detenga su ejecuci�n.
 * 
 * @author Cristobal Salido
 */
public class _07Raiz {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduzca un numero real caualquiera para calcular su raiz cuadrada:");
		double numero = tec.nextDouble();
		if (numero < 0)
			System.out.println("No se puede hayar la raiz de un numero negativo.\n"
					+ "Reinicie el programa y vuelva a intentarlo");
		else
			System.out.println("La raiz cuadrada de " + numero + " es: " + Math.sqrt(numero));

	}

}
