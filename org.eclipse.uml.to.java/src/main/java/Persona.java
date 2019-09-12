/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Persona.
 * 
 * @author alumno
 */
public class Persona {
	/**
	 * Description of the property Nombre.
	 */
	private String Nombre = "";

	/**
	 * Description of the property Fecha_nacimiento.
	 */
	private String Fecha_nacimiento = "";

	/**
	 * Description of the property Telefono.
	 */
	private int Telefono = 0;

	// Start of user code (user defined attributes for Persona)

	// End of user code

	/**
	 * The constructor.
	 */
	public Persona() {
		// Start of user code constructor for Persona)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Persona)

	// End of user code
	/**
	 * Returns Nombre.
	 * @return Nombre 
	 */
	public String getNombre() {
		return this.Nombre;
	}

	/**
	 * Sets a value to attribute Nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.Nombre = newNombre;
	}

	/**
	 * Returns Fecha_nacimiento.
	 * @return Fecha_nacimiento 
	 */
	public String getFecha_nacimiento() {
		return this.Fecha_nacimiento;
	}

	/**
	 * Sets a value to attribute Fecha_nacimiento. 
	 * @param newFecha_nacimiento 
	 */
	public void setFecha_nacimiento(String newFecha_nacimiento) {
		this.Fecha_nacimiento = newFecha_nacimiento;
	}

	/**
	 * Returns Telefono.
	 * @return Telefono 
	 */
	public int getTelefono() {
		return this.Telefono;
	}

	/**
	 * Sets a value to attribute Telefono. 
	 * @param newTelefono 
	 */
	public void setTelefono(int newTelefono) {
		this.Telefono = newTelefono;
	}

}
