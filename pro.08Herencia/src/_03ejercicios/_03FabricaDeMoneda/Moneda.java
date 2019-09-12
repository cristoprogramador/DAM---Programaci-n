package _03ejercicios._03FabricaDeMoneda;

/**
 * 3. La Fabrica Nacional de Moneda y Timbre quiere almacenar cierta información
 * técnica del dinero (billetes y monedas) que emite. En concreto, le interesa:
 * • Valor: Valor de la moneda o billete ,en euros.(double)
 * • Año de emisión: Año en que fué emitida la moneda o billete. (int) 
 * • De las monedas, 
 * • Diámetro: Diámetro de la moneda, en milímetros. (double)
 * • Peso: Peso de la moneda, en gramos (double)
 * • De los billetes.
 * • Altura del billete, en mm (double) 
 * • Anchura del billete, en mm (double).
 * 
 * @author alumno
 *
 */
public class Moneda extends Dinero {

	private double diametro;
	private double peso;

	/**
	 * a) Diseñar la clase abstracta Dinero y sus subclases Moneda y Billete,
	 * desarrollando: • Constructores que reciban los datos necesarios para
	 * inicializar los atributos de la clase correspondiente
	 * 
	 * @param valor
	 * @param anyo
	 * @param diametro
	 * @param peso
	 */
	public Moneda(double valor, int anyo, double diametro, double peso) {
		super(valor, anyo);
		this.diametro = diametro;
		this.peso = peso;
	}

	/**
	 * • toString: Que muestre todos los datos del billete o moneda. Los billetes
	 * irán precedidos por el texto “BILLETE” y las monedas por el texto “MONEDA” b)
	 * Diseñar la clase TestDinero para probar las clases desarrolladas: Crear
	 * objetos de las clases Moneda y Billete y mostrarlos por pantalla.
	 */
	@Override
	public String toString() {
		return "MONEDA" + 
				super.toString() + 
				"\nDiametro: " + diametro + " milimetros" + 
				"\nPeso: " + peso + " gramos";
	}
}
