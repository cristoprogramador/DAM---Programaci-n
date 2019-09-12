package _02ejemplos._07TreeSetVehiculos;

public class Vehiculo implements Comparable <Vehiculo>{
	private String matricula;
	private String marca;
	private String modelo;

	public Vehiculo (String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return matricula + " - " + marca + " - " + modelo;
	}
	
	// devuelve verdadero si las matriculas coinciden.
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Vehiculo)) return false;
		
		return this.matricula.equals(((Vehiculo)o).matricula);
	}

	@Override
	public int compareTo(Vehiculo v) {
		return this.matricula.compareTo(v.matricula);
	}

	@Override
	public int hashCode() {
		//Deve devolver un numero entero calculado a partir
		//del dato que IDENTIFICA al objeto. En enuestro caso,
		//la matricula
		//Para dos matriculas iguales, debe devolver el mismo numero
//		return matricula.length(); //Funciona, pero es una mala función de dispersión
		return matricula.hashCode();
		
	}
}
