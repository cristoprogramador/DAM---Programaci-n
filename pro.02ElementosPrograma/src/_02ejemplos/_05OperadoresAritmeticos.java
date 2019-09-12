package _02ejemplos;

public class _05OperadoresAritmeticos {
	public static void main(String arg[]){
		System.out.println(20 + 1 + 7);
		System.out.println(53 * 3);
		
//División 2 tipos
	//División Entera
	//Utilizamos la barra "/" 
	//El cociente es entero
	//Se hará siempre que los dos numeros sean enteros "int"
		System.out.println(5 / 2); //dará 2 numero entero
//División real
	//Tambien utilizamos la barra "/" 
	//El cociente es un numero con decimales
	//Se hará cuando el dividendo o el divisor sea un numero real "double o float"
		System.out.println(5.0 / 2); //dará 2.5 numero real
		System.out.println(5 / 2.0); //dará 2.5 numero real
		System.out.println(5.0 / 2.0); //dará 2.5 numero real
				
//IMPORTANTE SABER QUE TIPO DE NUMEROS TRABAJAMOS Y TRANSFORMAR PARA OPERAR SI PROCEDE
	
//Resto de la división "%"
		
		//25 entre 2 es 12 y el resto es 1 ((12*2)+1=25)
		System.out.println(25 / 2); //Dará 12 obviando el resto
		System.out.println(25 % 2); //Dará 1 obviando el resultado
		
	//Ejemplo de programa en siguiente classe _06RestoDivision
	}

}
