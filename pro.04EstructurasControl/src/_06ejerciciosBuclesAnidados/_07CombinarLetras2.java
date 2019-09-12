package _06ejerciciosBuclesAnidados;

/**
 * (CombinarLetras2) Escribir un programa que muestre todas las palabras de dos
 * letras que se pueden formar con los cuatro primeros caracteres del alfabeto
 * en minúsculas (‘a’,’b’,’c’,’d’): aa ab ac ad ba bb bc bd ... ... da db dc dd
 * 
 * @author alumno
 *
 */
public class _07CombinarLetras2 {

	public static void main(String[] args) {
		// Creamos una variable String con la letra inicial
		String caracter = "a";
		// Asignamos a una variable entera el valor del caracter
		int letra1 = (int) caracter.charAt(0);
		
		// hacemos un ciclo por caracter para la primera letra(4 ciclos)
		for (int cont = 0; cont < 4; cont++) {
			// Asignamos a una variable entera el valor del caracter
			int letra2 = (int) caracter.charAt(0);
			// Por cada caracter de la primera letra hacemos un ciclo
			// por caracter para la segunda letra (4 ciclos)
			for (int cont2 = 0; cont2 < 4; cont2++) {
				// ecribimos la primera letra
				System.out.print((char) letra1);
				// escribimos la segunda letra
				System.out.println((char) letra2);
				// cada ciclo subimos el valor de la segunda letra
				letra2++;
			}
			// cada ciclo subimos el valor de la primera letra
			letra1++;
		}
	}
}
