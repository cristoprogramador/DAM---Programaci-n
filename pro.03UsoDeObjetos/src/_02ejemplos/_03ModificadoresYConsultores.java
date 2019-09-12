package _02ejemplos;

import java.util.Scanner;

import figuras.Circulo;
import pizarra.Pizarra;

public class _03ModificadoresYConsultores {

	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
	
		Pizarra p = new Pizarra("Duplicar tamaño circulo",800,600);		
		
		//Creamos circulo en el centro de la pizarra, con radio aleatorio
		//El radio estará entre 100 y 200
		int radio = (int)(Math.random()*101+100);
		
		Circulo c= new Circulo(1,400,300, radio);
		
		//Anyadimos circulo a la pizarra
		p.anyadir(c);
		
		//Mostrar radio por pantalla
		System.out.println(c.getRadio());
		
		//Mostar el color por pantalla
		System.out.println(c.getColor());
		
		//Duplicar radio del ciruculo
		p.esperar(1000);//tiempo en milisegundos
		c.setRadio(c.getRadio()*2);
		
		
	}

}
