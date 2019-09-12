package examen;

public class _01Ejercicio1 {
	public static void main(String[] args) {
		double[] medias = { 8, 5, 3, 9, 4, 2, 9, 8, 7, 4 };
		String[] nombres = { "Miguel", "Luis", "Pablo", "Ana", "Amanda", "Rosa", "Marco", "Javi", "Blas", "Reme" };
		String[] excluidos = { "Miguel", "Pablo", "Marco" };
		double mejorNota = 0;
		int alumno = 0;
		boolean alumnoOk = false;

		// buscamos la mejor nota
		for (int i = 0; i < medias.length; i++) {
			alumnoOk = true;
			// si la nota es mejor
			if (medias[i] > mejorNota) {
				// buscamos si está excluido
				for (int j = 0; j < excluidos.length && alumnoOk; j++) {
					// si está excluido lo indicamos
					if (nombres[i] == excluidos[j])
						alumnoOk = false;
				}
				// si el alumno no está excluido lo guardamos
				if (alumnoOk) {
					mejorNota = medias[i];
					alumno = i;
				}
			}
		}

		if (alumnoOk)
			System.out.println("El premio es para " + nombres[alumno] + " con nota " + mejorNota);

	}
}
