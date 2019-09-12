package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * (Subsecuencia) Escribir un método que, dado un array, determine la posición
 * de la primera subsecuencia del array que comprenda al menos tres números
 * enteros consecutivos en posiciones consecutivas del array. De no existir
 * dicha secuencia devolverá -1. Por ejemplo: en el array {23, 8, 12, 6, 7, 9,
 * 10, 11, 2} hay 3 números consecutivos en tres posiciones consecutivas, a
 * partir de la posición 5: {9,10,11}
 * 
 * @author alumno
 *
 */
public class _13Subsecuencia {
	

	public static void main(String[] args) {
		int[] numeritos = { 23, 8, 12, 6, 7, 8, 9, 10, 11, 2 };
		int longitud = 4;

		int posicion = subsecuencia(numeritos, longitud);
		if (posicion != -1)
			for(int cont = posicion; cont < longitud; cont++)
			System.out.print(numeritos[cont] + " ");

		posicion = subsecuenciaArrayList(numeritos);
		if (posicion != -1)
			System.out.println(numeritos[posicion] + ", " + numeritos[posicion + 1] + ", " + numeritos[posicion + 2]);

	}

	public static int subsecuencia(int[] numeritos, int longitud) {
		int posicion = -1;
		boolean enc = false;
		int secuencia;

		for (int i = 0; i < numeritos.length - (longitud-1) && !enc; i++) {
			secuencia = 0;
			for (int cont = 1; cont < longitud+1; cont++) {
				if (numeritos[i]+cont == numeritos[i+cont]) {
					secuencia++;
				}
			}
			if (secuencia == longitud) {
				posicion = i;
				enc = true;
			}
			
		}

		return posicion;
	}

	public static int subsecuenciaArrayList(int[] numeritos) {
		int posicion = -1;
		boolean enc = false;

		ArrayList<Integer> secuencia = new ArrayList<>();

		for (int i = 0; i < numeritos.length && !enc; i++) {
			secuencia.add(numeritos[i]);
		}

		for (int i = 0; i < secuencia.size() - 2; i++) {
			if (secuencia.get(i) == secuencia.get(i + 1) - 1 && numeritos[i] == secuencia.get(i + 2) - 2) {
				posicion = i;
				enc = true;
			}
		}

		return posicion;
	}

}
