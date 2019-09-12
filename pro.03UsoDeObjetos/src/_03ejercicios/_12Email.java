package _03ejercicios;

import java.util.Scanner;

/**
 *  (email) El usuario introduce su dirección de correo electrónico, del tipo
 *  nombre@empresa.com. Mostrar, por separado el nombre de usuario, el
 *  subdominio y el dominio.
 *  		Introduce tu nombre dirección de email: paco@iesMatisse.org
 *  		Nombre de usuario: paco
 * 			Subdominio: iesMatisse
 *  		Dominio: org
 *  
 * @author Cristobal Salido
 *
 */
public class _12Email {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce tu nombre dirección de email:");
		String email = tec.next();
		System.out.println("Nombre de usuario: "+email.substring(0,email.indexOf("@")));
		System.out.println("Subdominio: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
		System.out.println("Dominio: "+email.substring(email.indexOf(".")+1,email.length()));

	}

}
