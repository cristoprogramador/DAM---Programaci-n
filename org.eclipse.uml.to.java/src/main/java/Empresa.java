import java.util.HashSet;

/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Empresa.
 * 
 * @author alumno
 */
public class Empresa {
	/**
	 * Description of the property CIF.
	 */
	private String CIF = "";

	/**
	 * Description of the property Dirección.
	 */
	private String Dirección = "";

	/**
	 * Description of the property Razón social.
	 */
	private String Razonsocial="";

	/**
	 * Description of the property clientess.
	 */
	public HashSet<Persona> clientess = new HashSet<Persona>();

	// Start of user code (user defined attributes for Empresa)

	// End of user code

	// Start of user code (user defined methods for Empresa)

	// End of user code
	/**
	 * Returns CIF.
	 * @return CIF 
	 */
	public String getCIF() {
		return this.CIF;
	}

	/**
	 * Sets a value to attribute CIF. 
	 * @param newCIF 
	 */
	public void setCIF(String newCIF) {
		this.CIF = newCIF;
	}

	/**
	 * Returns Dirección.
	 * @return Dirección 
	 */
	public String getDirección() {
		return this.Dirección;
	}

	/**
	 * Sets a value to attribute Dirección. 
	 * @param newDirección 
	 */
	public void setDirección(String newDirección) {
		this.Dirección = newDirección;
	}

	/**
	 * Returns Razón social.
	 * @return Razón social 
	 */
	public String getRazón

	social() {
		return this.Razón social;
	}

	/**
	 * Sets a value to attribute Razón social. 
	 * @param newRazón social 
	 */
	public void setRazón

	social(String newRazón social) {
	    this.Razón social = newRazón social;
	}

	/**
	 * Returns clientess.
	 * @return clientess 
	 */
	public HashSet<Persona> getClientess() {
		return this.clientess;
	}

}
