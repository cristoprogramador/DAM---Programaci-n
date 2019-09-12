package _03Ejercicios;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * (Tocayos) Disponemos de los nombres de dos grupos de personas (dos arrays de
 * String). Dentro de cada grupo todas las personas tienen nombre distinto, pero
 * queremos saber cuántas personas del primer grupo tienen algún tocayo en el
 * segundo grupo, es decir, el mismo nombre que alguna persona del segundo
 * grupo. Escribir un programa que resuelva el problema (inicializa los dos
 * arrays con los valores que quieras y diseña los métodos que consideres
 * necesarios). Por ejemplo, si los nombres son {"miguel","josé","ana","maría"}
 * y {"ana", "josé", "luján", "juan", "josé", "pepa", "ángela", "sofía",
 * "andrés", "bartolo") , el programa mostraría: josé tiene tocayo en el segundo
 * grupo. ana tiene tocayo en el segundo grupo. TOTAL: 2 personas del primer
 * grupo tienen tocayo.
 * 
 * Lo haremos con letras
 * 
 * @author alumno
 *
 */
public class _09Tocayos {

	public static void main(String[] args) {
		String[] grupo1 = { "Bartolo", "David", "Esteban", "German", "Javi" };
		String[] grupo2 = { "Ana", "Bartolo", "Carlos", "David", "Esteban", "Fernando" };
		String[] tocayos = null;
		int cont = 0;

		// hacemos un bucle de busqueda para el primer grupo
		if (grupo1.length < grupo2.length) {
			tocayos = new String[grupo1.length];

			for (int i = 0; i < grupo1.length; i++) {
				boolean igual = true;

				for (int j = 0; j < grupo2.length && igual; j++) {
					if (grupo1[i] == grupo2[j]) {
						tocayos[cont] = grupo1[i];
						cont++;
						igual = false;
					}
				}
			}
		}else {
			tocayos = new String[grupo2.length];

			for (int i = 0; i < grupo2.length; i++) {
				boolean igual = true;

				for (int j = 0; j < grupo1.length && igual; j++) {
					if (grupo2[i] == grupo1[j]) {
						tocayos[cont] = grupo2[i];
						cont++;
						igual = false;
					}
				}
			}
		}
		if (cont > 0) {
			for (int cont2 = 0; cont2 < cont; cont2++)
				System.out.println(tocayos[cont2] + " Tiene un tocayo en el segundo grupo");
			System.out.println("Total: " + cont + " personas del primer grupo tiene tocayo en el segundo grupo");
		} else {
			System.out.println("Ninguna persona del primer grupo tiene tocayo en el segundo");
		}
	
		//Solución Javi
		
		for (int i = 0; i < tocayos.length; i++) {
			//Comprobamos si grupo1[i] está en el grupo 2 (busqueda)
			boolean enc = false;
			for (int j = 0; j < tocayos.length; j++) {
				if(grupo1[i].equals(grupo2[j])){
					enc = true;
					System.out.println(grupo1[i] + " tiene un tocayo en el gruo dos");
				}
			}
		}
	}

	
	
}
