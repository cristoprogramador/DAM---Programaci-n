package _03ejercicios;

import java.util.Scanner;

public class _04Por2 {
	public static void main (String args[]){
		Scanner tec = new Scanner(System.in);
		System.out.println("Escribe un número:");
		int a = tec.nextInt();
		System.out.println("El doble de "+ a + " es "+ a*2);
	}
}