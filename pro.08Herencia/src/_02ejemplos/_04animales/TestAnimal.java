package _02ejemplos._04animales;

public class TestAnimal {

	public static void main(String[] args) {
		
		// Los interface permiten mantener la ventajas del polimorfismo.
		// Puedo tener un array de Mascota en el que almacenar
		// Perros y Gatos
		Mascota[] misMascotas = { new Perro(), new Gato(), new Perro(), new Perro() };
		for (int i = 0; i < misMascotas.length; i++) {
			misMascotas[i].vacunar();
			misMascotas[i].jugar();
			//Hacemos un casting para indicar que es una mascota
			//Es un animal (podría no serlo "tamagochi")
			((Animal)misMascotas[i]).dormir();
		}
		
	}

}
