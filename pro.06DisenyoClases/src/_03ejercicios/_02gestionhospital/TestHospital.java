package _03ejercicios._02gestionhospital;

import java.util.Scanner;

public class TestHospital {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		Hospital h = new Hospital();
		try {
			h.ingresarPaciente("Miguel", 20);
			h.ingresarPaciente("Ana", 21);
			h.ingresarPaciente("Rammon", 22);
			h.ingresarPaciente("Luisa", 25);
			h.ingresarPaciente("Pablo", 28);
			
		}catch (HospitalLlenoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(h);
		
		while (h.getNumLibres() != Hospital.MAXC) {
			h.darAltas();
			System.out.println(h);
			
			System.out.println("Pulsa INTRO para continuar");
			tec.nextLine(); // Esperamos a que se puelse INTRO;
		}
	}

}
