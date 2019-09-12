package _03ejercicios;
import java.util.Scanner;

/**
 * (Nombres) Escribir un programa en el que se solicite el nombre completo
 * (nombre de pila y dos apellidos) al usuario y se muestre:
 * 		� La primera letra del texto introducido.
 * 		� La �ltima letra del texto introducido.
 * 		� El nombre
 * 		� El primer apellido
 * 		� El segundo apellido
 * El m�todo main recoger� la entrada del usuario y mostrar� los resultados.
 * Para ello se apoyar� en los siguientes m�todos que deber�s implementar:
 * 		� public static char inicial(String texto): Devuelve el primer car�cter del
 * 		String texto. El car�cter se devolver� en may�sculas
 * 		independientemente de c�mo aparezca en el texto.
 * 		� public static char ultima(String texto): Devuelve el �ltimo car�cter del
 * 		String texto. El car�cter se devolver� en may�sculas
 * 		independientemente de c�mo aparezca en el texto.
 * 		� public static String primeraPalabra(String texto): Devuelve la primera
 * 		palabra del String texto.
 * 		� public static String segundaPalabra(String texto): Devuelve la segunda
 * 		palabra del String texto.
 * 		� public static String terceraPalabra(String texto): Devuelve la tercera
 * 		palabra del String texto.
 * 
 * @author Cristobal Salido
 */
public class _10NombresOtraForma {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca nombre y dos apellidos");
		
		//capturamos el nombre y cada apellido por separado
		String nombre = tec.next();
		String apellido1 = tec.next();
		String apellido2 = tec.next();
		
		System.out.println("Primera letra en mayuscula "+inicial(nombre));
		System.out.println("Ultima letra del texto en mayuscula "+ultima(apellido2));
		System.out.println("Nombre " + nombre);
		System.out.println("Primer Apellido " + apellido1);
		System.out.println("Segundo Apellido " + apellido2);

	}
	
	public static char inicial(String texto){
		String mayuscula = texto.toUpperCase();
		return mayuscula.charAt(0);
	}
	
	public static char ultima(String texto){
		int t=texto.length();
		String mayuscula = texto.toUpperCase();
		return mayuscula.charAt(t-1);
	}
}