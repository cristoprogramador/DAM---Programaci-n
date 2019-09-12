package tema8.fabricaDeMoneda;

public abstract class Dinero implements Comparable<Dinero>{
	private double valor;
	private int anyo;
	
	public Dinero(double v, int a) {
		valor = v;
		anyo = a;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dinero other = (Dinero) obj;
		if (anyo != other.anyo)
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Dinero o) {
		if (this.anyo != o.anyo)
			return this.anyo - o.anyo;
		else {
			if (this.valor < o.valor)
				return -1;
			else if (this.valor > o.valor)
				return -1;
			else return 0;
		}
	}

	@Override
	public String toString() {
		return "valor=" + valor + ", anyo=" + anyo;
	}
	
}
