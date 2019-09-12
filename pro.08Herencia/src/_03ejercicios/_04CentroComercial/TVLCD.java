package _03ejercicios._04CentroComercial;
/**
 * public String resulucion(): Devuelve un texto con la resolución del televisor, 
como por ejemplo “420 lineas” o “800 x 600 pixels” dependiendo del tipo 
de televisor.
 * @author alumno
 *
 */
public class TVLCD extends Televisores{
	private int pixelsV, pixelsH;
	
	public TVLCD(String marc, String model, double pvp, double pulga, int pixH, int pixV) {
		super(marc, model, pvp, pulga);
		pixelsH = pixH;
		pixelsV = pixV;
	}
	
	public String resolucion() {
		return pixelsH + " x " + pixelsV + " pixels";
	}
	
}
