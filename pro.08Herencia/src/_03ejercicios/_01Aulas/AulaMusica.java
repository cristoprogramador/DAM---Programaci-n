package _03ejercicios._01Aulas;

public class AulaMusica extends Aula{
	private boolean tienePiano;
	
	public AulaMusica (int codigo, double longitud, double anchura, boolean tienePiano) {
		super(codigo, longitud, anchura);
		this.tienePiano = tienePiano;
	}
	
	public boolean getPiano() {
		return tienePiano;
	}
	
	public void setPiano( boolean tienePiano) {
		this.tienePiano = tienePiano;
	}
	

	@Override
	public int capacidadAula() {
		if (tienePiano)
		return super.capacidadAula()-2;
		else return super.capacidadAula();
	}
	
	@Override
	public String toString() {
		return "Aula de musica\n" + super.toString();
	}
	
}

