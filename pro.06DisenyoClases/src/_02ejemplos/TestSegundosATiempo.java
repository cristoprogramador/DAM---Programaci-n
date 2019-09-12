package _02ejemplos;

import java.util.Scanner;

public class TestSegundosATiempo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce cantidad de segundos: ");
		int s = tec.nextInt();
		
		//Creamos un objeto Tiempo con esa cantidad de segundos
		// y lo mostramos por pantalla
		Tiempo t = Tiempo.fromSegundos(s);
		System.out.println(t);
	}

}
