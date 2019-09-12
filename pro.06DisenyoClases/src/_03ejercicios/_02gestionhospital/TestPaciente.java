package _03ejercicios._02gestionhospital;

public class TestPaciente {

	public static void main(String[] args) {
		Paciente p1 = new Paciente("Juan", 20);
		Paciente p2 = new Paciente("Miguel", 30);

		System.out.println(p1);
		System.out.println(p2);

		// Mostramos al que se considera menor
		if (p1.compareTo(p2) < 0)
			System.out.println("Menor: " + p1);
		else if (p1.compareTo(p2) > 0)
			System.out.println("Menor: " + p2);
		else
			System.out.println("Iguales");

		// Aplicar mejora al paciente mas grave
		System.out.println("Mejorar al más grave ------");
		while (p1.getEstado() < p2.getEstado()) {
			p1.mejorar();
			System.out.println(p1 + " - " + p2);
		}
		while (p2.getEstado() < p1.getEstado()) {
			p2.mejorar();
			System.out.println(p1 + " - " + p2);
		}
	}

}
