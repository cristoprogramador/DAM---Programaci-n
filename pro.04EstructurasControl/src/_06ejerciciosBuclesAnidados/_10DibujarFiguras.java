package _06ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * (dibujarFiguras) Escribe una clase que contenga los métodos que se indican a
 * continuación. En el método main solicita al usuario las dimensiones de las
 * figuras necesarias en cada caso y llama al método correspondiente para que se
 * muestre por pantalla
 * 
 * @author alumno
 *
 */
public class _10DibujarFiguras {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Ancho de la figura: ");
		int ancho = tec.nextInt();

		System.out.println("Alto de la figura: ");
		int alto = tec.nextInt();
		dibRecAsteriscos(ancho, alto);
		dibRecNumeros1(ancho, alto);
		dibRecNumeros2(ancho, alto);
		dibRecNumeros3(ancho, alto);
		dibDiagonal(ancho, alto);
		dibRecLetras(ancho, alto);
		dibRecLetras2(ancho, alto);
		dibRecLetras3(ancho, alto);
	}

	/**
	 * 10.1. (void dibRecAsteriscos(int ancho, int alto) dibuja un rectángulo
	 * utilizando asteriscos, como el siguiente. En el ejemplo ancho es 7 y alto es
	 * 3
	 * 
	 * @param ancho
	 * @param alto
	 */
	public static void dibRecAsteriscos(int ancho, int alto) {
		for (int cont = 0; cont < alto; cont++) {
			for (int cont2 = 0; cont2 < ancho; cont2++)
				System.out.print("* ");
			System.out.println();
		}
	}

	/**
	 * 10.2. (void dibRecNumeros1(int ancho, int alto) dibuja un rectángulo
	 * utilizando números, como el siguiente. En el ejemplo ancho es 7 y alto es 3
	 * 
	 * @param ancho
	 * @param alto
	 */
	public static void dibRecNumeros1(int ancho, int alto) {
		for (int cont = 0; cont < alto; cont++) {
			for (int cont2 = 0; cont2 < ancho; cont2++)
				System.out.print(cont2 + 1 + " ");
			System.out.println();
		}
	}

	/**
	 * 10.3. (void dibRecNumeros2(int ancho, int alto) dibuja un rectángulo
	 * utilizando números, como el siguiente. En el ejemplo ancho es 7 y alto es 3
	 * 
	 * @param ancho
	 * @param alto
	 */
	public static void dibRecNumeros2(int ancho, int alto) {
		for (int cont = 0; cont < alto; cont++) {
			for (int cont2 = ancho; cont2 > 0; cont2--)
				System.out.print(cont2 + " ");
			System.out.println();
		}
	}

	/**
	 * 10.4. (void dibRecNumeros3(int ancho, int alto) dibuja un rectángulo
	 * utilizando números, como el siguiente. En el ejemplo ancho es 7 y alto es 3
	 * 
	 * @param ancho
	 * @param alto
	 */
	public static void dibRecNumeros3(int ancho, int alto) {
		int numero = 1;
		for (int cont = 0; cont < alto; cont++) {
			for (int cont2 = 0; cont2 < ancho; cont2++) {
				System.out.format("%02d ", numero);
				numero++;
			}
			System.out.println();
		}
	}

	/**
	 * 10.5. (void dibDiagonal(int ancho, int alto) dibuja un rectángulo con ceros y
	 * unos. Los 1 están en las posiciones en las que fila y columna coinciden. En
	 * el ejemplo ancho es 7 y alto es 3
	 * 
	 * @param ancho
	 * @param alto
	 */
	public static void dibDiagonal(int ancho, int alto) {
		for (int cont = 0; cont < alto; cont++) {
			for (int cont2 = 0; cont2 < ancho; cont2++) {
				if (cont == cont2)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}

	/**
	 * 10.6. (void dibRecLetras(int ancho, int alto) dibuja un rectángulo letras
	 * sucesivas comenzando por la ‘a’. En el ejemplo ancho es 7 y alto es 3
	 * 
	 * @param ancho
	 * @param alto
	 */
	public static void dibRecLetras(int ancho, int alto) {
		String letra = "a";
		int numeroLetra = (char) letra.charAt(0);

		for (int cont = 0; cont < alto; cont++) {
			for (int cont2 = 0; cont2 < ancho; cont2++) {
				System.out.print((char) numeroLetra + " ");
			}
			numeroLetra++;
			System.out.println();
		}

	}

	/**
	 * 10.7. (void dibRecLetras2(int ancho, int alto) dibuja un rectángulo letras
	 * sucesivas terminando por la ‘a’. En el ejemplo ancho es 7 y alto es 3
	 * 
	 * @param ancho
	 * @param alto
	 */
	public static void dibRecLetras2(int ancho, int alto) {
		String letra = "a";
		int numeroLetra = (char) (letra.charAt(0) + (alto - 1));

		for (int cont = 0; cont < alto; cont++) {
			for (int cont2 = 0; cont2 < ancho; cont2++) {
				System.out.print((char) numeroLetra + " ");
			}
			numeroLetra--;
			System.out.println();
		}
	}

	/**
	 * 10.8. (void dibRecLetras3(int ancho, int alto) dibuja un rectángulo letras
	 * sucesivas comenzando por la ‘a’. En el ejemplo ancho es 7 y alto es 3
	 * 
	 * @param ancho
	 * @param alto
	 */
	public static void dibRecLetras3(int ancho, int alto) {
		String letra = "a";
		int numeroLetra = (char) letra.charAt(0);

		for (int cont = 0; cont < alto; cont++) {
			for (int cont2 = 0; cont2 < ancho; cont2++) {
				System.out.print((char) numeroLetra + " ");
				numeroLetra++;
			}
			System.out.println();
		}
	}
}
