package _02Ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class _01ConceptosBasicos {

	public static void main(String[] args) {
		
		// ------------- Declarar y crear arrays
		//Se puede hacer en una sola instrucción o en dos
		
		int[] edad = new int[10]; //Array de 10 int
		
		double[] estatura;
		estatura = new double [10]; //Array de 10 double
		
		//Tambien se puede crear un Array enumerando sus elementos
		char[] vocales = {'a','e','i','o','u'};
		//Lo anterior equivale a:
		char[] voc = new char[5];
		voc[0] = 'a';
		voc[1] = 'e';
		voc[2] = 'i';
		voc[3] = 'o';
		voc[4] = 'u';
		
		String dias[]= {"lunes", "martes", "miercoles", "jueves"};
		
		//Mostrar un array por pantalla
		//Formas incorrectas
		System.out.println(dias);//Sacan el tipo de Array y la direccion de memoria
		System.out.println(estatura);
		System.out.println(vocales);//La tipo chart saca todos los datos
		
		//Formas correctas
		System.out.println("----------------------");
		System.out.println(Arrays.toString(dias));
		System.out.println(Arrays.toString(estatura));
		System.out.println(Arrays.toString(vocales));
		
		//Mostrar un elementos
		System.out.println("----------------------");
		System.out.println(dias[0]);
		System.out.println(dias[0] + " - " + dias[3]);
		System.out.println(dias[0].toUpperCase());
		System.out.println(dias[0].charAt(0));
		
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Cuantas asignautas hay?: ");
		int numAsignaturas = tec.nextInt();
		
		//Puedo crear arrays cuyo tamaño se decide en tiempo de ejecucion
		double[] notasExamen = new double[numAsignaturas];
		double[] notasPracticas1y2 = new double[numAsignaturas * 2];
	}

}
