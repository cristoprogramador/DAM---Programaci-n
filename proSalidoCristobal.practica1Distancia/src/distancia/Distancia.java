package distancia;

import java.util.Locale;
import java.util.Scanner;

import coordenadas.Coordenadas;

public class Distancia {
	public static void main(String args[]){
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		int latGrad1, latGrad2, lalMin1, latMin2, lonGrad1, lonGrad2, lonMin1, lonMin2;
		double latSeg1, latSeg2, lonSeg1, lonSeg2, alt1, alt2;
		
		
		System.out.println("Introduzca las coordenadas en grados sexagesimales y la altura del punto 1");
		System.out.println("Grados de la latitud del punto 1 (maximo 90)");
		latGrad1 = tec.nextInt();
		System.out.println("Minutos de la latitud del punto 1 (maximo 59)");
		lalMin1 = tec.nextInt();
		System.out.println("Segundos de la latitud del punto 1 (menor que 60)");
		latSeg1 = tec.nextDouble();
		System.out.println("Grados de la longitud del punto 1 (maximo 180)");
		lonGrad1 = tec.nextInt();
		System.out.println("Minutos de la longitud del punto 1 (maximo 59)");
		lonMin1 = tec.nextInt();
		System.out.println("Segundos de la longitud del punto 1 (menor que 60)");
		lonSeg1 = tec.nextDouble();
		System.out.println("Altitud del punto 1 (en metros)");
		alt1 = tec.nextDouble();
		
		System.out.println("Introduzca las coordenadas en grados sexagesimales y la altura del punto 2");
		System.out.println("Grados de la latitud del punto 2 (maximo 90)");
		latGrad2 = tec.nextInt();
		System.out.println("Minutos de la latitud del punto 2 (maximo 59)");
		latMin2 = tec.nextInt();
		System.out.println("Segundos de la latitud del punto 2 (menor que 60)");
		latSeg2 = tec.nextDouble();
		System.out.println("Grados de la longitud del punto 2 (maximo 180)");
		lonGrad2 = tec.nextInt();
		System.out.println("Minutos de la longitud del punto 2 (maximo 59)");
		lonMin2 = tec.nextInt();
		System.out.println("Segundos de la longitud del punto 2 (menor que 60)");
		lonSeg2 = tec.nextDouble();
		System.out.println("Altitud del punto 2 (en metros)");
		alt2 = tec.nextDouble();
		
		//pasamos los datos de sexagesimal a decimal para poder llamar a los metodos
		double latDecimal1 = Coordenadas.aDecimal(latGrad1,lalMin1,latSeg1);
		double lonDecimal1 = Coordenadas.aDecimal(lonGrad1,lonMin1,lonSeg1);
		double latDecimal2 = Coordenadas.aDecimal(latGrad2,latMin2,latSeg2);
		double lonDecimal2 = Coordenadas.aDecimal(lonGrad2,lonMin2,lonSeg2);
		
		//Llamamos al metodo distanciaEnSuperficie dando latitud y longitud en grados decimales, devolviendonos la distancia en metros
		System.out.format("La distancia lineal entre los dos puntos es: %.3f metros \n" 
							,Coordenadas.distanciaEnSuperficie(latDecimal1,lonDecimal1,latDecimal2,lonDecimal2));
		
	
		//Calculamos el valor absoluto de la diferencia entre las distancias
		System.out.format("La diferencia de altura entre los dos puntos es: %.3f metros \n" 
							,Math.abs(alt1-alt2));
		
		//Llamamos al metodo Coordenadas.distancia con latitud y longitud en decimal y las alturas que nos devolverá la distancia absoluta
		System.out.format("La distancia real entre los dos puntos es: %.3f metros \n" 
							,Coordenadas.distancia(latDecimal1, lonDecimal1,alt1, latDecimal2, lonDecimal2, alt2));
		
	}

}
