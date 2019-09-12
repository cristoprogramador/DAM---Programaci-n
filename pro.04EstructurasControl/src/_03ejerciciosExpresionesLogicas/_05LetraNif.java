package _03ejerciciosExpresionesLogicas;

import java.util.Scanner;

/**
 * (LetraNif) Escribir un programa que lea de teclado un nif. Si el nif
 * introducido lleva la letra, se comprobar� si �sta es correcta y se le
 * indicar� al usuario si lo es o no. Si el nif no lleva letra, se calcular� la
 * que le corresponde y se mostrar� al usuario.
 * 
 * @author Cristobal Salido
 *
 */
public class _05LetraNif {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca el numero de NIF: ");
		int numeroNif = tec.nextInt();tec.nextLine();
		System.out.println("Introduzca la letra de NIF: ");
		String letra = tec.nextLine();
		
		if (letra.hashCode() == 0)
			System.out.println("No ha introducide letra \nLa letra que corresponde es la " + letra(numeroNif));
		else
			if (letra.toUpperCase().compareTo(letra(numeroNif)) == 0)
				System.out.println("La letra es correcta");
			else {
				System.out.println("La letra no es correcta");
				System.out.println("�Desea conocer la letra que le corresponde? (Si o No)");
				String respuesta = tec.next();
				if (respuesta.toUpperCase().compareTo("SI") == 0)
					System.out.println("La letra correspondiente es la " + letra(numeroNif));
				else System.out.println("Fin del programa. Hasta pronto");
			}

	}

	// hacemos un metodo para el calculo de letra de nif
	public static String letra(int nif) {

		int calculoLetra = Math.abs(nif % 23);
		String letraCalculada = null;
		if (calculoLetra == 0)letraCalculada = "T";
		else if (calculoLetra == 1)letraCalculada = "R";
		else if (calculoLetra == 2)letraCalculada = "W";
		else if (calculoLetra == 3)letraCalculada = "A";
		else if (calculoLetra == 4)letraCalculada = "G";
		else if (calculoLetra == 5)letraCalculada = "M";
		else if (calculoLetra == 6)letraCalculada = "Y";
		else if (calculoLetra == 7)letraCalculada = "F";
		else if (calculoLetra == 8)letraCalculada = "P";
		else if (calculoLetra == 9)letraCalculada = "D";
		else if (calculoLetra == 10)letraCalculada = "X";
		else if (calculoLetra == 11)letraCalculada = "B";
		else if (calculoLetra == 12)letraCalculada = "N";
		else if (calculoLetra == 13)letraCalculada = "J";
		else if (calculoLetra == 14)letraCalculada = "Z";
		else if (calculoLetra == 15)letraCalculada = "S";
		else if (calculoLetra == 16)letraCalculada = "Q";
		else if (calculoLetra == 17)letraCalculada = "V";
		else if (calculoLetra == 18)letraCalculada = "H";
		else if (calculoLetra == 19)letraCalculada = "L";
		else if (calculoLetra == 20)letraCalculada = "C";
		else if (calculoLetra == 21)letraCalculada = "K";
		else letraCalculada = "E";
		return letraCalculada;
	}

}
