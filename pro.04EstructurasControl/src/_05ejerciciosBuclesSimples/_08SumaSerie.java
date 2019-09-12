package _05ejerciciosBuclesSimples;

import java.util.Scanner;

/**
 * (SumaSerie) Dado un número n, introducido por el usuario,
 * calcula y muestra por pantalla la siguiente suma 
 * 1/1+1/2+1/3+ ··· + 1/n 
 * 
 * @author alumno
 *
 */
public class _08SumaSerie {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		int num = tec.nextInt();
		double suma = 0;
		
		for (int cont = 1; cont <= num; cont++) {
			System.out.print(1 + "/" + (cont));
			if (cont < num)System.out.print(" + ");
			suma = suma + 1.0/cont;
		}
		
		System.out.println(" = " + suma);

	}

}
