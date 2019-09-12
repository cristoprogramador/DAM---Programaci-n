package _02ejemplos._01Medicos;

public class Test {

	public static void main(String[] args) {
		Medico m = new Medico();
		MedicoDeCabecera mc = new MedicoDeCabecera();
		Cirujano c = new Cirujano();

		m.tratarPaciente();
		// Al ser tipo medico acude a tratarPaciente de la clase Medico

		mc.tratarPaciente();
		// Al ser tipo MedicoDeCabecera acude al tratarPaciente de su clase eredada
		// Medico

		c.tratarPaciente();
		// Al ser tipo Cirujano acude al metodo tratarPaciente de Cirujano, donde está
		// reescrito el metodo eredado de Medico
	}

}
