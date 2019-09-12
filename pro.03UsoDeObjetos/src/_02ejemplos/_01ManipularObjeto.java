package _02ejemplos;

import java.util.Scanner;

public class _01ManipularObjeto {
	//Esto es una CLASE DE PROGRAMA: tiene método main
	public static void main(String[] args) {
		//En este programa utilizo otras clases,
		// que no son clases de programa
		
		//Scanner es una clase de datos. Representa
		// al teclado. Tiene atributos como los datos
		// de localidad, que hacen que el separador de 
		// decimales sea la coma o el punto
		Scanner tec = new Scanner (System.in);
		
		//Tiene metodos que permiten capturar lo que introduce 
		// el usuario.
		System.out.println("Introduce tu nombre: ");
		String nombre = tec.nextLine();
		System.out.println(nombre);
		
		//La clase String es una clase de datos. Permite representar
		// una secuencia de cero o más caracteres.
		//La clase String tiene métodos que permiten realizar operaciones
		// sobre los objetos de la clase.
		//nombre es un objeto de la clase String
		
		System.out.println(nombre.toUpperCase());
		
		int longitud = nombre.length();
		System.out.println(longitud);

	}

}
