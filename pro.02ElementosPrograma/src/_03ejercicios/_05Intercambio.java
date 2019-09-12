package _03ejercicios;

import java.util.Scanner;

public class _05Intercambio {
	public static void main(String args[]){
		Scanner tec = new Scanner(System.in);
		System.out.println("Escribe un numero para v1");
		int v1 = tec.nextInt();
		System.out.println("Escribe un numero para v2");
		int v2 = tec.nextInt();
		System.out.println("Antes de intercambiar v1:"+v1 +" y v2:"+v2);
		int v3 = v1;
		v1 = v2;
		v2 = v3;
		System.out.println("Despues de intercambiar v1:"+v1 +" y v2:"+v2);
		
	}

}
