import java.util.HashSet;

/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Factura.
 * 
 * @author alumno
 */
public class Factura {
	/**
	 * Description of the property Total.
	 */
	private double Total = 0D;

	/**
	 * Description of the property Codigo.
	 */
	private String Codigo = "";

	/**
	 * Description of the property articulos.
	 */
	public HashSet<Articulo> articulos = new HashSet<Articulo>();

	// Start of user code (user defined attributes for Factura)

	// End of user code

	/**
	 * The constructor.
	 */
	public Factura() {
		// Start of user code constructor for Factura)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Factura)

	// End of user code
	/**
	 * Returns Total.
	 * @return Total 
	 */
	public double getTotal() {
		return this.Total;
	}

	/**
	 * Sets a value to attribute Total. 
	 * @param newTotal 
	 */
	public void setTotal(double newTotal) {
		this.Total = newTotal;
	}

	/**
	 * Returns Codigo.
	 * @return Codigo 
	 */
	public String getCodigo() {
		return this.Codigo;
	}

	/**
	 * Sets a value to attribute Codigo. 
	 * @param newCodigo 
	 */
	public void setCodigo(String newCodigo) {
		this.Codigo = newCodigo;
	}

	/**
	 * Returns articulos.
	 * @return articulos 
	 */
	public HashSet<Articulo> getArticulos() {
		return this.articulos;
	}

}
