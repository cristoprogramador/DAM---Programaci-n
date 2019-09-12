package tema8aulas;

public class AulaInformatica extends Aula {
	private int ordenadores;
	/**
	 * 
	 * @param c codigo
	 * @param l longitud
	 * @param a anchura
	 * @param o ordenadores
	 */
	public AulaInformatica(int c, double l, double a, int o) {
		super(c, l, a);
		ordenadores = o;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int capacidad() {
		// TODO Auto-generated method stub
		return ordenadores * 2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aula de informática\n" + super.toString();
	}

}
