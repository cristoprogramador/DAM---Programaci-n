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
public abstract class Dinero implements Comparable<Dinero> {
	protected double valor;
	protected int anyo;

	/**
	 * a) Diseñar la clase abstracta Dinero y sus subclases Moneda y Billete,
	 * desarrollando: • Constructores que reciban los datos necesarios para
	 * inicializar los atributos de la clase correspondiente
	 * 
	 * @param valor
	 * @param anyo
	 */
	public Dinero(double valor, int anyo) {
		this.valor = valor;
		this.anyo = anyo;
	}

	/**
	 * • equals: Dos monedas o billetes son iguales si tienen el mismo año de
	 * emisión y valor.
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Dinero))
			return false;
		if (this == o)
			return true;
		Dinero d = (Dinero) o;
		return this.anyo == d.anyo && this.valor == d.valor;
	}

	/**
	 * • compareTo: Es menor (mayor) el de menor (mayor) año, a igual año es menor
	 * (mayor) el de menor (mayor) valor.
	 */
	@Override
	public int compareTo(Dinero d) {
		if (this.anyo != d.anyo)
			return this.anyo - d.anyo;
		else {
			if (this.valor < d.valor ) return -1;
			else if(this.valor > d.valor) return 1;
			else return 0;
		}
	}

	/**
	 * • toString: Que muestre todos los datos del billete o moneda. Los billetes
	 * irán precedidos por el texto “BILLETE” y las monedas por el texto “MONEDA”
	 */
	@Override
	public String toString() {
		return "\nValor: " + valor + 
				"\nAño: " + anyo;
	}

}
