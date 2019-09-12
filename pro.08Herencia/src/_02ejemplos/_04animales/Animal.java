package _02ejemplos._04animales;

public abstract class Animal {
	
	public abstract void rugir(); 
	public abstract void comer();
	
	public void dormir() {
		System.out.println("ZZZzzzzzzzzz");
	}

	//Con esto el resto de clases tambien tendrían 
	//estos metodos (Tigres y lobos)
/*	public void jugar() {
		
	}
	public void vacunar() {
		
	}*/


}
