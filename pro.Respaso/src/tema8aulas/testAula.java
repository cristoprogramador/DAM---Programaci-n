package tema8aulas;

public class testAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula a = new Aula(1, 5, 12.5);
		AulaMusica m = new AulaMusica(2, 2, 10, false);
		AulaInformatica i = new AulaInformatica(4, 5, 5, 20);
		
		System.out.println(a);
		System.out.println(m);
		System.out.println(i);

	}

}
