package _03ejercicios._01Aulas;

public class AulaInformatica extends Aula {
	private int numOrdenadores;
	
	public AulaInformatica (int codigo, double longitud, double anchura, int numOrdenadores) {
		super(codigo, longitud, anchura);
		this.numOrdenadores = numOrdenadores;
	}
	public int getNumOrdenadores() {
		return numOrdenadores;
	}
	
	public void setNumOrdenadores( int numOrdenadores) {
		this.numOrdenadores = numOrdenadores;
	}
	

	@Override
	public int capacidadAula() {
		return numOrdenadores * 2;
	}
	
	@Override
	public String toString() {
		return "Aula de informatica\n" + super.toString();
	}
	
}
