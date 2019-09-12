package ejercicio1;

public class TestEjercicio1 {
	public static void main(String[] args) {
		String [][] letras = {
							{"A","B","C","D","E"},
							{"F","G","H","I","J"},
							{"K","L","M","N","O"},
							};
		Ejercicio1.imprimirMargen(letras, Ejercicio1.SUPERIOR); 
		Ejercicio1.imprimirMargen(letras, Ejercicio1.INFERIOR);
		Ejercicio1.imprimirMargen(letras, Ejercicio1.IZQUIERDO);
		Ejercicio1.imprimirMargen(letras, Ejercicio1.DERECHO);
	}
}
