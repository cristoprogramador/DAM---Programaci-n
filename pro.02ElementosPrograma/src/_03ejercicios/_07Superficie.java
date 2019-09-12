package _03ejercicios;

import java.util.Scanner;

public class _07Superficie {
	public static void main(String args[]){
		Scanner tec = new Scanner (System.in);
		System.out.println("Introduce la longitud de la habitación en metros");
		float longi= tec.nextFloat();
		System.out.println("Introduce la anchura de la habitación en metros");
		float anchura = tec.nextFloat();
		System.out.println("La superficie de la habitación es: " + longi*anchura + " metros cuadrados");
		
	}
}
