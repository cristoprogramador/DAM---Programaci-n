package _02ejemplos._07TreeSetVehiculos;

import java.util.TreeSet;

public class TreeSetVehiculos {

	public static void main(String[] args) {
		TreeSet<Vehiculo> s = new TreeSet<>();

		s.add(new Vehiculo("3848BBB", "Ford", "Fiesta"));
		s.add(new Vehiculo("5842BBK", "Renault", "Clio"));
		s.add(new Vehiculo("1111CCM", "Ford", "Ka"));
		System.out.println(s);		
		// Da error, porque add utiliza compareTo para añadir los
		// objetos en forma de arbol o bien a la izquierda o a la derecha
		// del objeto referencial que será el primero.
		// Al no estár implementado en nuestra clase Vehiculo, no podemos
		// definir los objetos de nuestra clase en una colección TreeSet
		
		
		Vehiculo buscado = new Vehiculo ("1111CCM", "Ford", "Ka");
		System.out.println(s.contains(buscado));
		//Contains en el caso de TreeSet, utiliza el compareTo para realizar
		//las busquedas dentro de la colección.

	}

}
