package _03ejerciciosExpresionesLogicas;

/**
 * Sean 4 variables enteras
 * 		int m, j, p, v ;
 * que contienen respectivamente la edad de Miguel, Julio, Pablo y Vicente.
 * 
 * Expresar las siguientes afirmaciones utilizando operadores lógicos y relacionales 
 * Ejemplo Miguel es mayor de edad.
 * Solución: m >= 18
 * 
 * @author alumno
 *
 */
public class _01EjerciciosParaPracticarConExpresionesLogicasYRelacionales {

	public static void main(String[] args) {
		int m = 0, j = 0, p = 0, v = 0;
		
		// 1. Miguel es menor de edad.
		if (m < 18);
		
		// 2. Miguel es mayor que Julio.
		if (m > j);
		
		// 3. Miguel es el más viejo.
		if (m > j && m > p && m > v);
		
		// 4. Miguel es el más joven.
		if (m < j && m < p && m < v);
		
		// 5. Miguel no es el más joven.
		if (m > j || m > p || m > v);
		
		// 6. Miguel no es el más viejo.
		if (m < j || m < p || m < v);
		
		// 7. Alguno de ellos es mayor de edad.
		if (m >= 18 || j >= 18 || p >= 18 || v >= 18);
		
		// 8. Miguel y Julio son los más jóvenes.
		if (m < p && m < v && j < p && j < v);
		
		// 9. Entre todos tienen más de 100 años.
		if ((m + j + p + v) > 100);
		
		// 10. Entre Miguel y Julio suman más edad que Pablo.
		if ((m + j) > p);
		
		// 11. Entre Miguel y Julio suman más edad que Pablo y Vicente juntos.
		if ((m + j) > (p + v));
		
		// 12. Si los ordenamos por edades de menor a mayor, Julio es el segundo.
		if ((j < m && j < p) || (j < p && j < v) || (j < m && j < v));
		
		// 13. Si los ordenamos por edades de menor a mayor, Julio es el segundo y Pablo el
		// tercero.
		if (((j < m && j < p) || (j < p && j < v) || (j < m && j < v)) && j < p && (p < v || p < m));
		
		// 14. Al menos uno de ellos es menor de edad.
		if (m < 18 || j < 18 || p < 18 || v < 18);
		
		// 15. Al menos dos de ellos son menores de edad.
		if ((m < 18 && j < 18) || (m < 18 && p < 18) || (m < 18 && v < 18) || (j < 18 && p < 18) || (j < 18 && v < 18) || (p < 18 && v < 18));
		
		// 16. Todos son menores de edad.
		if (m < 18 && j < 18 && p < 18 && v < 18);
		
		// 17. Solo dos de ellos son menores de edad.
		if ((m < 18 && j < 18 && p >= 18 && v >= 18) || (m < 18 && p < 18 && j >= 18 && v >= 18) || (m < 18 && v < 18 && p >= 18 && j >= 18) || (j < 18 && p < 18 && m >= 18 && v >= 18) || (j < 18 && v < 18 && p >= 18 && m >= 18) || (p < 18 && v < 18 && m >= 18 && j >= 18));
		
		// 18. Al menos dos de ellos nacieron el mismo año.
		if (m == j || m == p || m == v || j == p || j == v || p == v);
		
		// 19. Solo dos de ellos nacieron el mismo año.
		if ((m == j && p != m && v != m) || (m == p && j != m && v != m) || (m == v && p != m && j != m) || (j == p && v != j && m != j) || (j == v && p != j && m != j) || (p == v && j != p && m != p));
		
		// 20. Al menos uno de ellos es menor que Julio.
		if (m < j || v < j || p < j);
		
		// 21. Solo uno de ellos es menor que Julio.
		if ((m < j && p > j && v > j) || (v<j && p > j && m > j) || (p<j && m > j && v > j) );
		
		// 22. Miguel es mayor de edad y alguno de los otros es menor de edad.
		if (m >= 18 && (j < 18 || p < 18 || v < 18));

	}

}
