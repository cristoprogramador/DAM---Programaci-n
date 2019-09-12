package _02ejemplos;

import java.util.Scanner;

public class _10VariablesLocalesABloque {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		if (edad < 18){
			System.out.println("Peso: ");
			double peso;//Local al bloque de codigo (Encerrado entre llaves)
			//Al decalrar la variable peso dentro del bloque de codigo de if,
			//esa variable no es accesible desde fuera.
			peso = tec.nextInt();			
		}
	System.out.println();
	}

}
