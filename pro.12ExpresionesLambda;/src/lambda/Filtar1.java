package lambda;

import java.util.ArrayList;

public class Filtar1 {

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

		filtrar(l, new FiltroAlumnas());
		System.out.println();
		filtrar(l, new Filtro<Alumno>() {
			@Override
			public boolean aceptado(Alumno o) {
				if (o.getSexo().equals("M")) return true;
				else return false;
			}
		});

	}

	public static void filtrar(ArrayList<Alumno> l, Filtro<Alumno> f) {
		for (Alumno a : l) {
			if (f.aceptado(a)) 
				System.out.println(a);			
		}
	}

	public static boolean aceptado(Alumno a) {
		if(a.getSexo().equals("H")) return true;
		else return false;
	}
}
