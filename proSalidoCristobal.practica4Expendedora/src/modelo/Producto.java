package modelo;

/**
 * 
 * Representa un producto de la maquina expendedora. El dato que identifica a un
 * producto es su ccdigo, lo cual queda reflejado en los metodos equals y compareTo
 */
public class Producto implements Comparable<Producto> {
	private String codigo;
	private String nombre;
	private double precio;
	private double alcohol;
	private int stock;

	public Producto(String codigo,String nombre, double alcohol, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.alcohol = alcohol;
		this.precio = precio;
		this.stock = stock;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	@Override
	public String toString(){
		return codigo + " - " + nombre + " - " + alcohol +" - " + precio + " � - " + stock + " uds.";
	}
	
	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if(!(o instanceof Producto)) return false;
		return this.codigo.equals(((Producto)o).codigo);
	}

	@Override
	public int compareTo(Producto p) {
		return this.codigo.compareTo(p.codigo);
	}
	
}
