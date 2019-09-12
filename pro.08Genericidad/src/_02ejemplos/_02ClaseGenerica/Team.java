package _02ejemplos._02ClaseGenerica;

import java.util.ArrayList;

public class Team <E>{			
	//con <> dejamos abierto el tipo, esta por decidir(el arralist es de tipo E por ejemplo) 
	
	private String nombre;
	private E jefe;
	private ArrayList<E> miembros; //No concretamos el tipo de objeto
	
	public Team(String nombre) {
		this.nombre = nombre;
		miembros = new ArrayList();
		
	}
	
	public void anyadirMiembro(E m) {
		miembros.add(m);
		
	}
	public void setJefe(E j) {
		this.jefe = j;
		
	}
	public E getJefe() {
		return jefe;
		
	}
	@Override
	public String toString() {
		String res = "Nombre: "+ nombre
				+"\nJefe: \n"+jefe.toString() + "\n-----------"; 
		
		//este toString es para el objeto de alumno, profe, jugadores, ...
		
		for(E o:miembros) {
			res+="\n" + o.toString();
		}
		return res;
	}
	
	

}



