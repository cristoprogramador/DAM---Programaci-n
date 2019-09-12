package ejercicio2;

public class Monarca {
	private String nombre;
	private String sobrenombre;
	private int numero;
	
	public Monarca(String n, String sn){
		nombre = n;
		sobrenombre = sn;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSobrenombre() {
		return sobrenombre;
	}
	public void setSobrenombre(String sobrenombre) {
		this.sobrenombre = sobrenombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String toString(){
		return nombre + " " + numero + "º " + sobrenombre;
	}

}
