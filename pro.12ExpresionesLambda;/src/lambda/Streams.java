package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		ArrayList<Alumno> l = new ArrayList<>();
		l.add(new Alumno("a", 30, 80, "H"));
		l.add(new Alumno("b", 40, 80, "M"));
		l.add(new Alumno("c", 60, 80, "H"));
		l.add(new Alumno("d", 35, 80, "M"));
		l.add(new Alumno("e", 26, 80, "H"));
		l.add(new Alumno("f", 48, 80, "M"));
		l.add(new Alumno("g", 17, 80, "M"));
		l.add(new Alumno("h", 24, 80, "H"));
		
		//Crear otra lista solo con los hombres
		ArrayList<Alumno> h1= new ArrayList<>();
		for(Alumno a: l) {
			if (a.getSexo().equals("H")) h1.add(a);
		}
		System.out.println(h1);
		
		//Con streams
		List<Alumno> h2 = l.stream()
			.filter(alu -> alu.getSexo().equals("H"))
			.collect(Collectors.toList());
		System.out.println(h2);
		
		//Contar hombres
		int cont= 0;
				for(Alumno a: l) {
					if(a.getSexo().equals("H")) cont++;
				}
		System.out.println(cont);
		
		//Con streams
		System.out.println(l.stream()
				.filter((a)-> a.getSexo().equals("H"))
				.count());
		
		//Peso medio de los mayores de 30 años
		System.out.println(l.stream()
				.filter((a)-> a.getEdad()>30)
				.mapToDouble((a) ->a.getPeso())
				.average().getAsDouble());
	}

}
