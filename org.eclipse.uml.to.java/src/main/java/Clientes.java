import java.util.HashSet;

/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Clientes.
 * 
 * @author alumno
 */
public class Clientes extends Persona {
	/**
	 * Description of the property Comisión.
	 */
	private double Comisión = 0D;

	/**
	 * Description of the property articulos.
	 */
	public HashSet<Articulo> articulos = new HashSet<Articulo>();

	/**
	 * Description of the property DNI.
	 */
	private String DNI = "";

	/**
	 * Description of the property Empresa.
	 */
	private String Empresa = "";

	// Start of user code (user defined attributes for Clientes)

	// End of user code

	/**
	 * The constructor.
	 */
	public Clientes() {
		// Start of user code constructor for Clientes)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Clientes)

	// End of user code
	/**
	 * Returns Comisión.
	 * @return Comisión 
	 */
	public double getComisión() {
		return this.Comisión;
	}

	/**
	 * Sets a value to attribute Comisión. 
	 * @param newComisión 
	 */
	public void setComisión(double newComisión) {
		this.Comisión = newComisión;
	}

	/**
	 * Returns articulos.
	 * @return articulos 
	 */
	public HashSet<Articulo> getArticulos() {
		return this.articulos;
	}

	/**
	 * Returns DNI.
	 * @return DNI 
	 */
	public String getDNI() {
		return this.DNI;
	}

	/**
	 * Sets a value to attribute DNI. 
	 * @param newDNI 
	 */
	public void setDNI(String newDNI) {
		this.DNI = newDNI;
	}

	/**
	 * Returns Empresa.
	 * @return Empresa 
	 */
	public String getEmpresa() {
		return this.Empresa;
	}

	/**
	 * Sets a value to attribute Empresa. 
	 * @param newEmpresa 
	 */
	public void setEmpresa(String newEmpresa) {
		this.Empresa = newEmpresa;
	}

}
