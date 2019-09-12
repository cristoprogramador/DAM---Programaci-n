package _03ejercicios;

import java.util.Random;

/**
 * (Dados) Escribir un programa que simula el lanzamiento de dos dados. 
Ejemplo de ejecución: 
Dado 1 : 5 
Dado 2: 4 
Puntuación total: 9 
 * @author CristoSalido
 */
public class _12Dados {

	public static void main(String[] args) {
		int d1 = dado();
		int d2 = dado();
		System.out.println("Dado 1: "+d1);
		System.out.println("Dado 1: "+d2);
		System.out.println("Puntuación total: "+(d1+d2));
	}
	
	/**
	 * Generamos un metodo que simula un dado con la clase Math
	 * @return Devuelve un numero aleatorio del 1 al 6
	 */
	public static int dado()
	{
		return (int) (Math.random()*6 +1);
	}
	
	/**
	 * Generamos metodo que simula dado con la clase Random
	 * @return Devuelve un numero aleatorio del 1 al 6
	 */
	public static int dado2(){
		Random r=new Random();
		return r.nextInt();		
	}
}
