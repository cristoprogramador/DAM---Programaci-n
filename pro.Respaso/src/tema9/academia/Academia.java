package tema9.academia;

import java.util.Collection;
import java.util.TreeSet;

import tema8aulas.Aula;
/**
 * 
 * @author cristobal
 *
 */
public class Academia {
	private String nombre;
	private String direccion;
	Collection<Aula> aulas; 
	/**
	 * 
	 * @param nombre
	 * @param direccion
	 * @param aulas
	 */
	public Academia(String nombre, String direccion, Aula aulas) {
		this.aulas = new TreeSet<>();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas.add(aulas);
	}
	
	public void ampliar(Aula a) {
		//añade un aula a la academia
		this.aulas.add(a);
	}
	
	public void quitar (Aula a) {
		//elimina un aula a la academia
		this.aulas.remove(a);
	}
	
	public int getNumAulas() {
		//devuelva el numero de aulas
		return this.aulas.size();
	}

	@Override
	public String toString() {
		return "Academia " + nombre +
				"\nsuperficie"+ aulas;
	}
	
	
}
