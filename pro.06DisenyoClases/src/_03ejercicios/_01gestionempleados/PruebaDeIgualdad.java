package _03ejercicios._01gestionempleados;

public class PruebaDeIgualdad {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Miguel",  "11111111B", 2000 ,1000);
		Empleado e2 = new Empleado("Miguel",  "11111111B", 2000 ,1000); 
		
		if (e1 == e2)System.out.println("e1 == e2: TRUE");
		else System.out.println("e1 == e2: FALSE");
		
		if (e1.equals(e2))System.out.println("e1.equals(e2): TRUE");
		else System.out.println("e1.equals(e2): FALSE");
		
	}

}
