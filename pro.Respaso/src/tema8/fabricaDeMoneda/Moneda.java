package tema8.fabricaDeMoneda;

public class Moneda extends Dinero {
	private double diametro;
	private double peso;
	
	public Moneda(double v, int a, double d, double p) {
		super(v, a);
		diametro = d;
		peso = p;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moneda\n diametro=" + diametro + ", peso=" + peso + ", toString()=" + super.toString();
	}

}
