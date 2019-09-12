package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (DiasDelMes)Escribir un programa que lea de teclado el n�mero de un mes ( 1 a 12)
 * y visualice eln�mero de d�as que tiene el mes.
 * Hacerlo utilizando sentencias if-else.
 * Para hacer el programa, implementa un m�todo en la clase que reciba 
 * un n�mero de mes y devuelva el n�mero de d�as que tiene el mes
 * 
 * @author Cristobal Salido
 *
 */
public class _11DiasDelMes {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca un numero de mes");
		int mes = tec.nextInt();
		
		if (mes == 2)
			System.out.println("El mes " + mes + " tiene " + dias(mes) + " dias, 29 si es a�o bisiesto.");
		else
			System.out.println("El mes " + mes + " tiene " + dias(mes) + " dias.");
		System.out.println("y es " + _12NombreDelMes.nombreMes(mes));
	}
	
	//Metodo que devuelve los dias de un mes
	public static int dias (int mes) {
	int dias;
	if (mes == 2)
		dias=28;
	else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
		dias = 30;
	else dias = 31;
	return dias;
	}

}
