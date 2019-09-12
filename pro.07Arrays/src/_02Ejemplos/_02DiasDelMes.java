package _02Ejemplos;

import java.util.Scanner;

public class _02DiasDelMes {

	public static void main(String[] args) {
		int[]dias = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Mes: ");
		int mes = tec.nextInt();
		
		//Mostramos el numero de dias del mes
		System.out.println("El mes " + mes + " tiene " + dias[mes] + " dias");
		
	}

}
