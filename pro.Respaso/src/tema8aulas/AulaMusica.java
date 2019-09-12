package tema8aulas;

public class AulaMusica extends Aula {
	private boolean piano;
	/**
	 * 
	 * @param c codigo
	 * @param l largo
	 * @param a ancho
	 * @param p piano
	 */
	public AulaMusica(int c, double l, double a, boolean p) {
		super(c, l, a);
		// TODO Auto-generated constructor stub
		piano = p;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aula de Música\n" + super.toString();
	}

}
