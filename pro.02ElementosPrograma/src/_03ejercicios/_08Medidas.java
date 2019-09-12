package _03ejercicios;

/*
(Medidas) Escribir un programa que convierta una medida dada en pies a
sus equivalentes en yardas, pulgadas, centímetros  y metros, sabiendo que 
1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm, 1 m = 100 cm.
*/

import java.util.Scanner;
import java.util.Locale;

public class _08Medidas {
	public static void main(String args[]){
		
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
			//"useLocale(Locale.US)" los decimales se introducen con el punto
			//Por defecto sin "useLocale(Locale.US)" se introduce con la coma.
		
		System.out.println("Introduzca la medida en pies");
		
		double pies = tec.nextDouble();
		
		double pulgadas = pies * 12;
		double yardas = pies / 3; //Como pies es tipo double la división es real y no entera
		double centimetros = pulgadas * 2.54;
		double metros = centimetros / 100;
		
		System.out.println(pies + " Pies, son:");
		System.out.println(yardas + " Yardas");
		System.out.println(pulgadas + " Pulgadas");
		System.out.println(centimetros + " Centimetros");
		System.out.println(metros + " Metros");		
		
		//Presentación en pantalla con format
		System.out.format(" En %.2f pies hay:\n %012.2f yardas\n %012.2f pulgadas\n %-12.2f centimetros\n %-12.2f metros"
				,pies, yardas, pulgadas, centimetros, metros);
		//%f viene de float "floating point", para numeros con decimales
		//añadiendo x.x controlamos el numero de caracteres y de decimales
		//ejem %6.2f son 6 caracteres (incluyendo la coma) y dos decimales
		//ejem2 %06.2f añade ceros a la izquierda para completar la cifra
		//ejem3 %-6.2f completa por la derecha en lugar de la izquierda
		
	}

}
