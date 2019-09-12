package _03Ejercicios;

/**
 * 15. (Notas). Se dispone de una matriz que contiene las notas de una serie de
 * alumnos en una serie de asignaturas. Cada fila corresponde a un alumno,
 * mientras que cada columna corresponde a una asignatura. Desarrollar métodos
 * para: 15.1.Imprimir las notas alumno por alumno. 15.2.Imprimir las notas
 * asignatura por asignatura. 15.3.Imprimir la media de cada alumno.
 * 15.4.Imprimir la media de cada asignatura. 
 * 15.5.Indicar cual es la asignatura
 * más fácil, es decir la de mayor nota media. 
 * 15.6. ¿Hay algún alumno que
 * suspenda todas las asignaturas? 
 * 15.7. ¿Hay alguna asignatura en la que
 * suspendan todos los alumnos?
 * 
 * Utilizaremos un array para los alumnos y otro para las asignaturas
 * 
 * @author alumno
 *
 */
public class _15Notas {

	public static void main(String[] args) {
		// Damos valor a la matriz y a los arrays
		double[][] nota = { { 5, 5, 5 }, { 2, 3, 7 }, { 8, 9, 9, }, { 7, 2, 3 } };
		String[] alu = { "Miguel", "Pablo", "Julio", "Vicente" };
		String[] asig = { "PRO", "ED", "FOL" };

		mostrarPorAlumno(nota, alu, asig);
		System.out.println("");
		mostrarPorAsignatura(nota, alu, asig);
		System.out.println("");
		mediasDeAlumno(nota, alu);
		System.out.println("");
		mediasDeAsignaturas(nota, asig);
		System.out.println("");
		asigMasFacil(nota, asig);
		System.out.println("asignatura fatal "+hayAsignaturaFatal(nota));
		System.out.println("alumno falta "+hayAlumnoFatal(nota));
	}

	public static void mostrarPorAlumno(double[][] nota, String[] alu, String[] asig) {
		System.out.println("Notas alumno por alumno ----------------------");
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Notas de " + alu[i] + ": ");
			for (int j = 0; j < nota[0].length; j++) {
				System.out.println("   - Asignatura " + asig[j] + ": " + nota[i][j]);
			}
		}
	}

	public static void mostrarPorAsignatura(double[][] nota, String[] alu, String[] asig) {
		System.out.println("Notas alumno por asignatura ----------------------");
		for (int j = 0; j < nota[0].length; j++) {
			System.out.println("Notas de " + asig[j] + ": ");
			for (int i = 0; i < nota.length; i++) {
				System.out.println("   - Alumno " + alu[i] + ": " + nota[i][j]);
			}
		}
	}

	public static void mediasDeAlumno(double[][] nota, String[] alu) {
		System.out.println("Nota media de alumnos ----------------------");
		double sumaNotas;
		for (int i = 0; i < nota.length; i++) {
			sumaNotas = 0;
			for (int j = 0; j < nota[0].length; j++) {
				sumaNotas += nota[i][j];
			}
			System.out.println("   - Media de " + alu[i] + ": " + sumaNotas / nota[0].length);
		}

	}

	public static void mediasDeAsignaturas(double[][] nota, String[] asig) {
		System.out.println("Nota media de asignatura ----------------------");
		double sumaNotas;
		for (int j = 0; j < nota[0].length; j++) {
			sumaNotas = 0;
			for (int i = 0; i < nota.length; i++) {
				sumaNotas += nota[i][j];
			}
			System.out.println("   - Media de " + asig[j] + ": " + sumaNotas / nota.length);
		}
	}

	public static void asigMasFacil(double[][] nota, String[] asig) {
		double sumaNotas;
		double mejorNota = 0;
		double notasMedias = 0;
		int asignatura = 0;

		for (int j = 0; j < nota[0].length; j++) {
			sumaNotas = 0;
			for (int i = 0; i < nota.length; i++) {
				sumaNotas += nota[i][j];
			}
			notasMedias = sumaNotas / nota.length;
			if (mejorNota < notasMedias) {
				mejorNota = notasMedias;
				asignatura = j;
			}
		}
		System.out.println("Asignatura mas facil: " + asig[asignatura] + " " + mejorNota + " de Media");

	}
	
	public static boolean hayAsignaturaFatal(double[][] nota) {
		boolean fatal = false;
		
		for (int j = 0; j < nota[0].length && !fatal; j++) {
			int cont = 0;
			for (int i = 0; i < nota.length && !fatal; i++) {
				if (nota[i][j] < 5) 
					cont++;
				if(cont == nota.length)
					fatal = true;
			}
		}
		return fatal;
	}
	public static boolean hayAlumnoFatal(double[][] nota) {
	boolean fatal = false;
		
		for (int i = 0; i < nota.length && !fatal; i++) {
			int cont = 0;
			for (int j = 0; j < nota[0].length && !fatal; j++) {
				if (nota[i][j] < 5) 
					cont++;
				if(cont == nota[0].length)
					fatal = true;
			}
		}
		return fatal;
	}
}
