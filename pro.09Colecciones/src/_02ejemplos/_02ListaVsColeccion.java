package _02ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _02ListaVsColeccion {

	public static void main(String[] args) {
		List<String> listaNombres = new ArrayList<>();
		Collection<String> colNombres = new ArrayList<>();
		
		//en ambos puedo añadir
		listaNombres.add("ana");
		listaNombres.add("paz");
		listaNombres.add("luz");
		
		colNombres.add("sol");
		colNombres.add("pau");
		colNombres.add("luis");

		System.out.println(listaNombres.contains("ana"));
		System.out.println(colNombres.contains("sol"));
		//estas operaciones estarian bien en ambas

		//En una lista, sus elementos tienen una POSICIÓN.	
		//Esto hace que existan operaciones que solo se podrían hacer
		//en un List.
		
		//Sacar la posición del elemento
		System.out.println(listaNombres.indexOf ("ana"));
//		System.out.println(colNombres.indexOf("sol")); 
		//en la colección los elementos no tienen posisición y no podremos
		//pedirla.
		
		//añadir en una posición
		listaNombres.add(0, "Miguel");
//		colNombres.add(0,"Miguel");//No permite añadir por posiciones
		
		//eliminar en una posición
		listaNombres.remove(0);//elimina el elemento de la posición 0
		colNombres.remove(0);//elimina el elemento 0
		
		
	}

}
