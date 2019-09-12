package _06ejerciciosBuclesAnidados;

/**
 * (CombinarLetras3) Repite el ejercicio anterior mostrando palabras de tres
 * letras
 * 
 * @author alumno
 *
 */
public class _08CombinarLetras3 {

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
				// Asignamos a una variable entera el valor del caracter
				int letra3 = (int) caracter.charAt(0);
				// Por cada caracter de la primera letra hacemos un ciclo
				// por caracter para la tercera letra (4 ciclos)
				for (int cont3 = 0; cont3 < 4; cont3++) {
					// ecribimos la primera letra
					System.out.print((char) letra1);
					// escribimos la segunda letra
					System.out.print((char) letra2);
					// escribimos la tercera letra
					System.out.println((char) letra3);
					// cada ciclo subimos el valor de la tercera letra
					letra3++;
				}
				// cada ciclo subimos el valor de la segunda letra
				letra2++;
			}
			// cada ciclo subimos el valor de la primera letra
			letra1++;
		}
	}

}
