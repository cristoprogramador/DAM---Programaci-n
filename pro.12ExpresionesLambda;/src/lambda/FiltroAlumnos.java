package lambda;

public class FiltroAlumnos implements Filtro<Alumno> {

	@Override
	public boolean aceptado(Alumno o) {
		if (o.getSexo().equals("H"))
			return true;

		else
			return false;
	}

}
