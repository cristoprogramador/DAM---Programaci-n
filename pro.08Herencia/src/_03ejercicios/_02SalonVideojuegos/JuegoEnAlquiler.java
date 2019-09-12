package _03ejercicios._02SalonVideojuegos;

public class JuegoEnAlquiler extends JuegoAlquilerVenta{
	int diasAlquiler;
	
	public JuegoEnAlquiler (String t, String f, int a, double p, int c, int d) {
		super (t, f, a, p, c);
		diasAlquiler = d;
		
	}
	
	public void alquilar() {
		disminuirCopias();
	}
	public void devolver() {
		aumentarCopias();
	}
	@Override
	public String toString() {
		return super.toString() +
				"\nDias alquiler: " + diasAlquiler;
	}
}
