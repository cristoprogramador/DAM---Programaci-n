package fechas;
/**
 * Metodos utiles para realizar acciones sobre fechas
 * 
 * @author Cristobal Salido
 * 
 */

public class UtilesFechas {
	// Declaramos un array tipo static final, con los meses en orden
	// la posición 0 estará vacía y no se utilizará, para ello nos 
	// aseguraremos que el valor de mes sea siempre entre 1 y 12
	static final String[] MESES = { "", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
			"septiembre", "octubre", "noviembre", "diciembre" };
	
	/**
	 * Metodo para validar una fecha, con salida por pantalla
	 * 
	 * @param fecha array tipo entero con los valores dia mes y año en [0][1]y[2]
	 * @return devuelve true o false si la fecha es correcta o no
	 * 
	 * Comprueba si la fecha recibida es corrcta según el calendario
	 * gregoriano, según los dias que tiene cada mes, teniendo en cuenta 
	 * si el año es bisiesto o no
	 */
	public static boolean validarFecha(int[] fecha) {
		// si el dia está dentro de los dias que tiene el mes dado, teniendo en cuenta si el año es bisiesto
		if ((fecha[1] == 2 && anyoBisiesto(fecha[2]) && fecha[0] < 30) || (fecha[1] == 2 && !anyoBisiesto(fecha[2]) && fecha[0] < 29)
				|| (fecha[1] == 1 || fecha[1] == 3 || fecha[1] == 5 || fecha[1] == 7 || fecha[1] == 8 || fecha[1] == 10 || fecha[1] == 12 && fecha[0] < 32)
				|| (fecha[1] == 4 || fecha[1] == 6 || fecha[1] == 9 || fecha[1] == 11 && fecha[0] < 31)) {

			// Devolvemos true
			return true;
		} else
			// Devolvemos false
			return false;
	}

	
	/**
	 * Metodo para comparar dos fechas
	 * 
	 * @param fecha1 Array tipo int con los valores dia, mes y año por orden [0][1][2] de la primera fecha
	 * @param fecha2 Array tipo int con los valores dia, mes y año por orden [0][1][2] de la segunda fecha
	 * 
	 * recibirá dos fechas y apoyandose en otros metodos y 
	 * calculos, mostrará primero la fecha mas antigua
	 * y despues la fecha mas nueva	
	 */
	public static void compararFechas(int[] fecha1, int[] fecha2) {
		int dia1 = 0, dia2 = 0, mes1 = 0, mes2 = 0, anyo1 = 0, anyo2 = 0;
		dia1 = fecha1[0]; mes1 = fecha1[1];	anyo1 = fecha1[2];
		dia2 = fecha2[0]; mes2 = fecha2[1];	anyo2 = fecha2[2];

		// si las fechas son iguales
		if (anyo1 == anyo2 && mes1 == mes2 && dia1 == dia2) {
			System.out.println("Las fechas son iguales");
			System.out.println(dia1 + " de " + MESES[mes1] + " del " + anyo1);
			System.out.println(dia2 + " de " + MESES[mes2] + " del " + anyo2);
			// si no son iguales y la primera es la menor (mas antigua)
		} else if (anyo1 < anyo2 || (anyo1 == anyo2 && mes1 < mes2)
				|| (anyo1 == anyo2 && mes1 == mes2 && dia1 < dia2)) {
			System.out.println(dia1 + " de " + MESES[mes1] + " del " + anyo1);
			System.out.println(dia2 + " de " + MESES[mes2] + " del " + anyo2);
			// si no, la segunda es la mas antigua (la menor)
		} else {
			System.out.println(dia2 + " de " + MESES[mes2] + " del " + anyo2);
			System.out.println(dia1 + " de " + MESES[mes1] + " del " + anyo1);
		}

	}


	/**
	 * Metodo para calcaula la diferencia entre dos fechas, en dias.
	 *  
	 * @param fecha1 Array tipo int con los valores dia, mes y año por orden [0][1][2] de la primera fecha
	 * @param fecha2 Array tipo int con los valores dia, mes y año por orden [0][1][2] de la segunda fecha
	 * 
	 * recibirá dos fechas y apoyandose en otros metodos y 
	 * calculos, mostrará primero la fecha mas antigua
	 * y despues la fecha mas nueva	y la diferencia de
	 * una fecha a otra en dias. 
	 */

	public static void diferenciaFechas(int[]fecha1, int[]fecha2) {
		int dias;
		// si el año es el mismo
		if (fecha1[2] == fecha2[2]) {
			// llamos al metodo diasEnMismoAnyo y devolverá la diferencia en dias
			dias = diasEnMismoAnyo(fecha1[0], fecha1[1], fecha2[0], fecha2[1], fecha1[2]);
			// si son diferentes
		} else {
			// obtenemos los dias entre los años que hay de una fecha a otra
			// con el metodo diasEntreAnyos
			dias = diasEntreAnyos(fecha1[2], fecha2[2]);
			//si el año 1 es menor al año 2
			if (fecha1[2] < fecha2[2])
				// sumamos a dias, los dias de la fecha uno hasta fin de ese año
				// y los dias de la segunda fecha desde principio del año
				dias += hastaFinAnyo(fecha1[0], fecha1[1], fecha1[2]) + desdeInicioAnyo(fecha2[0], fecha2[1], fecha2[2]);
			// si es el año dos el menor
			else
				// realizamos la acción con las fechas intercambiadas
				dias += hastaFinAnyo(fecha2[0], fecha2[1], fecha2[2]) + desdeInicioAnyo(fecha1[0], fecha1[1], fecha1[2]);
		}
		// mostramos las dos fechas junto a los dias de diferencia
		// si las fechas son iguales
		compararFechas(fecha1, fecha2);
		System.out.println("Desde la primera a la segunda fecha hay " + dias + " dias");

	}
	
	/**
	 * Metodo para saber si un año es bisiesto o no
	 * 
	 * @param anyo el año a comprobar
	 * @return Devuelva un boleano true si es bisiesto, false si no lo es
	 * 
	 * El metodo tendrá en cuenta que...
	 * cada 4 años es bisiesto, pero...
	 * cada 100 no lo será y...
	 * cada 400 si lo será.
	 */
	public static boolean anyoBisiesto(int anyo) {
		// si el año es multiplo de cuatro
		// y no es multiplo de 100
		// o es multiplo de 400
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0)))
			return true;
		else
			return false;
	}

	/**
	 * Metodo para calcular la diferencia ente dos fechas dentro
	 * del mismo año, en dias.
	 * 
	 * @param dia1 tipo entero dia de la primera fecha
	 * @param mes1 tipo entero mes de la primera fecha
	 * @param dia2 tipo entero dia de la segunda fecha
	 * @param mes2 tipo entero mes de la segunda fecha
	 * @param anyo tipo entero año
	 * @return tipo entero con la diferencia en dias entre las dos fechas dadas
	 * 
	 * El metododo calcula la diferencia en tres partes
	 * la diferencia del dia del mes mas antiguao hasta final del mes
	 * los dias del mes mas nuevo hasta el dia (el mismo dia)
	 * y los dias totales de los meses que existan entre ambos.
	 * 
	 */
	public static int diasEnMismoAnyo(int dia1, int mes1, int dia2, int mes2, int anyo) {
		int dias = 0;

		// si los meses son iguales
		if (mes1 == mes2)
			//dias será igual a la diferencia entre dias
			dias = Math.abs(dia1 - dia2);
		// si son dos meses distintos
		// si el mes1 va antes que el mes 2
		else if (mes1 < mes2)
			// restamos a los dias del primer mes (teniendo en cuenta
			// si es bisiesto el dia de ese mes, y le sumamos el dia 2
			dias = (diasMes(mes1, anyo) - dia1) + dia2;
		// si es el mes 2 el que va antes
		else
			// realizamos la misma operación pero con los dias cambiados
			dias = (diasMes(mes2, anyo) - dia2) + dia1;

		// creamos un bucle que añada a los dias ya guardados en la variable
		// dias los dias de los meses que existen entre ambas fechas
		for (int cont = Math.min(mes1, mes2) + 1; cont < Math.max(mes1, mes2); cont++) {
			dias += diasMes(cont, anyo);
		}

		// devolvemos el total de la diferencia en dias.
		return dias;
	}

	/**
	 * Medodo para calcular los dias que hay entre dos años distintos
	 * 
	 * @param anyo1 tipo entero con el valor de un año
	 * @param anyo2 tipo entero con el valor de otro año
	 * @return tipo int con el total de dias que hay entre los dos años dados
	 * 
	 * El metodo tendrá en cuenta los años bisiestos
	 * y sumará el total de los dias
	 */
	public static int diasEntreAnyos(int anyo1, int anyo2) {
		int dias = 0;
		// creamos un bucle que recorra los años entre ambos y sume los dias
		for (int cont = Math.min(anyo1, anyo2) + 1; cont < Math.max(anyo1, anyo2); cont++) {
			// si es bisiesto suma 366 dias 
			if (anyoBisiesto(cont))
				dias += 366;
			//si no, suma 365 dias
			else
				dias += 365;
		}
		// devolvemos el total de dias
		return dias;
	}

	/**
	 * Meto para calcular los dias de una fecha hasta el final del año de la misma
	 * 
	 * @param dia tipo int con el dia de la fecha
	 * @param mes tipo int con el mes de la fecha
	 * @param anyo tipo int con el año de la fecha
	 * @return tipo int con el total de dias desde la fecha hasta fin del año de la misma fecha
	 * 
	 * El metodo sumará los dias desde el dia de la fecha hasta el final
	 * del mes de la misma y los sumará a los dias de los meses
	 * hasta el final del año de la fecha
	 */
	public static int hastaFinAnyo(int dia, int mes, int anyo) {
		// dias hasta el final del mes de la fecha
		int dias = diasMes(mes, anyo) - dia;
		// bucle para sumar los dias de los meses hasta final de año
		for (int cont = mes + 1; cont < 13; cont++) {
			dias += diasMes(cont, anyo);
		}
		// devolvemos el total de dias
		return dias;
	}

	/**
	 * Metodo para calcular los dias desde el principio de año de una fecha dada
	 * @param dia tipo int con el dia de la fecha
	 * @param mes tipo int con el mes de la fecha
	 * @param anyo tipo int con el año de la fecha
	 * @return tipo int con el total de dias desde la fecha hasta fin del año de la misma fecha
	 * 
	 * El metodo sumará los dias desde el principio del año
	 * de la fecha dada, hasta el dia del mes de la misma.
	 */
	public static int desdeInicioAnyo(int dia, int mes, int anyo) {
		// dias del mes de la fecha
		int dias = dia;
		// bucle que cuenta los dias de los meses entre principio
		// de año y la fecha dada del mismo año.
		for (int cont = mes - 1; cont >= 1; cont--) {
			dias += diasMes(cont, anyo);
		}
		return dias;
	}

	/**
	 * Metodo para calcular los dias de un mes
	 * 
	 * @param mes tipo int con el mes del que se quieren saber los dias
	 * @param anyo tipo int con el año del mes del que se quieren saber los dias
	 * @return la cantidad de dias que tiene el mes
	 * 
	 * El metodo tendrá en cuenta no solo que mes es
	 * si no tambien si el año es bisiesto o no.
	 */
	public static int diasMes(int mes, int anyo) {
		// si el mes es febrero y el año es bisiesto
		if (mes == 2 && anyoBisiesto(anyo))
			return 29;
		// si el mes es febrero y el año no es bisiesto
		else if (mes == 2 && !anyoBisiesto(anyo))
			return 28;
		// si el mes el abril, junio, septiembre o noviembre
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;
		// si es uno del resto de meses
		else
			return 31;
	}

}
