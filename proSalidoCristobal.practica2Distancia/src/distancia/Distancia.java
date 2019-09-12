package distancia;

import java.util.InputMismatchException;
//PROBLEMA - LA IDENTIFICACION DE º EN EL STRING CON DISTINTOS SO???
//PROBLEMA - AL INGRESAR LAS " LAS RECONOCEN COMO COMANDOS DE STRING 
//PROBLEMA - En shell hay que añadir contrabarra a " y a '
import java.util.Locale;
import java.util.Scanner;

import coordenadas.Coordenadas;

public class Distancia {
	public static void main(String args[]) {
		// creamos objeto tec para capturar información del teclado con el uso local de
		// US para que acepte el punto y la como para separador decimal
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);

		// Declaramos las variables de altitud y las que contendran el valor de
		// los grados en decimal
		double alt1 = 0, alt2 = 0, latDecimal1 = 0, lonDecimal1 = 0, latDecimal2 = 0, lonDecimal2 = 0;
		// Declaramos los String que contendr�n los valores latitud y longitud
		// dados por el usuario
		String latitudPunto1, longitudPunto1, latitudPunto2, longitudPunto2;
		// Declaramos un String con el contenid del aviso en caso de que los argumentos
		// sean incorrectos
		String aviso = "Los datos proporcionados al programa son incorrectos.\n"
				+ "Uso: Distancia 10º20\\'53.2\\\"N 11º12'23\\\"E 0.25 11º20\\'53.2\\\"N 21º12\\'23\\\"O 0.38";
		// Declaramos variable boolean de comprovación o validación
		// Asignamos valor de validación (true) a los datos y a los argumentos
		boolean datosOk = true, argumentos = true;

		/*
		 * Punto de test
		 * 
		 * System.out.println(args.length); System.out.println(args[0]);
		 * System.out.println(args[1]); System.out.println(args[2]);
		 * System.out.println(args[3]); System.out.println(args[4]);
		 * System.out.println(args[5]);
		 */

		// Si los argumentos no sos 6 ni 0
		// Es decir si introducen argumentos y no son seis
		if (args.length != 6 && args.length != 0)
			// Escribivmos aviso y finaliza el programa
			System.out.println(aviso);

		// Si los argumentos son 6 o no hay argumentos
		else {

// Preguntamos por la latitud del punto 1
			do {
				// Si los argumentos son 6 asignamos el valor del argumento
				if (args.length == 6) {
					latitudPunto1 = args[0];
				}
				// Si no hay argumentos
				else {
					// Pedimos que introduzcan latitud del punto 1
					System.out.println("Introduzca la latitud del punto 1\nDato tipo 89º59'59.99\"(N/S)");
					latitudPunto1 = tec.next();
				}

				// Comprovamos la cardinalidad de la latitud
				// Pasamos el String que han introducido como latitud del punto uno a Mayusculas
				// esto permite que el usuaro introduzca el dato en minusculas sin dar error
				// Despues localizamos el ultimo caracter y lo guardamos en el String direccion
				String direccion = latitudPunto1.toUpperCase().substring(latitudPunto1.length() - 1);
				// Si la latitud tiene indicador cardinal Norte o Sur
				if ((direccion.compareTo("N") == 0 || direccion.compareTo("S") == 0))
					// Llamamos al metodo aDecimal y asignamos a latDecimal1 el valor que devuelve
					latDecimal1 = Coordenadas.aDecimal(latitudPunto1);
				// si no es Norte o Sur
				else
					// latDecimal1 será igual a 1000 (codigo de error)
					latDecimal1 = 1000;

				// Si latDecimal1 será igual a 1000 (codigo de error) y los argumentos son 6
				if (latDecimal1 == 1000 && args.length == 6) {
					// Mostramos aviso
					System.out.println(aviso);
					// argumentos no serán validos y cerrará el bucle
					argumentos = false;
				}
				// Si latDecimal1 será igual a 1000 (codigo de error)
				else if (latDecimal1 == 1000)
					// Mostramos Parametro incorrecto
					System.out.println("Parametro incorrecto");
			}
			// Se repitirá mientras latDecimal sea 1000 (codigo de error) y los argumentos
			// sean true
			while (latDecimal1 == 1000 && argumentos);

			// punto de test
			// System.out.println(latdecimal1);

// Preguntamos por la longitud del punto 1
			do {
				if (args.length == 6) {
					longitudPunto1 = args[1];
				} else {
					System.out.println("Introduzca la longitud del punto 1\nDato tipo 179º59'59.99\"(E/O)");
					longitudPunto1 = tec.next();
				}

				lonDecimal1 = Coordenadas.aDecimal(longitudPunto1);
				String direccion = longitudPunto1.toUpperCase().substring(longitudPunto1.length() - 1);

				if ((direccion.compareTo("E") == 0 || direccion.compareTo("O") == 0))
					lonDecimal1 = Coordenadas.aDecimal(longitudPunto1);
				else
					lonDecimal1 = 1000;

				if (lonDecimal1 == 1000 && args.length == 6) {
					System.out.println(aviso);
					argumentos = false;
				} else if (lonDecimal1 == 1000)
					System.out.println("Parametro incorrecto");
			} while (lonDecimal1 == 1000 && argumentos);

			// Punto de test
			// System.out.println(londecimal1);

// Preguntamos la altura del punto 1
			do {
				// Si los argumentos son 6
				if (args.length == 6) {
					// la Variable atl1 toma el valor del argumento correspondiente
					alt1 = Double.parseDouble(args[2]);
				}
				// Si los argumentos no son 6
				else {
					// Damos los datos como validos
					datosOk = true;
					// Intentamos capturar una excepción
					try {
						// Pedimos la Altitud
						System.out.println("Altitud del punto 1 (en metros)");
						alt1 = tec.nextDouble();
					}
					// Si captura la excepción de datos introducidos no correspondientes
					catch (InputMismatchException e) {
						// Si los argumentos son 6
						if (args.length == 6) {
							// Mostramos aviso
							System.out.println(aviso);
							// Los argumentos no serán correctos, saldrá del bucle y cerrará programa
							argumentos = false;
						}
						// Si los argumentos no son 6
						else {
							// Los datos no serán correctos
							datosOk = false;
							// Vaciamos el buffer
							tec.nextLine();
						}
					}
				}
			}
			// Se repitirá mientas que los datos no sean correctos y los argumentos sean
			// correctos
			while (!datosOk && argumentos);

			// Punto de test
			// System.out.println(alt1);

// Preguntamos por la latitud del punto 2
			do {
				if (args.length == 6) {
					latitudPunto2 = args[3];
				} else {
					System.out.println("Introduzca la latitud del punto 2\nDato tipo 89º59'59.99\"(N/S)");
					latitudPunto2 = tec.next();
				}

				String direccion = latitudPunto2.toUpperCase().substring(latitudPunto2.length() - 1);

				if ((direccion.compareTo("N") == 0 || direccion.compareTo("S") == 0))
					latDecimal2 = Coordenadas.aDecimal(latitudPunto2);
				else
					latDecimal2 = 1000;
				if (latDecimal2 == 1000 && args.length == 6) {
					System.out.println(aviso);
					argumentos = false;
				} else if (latDecimal2 == 1000)
					System.out.println("Parametro incorrecto");
			} while (latDecimal2 == 1000 && argumentos);

			// Punto de test
			// System.out.println(latDecimal2);

// Preguntamos por la longitud del punto 2
			do {
				if (args.length == 6) {
					longitudPunto2 = args[4];
				} else {
					System.out.println("Introduzca la longitud del punto 2\nDato tipo 179º59'59.99\"(E/O)");
					longitudPunto2 = tec.next();
				}
				lonDecimal2 = Coordenadas.aDecimal(longitudPunto2);

				String direccion = longitudPunto2.toUpperCase().substring(longitudPunto2.length() - 1);

				if ((direccion.compareTo("E") == 0 || direccion.compareTo("O") == 0))
					lonDecimal2 = Coordenadas.aDecimal(longitudPunto2);
				else
					lonDecimal2 = 1000;
				if (lonDecimal2 == 1000 && args.length == 6) {
					System.out.println(aviso);
					argumentos = false;
				} else if (lonDecimal2 == 1000)
					System.out.println("Parametro incorrecto");
			} while (lonDecimal2 == 1000 && argumentos);

			// Punto de test
			// System.out.println(londecimal2);

// Preguntamos la altura del punto 2
			do {
				if (args.length == 6) {
					alt2 = Double.parseDouble(args[5]);
				} else {
					datosOk = true;
					try {
						System.out.println("Altitud del punto 2 (en metros)");
						alt2 = tec.nextDouble();
					} catch (InputMismatchException e) {
						if (args.length == 6) {
							System.out.println(aviso);
							argumentos = false;
						} else {
							datosOk = false;
							tec.nextLine();
						}
					}
				}
			}
			while (!datosOk && argumentos);
			
			// Punto de test
			// System.out.println(alt2);

			// Si los argumentos son correctos
			if (argumentos) {
				// Añadimos una linea en blanco para separar los datos de los resultados
				System.out.println();
				// Llamamos al metodo distanciaEnSuperficie dando latitud y longitud en
				// grados decimales, devolviendonos la distancia en metros
				System.out.format("La distancia lineal entre los dos puntos es: %.3f metros \n",
						Coordenadas.distanciaEnSuperficie(latDecimal1, lonDecimal1, latDecimal2, lonDecimal2));

				// Calculamos el valor absoluto de la diferencia entre las distancias
				System.out.format("La diferencia de altura entre los dos puntos es: %.3f metros \n",
						Math.abs(alt1 - alt2));

				// Llamamos al metodo Coordenadas.distancia con latitud y longitud en
				// decimal y las alturas que nos devolver� la distancia absoluta
				System.out.format("La distancia real entre los dos puntos es: %.3f metros \n",
						Coordenadas.distancia(latDecimal1, lonDecimal1, alt1, latDecimal2, lonDecimal2, alt2));
			}
		}
	}
}


