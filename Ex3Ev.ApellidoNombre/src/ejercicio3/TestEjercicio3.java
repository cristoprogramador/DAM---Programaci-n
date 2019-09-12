package ejercicio3;

import java.util.Arrays;
import java.util.List;

public class TestEjercicio3 {
	public static void main(String[] args) {
		Partido q[] = {
				new Partido("PSOE",90),
				new Partido("PP",123),
				new Partido("CS",40),
				new Partido("PODEMOS",71),
				new Partido("CDC",8),
				new Partido("PNV",5),
				new Partido("ERC",9),
				new Partido("IU",2)
		};
		List<Partido> resultados20D2015 = Arrays.asList(q);

		Partido p[] = {
				new Partido("PP",137),
				new Partido("PSOE",85),
				new Partido("PODEMOS",71),
				new Partido("CS",32),
				new Partido("ERC",9),
				new Partido("CDC",8),
				new Partido("PNV",5),
				new Partido("PartidoX",1)
		};
		List<Partido> resultados26J2016 = Arrays.asList(p);
		
		Ejercicio3.mostrarDiferenciaEscanyos(resultados20D2015,resultados26J2016);
	}
	
}
