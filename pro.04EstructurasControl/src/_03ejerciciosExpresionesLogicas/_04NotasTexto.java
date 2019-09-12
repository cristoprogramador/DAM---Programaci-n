package _03ejerciciosExpresionesLogicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * (NotasTexto) Escribir un programa que acepte del usuario la nota de un examen (valor numérico
 * entre 1 y 10 en numero real "double") y muestre el literal correspondiente a dicha nota según
 *  (insuficiente, suficiente, bien, notable, sobresaliente).
 * @author alumno
 *
 */
public class _04NotasTexto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduzca la nota obtenida: ");
		double nota = tec.nextDouble();
		
		if (nota < 5)
			System.out.println("Insuficiente");
		else
			if (nota >= 5 && nota < 6)
				System.out.println("Suficiente");
			else 
				if (nota >= 6 && nota < 7)
					System.out.println("Bien");
				else
					if (nota >= 7 && nota < 9)
						System.out.println("Notable");
					else {
						System.out.println("Sobresaliente");
						System.out.println("Eres casi tan perfecto como Cristóbal");
						}
		
	}

}
