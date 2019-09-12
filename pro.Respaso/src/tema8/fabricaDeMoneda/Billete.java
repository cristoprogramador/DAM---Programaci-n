package tema8.fabricaDeMoneda;

public class Billete extends Dinero {
	private double alto;
	private double ancho;
	
	public Billete(double v, int a, double alt, double an) {
		super(v, a);
		alto = alt;
		ancho = an;	
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Billete\n alto=" + alto + ", ancho=" + ancho + ", toString()=" + super.toString();
	}

}
