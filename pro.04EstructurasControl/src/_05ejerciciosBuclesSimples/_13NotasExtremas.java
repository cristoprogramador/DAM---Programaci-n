package _05ejerciciosBuclesSimples;

import java.util.Locale;
import java.util.Scanner;

/**
 * (NotasExtremas) Modificar el ejercicio anterior para que además calcule la
 * nota máxima y la nota mínima.
 * 
 * @author Cristobal Salido
 *
 */
public class _13NotasExtremas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		double nota = 0;
		int notas = 0;
		int aprovados = 0;
		double suma = 0;
		double notaMaxima = 0;
		double notaMinima = 10;

		while (nota >= 0) {
			System.out.println("Introduzca nota del alumno: ");
			nota = tec.nextDouble();
			if (nota >= 0) {
				suma += nota;
				if (nota > notaMaxima)
					notaMaxima = nota;
				if (nota < notaMinima)
					notaMinima = nota;
				if (nota >= 5)
					aprovados++;
				if (nota >= 0)
					notas++;
			}
		}

		System.out.println("El numero de notas introducidas es: " + (notas));
		System.out.println("El numero de aprovados es: " + aprovados);
		System.out.println("La nota media es: " + suma / (notas));
		System.out.println("La nota maxima es: " + notaMaxima);
		System.out.println("La nota minima es: " + notaMinima);

	}

}
