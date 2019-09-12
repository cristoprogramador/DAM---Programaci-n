package _03ejercicios._01gestionempleados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaEqualsyCompareTo {

	public static void main(String[] args) {
		
		//Prueba equals
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		
		listaEmpleados.add(new Empleado("Miguel", "111A", 2000, 2000));
		listaEmpleados.add(new Empleado("Miguel", "222B", 2000, 2000));
		listaEmpleados.add(new Empleado("Ana", "333C", 2000, 2000));
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce dni del empleado a buscar");
		String dni = tec.next();
		Empleado x = new Empleado("",dni,0,0);
		int posicion = listaEmpleados.indexOf(x);
		System.out.println(posicion);
		
		System.out.println(listaEmpleados.get(posicion));
		
		
		//Prueba compareTo
		
		Empleado[] v = { new Empleado("Miguel", "111A", 2000, 2000),
							new Empleado("Miguel", "222B", 2000, 2000),
							new Empleado("Ana", "333C", 2000, 2000),};
		Arrays.sort(v); //Ordena segun el criterio de compareTo de Empleados
		System.out.println(Arrays.toString(v));
	}

}
