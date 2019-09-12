package tema8.videoJuegos;

public class JuegoAlquiler extends JuegoAlquilerVenta {
	private int diasAlquiler;
	
	public JuegoAlquiler(String t, String f, int a, double p, int c, int da) {
		super(t, f, a, p, c);
		diasAlquiler = da;
		// TODO Auto-generated constructor stub
	}
	
	public void alquilar() {
		super.decrementarCopias();
	}
	
	public void devolver() {
		super.decrementarCopias();
	}

	@Override
	public String toString() {
		return "JuegoAlquiler [diasAlquiler=" + diasAlquiler + ", toString()=" + super.toString() + "]";
	}

}
