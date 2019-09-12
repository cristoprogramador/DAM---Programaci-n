package coordenadas;

/**
 * Clase con metodos para calculo con coordenadas
 * 
 * @author Cristobal Salido
 *
 */
public class Coordenadas{
	
	/** Metodo para pasar de grados sexagesimales a decimales
	 * 
	 * @param gra grados sexagesimales 
	 * @param min minutos sexagesimales
	 * @param seg Segundos sexagesimales
	 * @return el equivalente en grados decimales de los grados sexagesimales introducidos
	 */
	public static double aDecimal(int gra, int min, double seg){
		return (gra +  min*(1/60.0) + seg*(1/3600.0));
	}
	
	
	/** Metodo para calcular la distancia en superficie de dos puntos en la tierra
	 *  dados su posiciones mediante su latitud y longitud en grados decimales
	 * 
	 * @param latitud1 latitud del punto uno en decimal
	 * @param longitud1 longitud del punto uno en decimal
	 * @param latitud2 latitud del punto dos en decimal
	 * @param longitud2 longitud del punto dos en decimal
	 * @return Distancia entre los dos puntos dados, en metros
	 */
	public static double distanciaEnSuperficie(double latitud1, double longitud1, double latitud2, double longitud2){
		//radio de la tierra de kilometros a metros
		final int radiotierra = 6371 * 1000;
		
		//Pasamos a radianes los grados sesagesimales con la clase Math.toRadians
		double latitudradian1 = Math.toRadians(latitud1);
		double longitudradian1 = Math.toRadians(longitud1);
		double latitudradian2 = Math.toRadians(latitud2);
		double longitudradian2 = Math.toRadians(longitud2);
		
		//Calculamos distancia con la formula de Harvesine
		//suma interna de la raiz cuadrada por partes
		//parte 1 de la suma
		double suma1 = Math.pow(Math.sin((latitudradian2 - latitudradian1)/2),2);
		//parte 2 de la suma
		double suma2 = Math.cos(latitudradian1) * Math.cos(latitudradian2) * Math.pow(Math.sin((longitudradian2 - longitudradian1)/2),2);
		//calculamos la formula completa
		double distancia = (2 * radiotierra)* Math.asin(Math.sqrt(suma1+suma2));
		//Devolvemos la distancia en metros
		return distancia;
	}
	
	
	/** Metodo para calcular la distancia entre dos puntos de la tierra teniendo
	 *  en cuenta su diferencia de altura.
	 *  NOTA.- este metodo utiliza el metodo distanciaEnSuperficie
	 * 
	 * @param latitud1 latitud del punto 1 en grados decimales
	 * @param longitud1 longitud del punto 1 en grados decimales
	 * @param altura1 Altura del punto 1 en metros
	 * @param latitud2 latitud del punto 2 en grados decimales
	 * @param longitud2 longitud del punto 2 en grados decimales
	 * @param altura2 altura del punto 2 en metros
	 * @return La distancia entre dos puntos en metros, teniendo en cuenta su diferencia de altura
	 */
	public static double distancia(double latitud1, double longitud1, double altura1, double latitud2, double longitud2, double altura2){
		//Gruadamos en la variable difAltura el valor absoluto de la diferencia de Altura
		double difAltura = Math.abs(altura1-altura2);
		
		//Llamamos al metodo distanciaEnSuperficie para allara la distancia lineal y la guardamos en la variable distancia
		double distancia = distanciaEnSuperficie(latitud1, longitud1, latitud2, longitud2);
		
		//Devolvemos la distancia con el factor altura mediante el calculo de la hypotenusa
		return Math.hypot(distancia, difAltura);
	}
}
