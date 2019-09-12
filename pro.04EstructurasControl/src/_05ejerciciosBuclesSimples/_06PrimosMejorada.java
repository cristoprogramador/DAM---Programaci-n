package _05ejerciciosBuclesSimples;

import java.util.Scanner;

/**
 * (esPrimoMejorada) Haz una nueva version del programa del ejercicio anterior
 * teniendo en cuenta lo siguiente: � El unico numero par que es primo es el 2.
 * � Un numero n no puede tener divisores mayores que n/2
 * 
 * @author Cristobal Salido
 *
 */
public class _06PrimosMejorada {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Escriba un numero entero: ");
		int num = tec.nextInt();
		int cont = 1;
		if (num == 2)
			System.out.println("El numero es primo");
		else if (num % 2 == 0)
			System.out.println("El numero no es primo");
		else {
			do {
				cont++;
				if (num % cont == 0)
					System.out.println("El numero no es primo");
			} while (cont <= num / 2 && num % cont != 0);
			if (num % cont != 0)
				System.out.println("El numero es primo");
		}
	}

}
