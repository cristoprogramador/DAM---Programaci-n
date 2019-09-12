package ejercicio4;

public class ContratoFijo extends Contrato {

	public ContratoFijo(String titular, String lineaPrincipal, double precioMinuto, int permanencia) {
		super(titular, lineaPrincipal, precioMinuto, permanencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio(int minutosHablados) {
		return 16 + minutosHablados * this.precioMinuto;
	}
	

}
