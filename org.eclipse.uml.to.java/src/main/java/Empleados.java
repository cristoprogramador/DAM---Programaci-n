/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Empleados.
 * 
 * @author alumno
 */
public class Empleados extends Persona {
	/**
	 * Description of the property departamentos.
	 */
	public Departamento departamentos = null;

	/**
	 * Description of the property CIF.
	 */
	private String CIF = "";

	/**
	 * Description of the property Salario.
	 */
	private double Salario = 0D;

	// Start of user code (user defined attributes for Empleados)

	// End of user code

	/**
	 * The constructor.
	 */
	public Empleados() {
		// Start of user code constructor for Empleados)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Empleados)

	// End of user code
	/**
	 * Returns departamentos.
	 * @return departamentos 
	 */
	public Departamento getDepartamentos() {
		return this.departamentos;
	}

	/**
	 * Sets a value to attribute departamentos. 
	 * @param newDepartamentos 
	 */
	public void setDepartamentos(Departamento newDepartamentos) {
		this.departamentos = newDepartamentos;
	}

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
	 * Returns Salario.
	 * @return Salario 
	 */
	public double getSalario() {
		return this.Salario;
	}

	/**
	 * Sets a value to attribute Salario. 
	 * @param newSalario 
	 */
	public void setSalario(double newSalario) {
		this.Salario = newSalario;
	}

}
