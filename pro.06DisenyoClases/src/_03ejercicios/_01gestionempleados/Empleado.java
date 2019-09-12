package _03ejercicios._01gestionempleados;

import java.util.Calendar;

public class Empleado implements Comparable{

	private String nombre;
	private String dni;
	private int anyoIngreso;
	private double sueldoBrutoAnual;

	public Empleado(String nombre, String dni, int anyo, double sueldoBruto) {
		this.nombre = nombre;
		this.dni = dni;
		// Para que de excepción si son negativos...
		setAnyoIngreso(anyo);
		setSueldoBrutoAnual(sueldoBruto);
	}

	// Metodos consultores geters
	// Los metodos no son estaticos porque actuan sobre diversos objetos
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getAnyoIngreso() {
		return anyoIngreso;
	}

	public double getSueldoBrutoAnual() {
		return sueldoBrutoAnual;
	}

	// Metodos modificadores seters
	public void setNombre(String nombre) {
		// this. hace referencia al objeto sobre el que trabajamos
		// this.nombre hará referencia a la bariable del objeno no
		// a la del metodo
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAnyoIngreso(int anyo) {
		if (anyo < 0)
			throw new IllegalArgumentException("No puede ser negativo");
		this.anyoIngreso = anyo;
	}

	public void setSueldoBrutoAnual(double sueldo) {
		if (sueldo < 0)
			throw new IllegalArgumentException("No puede ser negativo");
		this.sueldoBrutoAnual = sueldo;
	}

	
	// Metodo antigüedad
	public int antiguedad() {
		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
		if (this.anyoIngreso > anyoActual)
			return 0;
		else
			return anyoActual - this.anyoIngreso;
	}

	public void incrementarSueldo(double porcentaje) {
		this.sueldoBrutoAnual =(getSueldoBrutoAnual() + ((getSueldoBrutoAnual() / 100 * porcentaje)));
	}
	
	public String toString() {
		return "Nombre " + nombre +
				"\nDNI: " + dni +
				"\nAño de ingreso: " + anyoIngreso +
				"\nSueldo bruto anual: " + sueldoBrutoAnual;
	}
	
	//El metodo equals siempre ha de tener esta cabecera
	public boolean equals(Object o) {
		if (this == o) return true; //Cuando se compara el objeto consigo mismo
		if (!(o instanceof Empleado)) return false; //Cuando "o" no es un Empleado
		
		Empleado e = (Empleado) o;
		if (this.dni.equals(e.dni)) return true;
		else return false;
	}
	
	public int compareTo(Object o) {
		Empleado e = (Empleado) o;
		//Si consideramos menor al empleado con menor DNI
		if(this.dni.compareTo(e.dni) < 0) return -1; //este compareTo es el del String
		else if (this.dni.compareTo(e.dni) > 0) return +1;
		else return 0;
		//menor devuelve -1, mayor +1, si son iguales 0. Por convenio
		
	}
	/**
	 * Metodo estático public static double calcularIRPF(double salario). Determina el % de IRPF
	 * que corresponde a un salario determinado, según la siguiente tabla:
	 * Desde salario (incluido) Hasta salario (no incluido) % IRPF
	 * 800 3
	 * 800 1000 10
	 * 1000 1500 15
	 * 1500 2100 20
	 * 2100 30

	 * @param salario
	 * @return
	 */
	public static double calcularIRPF (double salario) {
		double porcentaje = 3;
		//No trabaja sobre el objeto por lo tanto es un metodo static
		if (salario < 800) porcentaje = 3;
		else if (salario < 1000) porcentaje = 10;
		else if (salario < 1500) porcentaje = 15;
		else if (salario < 2100) porcentaje = 20;
		else porcentaje = 30;
		
		return porcentaje;
	}
}
