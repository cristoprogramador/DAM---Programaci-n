package coordenadas;

/**
 * Clase con metodos para calculo con coordenadas
 * 
 * @author Cristobal Salido
 *
 */
public class Coordenadas {

	/**
	 * Metodo para pasar de grados sexagesimales a decimales
	 * 
	 * @param gra
	 *            grados sexagesimales
	 * @param min
	 *            minutos sexagesimales
	 * @param seg
	 *            Segundos sexagesimales
	 * @return el equivalente en grados decimales de los grados sexagesimales
	 *         introducidos
	 */
	public static double aDecimal(int gra, int min, double seg) {
		return (gra + min * (1 / 60.0) + seg * (1 / 3600.0));
	}

	/**
	 * Metodo aDecimal sobrecargado que devuelve los grados decimales dados en un
	 * String del formato 00ª00'00"N con los grados Sexagesimales.
	 * 
	 * @param gradosSexagesimales
	 *            String que deve dar los grados sexagesimales con el formato
	 *            00ª00'00"N
	 * @return devuelve los grados en decimal
	 */
	public static double aDecimal(String gradosSexagesimales) {
		int grados = 0, minutos = 0;
		double segundos = 0;
		// Comprobamos el ultimo caracter, que nos da el punto cardinal e indica
		// si son
		// grados positivos o negativos
		String direccion = gradosSexagesimales.toUpperCase().substring(gradosSexagesimales.length() - 1);

		// Devolvemos 1000 si se cumplen las siguientes condiciones

		// Si algún valor es negativo
		if (gradosSexagesimales.indexOf("-") != -1)
			return 1000;
		// Si no está alguno de los tres signos (º,',")
		else if (gradosSexagesimales.indexOf("º") == -1 || gradosSexagesimales.indexOf("'") == -1
				|| gradosSexagesimales.indexOf('"') == -1)
			return 1000;
		// Si los signos no están en el orden correspondiente
		else if (gradosSexagesimales.indexOf("º") > gradosSexagesimales.indexOf("'")
				|| gradosSexagesimales.indexOf("º") > gradosSexagesimales.indexOf('"')
				|| gradosSexagesimales.indexOf("'") > gradosSexagesimales.indexOf('"'))
			return 1000;

		// Al comprobar en la interface si para latitud y longitud se introducen los
		// simbolos correctos de las correspontiente cardinalidades, esta condicion
		// seria redundante, no obstante la dejamos por ser funcion al metodo que
		// podria ser llamado desde otra interface sin dicha funcion

		// Si el signo cardinal no es N,S,E u O
		else if (direccion.compareTo("N") != 0 
				&& direccion.compareTo("S") != 0 
				&& direccion.compareTo("E") != 0
				&& direccion.compareTo("O") != 0)
			return 1000;

		// Convertimos los String a numeros, comprobamos los rangos y calculamos el
		// valor decimal

		// Segundos
		// Convertimos su valor String en numero real
		segundos = Double.parseDouble(
				gradosSexagesimales.substring(gradosSexagesimales.indexOf("'") + 1, gradosSexagesimales.indexOf('"')));
		// Si los segundos estan fuera de rango (igual o mayor a 60)
		// devolvemos 1000
		if (segundos >= 60)
			return 1000;

		// Minutos
		// Convertimos su valor String en numero entero
		minutos = Integer.parseInt(
				gradosSexagesimales.substring(gradosSexagesimales.indexOf("º") + 1, gradosSexagesimales.indexOf("'")));
		// Si los minutos estan fuera de rango (valor maximo 59) devolvemos
		// 1000
		if (minutos > 59)
			return 1000;

		// Grados
		// Convertimos su valor String en numero entero
		grados = Integer.parseInt(gradosSexagesimales.substring(0, gradosSexagesimales.indexOf("º")));
		// Si los grados de la latitud o la longitud están fuera de rango devolvemos
		// 1000
		// Para la latitud el numero maximo en grados sexagesimales es 90
		if ((direccion.compareTo("N") == 0 || direccion.compareTo("S") == 0) && grados > 90)
			return 1000;
		// Para la longitud el numero maximo en grados sexagesimales es 180
		else if ((direccion.compareTo("E") == 0 || direccion.compareTo("E") == 0) && grados > 180)
			return 1000;

		// Para la latitud el numero maximo en grados sexagesimales es 90º00'00"
		if ((direccion.compareTo("N") == 0 || direccion.compareTo("S") == 0) && grados == 90
				&& (minutos > 0 || segundos > 0))
			return 1000;
		// Para la longitud el numero maximo en grados sexagesimales es 180º00'00"
		else if ((direccion.compareTo("E") == 0 || direccion.compareTo("E") == 0) && grados == 180
				&& (minutos > 0 || segundos > 0))
			return 1000;

		// Hacemos el calculo final con lo valores obtenidos de los grados,
		// minutos y segundos
		// Si el punto cardinal es Norte u Oeste pasamos el valor a negativo
		if (direccion.compareTo("S") == 0 || direccion.compareTo("O") == 0)
			return -(grados + minutos * (1 / 60.0) + segundos * (1 / 3600.0));
		// Si no, pasamos el valor en positivo
		else
			return (grados + minutos * (1 / 60.0) + segundos * (1 / 3600.0));
	}

	/**
	 * Metodo para calcular la distancia en superficie de dos puntos en la tierra
	 * dados su posiciones mediante su latitud y longitud en grados decimales
	 * 
	 * @param latitud1
	 *            latitud del punto uno en decimal
	 * @param longitud1
	 *            longitud del punto uno en decimal
	 * @param latitud2
	 *            latitud del punto dos en decimal
	 * @param longitud2
	 *            longitud del punto dos en decimal
	 * @return Distancia entre los dos puntos dados, en metros
	 */
	public static double distanciaEnSuperficie(double latitud1, double longitud1, double latitud2, double longitud2) {
		// radio de la tierra de kilometros a metros
		final int radiotierra = 6371 * 1000;

		// Pasamos a radianes los grados sesagesimales con la clase
		// Math.toRadians
		double latitudradian1 = Math.toRadians(latitud1);
		double longitudradian1 = Math.toRadians(longitud1);
		double latitudradian2 = Math.toRadians(latitud2);
		double longitudradian2 = Math.toRadians(longitud2);

		// Calculamos distancia con la formula de Harvesine
		// suma interna de la raiz cuadrada por partes
		// parte 1 de la suma
		double suma1 = Math.pow(Math.sin((latitudradian2 - latitudradian1) / 2), 2);
		// parte 2 de la suma
		double suma2 = Math.cos(latitudradian1) * Math.cos(latitudradian2)
				* Math.pow(Math.sin((longitudradian2 - longitudradian1) / 2), 2);
		// calculamos la formula completa
		double distancia = (2 * radiotierra) * Math.asin(Math.sqrt(suma1 + suma2));
		// Devolvemos la distancia en metros
		return distancia;
	}

	/**
	 * Metodo para calcular la distancia entre dos puntos de la tierra teniendo en
	 * cuenta su diferencia de altura. NOTA.- este metodo utiliza el metodo
	 * distanciaEnSuperficie
	 * 
	 * @param latitud1
	 *            latitud del punto 1 en grados decimales
	 * @param longitud1
	 *            longitud del punto 1 en grados decimales
	 * @param altura1
	 *            Altura del punto 1 en metros
	 * @param latitud2
	 *            latitud del punto 2 en grados decimales
	 * @param longitud2
	 *            longitud del punto 2 en grados decimales
	 * @param altura2
	 *            altura del punto 2 en metros
	 * @return La distancia entre dos puntos en metros, teniendo en cuenta su
	 *         diferencia de altura
	 */
	public static double distancia(double latitud1, double longitud1, double altura1, double latitud2, double longitud2,
			double altura2) {
		// Gruadamos en la variable difAltura el valor absoluto de la diferencia
		// de
		// Altura
		double difAltura = Math.abs(altura1 - altura2);

		// Llamamos al metodo distanciaEnSuperficie para allara la distancia
		// lineal y la
		// guardamos en la variable distancia
		double distancia = distanciaEnSuperficie(latitud1, longitud1, latitud2, longitud2);

		// Devolvemos la distancia con el factor altura mediante el calculo de
		// la
		// hypotenusa
		return Math.hypot(distancia, difAltura);
	}
}
