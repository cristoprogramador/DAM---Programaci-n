package _03ejerciciosExpresionesLogicas;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

/**
 * (Salario) Escribir un programa que lea de teclado las horas trabajadas 
 * por un empleado en una semana y calcule su salario neto semanal, sabiendo que:
 * 
 * 		Las horas ordinarias se pagan a 6 euros.
 * 		Las horas extraordinarias se pagan a 10 euros.
 * 
 * 	Los impuestos a deducir son:
 * 		Un 2 % si el salario bruto semanal es menor o igual a 350 euros
 * 		Un 10 % si el salario bruto semanal es superior a 350 euros
 * 
 * 	La jornada semanal ordinaria son 40 horas. El resto de horas trabajadas se consideraron horas extra.
 * 
 * @author Cristobal Salido
 *
 */
public class _13Salario {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduzca las hora trabajadas: ");
		double horas = tec.nextDouble();
		double horasExtra  = 0;
		double salarioNeto = 0;
		double deduccion = 0.02;
		
		if (horas > 40) {
			horasExtra = horas - 40;
			horas = 40;
		}
		
		//Salario Bruto
		double salarioBruto = horas * 6 + horasExtra * 10;
		
		//Salario Neto
		if (salarioBruto <= 350) {
			salarioNeto = salarioBruto - (salarioBruto * deduccion);
		}
		else
			deduccion = 0.10;
			salarioNeto = salarioBruto - (salarioBruto * deduccion);
		
		System.out.println("Jornada laboral: " + horas);
		System.out.println("Horas extraordinarias: " + horasExtra);
		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("Deducción " + deduccion * 100 + "% = " + salarioBruto * deduccion);
		System.out.println("Salario neto: " + salarioNeto);

	}

}
