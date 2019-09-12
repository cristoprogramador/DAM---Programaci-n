package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _11PropagarExcepcionComprobada {

	public static void main(String[] args) {
		try {
			int num = leerEnteroDeFichero("datos.txt");
			System.out.println(num);
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
		}

	}
	public static int leerEnteroDeFichero(String nombreFichero) throws FileNotFoundException {
		Scanner tec = new Scanner (new File(nombreFichero));
		int num = tec.nextInt();
		return num;
		
	}

}
