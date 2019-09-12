package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (Taxi) Se desea calcular el coste del trayecto realizado en taxi en funcion
 * de los kilometros recorridos en las carreras metropolitanas de Valencia.
 * Segun las tarifas vigentes para el 2012, el coste se calcula de la siguiente manera:
 * 
 * 		Dias laborables en horario diurno (de 6:00 a 22:00h): 0.73 e/km.
 * 		Dias laborables en horario nocturno: 0.84 e/km.
 * 		Sabados y domingos: 0.93 e/km.
 * 		Ademas, la tarifa minima diurna es de 2.95e y la minima nocturna de 4e.
 * 
 * Escribir un programa que solicite al usuario:
 * 
 * 		- La hora (hora y minutos) en que se realiza el trayecto.
 * 		- El dia de la semana (se supone que el usuario introduce un valor entre 1 y 7)
 * 		- Los quilometros recorridos.
 * 
 * Y muestre el coste del trayecto
 * @author Cristobal Salido
 *
 */
public class _18Taxi {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double precioKm = 0.73;
		double coste;
	
		System.out.println("Hora en que se realiza el trayecto: ");
		int hora = tec.nextInt();
		System.out.println("Minuto en que se realiza el trayecto: ");
		int minuto = tec.nextInt();
		System.out.println("Dia de la semana de 1(lunes) a 7(domingo): ");
		int dia = tec.nextInt();
		System.out.println("Kilometros recorridos: ");
		double km = tec.nextDouble();
		
		if (dia == 6 || dia == 7) {
			precioKm = 0.93;
			coste = precioKm * km;
			if (hora >=22 || hora < 6 && coste < 4)
				coste =4;
			else if (coste < 2.95) coste = 2.95;
			}
		else if (hora >=22 || hora < 6){
			precioKm = 0.84;
			coste = precioKm * km;
			if (coste < 4) coste = 4;
			}
		else {
			coste = precioKm * km;
			if (coste < 2.95) coste = 2.95;}
		
		System.out.println("Coste del trayecto: " + coste + " euros");
		
		
		/////Versión Javi///////
		
		if (dia < 6){
			//Entre semana
			if (hora>=6 && hora < 22)
				coste = km * 0.73;
			else coste = km * 0.93;			
			}
		else 
			//Finde
			coste = km * 0.93;
		
		//coste minimo
		if (hora >=6 && hora < 22){
			if (coste < 2.95)coste = 2.95;}
		else coste = Math.max(coste, 4);
		
		System.out.println(coste);
		

	}

}
