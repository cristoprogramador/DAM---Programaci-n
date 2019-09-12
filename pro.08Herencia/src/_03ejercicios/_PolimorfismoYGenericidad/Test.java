package _03ejercicios._PolimorfismoYGenericidad;

public class Test {
	
	public static void main(String a[]){ 
		Montador m1 = new Carpintero(); 
//		Montador m2 = new Albanyil(); // Albanyil no implementa la interface Montador
		Obrero o1 = new Carpintero(); 
		Obrero o2 = new Albanyil(); 
//		o1.montar("Mesa"); // Tipo Obrero no tiene metodo montar
//		o2.levantarMuro(); // Tipo Obrero no existe el metodo levantar Muro
//		m1.saludar(); //Tipo Montador, no tiene metodo saludar
		m1.montar("Silla"); 
		((Albanyil)o2).levantarMuro();
		((Albanyil)o1).levantarMuro();
		
	} 

}
