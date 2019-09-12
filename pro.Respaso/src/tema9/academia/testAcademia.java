package tema9.academia;

import tema8aulas.Aula;

public class testAcademia {

	public static void main(String[] args) {
		Aula a = new Aula(1,10,10);
		Aula a1 = new Aula(2,15,10);
		Aula a2 = new Aula(3, 5,10);

		
		Academia ac = new Academia("Bartolo", "Virgen de la roa", a);
		System.out.println(a);
		System.out.println(ac);
		ac.ampliar(a2);
		System.out.println(ac);
		System.out.println(ac.getNumAulas());


	}

}
