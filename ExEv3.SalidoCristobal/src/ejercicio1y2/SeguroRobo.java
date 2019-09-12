package ejercicio1y2;

public class SeguroRobo extends Seguro {
	private int antiguedad;
	public SeguroRobo(String codigo, int anyo, String matricula, boolean incendio, boolean lunas, int antiguedad) {
		super(codigo, anyo, matricula, incendio, lunas);
		this.antiguedad = antiguedad;
	}
	
	@Override
	public double calcularPrecio() {
		double precio = super.calcularPrecio();
		if(this.antiguedad > 5) {
			return precio + ((precio/100) *10);
		} else 
			return precio + ((precio/100) *20); 
	}
	
	@Override
	public String toString() {
		return "ROBO INCLUIDO\n" +
				super.toString() +
				"\nAntigüedad del vehiculo: " + antiguedad + " años";
	}

	
}
