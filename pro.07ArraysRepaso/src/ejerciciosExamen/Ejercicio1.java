package ejerciciosExamen;

public class Ejercicio1 {

	public static void main(String[] args) {
		int [] numeros = {1,2,4,3,5,7,9};
		System.out.println(soloHayUnPar(numeros));

	}
	
	public static boolean soloHayUnPar(int v[]) {
		int cont = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i]%2 == 0)cont++;
			if (cont > 1) return false;
		}
		if (cont == 1) return true;
		return false;
	}

}
