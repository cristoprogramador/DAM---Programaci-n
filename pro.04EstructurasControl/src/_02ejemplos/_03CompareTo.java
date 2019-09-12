package _02ejemplos;

public class _03CompareTo {

	public static void main(String[] args) {
		// El metodo compareTo se usa para establecer
		// una reslacion de orden entre Strings

		// Si los Strings son iguales, devuelve cero
		System.out.println("a".compareTo("a"));
		System.out.println("casa".compareTo("casa"));

		// Si el primer String va antes que el segundo, devuelve n� negativo
		// resta los codigos accis
		// sigue un criterio alfabetico, basado en la tabla accis no de cantidad de
		// caracteres
		System.out.println("---------------------");
		System.out.println("a".compareTo("b"));
		System.out.println("casal".compareTo("casr"));
		System.out.println("aaa".compareTo("baa"));
		System.out.println("aab".compareTo("b"));

		// Si el primer String va despu�s que el segundo devuelve n� positivo
		System.out.println("---------------------");
		System.out.println("b".compareTo("a"));

		// Las mayusculas afectan
		System.out.println("-----------------");
		System.out.println("a".compareTo("B"));
		System.out.println("A".compareTo("b"));
	}

}
