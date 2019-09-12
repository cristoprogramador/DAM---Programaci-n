package _03ejercicios;

import java.util.Scanner;

/*
(Segundos) Escribir un programa que, dada una cantidad de segundos, 
introducida por teclado, la desglose en días, horas, minutos y segundos.  
Ejemplo de ejecución: 
    
				Introduce cantidad de segundos:  
				3661 ? 
				3661 segundos son: 
				0 dias 
				1 horas 
				1 minutos 
				1 segundos
*/
public class _09Segundos {
	public static void main(String arg[]){
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce cantidad de segundos:");
		int segundos = tec.nextInt();
		/*
		System.out.println(segundos + " segundos son:");
		int dias = segundos / (3600*24);
		System.out.println(dias + " dias");
		int horas = ((segundos % (3600*24)) / 3600);
		System.out.println(horas + " horas");
		int minutos = (((segundos % (3600*24)) % 3600) / 60);
		System.out.println(minutos + " minutos");
		int resto = (((segundos % (3600*24)) % 3600) % 60);
		System.out.println(resto + " segundos");
		*/
		
		
		//Resolución en calse
		
		//Dias
		int dias = segundos / 86400;
		int sobran = segundos % 86400;
		
		//Horas
		int horas = sobran / 3600;
		sobran = sobran % 3600;
		
		//Minutos
		int minutos = sobran / 60;		
		sobran = sobran % 60;
		
		System.out.println(segundos + " segundos son:\n" +
							dias + " dias\n" +
							horas + " horas\n" +
							minutos + " minutos\n" +
							sobran + " segundos");
							
		System.out.format("En %d segundos hay %d dias %d horas %d minutos %d segundos", segundos, dias, horas, minutos, sobran );
		//en %d la de viene de decimal y se utiliza solo para numeros enteros
		
		
		/*
		//Calcluo desde minutos a dias
		//Segundos
		int sobran = segundos;
		
		int minutos = segundos / 60;
		segundos = segundos % 60;
		
		//Horas
		int horas = minutos / 60;
		minutos = minutos % 60;
		
		//Dias
		int dias = horas / 24;		
		horas = horas % 24;
		
		System.out.println(sobran + " segundos son:\n" +
							dias + " dias\n" +
							horas + " horas\n" +
							minutos + " minutos\n" +
							segundos + " segundos");
		*/
	}

}
