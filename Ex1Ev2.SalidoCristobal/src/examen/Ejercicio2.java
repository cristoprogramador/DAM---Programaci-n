package examen;

import java.util.Scanner;

public class Ejercicio2 {
	final static int MAX = 8;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double peso;
		double pesoAcumulado = 0;
		int cont = 0;
		boolean pesoOk = true;

		// Creamos un bucle do while para que al menos pregunte una vez
		do {
			// preguntamos el peso
			System.out.print("Intorduce peso: ");
			peso = tec.nextDouble();
			// acumulamos el peso en una variable
			pesoAcumulado += peso;
			// sumamos uno al contador
			cont++;

			// Si el peso acumulado con el ultimo peso introducido es igual a 500
			if (pesoAcumulado == 500) {
				//Aceptamos a la persona en el ascensor
				System.out.println("Adelante!! Personas " + (cont) + " Peso: " + pesoAcumulado);
				//Cambiamos condición de peso del bucle y salimos del mismo
				pesoOk = false;
			}//Si el peso es menor de 500
			else if (pesoAcumulado < 500)
				//Aceptamos a la persona y continuamos pidiendo peso
				System.out.println("Adelante!! Personas " + (cont) + " Peso: " + pesoAcumulado);
			//Si el peso sobrepasa los 500 kilos
			else {
				//No aceptamos el ultimo peso
				System.out.println("Stop!! No cabes en el ascenso. El peso sería: " + pesoAcumulado);
				//Lo restamos del acumulado
				pesoAcumulado = pesoAcumulado - peso;
				//Descontamos del contador la ultima persona
				cont--;
				//Cambiamos condición de peso del bucle y salimos del mismo
				pesoOk = false;
			}

		} //El bucle se realizará mientras que no llege al maximo de presonas y el peso sea correcto
		while (cont < MAX && pesoOk);
		
		//Finalizamos el proceso sacando por pantalla las personas y el peso
		System.out.println("--------");
		System.out.println("Ascensor lleno - Personas " + cont + " - Peso: " + pesoAcumulado);

	}

}
