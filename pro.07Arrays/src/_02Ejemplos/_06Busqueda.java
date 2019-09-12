package _02Ejemplos;

public class _06Busqueda {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 2, 2, 4, 2, 2, 2, 8, 2, 9 };
		
		System.out.println(haySoloUnCero(numeros));
		
	/*	if (hayNegativos(numeros)) //Como condicion puedes poner metodo con boolean, cualquier expresion q sea V o F.
			System.out.println("Hay negativos ");
		else
			System.out.println("No hay negativos");
	*/}

	public static boolean hayNegativos(int[] numeros) {
		boolean encontrado = false;
		for (int i = 0; i < numeros.length && !encontrado; i++) {
			if (numeros[i] < 0)
				encontrado = true;
		}
		return encontrado;
	}

	public static int posPrimerCero(int[] numeros) {
		boolean encontrado = false;
		int pos = -1;

		for (int i = 0; i < numeros.length && !encontrado; i++) {
			if (numeros[i] == 0) {
				encontrado = true;
				pos = i;
			}

		}

		return pos;
	}

	public static int posPrimerCero2(int[] numeros) {
		boolean encontrado = false;
		int i;
		for (i = 0; i < numeros.length && !encontrado; i++) {
			if (numeros[i] == 0) {
				encontrado = true;
				
			}

		}
		if(encontrado) return i-1; //...cuando lo encuentra sube el contador, es automatico.
		else return -1;
	}
	
	public static int posUltimoCero(int[] numeros){
		
		boolean encontrado = false;
		int i = numeros.length-1; //ultima posicion del array
		while( i >= 0 && !encontrado){
			
			
			
			if(numeros[i]==0){
			encontrado = true;
				
			} else {
				i--;
			}	
		}
			if(encontrado) return i;
			else return -1;
			
		
	}

public static int posUltimoCero2(int[] numeros){
	
	boolean encontrado = false;
	int i = numeros.length-1; //ultima posicion del array
	while( i >= 0 && !encontrado){
		if(numeros[i]==0){
		encontrado = true;
			
		} 
			i--;
		}	
		if(encontrado) return i+1;
		else return -1;
		
	
}

	public static boolean todosPares(int[] numeros) {
		boolean encontradoImpar = false;
		for (int i = 0; i < numeros.length && !encontradoImpar; i++) {
			if(numeros[i] % 2 != 0){
				encontradoImpar = true;
			}
			
		}
		//if(encontradoImpar) return false;
		//else return true;
		return !encontradoImpar;
	}
	

	public static boolean esCreciente(int[] numeros) { //Buscamos solo el caso de que el numero anterior > el siguiente
													
		boolean enc = false; 	// enc es que no es creciente
		for (int i = 0; i < numeros.length - 1 && !enc; i++) {//length -1 porque el ultimo no tiene siguiente, si fuera creciente
			if(numeros[i] >= numeros[i+1]){
				enc = true;
			}
		}
		//if(enc) return false;
		//else return true;
		return !enc;
	}

	public static boolean hayAlMenosDosCeros(int[] numeros) {
		boolean encontrado = false;
		int j = 0; //contador
		
		for (int i = 0; i < numeros.length && !encontrado; i++) {
			
			if(numeros[i] == 0){
				j++;
			}
			if(j == 2){
			encontrado = true;
			}
		}
		return encontrado;
	}
		
		
		
	
	//comprobar.
	public static boolean haySoloUnCero(int[] numeros) {
		boolean encontrado = true;
		int j = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 0) {
				j++;
			}
			
			}
			if (j != 1){
			encontrado = false;

		}
		return encontrado;
	}
}
