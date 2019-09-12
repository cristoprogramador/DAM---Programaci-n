package _03ejercicios._02SalonVideojuegos;

public class Test {

	public static void main(String[] args) {
		Juego j1 = new Juego ("CS GO", "Valve", 2012);
		System.out.println(j1);
		
		JuegoEnAlquiler ja = new JuegoEnAlquiler("Super Mario Odisssey", "Nintendo", 2017, 5, 10, 2);
		System.out.println("\n"+ja);
		
		JuegoEnVenta jv = new JuegoEnVenta("Super Mario Odisssey", "Nintendo", 2017, 70, 20);
		System.out.println("\n"+jv);
		
	}

}
