package _02ejemplos._07TreeSetVehiculos;

import java.util.HashSet;

public class HashSetVehiculos {

	public static void main(String[] args) {
		HashSet<Vehiculo> s = new HashSet<>();

		s.add(new Vehiculo("3848BBB", "Ford", "Fiesta"));
		s.add(new Vehiculo("5842BBK", "Renault", "Clio"));
		s.add(new Vehiculo("1111CCM", "Ford", "Ka"));
		System.out.println(s);		
		
		
		Vehiculo buscado = new Vehiculo ("1111CCM", "Ford", "Ka");
		System.out.println(s.contains(buscado));


	}

}
