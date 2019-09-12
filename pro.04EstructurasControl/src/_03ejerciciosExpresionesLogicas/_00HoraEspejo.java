package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * imaginando un reloj analogico reflejado en un espejo
 * realizar un programa que muestre la hora real con respecto a la
 * reflejada en espejo
 * 
 * @author alumno
 *
 */
public class _00HoraEspejo {
	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	System.out.println("Introduzca la hora reflejada");
	int hora = tec.nextInt();
	System.out.println("Introduzca los minutos reflejados");
	int minutos = tec.nextInt();
	

	if (hora == 12 && minutos == 0 || hora == 6 && minutos == 0)
		mostrar(hora,minutos);
	else if (hora == 12 && minutos == 30)
		mostrar(11,minutos);
	else if (hora == 12)
		mostrar(11,60-minutos);
	else if (minutos == 0 || minutos == 30)
		mostrar(11-hora,minutos);
	else mostrar(11-hora,60-minutos);
	}
	
	public static void mostrar(int hora, int minutos) {
		System.out.format("La hora real es %02d:%02d",hora,minutos);
	}


}
