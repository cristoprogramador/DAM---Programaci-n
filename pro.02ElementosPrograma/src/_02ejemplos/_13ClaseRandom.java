package _02ejemplos;

import java.util.Random;

public class _13ClaseRandom {
	public static void main(String arg[]){
		Random r = new Random();
		
		System.out.println(r.nextInt());
		//numero aleatorio que esté en el rango de un numero Int
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		
		System.out.println(r.nextDouble());	
		//Numero aleatorio que esté en el rango de un numero Double	
		
		System.out.println(r.nextInt(10));
		//numero aleatorio que esté entre 0 y 9 del tipo entero Int
		
		Random r2 = new Random(27);
		//indicamos semmilla a partir del que se calcula el numero aleatorio
		
		System.out.println("-------------------");
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		
	}
	
}
