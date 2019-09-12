package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (Fechas) Escribir un programa que pida al usuario dos fechas (dia, mes y
 * ano), que se suponen correctas, y le muestre la menor de ellas. La fecha se
 * mostrara en formato dd/mm/ano. Utiliza un metodo mostrarFecha, para mostrar
 * la fecha por pantalla. La fecha se mostrara siempre con dos digitos para el
 * dia, dos para el mes y cuatro para el ano.
 * 
 * @author Cristobal Salido
 */
public class _10Fechas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduzca el dia de la primera fecha");
		int dia1 = tec.nextInt();
		System.out.println("Introduzca el mes de la primera fecha");
		int mes1 = tec.nextInt();
		System.out.println("Introduzca el año de la primera fecha");
		int anyo1 = tec.nextInt();
		System.out.println("Introduzca el dia de la segunda fecha");
		int dia2 = tec.nextInt();
		System.out.println("Introduzca el mes de la segunda fecha");
		int mes2 = tec.nextInt();
		System.out.println("Introduzca el año de la segunda fecha");
		int anyo2 = tec.nextInt();


		// Comparamos años
		if (anyo1 < anyo2)
			mostrarFecha(dia1,mes1,anyo1);
		else if (anyo1 > anyo2)
			mostrarFecha(dia2,mes2,anyo2);
		else if (mes1 < mes2)
			mostrarFecha(dia1,mes1,anyo1);
		else if (mes1 > mes2)
			mostrarFecha(dia2,mes2,anyo2);
		else if (dia1 < dia2)
			mostrarFecha(dia1,mes1,anyo1);
		else if (dia1 > dia2)
			mostrarFecha(dia2,mes2,anyo2);
		else
			System.out.println("Las fechas son iguales");

	}
	
	public static void mostrarFecha (int dia, int mes, int anyo) {
		
		System.out.format("La fecha menor es el %02d del %02d de %04d", dia, mes, anyo);
		
	}
	

}
