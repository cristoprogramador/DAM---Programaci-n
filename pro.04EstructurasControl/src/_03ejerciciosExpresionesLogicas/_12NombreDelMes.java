package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (NombreDelMes)Escribir un programa que lea de teclado el n�mero de un mes ( 1 a 12)
 *  y visualice el nombre del m�s (enero, febrero, etc). 
 *  Hacerlo utilizando sentencias if-else. Para hacer un programa, implementa 
 *  un m�todo en la clase que reciba un n�mero de mes y devuelva el nombre del mes
 *  
 * @author Cristobal Salido
 */
public class _12NombreDelMes {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca el numero de mes: ");
		int mes = tec.nextInt();
		System.out.println("El mes " + mes + " es " + nombreMes(mes));
	}
	public static String nombreMes(int numeroMes){
		String mes = null;
		if (numeroMes == 1)mes ="Enero";
		else if (numeroMes == 2)mes ="Febrero";
		else if (numeroMes == 3)mes ="Marzo";
		else if (numeroMes == 4)mes ="Abril";
		else if (numeroMes == 5)mes ="Mayo";
		else if (numeroMes == 6)mes ="Junio";
		else if (numeroMes == 7)mes ="Julio";
		else if (numeroMes == 8)mes ="Agosto";
		else if (numeroMes == 9)mes ="Septiembre";
		else if (numeroMes == 10)mes ="Octubre";
		else if (numeroMes == 11)mes ="Noviembre";
		else if (numeroMes == 12)mes ="Diciembre";
		else mes ="El numero de mes no es correcto, ha de ser entre 1 y 12";
		return mes;
	}

}
