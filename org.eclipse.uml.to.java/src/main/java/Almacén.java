import java.util.HashSet;

/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Almacén.
 * 
 * @author alumno
 */
public class Almacén {
	/**
	 * Description of the property id.
	 */
	private String id = "";

	/**
	 * Description of the property articulos.
	 */
	public HashSet<Articulo> articulos = new HashSet<Articulo>();

	/**
	 * Description of the property localización.
	 */
	private String localización = "";

	// Start of user code (user defined attributes for Almacén)

	// End of user code

	/**
	 * The constructor.
	 */
	public Almacén() {
		// Start of user code constructor for Almacén)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Almacén)

	// End of user code
	/**
	 * Returns id.
	 * @return id 
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Sets a value to attribute id. 
	 * @param newId 
	 */
	public void setId(String newId) {
		this.id = newId;
	}

	/**
	 * Returns articulos.
	 * @return articulos 
	 */
	public HashSet<Articulo> getArticulos() {
		return this.articulos;
	}

	/**
	 * Returns localización.
	 * @return localización 
	 */
	public String getLocalización() {
		return this.localización;
	}

	/**
	 * Sets a value to attribute localización. 
	 * @param newLocalización 
	 */
	public void setLocalización(String newLocalización) {
		this.localización = newLocalización;
	}

}
