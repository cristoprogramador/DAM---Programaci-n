package _02ejemplos._02ClaseGenerica;

import java.util.ArrayList;

public class Equipo {

	// Un equipo esta formado por varios miembros y un jefe
	// Podria tratarse de un equipo de Jugadores, un equipo de Alumnos,
	// un equipo de Profesores, ...
	
	private String nombre;
	private ArrayList miembros; //Por defecto cualquier tipo de objeto
	private Object jefe;
	
	
	/**
	 * Crea el equipo vacio: sin miembros y sin jefe
	 */
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		miembros = new ArrayList();
		
	}
	
	public void anyadirMiembro(Object m) {
		miembros.add(m);
		
	}
	public void setJefe(Object j) {
		this.jefe = j;
		
	}
	public Object getJefe() {
		return jefe;
		
	}
	@Override
	public String toString() {
		String res = "Nombre: "+ nombre
				+"\nJefe: \n"+jefe.toString() + "\n-----------"; 
		//este toString es para el objeto de alumno, profe, jugadores, ...
		
		for(Object o:miembros) {
			res+="\n" + o.toString();
		}
		return res;
	}
	
	

}
