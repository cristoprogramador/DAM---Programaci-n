package fechas;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * La clase Fechas, tiene una ejecución tipo programa, que nos permite realizar
 * varias operaciones, entre ellas: 
 * Validar una fecha 
 * Comparar dos fechas
 * Obtener la diferencia entre dos fechas en dias
 * 
 * @author Cristobal Salido
 *
 */
public class Fechas {
	static Scanner tec = new Scanner(System.in);
	static StringTokenizer tokens;


	public static void main(String[] args) {
		int opcion;

		do {
			// inicializamos la variable opción con un valor no valido
			// con esto conseguimos que no se salga del bucle al menos
			// que se le dé un valor correcto, en cada iteración.
			opcion = 5;
			// generamos interface de menú con un aspecto que lo distinga
			// mejor del resto de mensajes
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("1.-Validar fecha.           |");
			System.out.println("2.-Comparar fechas.         |");
			System.out.println("3.-Diferencia entre fechas. |");
			System.out.println("0.-Salir.                   |");
			System.out.println("-----------------------------");
			System.out.print("Indique la acción a realizar:");

			// Recivimos la información del usuario
			try {
				opcion = tec.nextInt();
				// limpiamos el intro de la memoria para evitar
				// una entrada en bucle.
				tec.nextLine();
				// marcamos un espacio que separa el menú de la 
				// ejecución del metodo elegido
				System.out.println();
				//Si la opción no está entre 0 y 3
				if (opcion < 0 || opcion > 3)
					//notificamos al usuario 
					System.err.println("Opción incorrecta");
				//capturamos si no se introduce un entero
			} catch (InputMismatchException e) {
				// notificamos al usuario
				System.err.println("Error en la introducción");
				// limpiamos memoria entrada de datos
				tec.nextLine();
			}
			// selecionamos el metodo correspondiente
			// segun la seleción del usuario.
			if (opcion == 1)
				submenu(1);
			else if (opcion == 2)
				submenu(2);
			else if (opcion == 3)
				submenu(3);
			//el bucle se realizará mientras que la opción no sea 0
		} while (opcion != 0);
	}

	/**
	 * Metodo submenu para las opciones
	 * 
	 * @return boleano a true constante, para retornar a menú
	 * 
	 * el metodo indicará la opción elegida, preguntará la fecha dos
	 * veces y las guardará en dos arrays, seguidamente llamará al
	 * metodo según opción comarar o diferencia enviandole las dos 
	 * fechas guardadas.
	 * 
	 */
	public static boolean submenu(int opcion) {
		int[] fecha1, fecha2 = null;
		int dia1 = 0, dia2 = 0, mes1 = 0, mes2 = 0, anyo1 = 0, anyo2 = 0;

		//indicamos la opción que a elegido
		if (opcion == 1) {
			System.out.println("Ha elegido Validar fecha");
			do {
				fecha1 = validarEntradaFecha();
				//si la fecha no es valida
				if (!UtilesFechas.validarFecha(fecha1))
					//notificamos
					System.out.println("Dia:" + fecha1[0] + " Mes:" + fecha1[1] + " Año:" + fecha1[2] + ". Fecha incorrecta");
				//Preguntará la primera fecha mientras mientras que la fecha no sea valida
			} while (!UtilesFechas.validarFecha(fecha1));
		}else {
			if (opcion == 2)
				System.out.println("Ha elegido Comparar fechas");
			if (opcion == 3)
				System.out.println("Ha elegido Diferencia entre fechas");		
			System.out.println();

			//preguntamos primera fecha
			do {
				System.out.println("Primera fecha");
				fecha1 = validarEntradaFecha();
				//si la fecha no es valida
				if (!UtilesFechas.validarFecha(fecha1))
					//notificamos
					System.out.println("Dia:" + fecha1[0] + " Mes:" + fecha1[1] + " Año:" + fecha1[2] + ". Fecha incorrecta");
				//Preguntará la primera fecha mientras mientras que la fecha no sea valida
			} while (!UtilesFechas.validarFecha(fecha1));

			System.out.println();
			//preguntamos segunda fecha
			do {
				System.out.println("Segunda fecha");
				fecha2 = validarEntradaFecha();
				if (!UtilesFechas.validarFecha(fecha2))
					System.out.println("Dia:" + fecha2[0] + " Mes:" + fecha2[1] + " Año:" + fecha2[2] + ". Fecha incorrecta");
			} while (!UtilesFechas.validarFecha(fecha2));
			System.out.println();
		}
		// ejecutamos la opcion elegida con las dos fechas
		if (opcion == 1) {
			System.out.println();
			if(UtilesFechas.validarFecha(fecha1))
				// notificamos de la fecha correcta con el mes en formato nombre
				System.out.println(fecha1[0] + " de " + UtilesFechas.MESES[fecha1[1]] + " del " + fecha1[2] + ": Fecha correcta");
			else
				System.out.println("Dia:" + fecha1[0] + " Mes:" + fecha1[1] + " Año:" + fecha1[2] + ". Fecha incorrecta");
		}
		if (opcion == 2)
			// Enviamos al metodo de compararFechas las dos fechas
			// este nos mostrará por pantalla la comparación
			UtilesFechas.compararFechas(fecha1, fecha2);
		if (opcion == 3)
			// Enviamos al metodo diferenciaFechas las dos fechas
			// este nos mostrará los dias entre la mas antigua y la mas nueva
			UtilesFechas.diferenciaFechas(fecha1, fecha2);

		// Damos una pausa de 5 segundos para ver el resultado antes de volver a menú
		System.out.println();
		System.out.println("El menú se mostrará en 5 segundos");	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Devolvemos true 
		// (en este programa lo utilizamos solo para retornar al menú)
		return true;
	}


	/**
	 * Metodo para validar la entrada de datos de fecha por parte del usuario
	 * 
	 * @return devuelve un Array tipo int con los valores dia, mes y año por orden [0][1][2]
	 * 
	 * El metodo se asegurará que el usuario introduzca los datos
	 * solicitados de una forma correcta y los devolverá en un array
	 * 
	 */
	public static int[] validarEntradaFecha() {
		String fecha;
		int[] arrayFecha = new int[3];
		boolean fechaOk;

		do {
			// damos valor true a la condición del bucle
			fechaOk = true;
			try {
				// pedimos entrada de fecha
				System.out.print("Introduzca una fecha con formato (dd/mm/aaaa): ");
				fecha = tec.nextLine();

				// Si el tamaño es menor a 5 (1/1/1) o tiene un caracter '/' al principio
				// o al final, informamos de un formato incorrecto
				if (fecha.length() < 5 || fecha.charAt(0) == '/' || fecha.charAt(fecha.length() - 1) == '/' || fecha.indexOf("+") != -1) {
					System.out.println();
					System.err.println("Formato de fecha mal introducido");
					//cambiamos a false fechaOk para repetir el bucle
					fechaOk = false;

					//si no incumple condiciones de formatro previas
				} else {
					// cortamos el String por los caracteres '/'
					tokens = new StringTokenizer(fecha, "/");
					// hacemos el primer corte lo pasamos a entero y 
					// lo guardamos en la posición 0 del arrayFecha
					arrayFecha[0] = Integer.valueOf(tokens.nextToken());
					// si el corte del dia no está entre 1 y 31
					if (arrayFecha[0] < 1 || arrayFecha[0] > 31) {
						//notificamos error en el dia
						System.out.println();
						System.err.println("El dia deve estar entre 1 y 31");
						fechaOk = false;
					}
					// hacemos el segundo corte lo pasamos a entero y 
					// lo guardamos en la posición 1 del arrayFecha
					arrayFecha[1] = Integer.valueOf(tokens.nextToken());
					// el el corte del mes no está entre 1 y 12
					if (arrayFecha[1] < 1 || arrayFecha[1] > 12) {
						//notificamos error de mes
						System.out.println();
						System.err.println("El mes deve estar entre 1 y 12");
						fechaOk = false;
					}
					// hacemos el tercer corte lo pasamos a entero y 
					// lo guardamos en la posición 2 del arrayFecha
					arrayFecha[2] = Integer.valueOf(tokens.nextToken());
					// si el año es 0 o negativo
					if (arrayFecha[2] <= 0) {
						// notificamos erro de año
						System.out.println();
						System.err.println("El año deve ser positivo");
						fechaOk = false;
					}
				}
				// capturamos las excepciones notificamos y repetimos el bucle
			} catch (NoSuchElementException e) {
				System.out.println();
				System.err.println("Formato de fecha mal introducido");
				fechaOk = false;
			} catch (NumberFormatException e) {
				System.out.println();
				System.err.println("La fecha ha de ir en formato numerico y entre barras");
				fechaOk = false;
			}
			//se repite mientras que la fecha no esté Ok
		} while (!fechaOk);
		// devolvemos un array con los datos de fecha con unos valores
		// que nos asegura poder trabajar con ellos sin errores a causa de ellos
		return arrayFecha;
	}

}