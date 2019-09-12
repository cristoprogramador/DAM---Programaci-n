package _03ejercicios._02SalonVideojuegos;

//Clase abstracta, en la cual no se crean objetos sirve para
//atributos comunes a subclases

public abstract class JuegoAlquilerVenta extends Juego {

	protected double precio;
	protected int copiasDisponibles;

	public JuegoAlquilerVenta(String t, String f, int a, double p, int c) {
		super(t, f, a);
		precio = p;
		copiasDisponibles = c;
	}
	

	protected void disminuirCopias() {
		if (copiasDisponibles >0) {
		copiasDisponibles--;
		} else {
			throw new UnsupportedOperationException("No hay stock");
		}
	}
	protected void aumentarCopias() {
		copiasDisponibles++;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nPrecio: " + precio +
				"\nCopias disponibles: " + copiasDisponibles;
	}
}