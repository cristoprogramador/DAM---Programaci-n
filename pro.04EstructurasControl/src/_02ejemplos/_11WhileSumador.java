package _02ejemplos;

import java.util.Scanner;

public class _11WhileSumador {

	public static void main(String[] args) {
		// Leer de teclado las notas de un grupo de alumnos
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce numero de alumnos del grupo: ");
		int numAlumnos = tec.nextInt();

		// Leer la nota de cada alumno
		// Contador es una variable que utilizamos para saber cuantas veces se hace algo
		int cont = 0; // Notas que llevo leidas (Veces que se ha hecho)
		double suma = 0; // Acumulador para las notas
		while (cont < numAlumnos) {
			System.out.println("Introduce nota: ");
			double nota = tec.nextDouble();
			cont++;
			// Si inicializamos el contador a 0, en el contador fijamos (cont< n)
			// para que pare cuando sea igual al numero de veces que queremos que se repita

			// Sumamos la nota al total
			suma = suma + nota;
		}

		System.out.println("Las notas suman: " + suma);
		System.out.println("La media de notas es: " + suma / numAlumnos);

	}

}
