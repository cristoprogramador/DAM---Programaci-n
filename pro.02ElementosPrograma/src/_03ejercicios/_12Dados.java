package _03ejercicios;
/*. 
(Dados) Escribir un programa que simula el lanzamiento de dos dados. 
Ejemplo de ejecución: 

Dado 1: 5 
Dado 2: 4 
Puntuación total: 9 
*/
import java.util.Random;

public class _12Dados {
	public static void main(String arg[]){
		//Con la clase Random
		Random r = new Random();//Creamos objeto clase random
		
		/* Asignamos a dos variables del tipo entero 
		   con un valor a cada una aleatorio y entre 0 y 6 */
		int dado1 =r.nextInt(6)+1;
		int dado2 =r.nextInt(6)+1;
		
		/* Sacamos por pantalla los resultados
		   de cada dado y de la suma de ambos*/
		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 1: " + dado2);
		System.out.println("Puntuación total: " + (dado1 + dado2));
		
		//Con Math.random
		int d1= (int) (Math.random() * 6 + 1);
		int d2= (int) (Math.random() * 6 + 1);
		
		System.out.println("Dado 1: " + d1);
		System.out.println("Dado 1: " + d2);
		System.out.println("Puntuación total: " + (d1 + d2));
		

	}

}
