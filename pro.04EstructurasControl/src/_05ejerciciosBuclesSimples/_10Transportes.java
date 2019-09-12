package _05ejerciciosBuclesSimples;

import java.util.Scanner;

/**
 * Una empresa de transportes cobra 30e por cada bulto que transporta. Ademas,
 * si el peso total de todos los bultos supera los 300 kilos, cobra 0.9e por
 * cada kg extra. Por ultimo si el trasporte debe realizarse en sabado, cobra un
 * plus de 60e. La empresa no realiza el pedido si hay que transportar mas de 30
 * bultos, si el peso total supera los 1000 kg o si se solicita hacerlo en
 * domingo. Realizar un programa que solicite el numero de bultos, el dia de la
 * semana (valor entre 1 y 7) y el peso de cada uno de los bultos y muestre el
 * coste del transporte en caso de que pueda realizarse o un mensaje adecuado en
 * caso contrario
 * 
 * @author alumno
 *
 */

public class _10Transportes {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double costeTotal = 0;
		double pesoTotal = 0;
		int bultos, dia;
		int cont = 1;
		String respuesta;

		// Numero de bultos, minimo 1 maximo 30 si no, continua preguntando
		do {
			System.out.println("Numero de bultos: ");
			bultos = tec.nextInt();
			if (bultos > 30)
				System.out.println("30 bultos como maximo");
			else if (bultos < 1)
				System.out.println("1 bulto como minimo");
		} while (bultos > 30 || bultos < 1);
		costeTotal = bultos * 30;

		// Dia de la semana entre 1 y 6 si es 6 confirma el dia si e 7 avisa de
		// no envio
		do {
			respuesta = "N";
			System.out.println("Dia de la semana (1 a 7): ");
			dia = tec.nextInt();
			if (dia > 7 || dia < 1)
				System.out.println("El dia no es correcto");
			else {
				if (dia == 7)
					System.out.println("En domingo no se realizan repartos");
				if (dia == 6) {
					System.out
							.println("El reparto en sabado tiene un recargo de 60 euros, desea elegir otro dia? (s/n)");
					respuesta = tec.next();
					if (respuesta.toUpperCase().compareTo("N") == 0)
						costeTotal = costeTotal + 60;
				}
			}
		} while (dia > 6 || dia < 1 || respuesta.toUpperCase().compareTo("S") == 0);

		// Peso de los bultos
		do {
			System.out.println("Introduzca el peso del bulto " + cont + ":");
			double peso = tec.nextDouble();
			pesoTotal += peso;
			cont++;
		} while (cont <= bultos && pesoTotal <= 1000);

		if (pesoTotal > 1000)
			System.out.println("El peso excede los 1000Kg. No puede realizarse el transporte");
		else if (pesoTotal > 300) {
			costeTotal = costeTotal + (pesoTotal - 300) * 0.9;
			System.out.println("Coste del transporte: " + costeTotal + " euros");
		} else
			System.out.println("Coste del transporte: " + costeTotal + " euros");
	}
}
