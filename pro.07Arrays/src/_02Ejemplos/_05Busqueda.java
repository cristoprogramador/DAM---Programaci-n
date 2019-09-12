package _02Ejemplos;

public class _05Busqueda {

	public static void main(String[] args) {
		int[] edad = {10,20,12,19,17,23,15,16};
		
		System.out.println(contarAdultos(edad));
		System.out.println(hayAdultos(edad));
	}
	
	
	/*------ RECORRIDO ------*/
	
	public static int contarAdultos(int v[]) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] >= 18) {
				cont++;
			}
		}
		
		return cont;
	}
	
	/*------ BUSQUEDA ------*/
	
	public static boolean hayAdultos(int v[]) {
		boolean encontrado = false;
		for (int i = 0; i < v.length && !encontrado; i++) {
			if(v[i] >= 18) {
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	public static boolean hayAdultos2 (int v[]) {
		
		/* SI USAR BOOLEAN */
		int i = 0;
		while (i < v.length && v[i] < 18) {
			i++;
		}
		
		if(i < v.length) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean hayAdultos3(int v[]) {
		
		for (int i = 0; i < v.length; i++) {
			if(v[i] >= 18) {
				return true;
			}
		}
		
		return false;
	}
}
