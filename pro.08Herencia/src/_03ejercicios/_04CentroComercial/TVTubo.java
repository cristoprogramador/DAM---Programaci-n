package _03ejercicios._04CentroComercial;
/**
 * public String resulucion(): Devuelve un texto con la resolución del televisor, 
como por ejemplo “420 lineas” o “800 x 600 pixels” dependiendo del tipo 
de televisor.
 * @author alumno
 *
 */
public class TVTubo extends Televisores{
	private int lineas;
	
	public TVTubo(String marc, String model, double pvp, double pulga, int lines) {
		super(marc, model, pvp, pulga);
		lineas = lines;
	}

	public String resolucion() {
		return lineas + " lineas";
	}
}
