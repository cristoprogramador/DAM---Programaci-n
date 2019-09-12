package ejercicio3;

public class TestGaraje {
	public static void main(String[] args) {
		Garaje g = new Garaje();
		
		g.registrarMatricula("1111AAA",1);
		g.registrarMatricula("6666FFF",12);
		g.registrarMatricula("3333CCC",23);
		g.registrarMatricula("1111AAA",30);
		g.registrarMatricula("4444DDD",40);
		g.registrarMatricula("3333CCC",45);
		g.registrarMatricula("3333CCC",60);
		
		System.out.println(g.toString());
		
	}
}
