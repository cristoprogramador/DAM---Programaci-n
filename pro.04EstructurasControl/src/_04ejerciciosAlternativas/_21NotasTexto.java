package _04ejerciciosAlternativas;

import java.util.Scanner;

/**
 * (NotasTexto) Escribir un programa que acepte del usuario la nota de un examen
 * (valor num�rico entre 1 y 10) y muestre el literal correspondiente a dicha
 * nota seg�n (insuficiente, suficiente, bien, notable, sobresaliente). Hacerlo
 * utilizando la sentencias switch. La nota que introduce el usuario tendr� que
 * ser un valor entero.
 * 
 * @author Cristobal Salido
 */
public class _21NotasTexto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduzca la nota del examen: de 1 a 10");
		int nota = tec.nextInt();

		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Nota incorrecta");
		}
	}

}
