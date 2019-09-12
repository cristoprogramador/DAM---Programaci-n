package _03ejercicios;

import figuras.Circulo;
import pizarra.Pizarra;

/**
 * (AgrandarCirculo) Crear una pizarra de tamaño aleatorio. Dibujar en la esquina 
 * superior izquierda un círculo de radio aleatorio (entre 100 y 200). Una vez el círculo 
 * esté visible, modificar su radio incrementándolo un 50%
 * 
 * @author alumno
 */
public class _08AgrandarCirculo {
	public static void main(String args[]){
		Pizarra p = new Pizarra();
		int r=(int)(Math.random()*201+100);
		Circulo c= new Circulo(r,r,r);
		p.anyadir(c);
		p.esperar(1000);
		c.setRadio(r+(r/2));
		
	}

}
