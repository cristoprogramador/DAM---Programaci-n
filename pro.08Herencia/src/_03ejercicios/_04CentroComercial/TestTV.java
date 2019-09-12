package _03ejercicios._04CentroComercial;

import java.util.ArrayList;

public class TestTV {

	public static void main(String[] args) {
		//No se pueden crear objetos de la clase Televisores 
		//porque es abstracta
		//Televisores t = new Televisores ("Samsun", "HD20", 1000,40);

		ArrayList<Televisores> catalogo = new ArrayList<>();
		catalogo.add(new TVTubo("Samsun", "HD20", 1000, 20, 400));
		catalogo.add(new TVLCD("Samsun", "LCD32A", 1000, 32, 800, 600));
		catalogo.add(new TVLCD("Sony", "S50", 2000, 50, 2000, 1800));

		for(Televisores t: catalogo) {
		System.out.println(t);
		System.out.println("--------------------------");

		}

	}

}
