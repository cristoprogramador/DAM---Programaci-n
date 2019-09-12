package _05ejerciciosBuclesSimples;

/**
 * 1. Dentro del proyecto, crear una clase llamada “SencillosWhile” y crear en
 * él métodos que realicen las siguientes tareas.
 * 
 * @author alumno
 *
 */
public class _01SencillosWhile {

	public static void main(String[] args) {
		// imparesHastaN(17);
		// nImpares (10);
		// cuentaAtras(10);
		// sumaNPrimeros(6);
		// mostrarDivisoresN(17);
		sumaDivisoresN(17);
	}

	/**
	 * 1.1. (imparesHastaN) Dado un nº entero n introducido por el usuario, mostrar
	 * los números impares que hay entre 1 y n. Por ejemplo, si n es 8 mostrará 1 3
	 * 5 7
	 */
	public static void imparesHastaN(int n) {
		long t1 = System.currentTimeMillis();
		int num = 1;
		while (num <= n) {
			System.out.println(num);
			num += 2; // nun = num +2
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Miliseguntos: " + (t2 - t1));
	}

	/**
	 * 1.2. (nImpares) Dado un nº entero n introducido por el usuario, mostrar los n
	 * primeros números impares. Por ejemplo, si n es 3 mostrará 1 3 5 (3 primeros
	 * impares)
	 * 
	 * @param n
	 */
	public static void nImpares(int n) {
		int cont = 0;
		int num = 1;
		while (cont < n) {
			System.out.println(num);
			num += 2;
			cont++;
		}
	}

	/**
	 * (cuentaAtras) Dado un entero n introducido por el usuario, mostrar una cuenta
	 * atrás partiendo de n: n, n-1, …. 5, 4, 3, 2, 1, 0
	 */

	public static void cuentaAtras(int n) {
		int num = n;
		while (num >= 0) {
			System.out.println(num);
			num -= 1;

			// para pausarlo
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * (sumaNPrimeros) Dado un entero n introducido por el usuario, mostrar la suma
	 * de los números entre 1 y n.
	 */
	public static void sumaNPrimeros(int n) {
		int num = 1;
		int suma = 0;
		while (num <= n) {
			suma = suma + num;
			num++;
		}
		System.out.println(suma);
	}

	/**
	 * (MostrarDivisoresN) Dado un entero n introducido por el usuario, mostrar
	 * todos sus divisores, incluidos el 1 y el mismo n. Por ejemplo, si n es 12
	 * mostraría 1, 2, 3, 4, 6 y 12
	 */
	public static void mostrarDivisoresN(int n) {
		int divisor = 1;
		while (divisor <= n) {
			if (n % divisor == 0)
				System.out.println(divisor);
			divisor++;
		}

	}

	/**
	 * (sumaDivisoresN) Dado un entero n introducido por el usuario, mostrar la suma
	 * de todos sus divisores, sin incluir al propio n.
	 */
	public static void sumaDivisoresN(int n) {
		int divisor = 1;
		int suma = 0;
		while (divisor < n) {
			if (n % divisor == 0)
				suma = suma + divisor;
			divisor++;
		}
		System.out.println(suma);
	}
}
