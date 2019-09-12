package _03ejercicios._01Aulas;

//Declaramos que la clase incluye el metodo compareTo.
//Los metodos como Arrys.sort podrán entonces usar el metododo compareTo.
//indicamos que es comparable solo con un obejto Aula o descendiente
public class Aula implements Comparable<Aula>{
	protected int codigo;
	protected double longitud, anchura;
	
	public Aula(int codigo, double longitud, double anchura){
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getAnchura() {
		return anchura;
	}
	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}
	
	public int capacidadAula() {
		return (int) (longitud * anchura / 1.4);
	}
	
	@Override
	public String toString() {
		return "Codigo: " + codigo +
				"\nSuperficie: " + (anchura * longitud) +
				"\nCapacidad: " + capacidadAula();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Aula)) return false;
		return this.codigo == ((Aula)o).codigo;
	}
	
	public int compareTo(Aula a) {
		//Aula a = (Aula) o;
		return this. codigo - a.codigo;
	}
}
