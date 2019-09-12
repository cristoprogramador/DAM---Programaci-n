package _03ejercicios._01gestionempleados;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> plantilla;

	public Empresa(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();

	}

	public int getNumeroEmpleados() {
		return plantilla.size();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}

	public void contratar(Empleado e) {
		if (!this.plantilla.contains(e))
			this.plantilla.add(e);
	}

	public String toString() {
		String res = "Nombre empresa: " + this.nombre;

		// Añadimos la información de los empleados
		if (plantilla.size() == 0)
			res += "\n - sin empleados - ";
		else {
			res += "\n==== EMPLEADOS ====\n";
			for (int i = 0; i < plantilla.size(); i++) {
				res += plantilla.get(i).toString();
				res += "\n-------------\n";
			}
		}
		return res;
	}

	public void despedir(Empleado e) throws NoSuchElementException {
		if (plantilla.indexOf(e) == -1) {
			throw new NoSuchElementException("El empleado no existe");
		}
		this.plantilla.remove(e);
	}

	public void subirTrienio(double porcentaje) {
		// Recorremos la plantilla
		
		// Con cada empleado e de la lista plantilla
		for (Empleado e : this.plantilla) {
			if (e.antiguedad() > 0 && e.antiguedad() % 3 == 0) {
				e.incrementarSueldo(porcentaje);
			}
		}
	}

}
