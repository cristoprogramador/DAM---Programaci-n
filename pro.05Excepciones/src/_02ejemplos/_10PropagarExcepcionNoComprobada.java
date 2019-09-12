package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _10PropagarExcepcionNoComprobada {
	public static void main(String[] args) {
		System.out.println("Main 1");
		int num = leerNumero();
		System.out.println(num);
		System.out.println("Main 2");	
	}
	public static int leerNumero() throws InputMismatchException { 
		//Throws es opcional en este caso, porque la excepcion que se produce es NO COMPROBADA
		Scanner tec = new Scanner (System.in);
		System.out.println("introduce numero: ");
		
		//Si se procduce InputMismatchException,
		// se está PROPAGANDO (puesto que no se esta
		// capturando)
		int num = tec.nextInt();
		return num;
	}

}
