package _02ejemplos._02ClaseGenerica;

import _02ejemplos._01Personas.Alumno;
import _02ejemplos._04animales.Perro;

public class TestTeam {

	public static void main(String[] args) {
		// cuando lo definimos tenemos que decirle el tipo

		Team<Alumno> t = new Team<>("programame");
		t.anyadirMiembro(new Alumno("112111A", "Miguel", 134413));
		t.anyadirMiembro(new Alumno("474774B", "Antonio", 23434));
		t.anyadirMiembro(new Alumno("474774", "Antoclon", 43432));
		t.setJefe(new Alumno("586868Z", "Rafa", 45757));

		System.out.println(t);

		// Ahora no se pueden mezclar distintos tipos de object...WIN
		//t.setJefe(new Perro());

		// Al recuperar informacion ya no tengo que hacer casting
		Alumno j = t.getJefe(); 
		// Ya no hay Dificultades para utilizar ventajas de polimorfismo

	}

}
