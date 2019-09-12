package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _12DondeCapturarExcepciones {

	public static void main(String[] args) {
		//cosicas
			int num1 = leerEnteroDeFichero1("datos12.txt");
			int num2 = leerEnteroDeFichero1("datos2.txt");
			System.out.println("Suma: " + (num1 + num2));
			
			try {
			int num3 = leerEnteroDeFichero2("datos12.txt");
			int num4 = leerEnteroDeFichero2("datos2.txt");
			System.out.println("Suma: " + (num1 + num2));
			} catch (FileNotFoundException e) {
				System.out.println("Falta algun fichero. No se puede calcular la suma");
			}
	}
	public static int leerEnteroDeFichero1(String nombreFichero){
		int num = 0;
		try {
		Scanner tec = new Scanner (new File(nombreFichero));
		num = tec.nextInt();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe");
		}
		return num;
		
	}
	public static int leerEnteroDeFichero2(String nombreFichero) throws FileNotFoundException{
		int num = 0;
		Scanner tec = new Scanner (new File(nombreFichero));
		num = tec.nextInt();
		return num;
		
	}

}
