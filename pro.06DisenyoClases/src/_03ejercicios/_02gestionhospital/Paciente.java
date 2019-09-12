package _03ejercicios._02gestionhospital;

public class Paciente {

	private String nombre;
	private int edad;
	private int estado;

	public Paciente(String n, int e) {
		this.nombre = n;
		this.edad = e;
		this.estado = 1 + (int)(Math.random()*5); // [1 a 5]
	}

	public int getEdad() {
		return this.edad;
	}

	public int getEstado() {
		return this.estado;
	}

	public void mejorar() {
		this.estado++;
	}

	public String toString() {
		return this.nombre + " " + this.edad + " " + this.estado;
	}

	public int compareTo(Object o) {
		Paciente p = (Paciente) o;

		if (this.estado > p.estado)
			return -1;
		else if (this.estado < p.estado)
			return 1;
		else if (this.edad < p.edad)
			return 1;
		else if (this.edad < p.edad)
			return 1;
		else
			return 0;
	}

}
