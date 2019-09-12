package ejercicio3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Garaje {
	private Map<String, Integer> vehiculos;

	public Garaje() {
		vehiculos = new LinkedHashMap<>();
	}

	public void registrarMatricula(String matricula, int instante) {
		if (this.vehiculos.containsKey(matricula)) {
			System.out.println("Salida del vehiculo " + matricula + " en el instante " + instante);
			int tiempo = instante - this.vehiculos.get(matricula);
			System.out.println("Tiempo dentro: " + tiempo);
			this.vehiculos.remove(matricula);
		} else {
			System.out.println("Entrada del vehiculo " + matricula + " en el instante " + instante);
			this.vehiculos.put(matricula, instante);
		}
	}

	@Override
	public String toString() {
		Set<String> matriculas = vehiculos.keySet();
		String listaVehiculos = "";
		
		for (String m: matriculas) {
			listaVehiculos += "Matricula: "+ m +
					" Instante de entrada " + vehiculos.get(m) +"\n";
		}

		return "---- Contenido del garaje ----\n" + listaVehiculos;
	}

}
