package _03Ejercicios;

import java.util.Arrays;
import java.util.List;

public class _09TocayosConArrayLis {

	public static void main(String[] args) {
		String[] grupo1 = {"Bartolo", "David", "Esteban", "German", "Javi"};
		String[] grupo2 = {"Ana", "Bartolo", "Carlos", "David", "Esteban", "Fernando"};
		
		List<String> g1 = Arrays.asList(grupo1);
		List<String> g2 = Arrays.asList(grupo2);
		
		// Recorremos los nombres del g1
		for (String nombre : g1) {			
			if (g2.indexOf(nombre) != -1)
				System.out.println(nombre + " tiene tocayo en el gurpo 2");	
		}
		
		// Recorremos los nombres del g1
		for (String nombre : g1) {			
			if (g2.contains(nombre))
				System.out.println(nombre + " tiene tocayo en el gurpo 2");	
		}
	}

}
