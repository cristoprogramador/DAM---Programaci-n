package _03ejercicios._PolimorfismoYGenericidad;

public class Carpintero extends Obrero implements Montador{
	public Carpintero(){
		System.out.println("Se crea Carpintero");
		} 
	
	public void montar(String x) {
		System.out.println("Montando " + x);
		} 
	
	public void desmontar(String x) {
		System.out.println("Desmontando " + x);
		} 
	
	public void clavar() { 
		
	} 

}
