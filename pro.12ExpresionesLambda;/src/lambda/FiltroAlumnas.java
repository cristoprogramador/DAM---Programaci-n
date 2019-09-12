package lambda;

public class FiltroAlumnas implements Filtro<Alumno> {

	@Override
	public boolean aceptado(Alumno o) {
		if (o.getSexo().equals("M"))
			return true;

		else
			return false;
	}

}
