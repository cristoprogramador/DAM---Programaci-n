package _02ejemplos;


/**
 * @author alumno
 *
 */
public class Tiempo implements Comparable{

	// Atributos: Son como variables que almacena el objeto.
	// Cada objeto tiene sus propios valores en los atributos.
	// Se definen fuera de los metodos.

	// SE definen PRIVATE. Algo PRIVATE solo es accesible desde la propia clase.

	private int hora;
	private int minuto;
	private int segundo;

	// Constructores: Son métodos a los que se llama para crear los objetos
	// de la clase.
	// Tienen el mismo nombre que la clase.
	// No devuelven nada, pero no se definen "void"
	// En realidad devuelve de manera automatica la dirección
	// de memoria del objeto que genera
	public Tiempo(int h, int m, int s) {
		if (h < 0 || m < 0 || s < 0 || h > 23 || m > 59 || s > 59) {
			throw new IllegalArgumentException("Valor fuera de rango");
		}
		hora = h;
		minuto = m;
		segundo = s;
	}

	public Tiempo(int h, int m) {
		// Otra foma de controlar que los valores sean correctos
		// mediante los metodos setters
		setHora(h);
		setMinuto(m);
		setSegundo(0);
	}

	// Metodos getter:Devuelven el valor de los atributos
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	// Metodos setter: Permiten cambiar el valor de los atributos
	public void setHora(int hora) {
		// Lanzamos una excepción propia en caso que la hora esté fuera de rango
		if (hora < 0 || hora > 23) {
			throw new IllegalArgumentException("Hora debe estar en [0,23]");
		}
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		// Lanzamos una excepción propia en caso que los minutos esté fuera de rango
		if (minuto < 0 || minuto > 59) {
			throw new IllegalArgumentException("Minutos debe estar en [0,59]");
		}
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		// Lanzamos una excepción propia en caso que los segundos estén fuera de rango
		if (segundo < 0 || segundo > 59) {
			throw new IllegalArgumentException("Segundos deben estar en [0,59]");
		}
		this.segundo = segundo;
	}

	// Metodo toString
	public String toString() { // No se pone static...actua en el objeto, no es estatico

		// return hora + ":" + minuto + ":" + segundo;
		return String.format("%02d", hora) + ":" + String.format("%02d", minuto) + ":" + String.format("%02d", segundo);
		// devuelve con un formato
	}
	
	//El metodo equals siempre ha de tener esta cabecera
	public boolean equals (Object o) {
		if (this == o)return true;//Cuando se compara el objeto consigo mismo
		if (!(o instanceof Tiempo)) return false;//Cuando "o" no es un Empleado
		
		//Si no hacemos el casting el objeto enviado   
		//lo tomará como un objeto de la clase original Object
		Tiempo t = (Tiempo) o; 
		//Esto, es lo mismo que...
//		if (this.hora == T.hora && this.minuto == T.minuto && this.segundo == T.segundo)
//			return true;
//		else return false;
		//Esto otro.
		return this.hora == t.hora 
				&& this.minuto == t.minuto 
				&& this.segundo == t.segundo;
	}
	
	public int compareTo (Object o) {
		if (this == o) return 0;	

		Tiempo t = (Tiempo) o;			
		if (this.hora == t.hora && this.minuto == t.minuto && this.segundo == t.segundo)return 0;
		else if (this.hora < t.hora)return -1;
		else if (this.hora > t.hora)return 1;
		else if (this.minuto < t.minuto)return -1;
		else if (this.minuto > t.minuto)return 1;
		else if (this.segundo < t.segundo)return -1;
		else return 1;			
		
	}
	
	
	public int toSegundos() {
		return hora*3600 + minuto*60 + segundo;
	}
	
	// Static está en la librería, pero no actua sobre los atributos del objeto
	// si no es estatic habría que crear un objeto para llamar al metodo
	// añadiendo static podemos llamarlo como Tiempo.fromSegundos
	public static Tiempo fromSegundos (int s) {
		int hh = s / 3600;
		int mm = s % 3600 / 60;
		int ss = s % 3600 % 60;
				
		Tiempo t = new Tiempo( hh, mm, ss);
		return t;
		
	}
}
