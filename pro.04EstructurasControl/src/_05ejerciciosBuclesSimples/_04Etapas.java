package _05ejerciciosBuclesSimples;

import java.util.Scanner;

/**
 * El ser humano pasa por una serie de etapas en su vida que, con carácter general
 * se asocian a las edades que aparecen en la tabla siguiente.
 * 		Infancia Hasta los 10 años 
 * 		Pubertad De 11 a 14 años 
 * 		Adolescencia De 15 a 21 años 
 * 		Adultez De 22 a 55 años 
 * 		Vejez De 55 a 70 años 
 * 		Ancianidad A partir de los 71 años 
 * 
 * Escribe un programa en el que el usuario introduzca las edades de una serie de personas y
 * calcule y muestre que porcentaje de personas que se encuentran en cada etapa. 
 * En primer lugar el programa pedirá el número de personas que participan en la muestra y
 * a continuación solicitará la edad de cada una de ellas. 
 * El resultado será similar al siguiente:
 * 		Infancia: 5.3 % 
 * 		Pubertad: 10.7 % 	
 * 		Adolescencia: 21.2 % 
… 

 * @author alumno
 *
 */
public class _04Etapas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		//Introducimos el numero de personas de las que nos darán la edad
		System.out.println("Introduzca el numero de personas: ");
		int numPersonas = tec.nextInt();
		
		//inicializamos las variables de las diferentes edades
		int infancia = 0;
		int pubertad = 0;
		int adolescencia = 0;
		int adultez = 0;
		int vejez = 0;
		int ancianidad = 0;
		
		//Preguntamos las edades de cada persona y sumamos uno a la edad correspondiente
		int cont = 0;
		while (cont < numPersonas) {
			System.out.println("Introduzca la edad de la persona " + (cont+1) + ":");
			int edad = tec.nextInt();
			if (edad < 11) infancia++;
			else if (edad < 15) pubertad++;
			else if(edad < 22) adolescencia++;
			else if (edad < 56) adultez++;
			else if (edad < 71) vejez++;
			else ancianidad++; 
			cont++;
		}
		
		//Sacamos por pantalla los porcentajes de las diferentes edades dadas
		//Descartamos las que no han introducido.
		if (infancia > 0) System.out.format("Infancia: %.2f %% \n", (100.0/numPersonas * infancia));
		if (pubertad > 0) System.out.format("pubertad: %.2f %% \n", (100.0/numPersonas * pubertad));
		if (adolescencia > 0) System.out.format("adolescencia: %.2f %% \n", (100.0/numPersonas * adolescencia));
		if (adultez > 0) System.out.format("adultez: %.2f %% \n", (100.0/numPersonas * adultez));
		if (vejez > 0) System.out.format("vejez: %.2f %% ", (100.0/numPersonas * vejez));
		if (ancianidad > 0) System.out.format("ancianidad: %.2f %% \n", (100.0/numPersonas * ancianidad));
	}

}
