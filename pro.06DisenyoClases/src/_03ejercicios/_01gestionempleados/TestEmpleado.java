package _03ejercicios._01gestionempleados;

public class TestEmpleado {

	public static void main(String[] args) {
		Empleado e1, e2;
		e1 = new Empleado ("Miguel Ruiz", "20134134M", 2000, 1720);
		e2 = new Empleado ("Ana Gutierrez", "13433343S", 2001, 2170);

		System.out.println(e1);
		System.out.println("------------------------");
		System.out.println(e2);
		
		//Incrementar sueldo 20% al que menos cobre
		if(e1.getSueldoBrutoAnual() < e2.getSueldoBrutoAnual()){
			e1.incrementarSueldo(20);
			System.out.println("------------------------");
			System.out.println(e1);
		} else if(e1.getSueldoBrutoAnual() > e2.getSueldoBrutoAnual()) {
			e2.incrementarSueldo(20);
			System.out.println("------------------------");
			System.out.println(e2);
		}else System.out.println("Los dos cobran lo mismo");
		
		//Incrementar sueldo 10% al más antiguo
		if(e1.getAnyoIngreso() < e2.getAnyoIngreso()){
			e1.incrementarSueldo(10);
			System.out.println("------------------------");
			System.out.println(e1);
		} else if(e1.getAnyoIngreso() > e2.getAnyoIngreso()) {
			e2.incrementarSueldo(10);
			System.out.println("------------------------");
			System.out.println(e2);
		}else System.out.println("Los dos cobran lo mismo");
	
		//Porcentaje de IRPF que le corresponde a cada empleado
		double porc1 = Empleado.calcularIRPF(e1.getSueldoBrutoAnual());
		double porc2 = Empleado.calcularIRPF(e2.getSueldoBrutoAnual());
		
		System.out.println("=====================");
		System.out.println(e1.getNombre() +  ": " + porc1 + " %");
		System.out.println(e2.getNombre() +  ": " + porc2 + " %");

	
	}
	
	

}
