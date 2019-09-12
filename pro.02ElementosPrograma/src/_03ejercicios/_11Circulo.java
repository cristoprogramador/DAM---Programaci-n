package _03ejercicios;

import java.util.Scanner;

/*
 * (Círculo) Escribir un programa que calcule la longitud de la circunferencia 
y el área del círculo para un valor del radio introducido por teclado

pi*r cuadrado = Area
2*pi*r =longitud

 */
public class _11Circulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		//Pedimos el tama�o del radio en metros
		System.out.println("Introduzca el radio de la circunferencia en centimetros");
		double radio = tec.nextDouble();
		
		double pi = Math.PI;
		double area = pi * (radio * radio);
		double longitud = 2 * pi * radio;
		double volumen = (4.0/3.0) * pi / (radio*radio/radio);
		
		System.out.println("Dado un circulo de "+ radio + "cm de raido\n"
				+ "Su longitud sera de "+longitud+"cm\n"
				+ "y su area sera de "+area+" cm");
		
		System.out.println("");
		
		System.out.format("Un circulo de %9fcm de radio tiene: \nuna longitud de %9fcm \nun area de %9fcm",radio ,longitud, area);
		
	}
}
