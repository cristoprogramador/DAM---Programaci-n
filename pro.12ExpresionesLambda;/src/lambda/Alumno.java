package lambda;

public class Alumno {

	private String nombre;
	private int edad;
	private int peso;
	private String sexo;
	public Alumno(String nombre, int edad, int peso, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre + " - " + edad + " - " + peso + " - " + sexo;
	}
	
}
