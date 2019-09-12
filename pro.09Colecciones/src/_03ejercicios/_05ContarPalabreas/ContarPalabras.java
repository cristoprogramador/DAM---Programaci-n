package _03ejercicios._05ContarPalabreas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 5. (paquete Palabras)
 * - Escribe un programa en el que el usuario escriba una frase y el programa muestre 
 * qué palabras ha usado y cuántas veces ha usado cada palabra:
 * Por ejemplo: en la casa en la que la mujer nació no había nadie”
 * en – 2, la – 3, casa – 1, que – 1, mujer – 1, nació – 1, no – 1, había – 1, nadie - 1
 * @author alumno
 *
 */
public class ContarPalabras {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Map<String, Integer> cuentaPalabras = new LinkedHashMap<>();
		System.out.println("Introduce frase: ");
		String frase = tec.nextLine();
		
		StringTokenizer st = new StringTokenizer(frase);
		while (st.hasMoreTokens()) {
			String palabra = st.nextToken();
			if (!cuentaPalabras.containsKey(palabra)) {
				cuentaPalabras.put(palabra, 1);
			}else {
				int count = cuentaPalabras.get(palabra)+1;
				cuentaPalabras.put(palabra, count);
			}
		}
		System.out.println(cuentaPalabras);
	}
}
