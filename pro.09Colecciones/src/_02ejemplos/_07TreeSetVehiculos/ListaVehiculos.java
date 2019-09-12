package _02ejemplos._07TreeSetVehiculos;

import java.util.ArrayList;

public class ListaVehiculos {

	public static void main(String[] args) {
		ArrayList<Vehiculo> lv = new ArrayList<>();
		
		lv.add(new Vehiculo("3848BBB", "Ford", "Fiesta"));
		lv.add(new Vehiculo("5842BBK", "Renault", "Clio"));
		lv.add(new Vehiculo("1111CCM", "Ford", "Ka"));
		System.out.println(lv);

		Vehiculo buscado = new Vehiculo ("1111CCM", "Ford", "Ka");
		System.out.println(lv.contains(buscado));
		
		//Devolverá false porque no tenemos implementado correctamente el metodo
		// equals en la clas Vehiculo, que es el que utiliza contains para buscar
		// si un objeto está dentro del arraylist. No da error porque lo tiene 
		// eredado de la clase objet, pero no se ejecuta acorde al tipo de objeto
		// solo devuelve true si están en la misma dirección de memeoria, osea es 
		// el miso objeto.
	}

}
