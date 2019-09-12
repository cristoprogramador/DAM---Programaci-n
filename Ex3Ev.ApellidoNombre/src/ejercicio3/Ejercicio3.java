package ejercicio3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio3 {
	public static void mostrarDiferenciaEscanyos(List<Partido> Res20D2015, List<Partido> Res26J2016) {
		Map<String, Integer> diferencia = new HashMap<>();

		for (Partido p2015 : Res20D2015) {
			String partido2015 = p2015.getPartido();
			Integer resultado2015 = p2015.getEscanyos();

			if (Res26J2016.contains(p2015))
				diferencia.put(partido2015, resultado2015);
			else
				diferencia.put(partido2015, -resultado2015);
		}
		
		for (Partido p2016 : Res26J2016) {
			String partido2016 = p2016.getPartido();
			Integer resultado2016 = p2016.getEscanyos();

			if (diferencia.containsKey(partido2016)) {
				int dif = resultado2016 - diferencia.get(partido2016);
				diferencia.put(partido2016, dif);
			} else
				diferencia.put(partido2016, resultado2016);
		}

		System.out.println(diferencia);
	}
}
