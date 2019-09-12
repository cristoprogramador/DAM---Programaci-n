package _02.ejemplos;

import java.util.Scanner;

public class ControlTrayectos {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		// Definimos dos variables de tipo Tiempo
		Tiempo salida = new Tiempo();
		Tiempo llegada = new Tiempo();

		//Leemos las horas de teclado
		System.out.println("Hora de salida:");
		System.out.println("Hora: ");
		salida.setHora(tec.nextInt());
		System.out.println("Minuto: ");
		salida.setMinuto(tec.nextInt());
		System.out.println("Segundos: ");
		salida.setSegundo(tec.nextInt());
		System.out.println("Hora de llegada: ");
		System.out.println("Hora: ");
		llegada.setHora(tec.nextInt());
		System.out.println("Minuto: ");
		llegada.setMinuto(tec.nextInt());
		System.out.println("Segundos: ");
		llegada.setSegundo(tec.nextInt());
		
		// Mostremos las horas por pantalla
		System.out.println ("Hora de salida: " + salida.toString());
		System.out.println("Hora de llegada: " + llegada.toString());

	}

}
