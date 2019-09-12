package ejercicio2;

import java.util.Arrays;
import java.util.List;

public class TestEjercicio2 {
	public static void main(String[] args) {
		Monarca[] m = {
				new Monarca("Isabel","La Catolica"),
				new Monarca("Fernando","El Catolico"),
				new Monarca("Juana","La loca"),
				new Monarca("Felipe","El hermoso"),
				new Monarca("Carlos","El cesar"),
				new Monarca("Felipe","El prudente"),
				new Monarca("Felipe","El piadoso"),
				new Monarca("Felipe","El grande"),
				new Monarca("Carlos","El hechizado"),
				new Monarca("Felipe","El animoso"),
				new Monarca("Luis","El liberal"),
				new Monarca("Carlos","El politico"),
				new Monarca("Carlos","El cazador"),
				new Monarca("Isabel", "La Castiza"),
				new Monarca("Juan Carlos","<sin sobrenombre>"),
				new Monarca("Felipe","<sin sobrenombre>")
		};
		List<Monarca> reyes = Arrays.asList(m);
		Ejercicio2.ponerNumeroAReyes(reyes);
		imprimir(reyes);
		
	}
	public static void imprimir(List<Monarca> reyes){
		for(Monarca m: reyes) System.out.println(m);
		
	}
	

}
