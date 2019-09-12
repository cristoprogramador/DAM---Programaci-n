package examen;

import java.net.StandardSocketOptions;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class _Pruebas {

	public static void main(String[] args) {
		try {
			Scanner tec = new Scanner(System.in);
			System.out.println("introduce número: ");
			int posicion = tec.nextInt();
			System.out.println("Resultado: " + metodo(posicion)+" - ");
			
		}catch (InputMismatchException e) {
			System.out.println("catch me - ");
		}
		System.out.println("FIN");
	}
	
	public static int metodo(int posicion) {
		int resultado = 0;
		try {
			String s = "A5";
			String texto = "" + s.charAt(posicion);
			int num = Integer.parseInt(texto);
			resultado = num * 2;
			
		}catch (NumberFormatException e){
			System.out.println("Catch NFE - ");
		}finally {
			System.out.println("Finally Metodo - ");
		}
		return resultado;
		
	}

}
