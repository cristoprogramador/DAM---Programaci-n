package _03ejercicios._03FabricaDeMoneda;

import java.util.ArrayList;
import java.util.Collections;

/**
 * b) Diseñar la clase TestDinero para probar las clases desarrolladas: Crear objetos 
de las clases Moneda y Billete y mostrarlos por pantalla. 
 * @author alumno
 *
 */
public class TestDinero {

	public static void main(String[] args) {
		ArrayList<Dinero> lista = new ArrayList();
		lista.add(new Moneda(25, 1977, 10, 10));
		lista.add(new Moneda(50, 1992, 20, 25.3));
		lista.add(new Billete(100, 1950, 200, 400));
		lista.add(new Billete(10000, 1992, 2000, 4000));
		lista.add(new Billete(20, 2001,12, 18));
		lista.add(new Billete(5, 2002, 9, 7));
		lista.add(new Billete(50, 2010, 13, 9));
		
		Collections.sort(lista);
		
		//Mostramos por pantalla
		for (Dinero d : lista) {
			System.out.println(d);
			System.out.println("-------------");
		}
		
		
		if (lista.get(0).equals(lista.get(1))){
			System.out.println("IGUALES");
		}else {
			System.out.println("DISTINTOS");
		}

	}

}
