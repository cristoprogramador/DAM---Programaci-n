/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Articulo.
 * 
 * @author alumno
 */
public class Articulo {
	/**
	 * Description of the property Código.
	 */
	private int Código = 0;

	/**
	 * Description of the property Precio.
	 */
	private double Precio = 0D;

	/**
	 * Description of the property Descripción.
	 */
	private String Descripción = "";

	// Start of user code (user defined attributes for Articulo)

	// End of user code

	/**
	 * The constructor.
	 */
	public Articulo() {
		// Start of user code constructor for Articulo)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Articulo)

	// End of user code
	/**
	 * Returns Código.
	 * @return Código 
	 */
	public int getCódigo() {
		return this.Código;
	}

	/**
	 * Sets a value to attribute Código. 
	 * @param newCódigo 
	 */
	public void setCódigo(int newCódigo) {
		this.Código = newCódigo;
	}

	/**
	 * Returns Precio.
	 * @return Precio 
	 */
	public double getPrecio() {
		return this.Precio;
	}

	/**
	 * Sets a value to attribute Precio. 
	 * @param newPrecio 
	 */
	public void setPrecio(double newPrecio) {
		this.Precio = newPrecio;
	}

	/**
	 * Returns Descripción.
	 * @return Descripción 
	 */
	public String getDescripción() {
		return this.Descripción;
	}

	/**
	 * Sets a value to attribute Descripción. 
	 * @param newDescripción 
	 */
	public void setDescripción(String newDescripción) {
		this.Descripción = newDescripción;
	}

}
