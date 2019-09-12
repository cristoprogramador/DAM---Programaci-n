package _02ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _14ForContador {

	public static void main(String[] args) {
		// Leer de teclado las notas de un grupo de alumnos
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Introduce numero de alumnos del grupo: ");
		int numAlumnos = tec.nextInt();

		// Leer la nota de cada alumno
		// Contador es una variable que utilizamos para saber cuantas veces se hace algo
		double suma = 0;
		for (int num = 0; num < numAlumnos; num++) {
			System.out.println("Introduce nota: ");
			double nota = tec.nextDouble();
			// Si inicializamos el contador a 0, en el contador fijamos (cont< n)
			// para que pare cuando sea igual al numero de veces que queremos que se repita
		}
	}

}
