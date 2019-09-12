package _05ejerciciosBuclesSimples;

import java.util.Scanner;

/**
 * (Containers) La capacidad de un buque que transporta containers está limitada
 * tanto por la cantidad de containers como por el peso, pudiendo transportar un
 * máximo de 100 containers y un máximo de 700 toneladas. 
 * Hacer un programa en el que se vaya introduciendo el peso de los containers 
 * (en toneladas) a medida que se cargan en el barco, hasta que se llegue al máximo
 * de capacidad.
 * Mostrar al final la cantidad de containers cargados y el peso total. En el
 * momento en que se desee cargar un container que haga que la carga total
 * supere las 700 toneladas, se dará por finalizada la carga, aunque pudieran
 * existir containers menos pesados con posibilidad de ser cargados.
 * 
 * @author alumno
 *
 */
public class _11Containers {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int contenedores = 0;
		double pesoTotal = 0;
		double peso = 0;

		// Mientras que los contenedores sean menos o igual a 100 y
		// Mientras que el peso sea menor o igual a 700
		while (contenedores < 100 && pesoTotal < 700) {
			// Introducimos el peso del los container
			System.out.println("Introduzca el peso del container " + (contenedores + 1));
			peso = tec.nextDouble();
			// Sumamos el peso según lo introducimos
			pesoTotal += peso;
			// Contamos un conteneror mas
			contenedores++;
		}

		if (pesoTotal > 700) {
			System.out.println("El peso del container excede el peso y no entrará en la carga\n" + "Carga terminada");
			pesoTotal -= peso;
			contenedores--;
		}

		// Sacamos los resultados, cantidad de containers y peso cargados
		System.out.println("Containers cargados: " + contenedores);
		System.out.println("Peso total cargado: " + pesoTotal);
	}
}
