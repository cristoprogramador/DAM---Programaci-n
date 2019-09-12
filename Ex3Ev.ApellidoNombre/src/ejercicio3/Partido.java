package ejercicio3;

public class Partido {
	private String nombre;
	private int escanyos;
	
	public Partido(String p, int e){
		nombre = p;
		escanyos = e;
	}
	
	public String getPartido(){
		return nombre;
	}
	
	public int getEscanyos(){
		return escanyos;
	}
	
	// Dos partidos son el mismo si tienen el mismo nombre
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Partido)) return false;
		return this.nombre.equals(((Partido)o).nombre);
	}

}
