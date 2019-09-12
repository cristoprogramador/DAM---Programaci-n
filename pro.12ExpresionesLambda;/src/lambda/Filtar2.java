package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Filtar2 {

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

		filtrar(l, (o)-> o.getSexo().equals("M")); //Mujeres
		
		Collections.sort(l, (o1,o2)-> {;
				if (o1.getEdad()< o2.getEdad()) return -1;
				else if (o1.getEdad()> o2.getEdad()) return 1;
				else return 0;
			});
		System.out.println("Lista por edad: ");
		for(Alumno a: l) {
			System.out.println(a);
		}
		 
		public static void filtrar (ArrayList<Alumno> l, Filtro<Alumno> f) {
			for (Alumno a: l) {
				if(f.aceptado(a))
			}
		}
	}

	/**
	 * las expresiones lambda son una forma de abreviar
	 */
}
