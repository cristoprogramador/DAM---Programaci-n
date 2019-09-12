package _02Ejemplos;

import java.util.Arrays;

public class _07ClaseArrays {

	public static void main(String[] args) {
		// ARRAYS.SORT ORDENA EL ARRAY POR DEFECTO ORDEN ASCENDENTE
		int edad[] = { 20, 29, 8, 3, 14 };
		// ordenamos el array edad de menor a mayor
		Arrays.sort(edad);
		System.out.println(Arrays.toString(edad));

		// ARRAYS.FILL RELLENA TODO EL ARRAY CON EL MISMO DATO
		int[] numeros = new int[20];
		// rellenamos todo el array con el numero 15
		Arrays.fill(numeros, 15);
		System.out.println(Arrays.toString(numeros));

		// ARRAYS.EQUALS COMPARA EL CONTENIDO DE DOS ARRAYS
		int[] v1 = { 1, 2, 3, 4 };
		int[] v2 = { 1, 2, 3, 4 };
		int[] v3 = v2;

		// compara las direcciones de memoria
		System.out.println(v1 == v2);// falso
		System.out.println(v1.equals(v2));// falso
		System.out.println(v2 == v3);// verdadero

		// compara el contenido de los arrays
		System.out.println(Arrays.equals(v1, v2));// verdadero

	}

}
