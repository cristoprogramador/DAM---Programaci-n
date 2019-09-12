package _04ejerciciosAlternativas;

import java.util.Scanner;

/**
 * (DiasDelMes)Escribir un programa que lea de teclado el n�mero de un mes ( 1 a
 * 12) y visualice el n�mero de d�as que tiene el mes. Resolver utilizando la
 * sentencias switch.
 * 
 * @author Cristobal Salido
 */
public class _22DiasDelMes {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduzca numero de mes(1 a 12): ");
		int mes = tec.nextInt();

		switch (mes) {
		case 2:
			System.out.println("28 Dias, 29 si es a�o bisiesto");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Dias");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Dias");
			break;
		default:
			System.out.println("Mes incorrecto");
		}
	}

}
