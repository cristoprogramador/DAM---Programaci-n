package _02ejemplos;

import java.util.Scanner;

public class _16ForSumadorRaro {

	public static void main(String[] args) {
		// Leer de teclado las notas de un grupo de alumnos
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce numero de alumnos del grupo: ");
		int numAlumnos = tec.nextInt();

		// Leer la nota de cada alumno
		// Contador es una variable que utilizamos para saber cuantas veces se hace algo

		double suma = 0;
		for (int cont = 0; cont < numAlumnos; cont++) {
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

		// Arriba forma correcta, ahora veremos ejemplos "incorrectos"

		// Inadecuado: Dejar partes vacias
		suma = 0;
		int cont = 0;
		for (; cont < numAlumnos;) {// Se comporta como un While
			System.out.println("Introduce nota: ");
			double nota = tec.nextDouble();
			suma = suma + nota;
			cont++;
		}

		// Inadecuado: Poner varias instrucicones en alguna parte
		double nota;
		for (cont = 0, suma = 0; cont < numAlumnos; suma = suma + nota, cont++) {
			// En esta ocasión introducimos mas de una operación en una de las partes del
			// for
			// inicialización // condición para repetir bucle // postbucle
			System.out.println("Introduce nota: ");
			nota = tec.nextDouble();
		}

		// Inadecuado: No basar el for en la variable de la ondiión
		cont = 0;
		for (suma = 0; cont < numAlumnos; suma = suma + nota) {
			System.out.println("Intoduce nota: ");
			nota = tec.nextDouble();
			cont++;
		}

	}

}
