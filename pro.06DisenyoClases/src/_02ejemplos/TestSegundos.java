package _02ejemplos;

public class TestSegundos {

	public static void main(String[] args) {
		Tiempo t = new Tiempo(10, 30, 15);

		System.out.println(t);
		System.out.println("Segundos: " + t.toSegundos());
	}

}
