package _02ejemplos;

import java.util.Scanner;

public class _07RestoDivision {
	public static void main(String[] args) {
		//El usuario introduce una candidad de segundos
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca un numero de segundos");
		int segundos = tec.nextInt();
		
		
		//Calculamos cuantos minutos hay y cuysntos segundos sobran
		int horas = segundos / 3600; //Calcula cuantas horas hay en los segundos dados
		int minutos = (segundos % 3600) / 60; //Calcula canditdad de minutos
		int sobran = (segundos % 3600) % 60; //Calcula cantidad de segundos restantes (Entre 0 y 59)
		System.out.println("Son " + horas + " horas " + minutos + " minutos y " + sobran + " Segundos");
		System.out.println("Son \n" + horas + " horas \n" + minutos + " minutos \n" + sobran + " Segundos");
			//añadiendo \n podemos añadir un salto de linea
		
		//Otra forma
		horas = segundos / 3600;
		sobran = segundos % 3600;
		
		minutos = sobran / 60;
		segundos = sobran % 60;
		System.out.println("Son " + horas + " horas " + minutos + " minutos y " + segundos + " Segundos");

		//Otra forma sobre la variable segundos
		horas = segundos / 3600; 
		segundos = segundos % 3600;
		
		minutos = segundos / 60;
		segundos = segundos % 60;
		System.out.println("Son " + horas + " horas " + minutos + " minutos y " + sobran + " Segundos");
			
	}
}