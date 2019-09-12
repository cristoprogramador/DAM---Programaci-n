package _02ejemplos;

import java.util.Scanner;

public class _09VariablesGlobalesMalUso {
//Aunque funciona, las variables globales acaban dando problemas 	
	static int a,b, resultado;
	public static void main(String args[]){
		
		Scanner tec= new Scanner(System.in);
		System.out.println("Introduce dos números: ");
		a = tec.nextInt();
		b = tec.nextInt();
		System.out.println("Suma: " + resultado);
	}
	public static void sumar(){
		resultado = a + b;
	}

}
