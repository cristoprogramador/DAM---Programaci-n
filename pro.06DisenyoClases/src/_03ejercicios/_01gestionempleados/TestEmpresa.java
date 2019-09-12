package _03ejercicios._01gestionempleados;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestEmpresa {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Empresa e1 = new Empresa ("Pinturas Ruiz");
		System.out.println(e1);

		e1.contratar(new Empleado("Pepe","11111A",2015,1500));
		Empleado emp = new Empleado("Antonio","22222B", 2016,1600);
		e1.contratar(emp);
		e1.contratar(emp);e1.contratar(emp);e1.contratar(emp);e1.contratar(emp);
		System.out.println("------------------");
		System.out.println(e1);
		
		//Despedir a empleado
		try {
		System.out.println("\n==========\n");
		System.out.print("Despedir a: ");
		e1.despedir(new Empleado ("","33333A",2017,1700));
		System.out.println(e1);
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		Empresa e2 = new Empresa("Autocares Alfredo");
		e2.contratar(new Empleado("Ana", "1A", 2012,1000));
		e2.contratar(new Empleado("Luis", "2B", 2013,1000));
		e2.contratar(new Empleado("Miguel", "3C", 2014,1000));
		e2.contratar(new Empleado("Pablo", "4D", 2015,1000));
		e2.contratar(new Empleado("Rosa", "5E", 2016,1000));
		e2.contratar(new Empleado("Carlos", "6F", 2017,1000));
		e2.contratar(new Empleado("Pedro", "7G", 2018,1000));
		e2.subirTrienio(10);
		System.out.println(e2);
	}
	
	

}
