package _03ejercicios._03contrarreloj;

import _02ejemplos.Tiempo;

public class Corredor {


	private int dorsal;
	private String nombre;
	private Tiempo salida;
	private Tiempo llegada;
	
	/**
	 * Constructor a partir del dorsal,  el nombre y el instante de salida.
	 * @param dorsal
	 * @param nombre
	 * @param salida
	 */
	public Corredor(int dorsal, String nombre, Tiempo salida) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.salida = salida;
	}
	
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tiempo getSalida() {
		return salida;
	}

	public void setSalida(Tiempo salida) {
		this.salida = salida;
	}

	public Tiempo getLlegada() {
		return llegada;
	}

	public void setLlegada(Tiempo llegada) throws IllegalArgumentException {
		if (this.salida.compareTo(llegada) >= 0) {
			throw new IllegalArgumentException ("El teimpo es incorrecto");
		} else {
			this.llegada = llegada;
		}		
	}
	
	/**
	 * Devuelve el tiempo tardado por el corredor.
	 * @return
	 */
	public int getDuracion() throws UnsupportedOperationException {
		if (getLlegada() == null) {
			throw new UnsupportedOperationException ("Todavia no ha llegado");
		}else {
			return this.llegada.toSegundos() - this.salida.toSegundos();
		}
	}
	
	/**
	 * Devuelve un String con los datos del corredor, de la forma:
	 * (234) -  Juan Ramirez – Salida: 10:20:30
	 * O
	 * (234) -  Juan Ramirez – Salida: 10:20:30 - Llegada: 10:30:30 - Duración: 600 segundos
	 */
	public String toString() {
		String res = "(" + dorsal +") - " + nombre + " - Salida: " + salida;
		if(llegada != null) {
			res+= " - llegada: " + llegada + " - Duración: " + getDuracion();
		}
		return res;
	}
	
	/**
	 * Devuelve true si los corredores tienen el mismo  dorsal y false en caso contrario
	 */
	public boolean equals(Object o) {
		if(this == o) return true; //Comprobamos si es el mismo objeto
		//this, hace referencia al objeto sobre el que se ejecuta el metodo juanGomez.equals(o);
		if(!(o instanceof Corredor))return false;// si 'o' no es de tipo corredor devuelve falso
		Corredor c = (Corredor) o;
		
		//if (this.dorsal == c.dorsala) return true;
		//else return false;
		return this.dorsal == c.dorsal;
	}
	
	/**
	 * Un corredor es menor que otro si tiene menor dorsal.
	 * @param o
	 * @return
	 */
	public int compareTo (Object o) {
		Corredor c = (Corredor) o;
		
		//if (this.dorsal < c.dorsal) return -1;
		//else if(this.dorsal > c.dorsal) return 1;
		//else return 0;
		return this.dorsal - c.dorsal;
	}
	
	

}
