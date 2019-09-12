package _06ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * (NotasPorAlumno) Programa que pida al usuario las notas de A alumnos en S
 * asignaturas, alumno por alumno. A y S se definirán en el programa como
 * CONSTANTES. Alumno 1 Introduce nota de asignatura 1: 8 Introduce nota de
 * asignatura 2: … Alumno 2 Introduce nota de asignatura 1: ….
 * 
 * @author alumno
 *
 */
public class _02NotasPorAlumno {
	final static int A = 7;
	final static int S = 5;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		for (int cont = 0; cont < A; cont++) {
			System.out.println("Alumno " + (cont+1));
			for (int cont2 = 0; cont2 < S; cont2++) {
				System.out.println("Introduzca la nota de la asignatura " + (cont2 + 1));
				double nota = tec.nextDouble();
			}

		}
	}
}
