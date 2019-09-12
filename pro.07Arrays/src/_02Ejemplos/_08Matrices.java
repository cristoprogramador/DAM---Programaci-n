package _02Ejemplos;

import java.util.Arrays;

public class _08Matrices {

	public static void main(String[] args) {

		// Matriz -- Array con dos filas
		int[][] m = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10, 11, 12 } };
		// Cada elemento de m es un array de enteros

		// imprime las direcciones de memoria de los arrais dentro de la matriz
		System.out.println("Matriz: " + Arrays.toString(m));
		// imprime los elementos de la fila 0
		System.out.println("Fila 0: " + Arrays.toString(m[0]));
		// imprime los elementos de la fila 1
		System.out.println("Fila 1: " + Arrays.toString(m[1]));
		// imprime el elemento contenido en la fila 0 columna 2 del array
		System.out.println("Fila 0 columna 2: " + m[0][2]);

		// RECORRER LA MATRIZ
		// En una matriz .length nos da el numero de filas.
		for (int i = 0; i < m.length; i++) {
			// Con m[i].length conseguimos el valor de longitud de cada fila
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}
