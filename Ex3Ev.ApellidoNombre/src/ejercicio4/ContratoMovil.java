package ejercicio4;

public class ContratoMovil extends Contrato{
	private int minutosGratis;
	private int gigasInternet;
	
	public ContratoMovil(String titular, String lineaPrincipal, double precioMinuto, int permanencia, int minutosGratis,
			int gigasInternet) {
		super(titular, lineaPrincipal, precioMinuto, permanencia);
		this.minutosGratis = minutosGratis;
		this.gigasInternet = gigasInternet;
	}
	
	@Override
	public double calcularPrecio(int minutosHablados) {
		double total = 0;
		if (minutosHablados > minutosGratis)
			total = this.precioMinuto * (minutosHablados - minutosGratis);
		return total+= this.gigasInternet * 5;
	}
	
	
}

