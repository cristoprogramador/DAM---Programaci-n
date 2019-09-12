package _02Ejemplos;

import java.util.ArrayList;

public class _10Arraylist {

	public static void main(String[] args) {
		// Declaración y creación del ArrayList
		ArrayList<String> nombres = new ArrayList<>();
		System.out.println(nombres);

		// Añadimos elementos al final del ArrayList
		nombres.add("pepe");
		nombres.add("miguel");
		nombres.add("ana");
		System.out.println(nombres);

		// Insertar elementos en determinada posición
		nombres.add(0, "amadeo");
		System.out.println(nombres);

		nombres.add(1, "bartolomé");
		System.out.println(nombres);

		// Si se añade fuera del orden da error
		// IndexOutOfBoundsException
		/*
		 * nombres.add(10, "Cristobal"); 
		 * System.out.println(nombres);
		 */

		// Eliminar por contenido
		nombres.remove("ana");
		System.out.println(nombres);

		// Eliminar por porsición
		nombres.remove(0); //Elimina el primero
		System.out.println(nombres);
		
		//Buscar por contenido
		int pos = nombres.indexOf("amadeo");
		System.out.println("Amadeo está en la posicion " + pos);
		
		pos = nombres.indexOf("pepe");
		System.out.println("Pepe está en al posición " + pos);
	}

}
