package tema9.listaAdmitidos;

import java.util.HashSet;
import java.util.Scanner;

public class ComprobarAdmision {

	public static void main(String[] args) {
		boolean admitido = false;
		Scanner tec = new Scanner(System.in);
		HashSet<Inscripcion> admitidas = new HashSet<>();
		admitidas.add(new Inscripcion("12121212j", "antonio", 1));
		admitidas.add(new Inscripcion("45454545d", "juan", 2));
		admitidas.add(new Inscripcion("87878787s", "pepito", 3));

		System.out.println("Introduzca dni para comprobar su admisión");
		String nif = tec.nextLine();

		Inscripcion in = new Inscripcion(nif, "", 0);

		for (Inscripcion i : admitidas) {
			if (i.equals(in)) {
				System.out.println("Admitido\n" + i);
				admitido = true;
			}
		}

		if (!admitido)
			System.out.println("No admitido");
	}

}
