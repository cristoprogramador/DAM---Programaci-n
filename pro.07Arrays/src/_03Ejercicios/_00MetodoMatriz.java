package _03Ejercicios;

import java.util.Arrays;
/**
 * Metodo que reciba una matriz de int
 * y devuelva la matriz transpuesta
 * 
 * @author Cristobal salido
 *
 */
public class _00MetodoMatriz {

	public static void main(String[] args) {
		int[][] numeros = {{1,2,3},{4,5,6}};
		int[][] transpuesta = transponer(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(Arrays.toString(numeros[i]));
		}
		System.out.println("----------------");
		for (int i = 0; i < transpuesta.length; i++) {
			System.out.println(Arrays.toString(transpuesta[i]));
		}
		
		char[] caracteres = new char[] {'h','o','l','a'};
		String arrayAString = deArrayAstring(caracteres);
		System.out.println();
	}

	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[][] transponer(int[][] matriz) {
		int[][] transpuesta = new int[matriz[0].length][matriz.length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				transpuesta[j][i] = matriz[i][j];
			}
		}
		return transpuesta;
	}
	
	public static String deArrayAstring(char[] v) {
		// ['h','o','l','a']  --> "hola"
		String s = "";
		for (int i = 0; i < v.length; i++) {
			s += v[i];
		}
		return s;
	}
	
	public static char[] deArrayAstring(String s) {
		// "hola" --> ['h','o','l','a']  
		char[] res = new char[s.length()];
		for (int i = 0; i < res.length; i++) {
			res[i] = s.charAt(i);
		}
		return res;
	}
	
	public static char[][] dematrizAString (String[] v){
		/*  casa--> ["casa", "hola","cosa"]
	 		hola
	 		cosa							*/	
		char[][] res = new char[v.length][v[0].length()];
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length(); j++) {
				res[i][j] = v[i].charAt(j);				
			}
		}
		return res;	
	}
	
	public static String[] deStringsAmatriz (char[][] s){
		/* ["casa", "hola","cosa"] -->  casa
										hola
										cosa*/	
		String[] res = new String[s.length];
		
		for (int i = 0; i < s.length; i++) {
			String temp = "";
			for (int j = 0; j < s[0].length; j++) {
				temp += s[i][j];
			}
			res[i]=temp;
		}
		return res;
	}	

}
