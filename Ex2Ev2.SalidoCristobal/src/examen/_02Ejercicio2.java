package examen;

public class _02Ejercicio2 {
	public static void main(String[] args) {
		int [][] m = {
				{3,6,7,4,2,1,2,3},
				{4,5,6,7,2,1,3,4},
				{1,3,4,5,6,0,9,7},
				{5,7,8,9,7,6,5,4},
				{4,2,0,6,3,4,5,3},
				{4,6,7,8,8,5,2,2},
				{3,3,4,2,1,2,2,3},
				{3,4,0,6,6,6,7,8},
				{1,2,2,4,6,4,3,4},
				{1,6,3,2,2,4,7,8}
		};

		System.out.println("Filas sin ceros: " + contarFilasSinCeros(m));
		System.out.println("------------------------------");
		mostrarNumeroCerosPorColumna(m);
	}
	
	public static void mostrarNumeroCerosPorColumna(int m[][]){
		int cont;
		for (int j = 0; j < m[0].length; j++) {
			cont = 0;
			for (int i = 0; i < m.length; i++) {
				if (m[i][j] == 0)
					cont++;
			}
			System.out.println("Columna " + j + ": " + cont + " ceros");
		}
	}
	
	public static int contarFilasSinCeros(int m[][]){
		boolean enc;
		int filasCero = 0;
		
		for (int i = 0; i < m.length; i++) {
			enc = false;
			for (int j = 0; j < m[0].length && !enc; j++) {
				if(m[i][j] == 0) {
					filasCero++;
					enc = true;
				}
			}
		}
		return m.length - filasCero;
	}
	
}
