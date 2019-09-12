package _01pruebas;

import java.util.Scanner;

public class _00ComprobarHora {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduzca la Hora en formato 24h (Ejem. 20:30)");
		String horaEntera = tec.nextLine();
		int hora = Integer.valueOf(horaEntera.substring(0,2));
		int minutos = Integer.valueOf(horaEntera.substring(3,5));
		
		if ((hora >= 0 && hora < 24) && (minutos >= 0 && minutos < 60))
			System.out.println("La hora es correcta");
		else System.out.println("La hora es incorrecta");

	}

}
