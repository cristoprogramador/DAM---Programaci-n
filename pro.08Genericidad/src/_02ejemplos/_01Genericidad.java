package _02ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class _01Genericidad {
	public static void main(String[] args) {
		
	
	
	
	ArrayList<String> alumnos = new ArrayList<>();
	alumnos.add("Angel");
	alumnos.add("Miguel");
	alumnos.add("Antonio");
	alumnos.add("Quique");
	//no esta permitido anyadir otro tipo de elementos
	//alumnos.add(new Integer(10));
	
	//<String> utiliza la notacion de diamante, relacionada con genericidad,
	//que permite definir los metodos de un arrayList
	//independientemente de los objetos que vayan a insertarse en el ArrayList
	
	
	//Hasta la version 7: El ArrayList admite cualquier Object
	
	ArrayList profesores = new ArrayList<>();
	profesores.add("Javi");
	profesores.add("Esther");
	profesores.add("Chema");
	profesores.add(new Integer(10));
	profesores.add(new Scanner(System.in));
	
	
	
	
	}
}
