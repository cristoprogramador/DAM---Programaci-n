package _03Ejercicios;

import java.util.ArrayList;

import javax.swing.SingleSelectionModel;

public class _03DadosConArrayList {

	public static void main(String[] args) {
		final int LANZAMIENTOS = 100000;
		final int FRECUENCIA = 1000;
		// int[] veces = new int[7];

		ArrayList<Integer> veces = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			veces.add(0);
			// veces.add(new Integer (0));
		}

		for (int cont = 1; cont <= LANZAMIENTOS; cont++) {
			// Lanzamos dado
			int dado = (int) (Math.random() * 6) + 1;
			// Incrementamos contador correspondient
			// veces[dado] ++;
			veces.set(dado, veces.get(dado) + 1);
			// Mostrar estadisticas cada cierto numero de lanzamientos
			if (cont % FRECUENCIA == 0) {
				System.out.println("Lanzamiento " + cont);
				/*
				 * for (int i = 1; i < veces.length; i++) { System.out.println( " " + i + ": " +
				 * (double)veces[i]/cont * 100); }
				 */
				double suma = 0;
				for (int i = 1; i < veces.size(); i++) {
					System.out.println(" " + i + ": " + (double) veces.get(i) / cont * 100);
					suma += (double) veces.get(i) / cont * 100;
				}
				System.out.println(suma);

			}

		}
	}
}
