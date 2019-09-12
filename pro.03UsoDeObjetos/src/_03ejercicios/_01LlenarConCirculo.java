package _03ejercicios;

import figuras.Circulo;
import pizarra.Pizarra;

public class _01LlenarConCirculo {

	public static void main(String[] args) {
		Pizarra p = new Pizarra("Llenar con circulo", 500,500);
		Circulo c = new Circulo(250,250,250);
		p.anyadir(c);

	}

}
