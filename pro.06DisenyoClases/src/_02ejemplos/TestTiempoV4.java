package _02ejemplos;

public class TestTiempoV4 {

	public static void main(String[] args) {

		// Usamos el constructor que permite especificar hora, min y seg.
		Tiempo t = new Tiempo(20, 30, 35);
		System.out.println(t);

		// Usamos el constructor que permite especificar solo hora y minutos
		Tiempo t2 = new Tiempo(10, 15);
		System.out.println(t2);// System.out.println (t2.toString())

		// Cuando generamos un metodo constructor, Java deja de crear
		// el constructor por defecto vacio y no permite su uso como en
		// las versiones anteriores de nuestro programa.
		// Si quisieramos usarlo deveriamos de crearlo por nuestra cuenta.
		//
		//Tiempo t3 = new Tiempo();

	}

}
