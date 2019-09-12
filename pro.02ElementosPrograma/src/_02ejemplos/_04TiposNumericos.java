package _02ejemplos;

public class _04TiposNumericos {
	public static void main(String arg[]){
		//Podemos almacenar valores "pequeños" en 
		// variables "grandes"
		int entero1 = 10;
		int largo1 = 10;
		
		//Enteros largos
		int entero2 = 2000000000;
		int entero2 = 3000000000; //da error al no caber en un entero int
		
		long largo2 = 3000000000; //da error el programa interpreta el numero como int
		long largo2 = 3000000000l; //definimosa l programa el numero como long 8bytes
		
		//la opción nextLong() incluye el identificador l al numero introducido por el usuario.
		
		//Incompatibilidad de tipos
		byte byte1 = 127;
		byte byte2 = 128; //error puesto que hacen falta 2 bytes para representarlo
		short short1 = 32767;
		short short2 = 32768; //error, hacen falta 4 bytes
		int int1 = 2000000000;
		int int2 = 2000000000L;//al definir el numero como largo no lo admite en int
		
		//NUMEROS REALES
		//java los interpreta como tipo double 
		//se le ha de añadir f al final para que lo interprete como float
		//tienen 3 valores especiales
			//Infinity ; -Infinity ; NaN (Not a Number)
		
		float float1 = 2.5; //error, interpreta como tipo double
		float float2 = 2.5F; //indocamos que el numero es tipo float
		
		double double1 = 2.3E-4; //Notación cientifica (2.3E-4 = 2.3 * 10 elevado a 4)
		
		//literales "extraños"
		System.out.println(5.0 / 0.0); //notifica Infinity
		System.out.println(-5.0 / 0.0); //notifica -Infinity
		System.out.println(0.0 / 0.0); //notifica NaN
	}

}
