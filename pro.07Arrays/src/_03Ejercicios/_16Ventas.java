package _03Ejercicios;
/**
 * 16. (Ventas). Una empresa comercializa 10 productos para lo cual tiene 5 distribuidores. 
 * Los datos de ventas los tenemos almacenados en una matriz de 5 filas x 10 columnas, ventas, con el 
 * número de unidades de cada producto que ha vendido cada distribuidor. Cada fila corresponde a las 
 * ventas de un distribuidor (la primera fila, del primer distribuidor, etc.), mientras que cada columna 
 * corresponde a un producto : 
 * 100 25 33 89 23 90 87 6 5 233 
 * 28 765 65 77 987 55 4 66 4 8 
 * .... 
 * El array precio, de 10 elementos, contiene el precio en € de cada uno de los 10 productos. 
 * 125.2 234.4 453.9 
 * ... 
 * Escribe el programa y los métodos necesarios para averiguar: 
 * 16.1. Distribuidor que más artículos ha vendido. 
 * 16.2. El artículo que más se vende. 
 * 16.3. Sabiendo que los distribuidores que realizan ventas superiores a 30.000 € cobran una comisión 
 * del 5% de las ventas y los que superan los 70.000 € una comisión del 8%, emite un informe de 
 * los distribuidores que cobran comisión, indicando nº de distribuidor, importe de las ventas, 
 * porcentaje de comisión e importe de la comisión en €: 
 *
 * @author Cristobal salido
 *
 */
public class _16Ventas {

	public static void main(String[] args) {
		int[][]ventas = {{10,5,2,5,20},
						{23,12,14,27,11},
						{10,17,21,33,15}}; // Unidades
		double precios[] = {2000,130.3,1200.1,210.2,130.7}; // Euros
		
		System.out.println("Distribuidor que más vende: " + mejorDistribuidor(ventas));
		System.out.println("Articulo menos vendido: " + articuloMenosVendido(ventas));
		System.out.println();
		informeVentas(ventas, precios);
	}
	
	/**
	 * Devuelve el número de fila de la matriz que más valor tiene
	 * en total
	 * 
	 * @param ventas matriz que contiene los datos
	 * @return el número de fila que más suma
	 */
	public static int mejorDistribuidor (int[][] ventas) {
		int sumaMax = Integer.MIN_VALUE, filaMax = 0;
		// Recorrido por filas
		for (int i = 0; i < ventas.length; i++) {
			int suma = 0;
			// Recorrido por columnas
			for (int j = 0; j < ventas[0].length; j++) {
				// Si suma mas que el maximo, alualizamos máximo
				suma += ventas[i][j];
				if (sumaMax < suma) {
					sumaMax = suma;
					filaMax = i; 
				}
						
			}
		}
		return filaMax;
	}
	
	/**
	 * Devuelve el numero de columna de la matriz que menos valor
	 * tiene en total
	 * 
	 * @param ventas matriz que contiene los datos
	 * @return el numero de columna que menos suma
	 */
	public static int articuloMenosVendido (int[][] ventas) {
		int sumaMin = Integer.MAX_VALUE, columnaMin = 0;
		for (int j = 0; j < ventas[0].length; j++) {
			int suma = 0;
			for (int i = 0; i < ventas.length; i++) {
				suma = ventas[i][j];
				if (sumaMin > suma) {
					sumaMin = suma;
					columnaMin = j;
				}
			}
		}
		
		return columnaMin;
	}
	
	/**
	 * Devuelve el numero de columna de la matriz que mas valor
	 * tiene en total
	 * 
	 * @param ventas matriz que contiene los datos
	 * @return el numero de columna que mas suma
	 */
	public static int articuloMasVendido (int[][] ventas) {
		int sumaMax = Integer.MIN_VALUE, columnaMax = 0;
		for (int j = 0; j < ventas[0].length; j++) {
			int suma = 0;
			for (int i = 0; i < ventas.length; i++) {
				suma = ventas[i][j];
				if (sumaMax < suma) {
					sumaMax = suma;
					columnaMax = j;
				}
			}
		}
		
		return columnaMax;
	}
	
	/**
	 * 16.3. Sabiendo que los distribuidores que realizan ventas superiores a 30.000 € cobran una comisión 
	 * del 5% de las ventas y los que superan los 70.000 € una comisión del 8%, emite un informe de 
	 * los distribuidores que cobran comisión, indicando nº de distribuidor, importe de las ventas, 
	 * porcentaje de comisión e importe de la comisión en €: 
	 * @param ventas
	 * @param precios
	 */
	public static void informeVentas(int[][] ventas, double[] precios) {

		for (int i = 0; i < ventas.length; i++) {
			double sumaVentas = 0;
		
			for (int j = 0; j < ventas[0].length; j++) {
				sumaVentas += (ventas[i][j] * precios[j]);
			}
		if (sumaVentas > 70000) {
			System.out.println("Numero de Distribuidor: " + i);
			System.out.println("Importe de ventas: " + sumaVentas + "€");
			System.out.println("Porcentaje de la comunisón: 8%");
			System.out.println("importe de la comisión: " + ((sumaVentas/100) * 8) + "€");
		} else if (sumaVentas > 30000) {
			System.out.println("Numero de Distribuidor: " + i);
			System.out.println("Importe de ventas: " + sumaVentas + "€");
			System.out.println("Porcentaje de la comunisón: 5%");
			System.out.println("importe de la comisión: " + ((sumaVentas/100) * 5) + "€");
		}
		System.out.println("----------------------------");
		}
	}
	
}	
