package _06ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * (NotasPorAsignatura) Programa que pida al usuario las notas de A alumnos en S
 * asignaturas, asignatura por asignatura. A y S se definirán en el programa
 * como CONSTANTES. Asignatura 1 Introduce nota del alumno 1: Introduce nota del
 * alumno 2: … Asignatura 2 Introduce nota del alumno 1: ….
 * 
 * @author alumno
 *
 */
public class _03NotasPorAsignaturas {

	final static int A = 7;
	final static int S = 5;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		for (int cont = 0; cont < S; cont++) {
			System.out.println("Asignatura " + (cont+1));
			for (int cont2 = 0; cont2 < A; cont2++) {
				System.out.println("Introduzca la nota del alumno " + (cont2 + 1));
				double nota = tec.nextDouble();
			}

		}
	}

}
