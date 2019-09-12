package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _06ComprobadasVsNoComprobadas {

	public static void main(String[] args) {

		// puede provocar AritmeticException si el denominador es 0
		int a1 = 5, b1 = 2;
		int c1 = a1 / b1;

		// AritmeticException es un tipo de RuntimeException (excepcion NO
		// COMPROBADA. Java no nos obliga a usar un bloque try catch
		// Lo correcto suele ser evitar la excepción

		int a2 = 5, b2 = 2;
		if (b2 != 0) {
			int c2 = a2 / b2;
			System.out.format("%d /%d = %d\n", a2, b2, c2);
		} else {
			System.out.println("No se puede dividir");
		}

		// Pero tambien seria posible capturar la excepcion. Es decir, usar
		// try - catch es posible aunque no sea obligatorio

		int a3 = 5, b3 = 2;
		try {
			int c3 = a3 / a2;
			System.out.format("%d /%d = %d\n", a3, b3, c3);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir");
		}
		
		//control+shit+o Importa todos las clases que se necesite
		
		//------------- EXCEPCIONES COMPROBADAS -----------------
		
		//Vamos a crear un objeto Scanner que lea de un fichero en lugar
		// de leer de teclado. Si el fichero no esxiste, se producirá una
		// excepción. La excepción que se produce es COMPROBADA por lo que 
		// Java nos obliga a hacer algo con ella (capturarla)
		
	//	try {
		Scanner f = new Scanner(new File("datos.txt")); //JAVA no me dJAVA //JAVA no C# dJAVA
		int num = f.nextInt();
		System.out.println(num);
	//	}catch (FileNotFoundException e) {
	//		System.out.println("El fichero no existe");
	//	}
		
		//Si no ponemos el bloque try-cathc java nos da error 
		//nos obliga a capturar la excepción para 
	}

}
