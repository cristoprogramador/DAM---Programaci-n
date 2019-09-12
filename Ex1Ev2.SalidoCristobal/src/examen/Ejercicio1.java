package examen;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
	final static int N = 20;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		int cont = 0;
		int muyPequenyos = 0, pequenyos = 0, normales = 0, grandes = 0, muyGrandes = 0;
		boolean produccionOk = true;

		// Creamos un bucle do while que al menos pretunte una vez
		do {
			// Preguntamos el diametro
			System.out.print("Introduce diametro " + (cont + 1) + ": ");
			double diametro = tec.nextDouble();
			// Comprovamos el diametro y sumamos uno donde corresponda
			if (diametro < 8) {
				muyPequenyos++;
			} else if (diametro < 9) {
				pequenyos++;
			} else if (diametro < 10) {
				normales++;
			} else if (diametro < 11) {
				grandes++;
			} else if (diametro >= 11) {
				muyGrandes++;
			}

			// comprovamos cada ciclo que los no validos no superan el 20%
			if (((muyPequenyos + muyGrandes) / (double) N) * 100 > 20)
				// si supero el 20% cambiamos la condicion de la variable para salir del bucle
				produccionOk = false;
			// sumamos uno al contador de ciclo
			cont++;
			// El bucle se realizará mientras el contador sea menor que N y la producción
			// sea valida
		} while (cont < N && produccionOk);

		// Si la condición de la producción es falsa mandamos mensaje de desechar la
		// producción
		if (!produccionOk)
			System.out.println("La produccion del dia se desecha");
		// Si la condición de la producción es verdadera sacamos los porcentajes por
		// pantalla
		else {
			System.out.format("Muy pequeños: %d - Porcentaje: %.2f%% \n", muyPequenyos,
					(((double) muyPequenyos / N) * 100));
			System.out.format("Pequeños: %d - Porcentaje: %.2f%% \n", pequenyos, (((double) pequenyos / N) * 100));
			System.out.format("Normales: %d - Porcentaje: %.2f%% \n", normales, (((double) normales / N) * 100));
			System.out.format("Grandes: %d - Porcentaje: %.2f%% \n", grandes, (((double) grandes / N) * 100));
			System.out.format("Muy grandes: %d - Porcentaje: %.2f%% \n", muyGrandes, (((double) muyGrandes / N) * 100));
		}
	}
}
