package _02ejemplos._02ClaseGenerica;

import _02ejemplos._01Personas.Alumno;
import _02ejemplos._04animales.Perro;

public class TestEquipo {
	public static void main(String[] args) {
		Equipo equipoAlumnos= new Equipo("programame");
		equipoAlumnos.anyadirMiembro(new Alumno("112111A", "Miguel", 134413));
		equipoAlumnos.anyadirMiembro(new Alumno("474774B", "Antonio", 23434));
		equipoAlumnos.anyadirMiembro(new Alumno("474774", "Antoclon", 43432));
		equipoAlumnos.setJefe(new Alumno("586868Z", "Rafa", 45757));
		
		System.out.println(equipoAlumnos);
		
		//Problema 1: Se pueden mezclar distintos tipos de object
		equipoAlumnos.setJefe(new Perro());
		
		//Problema 2: Al recuperar informacion tengo que hacer casting
		Alumno j = (Alumno) equipoAlumnos.getJefe(); //Un object no es un alumno, al reves siii
		
		//Problema 3: Dificultades para utilizar ventajas de polimorfismo
		
		
		
	}

}
