package examen;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		String nif;
		boolean tamanyoOk = true;
		do {
			System.out.println("Introduce nif: ");
			nif = tec.nextLine().toUpperCase();
			// Si deja el nif en blanco no hacemos nada
			if (nif.length() != 0) {
				// Seleccionamos el bloque donde vamos a intentar capturar las excepciones
				try {
					// Separamos en dos partes
					String parte1 = nif.substring(0, 8);
					char parte2 = nif.charAt(8);

					// Obtenemos la letra que corresponde
					boolean nifEsOk = comprobarNif(parte1, parte2);

					// Comprueba correccion de letra introducida
					if (nifEsOk)
						System.out.println("NIF Correcto\n");
					else
						System.out.println("NIF incorrecto\n");

				} // Si el tamanyo es menor capturamos indicamos el error y salimos del bucle
				catch (StringIndexOutOfBoundsException e) {
					System.out.println("Tamaño incorrecto");
					tamanyoOk = false;
				} // si se introducen caracteres no validos capturamos y continuamos
				catch (NumberFormatException e) {
				}
			}
		} while (nif.length() != 0 && tamanyoOk);
	}

	/**
	 * Recibe un texto con las dos partes del nif y devuelve true si la letra es la
	 * que corresponde al nif y false en caso contrario
	 */
	public static boolean comprobarNif(String numero, char letra) {
		String correspondencias = "TRWAGMYFPDXBNJZSQVHLCKE";

		// Convertimos la primera parte a numero
		int valor = Integer.parseInt(numero);

		// Calculamos que letra corresponder�a al numero
		char letraAdecuada = correspondencias.charAt(valor % 23);

		if (letra == letraAdecuada)
			return true;
		else
			return false;
	}

}
