package _02ejemplos;

import java.util.Scanner;

public class _01ExpresionesLogicas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Edad de Miguel: ");
		int m = tec.nextInt();
		System.out.println("Edad de Pablo: ");
		int p = tec.nextInt();

		// El resultado de una condici�n es de tipo boolean
		System.out.println("�Miguel es mayor que Pablo? " + (m > p));
		System.out.println("�La edad de Miguel y Pablo suman 100? " + (m + p == 100));

		// Puedo guardar el resultado de una condici�n en
		// una variable de tipo boolean
		// Si se cumple que m es mayor o igual a 18 ser� true (si es adulto)
		// en caso contrario ser� flase (no es adulto)
		boolean miguelEsAdulto = m >= 18;
		System.out.println("�Miguel es adulto? " + miguelEsAdulto);

		// Operadores de comparaci�n
		System.out.println();
		System.out.println("Operadores de comparaci�n: ");
		System.out.println("-------------------------");
		System.out.println(" > �Miguel es mayor que pablo? " + (m > p));
		System.out.println(" < �Miguel es menor que pablo? " + (m < p));
		System.out.println(">= �Miguel es mayor o de la misma edad que pablo? " + (m >= p));
		System.out.println("<= �Miguel es menor o de la misma edad que pablo? " + (m <= p));
		System.out.println("== �Miguel tiene la misma edad que pablo? " + (m == p));
		System.out.println("!= �Miguel tiene distinta edad que pablo? " + (m != p));
		System.out.println(" < �Miguel es menor de edad? " + (m < 18));
		System.out.println(">= �Pablo es mayor de edad? " + (p >= 18));
		System.out.println("<= �Entre los dos tienen 30 a�os o menos? " + (m + p <= 30));
		System.out.println("!= Miguel no tiene 18 a�os" + (m != 18));

	}

}
