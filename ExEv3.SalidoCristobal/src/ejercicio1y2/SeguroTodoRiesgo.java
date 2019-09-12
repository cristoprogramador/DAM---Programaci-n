package ejercicio1y2;

public class SeguroTodoRiesgo extends SeguroRobo{
	private double franquicia;
	
	public SeguroTodoRiesgo(String codigo, int anyo, String matricula, int antiguedad, double franquicia) {
		super(codigo, anyo, matricula, true, true, antiguedad);
		this.franquicia=franquicia;
		}

	@Override
	public double calcularPrecio() {
		return 700 - (franquicia/2);
	}

	@Override
	public String toString() {
		return "DAÑOS PROPIOS INCLUIDOS\n" + 
				super.toString();
	}

}
