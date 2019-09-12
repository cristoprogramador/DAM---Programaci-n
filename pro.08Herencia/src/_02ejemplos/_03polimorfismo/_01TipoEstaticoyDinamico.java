package _02ejemplos._03polimorfismo;

import _03ejercicios._01Aulas.Aula;
import _03ejercicios._01Aulas.AulaInformatica;
import _03ejercicios._01Aulas.AulaMusica;

public class _01TipoEstaticoyDinamico {

	public static void main(String[] args) {
		//Array de varias aulas
		Aula[] academia = new Aula[3];
		academia[0] = new Aula (1,10,8);
		academia[1] = new AulaInformatica(2,10,10,22);//Polimorfismo
		academia[2] = new AulaMusica(3,12,8,true);//Polimorfismo

		System.out.println(academia[0].capacidadAula());
		//Auna tiene metodo capacidadAula
		System.out.println(academia[1].capacidadAula());
		System.out.println(academia[2].capacidadAula());
		
		//No complila porque Aula no tiene métod getNumOrdenadores()
//		System.out.println(academia[1].getNumOrdenadores()); 
		
		//Si quiero que compile tengo que hacer un casting
		System.out.println(((AulaInformatica) academia[1]).getNumOrdenadores());
		
		//Puedo engañar al compilador haciendole creer que [2]
		//contiene un aula de informatica
		//PERO AL EJECUTAR DARA EXCEPCIÓN
		System.out.println(((AulaInformatica) academia[2]).getNumOrdenadores());
	}

}
