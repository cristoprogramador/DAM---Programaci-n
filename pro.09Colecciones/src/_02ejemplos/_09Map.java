package _02ejemplos;

import java.util.HashMap;
import java.util.Map;

public class _09Map {

	public static void main(String[] args) {
		//Map para almacenar notas de alumnos
		//Vamos a almacenar parejas (nombre de alumno, nota del alumno)
		
		Map<String,Double> notas = new HashMap<>();
		
		notas.put("miguel", 8.5); //miguel has sacado un 8.5: notas["miguel"]=8.5
		notas.put("ana", 7.0); //ana has sacado un 7
		notas.put("andres", 4.0); //andres has sacado un 4
		System.out.println(notas);	

		//No puede haber dos claves(key) repetidas
		notas.put("miguel", 0.5);
		System.out.println(notas);
		//Si la clave existia actualiza el valor
		
		//Consultar un valor
		Double notaDeAna = notas.get("ana");
		System.out.println("Nota de ana: " +  notaDeAna);
		//Si la clave no está, devuelve null
	}

}
