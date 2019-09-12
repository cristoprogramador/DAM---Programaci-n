package _03ejercicios._04CentroComercial;

/**
 * 4. Un centro comercial quiere mostrar cierta información sobre los televisores que 
vende. Los televisores pueden ser de dos tipos: de tubo o LCD. En concreto, de 
cada televisor le interesa mostrar 
• Marca (String) 
• Modelo (String) 
• Precio en euros 
• Pulgadas de la pantalla (double). 
• Resolución: La resolución se mide de forma distinta en los televisores de 
tubo que en los televisores LCD. 
• En los TV de tubo se mide en lineas. 
• En los TV LCD se mide pixels horizontales x pixels verticales. 
a) Diseñar la clase Televisor con los atributos y métodos comunes a los dos tipos 
de televisores y sus subclases TVTubo y TVLCD con los atributos y métodos 
que sea necesario: 
• Constructor de cada clase que permita inicializar todos los datos de la clase.
• equals: Dos televisiones son iguales si son de la misma marca y modelo.
• compareTo: Se considera menor (mayor) la de menor (mayor) marca. A 
igual marca, menor (mayor) la de menor (mayor) modelo.
• public String resulucion(): Devuelve un texto con la resolución del televisor, 
como por ejemplo “420 lineas” o “800 x 600 pixels” dependiendo del tipo 
de televisor.
• public String toString(): Devuelve un texto con la marca, modelo, precio, 
pulgadas y resolución.
b) Diseñar la clase TestTV para probar las clases diseñadas. Crear algunos objetos 
de las clases TVTubo y TVLCD y mostrarlos por pantalla. 
 * @author alumno
 *
 */
public abstract class Televisores implements Comparable<Televisores> {
	protected String marca;
	protected String modelo;
	protected double precio;
	protected double pulgadas;
	
	public Televisores (String marc, String model, double pvp, double pulga) {
		marca = marc;
		modelo = model;
		precio = pvp;
		pulgadas = pulga;
	}
	
	@Override
	public boolean equals (Object o) {
		if (!(o instanceof Televisores))return false;
		if (this == o)return true;
		Televisores t = (Televisores) o;
		return this.marca.equals(t.marca) && this.modelo.equals(t.modelo);
	}
	
	@Override
	public int compareTo (Televisores o) {
		if (this.marca.compareTo(o.marca) != 0) 
			return this.marca.compareTo(o.marca);
		else return this.modelo.compareTo(o.modelo);
	}
	
	@Override
	public String toString () {
		return "Marca: " + marca +
				"\nModelo: " + modelo + 
				"\nPrecio: " + precio + 
				"\nPulgadas: " + pulgadas +
				"\nResolucion: " + resolucion();
		
	}

	public abstract String resolucion();
}

