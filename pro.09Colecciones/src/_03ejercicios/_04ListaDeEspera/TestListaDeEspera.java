package _03ejercicios._04ListaDeEspera;

public class TestListaDeEspera {

	public static void main(String[] args) {
		ListaDeEspera l = new ListaDeEspera();
		
		l.ponerEnLista("miguel");
		l.ponerEnLista("pablo");
		l.ponerEnLista("luis");
		l.ponerEnLista("vicente");
		l.ponerEnLista("ana");
		l.ponerEnLista("rosa");
		l.ponerEnLista("carmen");
		System.out.println(l);
		System.out.println("------------------------");
		System.out.println("Atender a " + l.atenderPaciente());
		System.out.println("Atender a " + l.atenderPaciente());
		System.out.println("------------------------");
		System.out.println("Colar a ana ");
		System.out.println(l.colarPaciente("ana")); //true
		System.out.println("Colar a miguel ");
		System.out.println(l.colarPaciente("miguel")); //true
		
		System.out.println(l);
		System.out.println("------------------------");

	}

}
