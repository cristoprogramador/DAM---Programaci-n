package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _08TryVariosCatch {
	public static void main(String[] args) {
		try {
			Scanner tec = new Scanner(System.in);

			System.out.println("Nombre: ");
			String nombre = tec.nextLine();

			System.out.println("Posición: ");
			int pos = tec.nextInt();

			System.out.format("En la posición %d de %s está la letra %c", pos, nombre, nombre.charAt(pos));
			System.out.println(1 / 0);// Salta a catch - Exception
		} catch (InputMismatchException e) {
			System.out.println("Hay que introducir un entero");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("La posición es incorrecta");
		} catch (Exception e) {
			// Captura cualquier tipo de excepcion diferente
			// Si se pone el primero da error de compilación al
			// poner el resto de capturas de exceciones mas definidas
			System.out.println("Se ha producido algún error");
		}
	}
}
