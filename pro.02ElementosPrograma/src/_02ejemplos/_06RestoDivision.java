package _02ejemplos;

import java.util.Scanner;

public class _06RestoDivision {

	public static void main(String[] args) {
		//El usuario introduce una candidad de segundos
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca un numero de segundos");
		int segundos = tec.nextInt();
		
		
		//Calculamos cuantos minutos hay y cuysntos segundos sobran
		int minutos = segundos / 60; //Calcula canditdad de minutos
		int sobran = segundos % 60; //Calcula cantidad de segundos restantes (Entre 0 y 59)
		System.out.println("Son " + minutos + " minutos y " + sobran + " Segundos");

	}

}
