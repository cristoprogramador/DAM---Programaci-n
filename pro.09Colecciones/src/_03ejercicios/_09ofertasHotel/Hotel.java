package _03ejercicios._09ofertasHotel;

public class Hotel {


	private String cif;
	private String nombre;
	private int estrellas;
	
	public Hotel (String cif, String nombre, int estrellas) {
		this.cif= cif;
		this.nombre= nombre;
		this.estrellas = estrellas;
	}
	
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Hotel)) return false;
		return this.cif.equals(((Hotel)o).cif);
	}
	
	@Override
	public int hashCode() {
		return this.cif.hashCode();
	}
	
	@Override
	public String toString() {
		return cif + " - " + nombre;
	}
}
