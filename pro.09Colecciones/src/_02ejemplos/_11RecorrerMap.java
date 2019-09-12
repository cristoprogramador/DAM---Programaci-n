package _02ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _11RecorrerMap {

	public static void main(String[] args) {
		Map<String, Integer> edad = new HashMap<>();
		edad.put("miguel", 20);
		edad.put("ana", 25);
		edad.put("luis", 30);
		edad.put("rober", 23);
		edad.put("pepe", 22);
		edad.put("rosa", 31);

		//Recorrer el map:
		// - Primero obtengo las claves
		Set<String> nombres = edad.keySet();
		// - Recorro las claves
		for(String n: nombres) {
			Integer valor = edad.get(n);
			System.out.println("Edad de " + n + ": " + valor);
		}
	}

}
