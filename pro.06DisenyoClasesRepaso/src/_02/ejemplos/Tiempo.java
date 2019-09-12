package _02.ejemplos;

public class Tiempo {
//Atributos
	//los declaramos privados porque han de ser ocultos al usuario
	private int hora;
	private int minuto;
	private int segundo;
	
	//Metodos de la clase
	
	//Metodos consultores
	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}
	
	/**
	 * @return the minuto
	 */
	public int getMinuto() {
		return minuto;
	}
	
	/**
	 * @return the segundo
	 */
	public int getSegundo() {
		return segundo;
	}
	

	//Metodos modificadores
	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * @param minuto the minuto to set
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	/**
	 * @param segundo the segundo to set
	 */
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	// Metodo toString (obligado)
	public String toString() {
		return hora + ":"+ minuto +":"+segundo;
	}
	
}//de la clase
