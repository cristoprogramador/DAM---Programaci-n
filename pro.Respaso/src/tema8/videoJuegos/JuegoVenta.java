package tema8.videoJuegos;

public class JuegoVenta extends JuegoAlquilerVenta {

	public JuegoVenta(String t, String f, int a, double p, int c) {
		super(t, f, a, p, c);
		// TODO Auto-generated constructor stub
	}
	
	public void venta() {
		super.decrementarCopias();
	}

}
