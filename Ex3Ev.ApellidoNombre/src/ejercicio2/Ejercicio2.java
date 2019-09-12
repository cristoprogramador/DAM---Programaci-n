package ejercicio2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio2 {
	public static void ponerNumeroAReyes(List<Monarca> reyes){
		Map<String, Integer> rey = new  HashMap<>();
		
		for (Monarca m: reyes) {
			String nombre = m.getNombre();
			Integer num;
			if (rey.get(nombre) == null) {
				rey.put(nombre, 1);
				m.setNumero(1);
				
			}else {
				num = rey.get(nombre);
				m.setNumero(num+1);
				rey.put(nombre, num+1);
				
			}
			
		}
	}
}
