package _03Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class _02LLuvias {
	public static void main(String[] args) {
		double[] lluvias = new double[31];
		try {
			leerArray(lluvias, "lluviasenero.txt");
		} catch (FileNotFoundException e) {
			System.out.println("El fichero lluviasenero.txt no se encuentra");
			e.printStackTrace();
		}

		System.out.println("La cantidad total de lluvias del mes es: " + suma(lluvias));
		System.out.println("La cantidad media de lluvias del mes es: " + media(lluvias));
		System.out.println("La cantidad más grande de lluvia caída en un solo día es: " + maximo(lluvias));
		System.out.println("El día que más llovió fue el " + (posMaximo(lluvias) + 1));
		System.out.println("La cantidad más pequeña de lluvia caída en un solo día es: " + minimo(lluvias));
		System.out.println("El día que menos llovió fue el " + (posMinimo(lluvias) + 1));
		System.out.println("En " + contarApariciones(lluvias, 0) + " días no llovió nada.");

		int maxMedia = 0;
		System.out.println("2.2 aparece " + contarApariciones(lluvias, 2.2));
		for (double cont = (media(lluvias) + 0.1); cont <= maximo(lluvias); cont += 0.1) {
			cont = Math.round(cont * 10) / 10d;
			maxMedia += contarApariciones(lluvias, cont);
		}

		System.out.println("En " + maxMedia + " días la lluvia superó la media.");

		double diferencia = Math.abs(sumaParcial(lluvias, 0, 14) - sumaParcial(lluvias, 15, 30));
		if (diferencia == 0)
			System.out.println("En la primera y en la segunda quincena llovió lo mismo");
		else if (sumaParcial(lluvias, 0, 15) < sumaParcial(lluvias, 16, 30))
			System.out
					.println("En la primera quincena del mes llovió " + diferencia + " l/m2 menos que en la segunda.");
		else
			System.out.println("En la primera quincena del mes llovió " + diferencia + " l/m2 mas que en la segunda.");

		System.out
				.println("En " + menoresQueElSiguiente(lluvias) + " días la lluvia fue menor que la del día siguiente");

		if (posPrimero(lluvias, 19) == -1)
			System.out.println("No hubo ningún dia en el que lloviaran 19 litros");
		else
			System.out
					.println("El dia " + (posPrimero(lluvias, 19) + 1) + " fue el primer dia que llovieron 19 litros");

		if (posUltimo(lluvias, 18) == -1)
			System.out.println("No hubo ningún dia en el que lloviaran 18 litros");
		else
			System.out.println("El dia " + (posUltimo(lluvias, 18) + 1) + " fue el ultimo dia que llovieron 18 litros");

	}

	/**
	 * Carga a un array los datos existentes en un fichero
	 * 
	 * @param v
	 *            el array en el que hay que cargar los datos
	 * @param nombreFichero
	 *            Nombre del fichero que contiene los datos
	 * @throws FileNotFoundException
	 */
	public static void leerArray(double[] v, String nombreFichero) throws FileNotFoundException {
		Scanner f = new Scanner(new File(nombreFichero)).useLocale(Locale.US);

		for (int i = 0; i < v.length; i++) {
			v[i] = f.nextDouble();
		}

	}

	public static double suma(double[] v) {
		double suma = 0;

		for (int i = 0; i < v.length; i++) {
			suma += v[i];
		}
		return suma;
	}

	public static double media(double v[]) {
		double suma = 0;

		for (int i = 0; i < v.length; i++) {
			suma += v[i];
		}
		return suma / v.length;
	}

	public static double maximo(double v[]) {
		double mayor = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] > mayor)
				mayor = v[i];
		}
		return mayor;
	}

	public static double minimo(double v[]) {
		double menor = Double.MAX_VALUE;
		boolean cero = false;

		for (int i = 0; i < v.length && !cero; i++) {
			if (v[i] == 0) {
				menor = 0;
				cero = true;
			}
			if (v[i] < menor)
				menor = v[i];
		}
		return menor;
	}

	public static int posMaximo(double v[]) {
		double mayor = 0;
		int posicion = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] > mayor) {
				mayor = v[i];
				posicion = i;
			}

		}
		return posicion;
	}

	public static int posMinimo(double v[]) {
		double menor = Double.MAX_VALUE;
		boolean cero = false;
		int posicion = 0;

		for (int i = 0; i < v.length && !cero; i++) {
			if (v[i] == 0) {
				posicion = i;
				cero = true;
			} else if (v[i] < menor) {
				menor = v[i];
				posicion = i;
			}
		}
		return posicion;
	}

	public static int contarApariciones(double v[], double x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x)
				cont++;
		}
		return cont;
	}

	public static double sumaParcial(double v[], int izq, int der) {
		int inicio = Math.min(izq, der);
		int fin = Math.max(izq, der);
		double suma = 0;

		for (int i = inicio; i <= fin; i++) {
			suma += v[i];
		}
		return suma;
	}

	public static int menoresQueElSiguiente(double v[]) {
		int cont = 0;
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] < v[i + 1])
				cont++;
		}
		return cont;
	}

	public static int posPrimero(double v[], double x) {
		boolean enc = false;
		int posicion = -1;

		for (int i = 0; i < v.length && !enc; i++) {
			if (v[i] == x) {
				posicion = i;
				enc = true;
			}
		}
		return posicion;
	}

	public static int posUltimo(double v[], double x) {
		boolean enc = false;
		int posicion = -1;

		for (int i = v.length - 1; i >= 0 && !enc; i--) {
			if (v[i] == x) {
				posicion = i;
				enc = true;
			}
		}
		return posicion;
	}
}
