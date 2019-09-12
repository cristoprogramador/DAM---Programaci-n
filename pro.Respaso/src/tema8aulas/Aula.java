package tema8aulas;

public class Aula implements Comparable<Aula>{
	//NUNCA PONER VARIABLES EN static OBJETOS NO RETIENEN VALORES
	private int codigo;
	private double longitud;
	private double anchura;
	/**
	 * 
	 * @param c codigo
	 * @param l longitud
	 * @param a anchura
	 */
	public Aula(int c, double l, double a) {
		codigo = c;
		longitud = l;
		anchura = a;
	}
	
	public int capacidad() {
		//1 alumno por cada 1,4 metros cuadrados
		return (int)((longitud * anchura)/1.4);
	}
	
	@Override
	public String toString() {
		return "Aula: " + codigo +
				"\nSuperficie: " + (longitud * anchura) +
				"\nCapacidad: " + capacidad();
	}

	@Override
	public int compareTo(Aula o) {
		if (this.capacidad() < o.capacidad())
			return 1;
		else if (this.capacidad() > o.capacidad())
			return -1;
		else
		return 0;
	}
	
}
