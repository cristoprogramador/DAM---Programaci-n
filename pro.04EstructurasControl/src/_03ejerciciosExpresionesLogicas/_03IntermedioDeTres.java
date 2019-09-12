package _03ejerciciosExpresionesLogicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * (IntermedioDeTres) Escribir un programa que muestre el intermedio de tres
 * n�meros introducidos por teclado. Haz dos versiones: una utilizando los
 * operadores l�gicos necesarios (&&,||, �) y otra sin utilizar ninguno (habr�
 * que usar sentencias if else anidadas)
 * 
 * @author Cristobal Salido
 *
 */
public class _03IntermedioDeTres {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduzca el primer numero:");
		int a = tec.nextInt();
		System.out.println("Introduzca el segundo numero:");
		int b = tec.nextInt();
		System.out.println("Introduzca el tercer numero:");
		int c = tec.nextInt();

		// Ulitizando operadores l�gicos
		if ((a < b && a > c) || (a > b && a < c))
			System.out.println("El numero intermedio es " + a);
		if ((b < a && b > c) || (b > a && b < c))
			System.out.println("El numero intermedio es " + b);
		else
			System.out.println("El numero intermedio es " + c);

		// Sin utilizar operadores logicos
		// con la a
		if (a < b)
			if (a > c)
				System.out.println("El numero intermedio es " + a);
		if (a > b)
			if (a < c)
				System.out.println("El numero intermedio es " + a);

		// con la b
		if (b < a)
			if (b > c)
				System.out.println("El numero intermedio es " + b);
		if (b > a)
			if (b < c)
				System.out.println("El numero intermedio es " + b);

		// con la c
		if (c < b)
			if (c > a)
				System.out.println("El numero intermedio es " + c);
		if (c > b)
			if (c < a)
				System.out.println("El numero intermedio es " + c);

		// solución javi
		if (a < b) {
			if (c < a)
				System.out.println(a);
			else if (c < b)
				System.out.println(c);
			else
				System.out.println(b);
		} else {
			if (c < b)
				System.out.println(b);
			else if (c < a)
				System.out.println(c);
			else
				System.out.println(a);
		}

	}

}
