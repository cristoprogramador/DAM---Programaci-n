package tema8.videoJuegos;


public class TestJuego {

	public static void main(String[] args) {
		Juego j1 = new Juego ("CS GO", "Valve", 2012);
		System.out.println(j1);
		
		JuegoAlquiler ja = new JuegoAlquiler("Super Mario Odisssey", "Nintendo", 2017, 5, 10, 2);
		System.out.println("\n"+ja);
		
		JuegoVenta jv = new JuegoVenta("Super Mario Odisssey", "Nintendo", 2017, 70, 20);
		System.out.println("\n"+jv); 

	}

}
