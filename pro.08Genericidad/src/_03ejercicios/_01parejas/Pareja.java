package _03ejercicios._01parejas;

import java.util.ArrayList;

/**
 * Definir la clase generica Pareja<E>
 * -Una pareja tiene 2 miembros
 * -Dos parejas son iguales si sus dos miembros son iguales
 * -toString..-
 * @author alumno
 *
 */
public class Pareja <E extends Comparable<E>>{
	//con <> dejamos abierto el tipo, esta por decidir(el arralist es de tipo E por ejemplo) 
	
	private E miembro1;
	private E miembro2;
	
	public Pareja(E m1, E m2) {
		this.miembro1 = m1;
		this.miembro2 = m2;
		
	}

	public E getMiembro1() {
		return miembro1;
	}

	public void setMiembro1(E miembro1) {
		this.miembro1 = miembro1;
	}

	public E getMiembro2() {
		return miembro2;
	}

	public void setMiembro2(E miembro2) {
		this.miembro2 = miembro2;
	}


	public boolean equals(Object o) {
	if (!(o instanceof Pareja))return false;
	if (o == this)return true;

	Pareja<E> p = (Pareja<E>)o;
	return this.miembro1.equals(p.miembro1) &&
			this.miembro2.equals(p.miembro2);
	}
	
	public String toString() {
		if(miembro1.compareTo(miembro2))
		return "Miembro1: " + miembro1 +
				"\nMiembro2 " + miembro2;
		}
}
