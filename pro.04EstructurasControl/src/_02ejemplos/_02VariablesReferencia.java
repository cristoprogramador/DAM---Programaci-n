package _02ejemplos;

import java.util.Scanner;

public class _02VariablesReferencia {

	public static void main(String[] args) {
		// Si creo Strings usando solo un literal,
		// java reaprovecha el literal, no lo duplica
		String s1 = "a";
		String s2 = "a";
		System.out.println(s1 == s2);
		// Java se da cuenta que es el mismo objeto y
		// asigna el mismo a s2, no crea ninguno nuevo

		// Si los creo con new, s1 y s2 no ser�n iguales
		s1 = new String("a");
		s2 = new String("a");
		System.out.println(s1 == s2);
		// Java genera dos objetos iguales en
		// distintos puntos de memoria

		// Con variables referencia no se puede usar >, >=, <, <=
		// nos da err�r
		// System.out.println(s1 > s2);

		// Como hay que comparar Strings? METODO EQUALS (objeto.equals(objeto))
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del padre: ");
		String padre = tec.nextLine();

		System.out.println("Nombre del hijo: ");
		String hijo = tec.nextLine();

		System.out.println("Padre e hijo se llaman igual: " + (padre == hijo)); // Retonra false
		System.out.println("Padre e hijo se llaman igual: " + padre.equals(hijo)); // Retona true

	}

}
