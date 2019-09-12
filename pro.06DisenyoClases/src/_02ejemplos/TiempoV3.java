package _02ejemplos;

public class TiempoV3 {

	// Atributos: Son como variables que almacena el objeto.
	// Cada objeto tiene sus propios valores en los atributos.
	// Se definen fuera de los metodos.

	// SE definen PRIVATE. Algo PRIVATE solo es accesible desde la propia clase.

	private int hora;
	private int minuto;
	private int segundo;

	// Metodos getter:Devuelven el valor de los atributos
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	// Metodos setter: Permiten cambiar el valor de los atributos
	public void setHora(int hora) {
		// Lanzamos una excepción propia en caso que la hora esté fuera de rango
		if (hora < 0 || hora > 23) {
			throw new IllegalArgumentException("Hora debe estar en [0,23]");
		}
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		// Lanzamos una excepción propia en caso que los minutos esté fuera de rango
		if (minuto < 0 || minuto > 59) {
			throw new IllegalArgumentException("Minutos debe estar en [0,59]");
		}
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		// Lanzamos una excepción propia en caso que los segundos estén fuera de rango
		if (segundo < 0 || segundo > 59) {
			throw new IllegalArgumentException("Segundos deben estar en [0,59]");
		}
		this.segundo = segundo;
	}

	// Metodo toString
	public String toString() { // No se pone static...actua en el objeto, no es estatico

		// return hora + ":" + minuto + ":" + segundo;
		return String.format("%02d", hora) + ":" + String.format("%02d", minuto) + ":" + String.format("%02d", segundo);
		// devuelve con un formato
	}
}
