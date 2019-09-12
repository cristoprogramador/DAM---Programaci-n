/**
 * 
 */
package tema8.videoJuegos;

/**
 * @author cristobal
 *
 */
public abstract class JuegoAlquilerVenta extends Juego {
	private double precio;
	private int copias;

	public JuegoAlquilerVenta(String t, String f, int a, double p, int c) {
		super(t, f, a);
		precio = p;
		copias = c;
		// TODO Auto-generated constructor stub
	}
	
	protected void incrementarCopias() {
		copias++;
	}

	protected void decrementarCopias() {
		if (copias >0)
			copias--;
		else
			throw new UnsupportedOperationException("No hay stock");
	}

	@Override
	public String toString() {
		return "JuegoAlquilerVenta [precio=" + precio + ", copias=" + copias + ", toString()=" + super.toString() + "]";
	}

}
