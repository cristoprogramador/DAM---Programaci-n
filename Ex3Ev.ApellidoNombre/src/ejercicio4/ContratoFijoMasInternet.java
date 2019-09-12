package ejercicio4;

public class ContratoFijoMasInternet extends ContratoFijo {

	private boolean conFibra;
	private int velocidada;
	
	public ContratoFijoMasInternet(String titular, String lineaPrincipal, double precioMinuto, int permanencia,
			boolean conFibra, int velocidada) {
		super(titular, lineaPrincipal, precioMinuto, permanencia);
		this.conFibra = conFibra;
		this.velocidada = velocidada;
	}
	
	@Override
	public double calcularPrecio(int minutosHablados) {
		return super.calcularPrecio(minutosHablados)+10;
	}
	
	@Override
	public double calcularCancelacion() {
		return super.calcularCancelacion()*2;
	}
	
}
