package ejercicio4;

public abstract class Contrato {
	private String titular;
	private String lineaPrincipal;
	protected double precioMinuto;
	private int permanencia;
	
	public Contrato(String titular, String lineaPrincipal, double precioMinuto, 
			int permanencia) {
		this.titular = titular;
		this.lineaPrincipal = lineaPrincipal;
		this.precioMinuto = precioMinuto;
		this.permanencia = permanencia;
	}
	
	public abstract double calcularPrecio(int minutosHablados);
	
	public double calcularCancelacion() {
		return 10 * permanencia;
	}
	
	@Override
	public String toString() {
		String cancelar = "";
		if (calcularCancelacion() == 0)
			cancelar = "gratuito";
		else cancelar = calcularCancelacion() + " euros";
		
		return "Titular: " + titular +
				"\nPrecio: " + calcularPrecio(100) +
				"\nPrecio de Cancelación: " + cancelar;
	}
	

}