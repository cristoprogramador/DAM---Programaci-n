package _05ejerciciosBuclesSimples;
/**
 * Dentro del proyecto, crear una clase llamada “SencillosFor” y crear en él los mismos métodos que en 
el ejercicio anterior, pero utilizando la sentencia for en lugar de while 
 * @author alumno
 *
 */
public class _02SencillosFor {

	public static void main(String[] args) {
			// imparesHastaN(17);
			// nImpares (10);
			// cuentaAtras(10);
			// sumaNPrimeros(6);
			// mostrarDivisoresN(27);
			// sumaDivisoresN(17);
		}

		/**
		 * 1.1. (imparesHastaN) Dado un nº entero n introducido por el usuario, mostrar
		 * los números impares que hay entre 1 y n. Por ejemplo, si n es 8 mostrará 1 3
		 * 5 7
		 */
		public static void imparesHastaN(int n) {

			for (int cont = 1; cont <= n; cont = cont + 2) {
				System.out.println(cont);
			}
		}

		/**
		 * 1.2. (nImpares) Dado un nº entero n introducido por el usuario, mostrar los n
		 * primeros números impares. Por ejemplo, si n es 3 mostrará 1 3 5 (3 primeros
		 * impares)
		 * 
		 * @param n
		 */
		public static void nImpares(int n) {
			int impar = 1;
			for(int cont = 0; cont < n; cont ++) {
				System.out.println(impar);
				impar += 2;
			}
		}

		/**
		 * (cuentaAtras) Dado un entero n introducido por el usuario, mostrar una cuenta
		 * atrás partiendo de n: n, n-1, …. 5, 4, 3, 2, 1, 0
		 */

		public static void cuentaAtras(int n) {
			for (int cont = n; cont >= 0; cont--) {
				System.out.println(cont);
			}
		}

		/**
		 * (sumaNPrimeros) Dado un entero n introducido por el usuario, mostrar la suma
		 * de los números entre 1 y n.
		 */
		public static void sumaNPrimeros(int n) {
			int acum = 0;
			for (int cont = 1; cont <= n; cont++) {
				acum = acum + cont;
			}
			System.out.println(acum);
		}

		/**
		 * (MostrarDivisoresN) Dado un entero n introducido por el usuario, mostrar
		 * todos sus divisores, incluidos el 1 y el mismo n. Por ejemplo, si n es 12
		 * mostraría 1, 2, 3, 4, 6 y 12
		 */
		public static void mostrarDivisoresN(int n) {
			for (int cont = 1; cont <= n; cont++ ) {
				if (n % cont == 0) System.out.println(cont);
			}
		}

		/**
		 * (sumaDivisoresN) Dado un entero n introducido por el usuario, mostrar la suma
		 * de todos sus divisores, sin incluir al propio n.
		 */
		public static void sumaDivisoresN(int n) {
			int acum = 0;
			for (int cont = 1; cont < n; cont++) {
				if (n % cont == 0) acum = acum + cont;		
			}
			System.out.println(acum);
		}

}
