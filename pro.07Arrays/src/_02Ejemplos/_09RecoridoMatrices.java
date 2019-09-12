package _02Ejemplos;

public class _09RecoridoMatrices {

	public static void main(String[] args) {
		char[][] letras = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
				{ 'm', 'n', 'o' }, };

		// Recorrido por filas ascendente
		System.out.println("Por filas ascendente");
		for (int i = 0; i < letras.length; i++) {
			for (int j = 0; j < letras[i].length; j++) {
				System.out.print(letras[i][j]);
			}

		}
		System.out.println("\n");

		// Recorrido por filas desdendete
		System.out.println("Por filas desdendete");
		for (int i = letras.length - 1; i >= 0; i--) {
			for (int j = letras[i].length - 1; j >= 0; j--) {
				System.out.print(letras[i][j]);
			}

		}
		System.out.println("\n");

		// Recorrido por columnas ascendentes
		System.out.println("Por columnas ascendente");
		for (int j = 0; j < letras[0].length; j++) {
			for (int i = 0; i < letras.length; i++) {
				System.out.print(letras[i][j]);
			}

		}
		System.out.println("\n");
	}

}
