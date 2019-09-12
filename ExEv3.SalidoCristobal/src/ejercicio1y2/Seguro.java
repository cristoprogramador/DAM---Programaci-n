package ejercicio1y2;
/**
 * Para identificar el objeto utilizaremos el hasCode,
 * que nos devolverá un codigo segun la poiza y año.
 * 
 * Utilizamos hashCode para el HashSet
 * es necesario para el posicionamiento interno de los objetos
 * dentro de las colecciones tipo Hash
 * 
 * añadiremos un metodo equals para utilizar HashSet
 * es necesario para evitar el duplicado de los objetos
 * dentro de las colecciones tipo Hash
 * 
 * añadiremos un metodo compareTo para utilizar TreeSet
 * Es necesario para que los objetos esten ordenados
 * es el que define el orden dentro de las listas tipo Tree
 * @author Cristobal Salido
 *
 */
public class Seguro implements Comparable<Seguro>{
	private String poliza;
	private int anyo;
	private String matricula;
	private boolean incendio;
	private boolean lunas;
	
	public Seguro(String codigo, int anyo, String matricula, boolean incendio, boolean lunas) {
		this.poliza = codigo;
		this.anyo = anyo;
		this.matricula = matricula;
		this.incendio = incendio;
		this.lunas = lunas;
	}
	
	public double calcularPrecio() {
		int incremento = 0;
		if (this.incendio && this.lunas) {
			incremento = 40;
		}else {
			if (this.incendio) {
				incremento +=20;
			}
			if (this.lunas) {
				incremento +=30;
			}
		}
		return 200 + incremento;
	}
	
	@Override
	public String toString() {
		String fuego, cristales;
		if (this.incendio) {fuego = "Incluido";}else fuego = "Excluido";
		if (this.lunas) {cristales = "Incluido";}else cristales = "Excluido";
		
		return "Póliza: " + poliza +
				"\nAño: " + anyo + 
				"\nMatrícula: " + matricula +
				"\nIncencido: " + fuego	+ 
				"\nLunas: " + cristales +
				"\nPrecio: " + calcularPrecio();
	}
	
	/**
	 * Utilizamos hashCode para el HashSet
	 * es necesario para el posicionamiento interno de los objetos
	 * dentro de las colecciones tipo Hash
	 * HashCode nos identificará el ofjeto
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyo;
		result = prime * result + ((poliza == null) ? 0 : poliza.hashCode());
		return result;
	}
	
	/**
	 * Utilizamos equals para el HashSet
	 * es necesario para evitar el duplicado de los objetos
	 * dentro de las colecciones tipo Hash
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seguro other = (Seguro) obj;
		if (anyo != other.anyo)
			return false;
		if (poliza == null) {
			if (other.poliza != null)
				return false;
		} else if (!poliza.equals(other.poliza))
			return false;
		return true;
	}
	
	/**
	 * Utilizamos compareTo para el TreeSet
	 * Es necesario para que los objetos esten ordenados
	 * es el que define el orden dentro de las listas tipo Tree
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Seguro o) {
		if (this.anyo < o.anyo)return 1;
		else if (this.anyo > o.anyo)return -1;
		else return poliza.compareTo(o.poliza);
	}
	
}
