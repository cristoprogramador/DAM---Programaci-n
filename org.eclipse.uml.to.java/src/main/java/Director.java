import java.util.HashSet;

/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Director.
 * 
 * @author alumno
 */
public class Director extends Empleados {
	/**
	 * Description of the property fecha_alta.
	 */
	private String fecha_alta = "";

	/**
	 * Description of the property empleadoss.
	 */
	public HashSet<Empleados> empleadoss = new HashSet<Empleados>();

	/**
	 * Description of the property categoria.
	 */
	private String categoria = "";

	// Start of user code (user defined attributes for Director)

	// End of user code

	/**
	 * The constructor.
	 */
	public Director() {
		// Start of user code constructor for Director)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Director)

	// End of user code
	/**
	 * Returns fecha_alta.
	 * @return fecha_alta 
	 */
	public String getFecha_alta() {
		return this.fecha_alta;
	}

	/**
	 * Sets a value to attribute fecha_alta. 
	 * @param newFecha_alta 
	 */
	public void setFecha_alta(String newFecha_alta) {
		this.fecha_alta = newFecha_alta;
	}

	/**
	 * Returns empleadoss.
	 * @return empleadoss 
	 */
	public HashSet<Empleados> getEmpleadoss() {
		return this.empleadoss;
	}

	/**
	 * Returns categoria.
	 * @return categoria 
	 */
	public String getCategoria() {
		return this.categoria;
	}

	/**
	 * Sets a value to attribute categoria. 
	 * @param newCategoria 
	 */
	public void setCategoria(String newCategoria) {
		this.categoria = newCategoria;
	}

}
