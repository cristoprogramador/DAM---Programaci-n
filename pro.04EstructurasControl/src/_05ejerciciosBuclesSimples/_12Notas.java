package _05ejerciciosBuclesSimples;

import java.util.Locale;
import java.util.Scanner;

/**
 * (Notas) Realizar un programa que permita introducir las notas de un examen de
 * los alumnos de un curso. El usuario irá introduciendo las notas una tras
 * otra. Se considerará finalizado el proceso de introducción de notas cuando el
 * usuario introduzca una nota negativa. Al final, el programa le dirá: • El
 * número de notas introducidas. • El número de aprobados (mayor o igual a 5
 * puntos) • La nota media
 * 
 * @author alumno
 *
 */
public class _12Notas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		double nota = 0;
		int notas = 0;
		int aprovados = 0;
		double suma = 0;

		while (nota >= 0) {
			System.out.println("Nota del alumno " + (notas+1) + ": ");
			nota = tec.nextDouble();
			if (nota >= 0) {
				suma += nota;
				if (nota >= 5)
					aprovados++;
				if (nota >= 0)
					notas++;
			}
		}

		System.out.println("Notas introducidas: " + (notas));
		System.out.println("Numero de aprovados: " + aprovados);
		System.out.println("Nota media: " + suma / (notas));

	}

}
