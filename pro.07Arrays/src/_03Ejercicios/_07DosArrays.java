package _03Ejercicios;

import java.util.Arrays;

public class _07DosArrays {

	public static void main(String[] args) {
		double[] v1 = { 2, 3, 4, 5, 2, 2.5 };
		double[] v2 = { 1, 1.5, 2.5, 1, 1, 1.25 };

		/*
		 * NO HAY QUE CREAR UN NUEVO ARRAY YA QUE EL METODO sumaArraysIguales YA NO LOS
		 * CREA
		 */
		double[] suma1;
		suma1 = sumaArraysIgules(v1, v2);
		System.out.println(Arrays.toString(suma1));

		double[] a = { 2, 3, 4, 5, 2, 2.5 };
		double[] b = { 1, 2.5, 1, 1, };

		double[] suma2;
		suma2 = sumaArraysDiferentes(a, b);
		System.out.println(Arrays.toString(suma2));
	}

	public static double[] sumaArraysIgules(double a[], double b[]) {
		double[] res = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			res[i] = a[i] + b[i];
		}

		return res;
	}

	public static double[] sumaArraysDiferentes(double a[], double b[]) {
		double[] res;

		if (a.length > b.length) {
			res = new double[a.length];

			for (int i = 0; i < b.length; i++) {
				res[i] = a[i] + b[i];
			}

			for (int i = b.length; i < a.length; i++) {
				res[i] = a[i];
			}
		} else {
			res = new double[b.length];

			for (int i = 0; i < a.length; i++) {
				res[i] = a[i] + b[i];
			}
			for (int i = a.length; i < b.length; i++) {
				res[i] = b[i];
			}
		}
		return res;
	}

	public static double[] sumaArraysDiferentes2(double a[], double b[]) {
		double[] res, pequeño, grande;

		if (a.length < b.length) {
			pequeño = a;
			grande = b;
		} else {
			pequeño = b;
			grande = a;
		}

		res = new double[grande.length];

		for (int i = 0; i < pequeño.length; i++) {
			res[i] = pequeño[i] + grande[i];
		}

		for (int i = pequeño.length; i < grande.length; i++) {
			res[i] = grande[i];
		}

		return res;
	}

	public static double[] sumaArraysDiferentes3(double a[], double b[]) {
		double[] res;

		if (a.length > b.length) {
			res = new double[a.length];
		} else {
			res = new double[b.length];
		}

		/* RECORREMOS A Y SE LO SUMAMOS A RES */

		for (int i = 0; i < a.length; i++) {
			res[i] = res[i] + a[i];
		}

		/* RECORREMOS B Y SE LO SUMAMOS A RES */
		for (int i = 0; i < b.length; i++) {
			res[i] = res[i] + b[i];
		}
		return res;
	}
}
