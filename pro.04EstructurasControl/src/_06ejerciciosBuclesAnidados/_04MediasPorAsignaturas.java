package _06ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * (MediasPorAsignatura) Repite el ejercicio anterior haciendo que se muestre la
 * media de cada asignatura Asignatura 1 Introduce nota del alumno 1: Introduce
 * nota del alumno 2: … Media asignatura 1: 8.5 puntos Asignatura 2 Introduce
 * nota del alumno 1: … … Media asignatura 2: 6.5 puntos …
 * 
 * @author alumno
 *
 */
public class _04MediasPorAsignaturas {

	final static int A = 7;
	final static int S = 5;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		for (int cont = 0; cont < S; cont++) {
			System.out.println("Asignatura " + (cont + 1));

			double suma = 0;
			double media = 0;

			for (int cont2 = 0; cont2 < A; cont2++) {
				System.out.println("Introduzca la nota del alumno " + (cont2 + 1));
				double nota = tec.nextDouble();
				suma += nota;
			}

			System.out.println("Media asignatura " + S + ": " + suma / A + " puntos");

		}
	}
}
