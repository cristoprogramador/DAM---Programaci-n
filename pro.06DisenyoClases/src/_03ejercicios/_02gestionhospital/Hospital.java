package _03ejercicios._02gestionhospital;

import java.util.ArrayList;

/**
 * La clase Hospital contiene la información de las camas de un hospital, así
 * como de los pacientes que las ocupan. Un Hospital tiene un número máximo de
 * camas MAXC = 200 y para representarlas se utilizará un array (llamado
 * listaCamas) de objetos de tipo Paciente junto con un atributo (numLibres) que
 * indique el número de camas libres del hospital en un momento dado. El número
 * de cada cama coincide con su posición en el array de pacientes (la posición 0
 * no se utiliza), de manera que listaCamas[i] es el Paciente que ocupa la cama
 * i o es null si la cama está libre. Las operaciones de esta clase son:
 * 
 * @author Cristobal Salido
 *
 */
public class Hospital {
	// Atributos
	// final -- no pued cambiar de valor;
	// static -- será el mismo valor (bloque de memoria) para todos los objetos
	public final static int MAXC = 10;

	// los atributos se inicializan en el constructor (por normativa)
	private Paciente[] listaCamas;
	private int numLibres;

	/**
	 * Constructor de un hospital. Cuando se crea un hospital, todas las camas están
	 * libres.
	 */
	public Hospital() {
		listaCamas = new Paciente[MAXC + 1];
		numLibres = MAXC;
	}

	/**
	 * Consultor del número de camas libres
	 * 
	 * @return
	 */
	public int getNumLibres() {
		return numLibres;
	}

	/**
	 * Devuelve true si en el hospital hay camas libres y devuelve false en caso
	 * contrario.
	 * 
	 * @return
	 */
	public boolean hayLibres() {
		if (numLibres != 0)
			return true;
		return false;
	}

	/**
	 * Devuelve el número de la primera cama libre del array listaCamas si hay camas
	 * libres o devuelve un 0 si no las hay
	 * 
	 * @return
	 */
	public int primeraLibre() {
		boolean enc = false;
		if (hayLibres()) {
			for (int i = 1; i < this.listaCamas.length && !enc; i++) {
				if (listaCamas[i] == null) {
					enc = true;
					return i;
				}
			}
		}
		return 0;
	}
	
	/**
	 * Si hay camas libres, la primera de ellas (la de número menor)
	 * pasa a estar ocupada por el paciente de nombre n y edad e.
	 * Si no hay camas libres, lanza una excepción
	 * 
	 * @param n
	 * @param e
	 * @throws HospitalLlenoException
	 */
	public void ingresarPaciente(String n, int e) 
			throws HospitalLlenoException {
		if (hayLibres()) {
			listaCamas[primeraLibre()] = new Paciente(n,e);
			numLibres--;
		}
		else
			throw new HospitalLlenoException ("El hospital está lleno");
	}

	/**
	 * La cama i del hospital pasa a estar libre. 
	 * (Afectará al número de camas libres)
	 * 
	 * @param i
	 */
	private void darAltaPaciente(int i) {
		if (listaCamas != null) {
			listaCamas[i] = null;
			numLibres++;
		}
	}
	
	/**
	 * Se mejora el estado (método mejorar() de Paciente) de cada uno de los
	 * pacientes del hospital y a aquellos pacientes sanos (cuyo estado es 6)
	 * se les da el alta médica (invocando al método darAltaPaciente).
	 * 
	 */
	public void darAltas() {
		for (int i = 1; i < listaCamas.length-1; i++) {
			// Si en la cama hay un paciente
			if (listaCamas[i] != null) {
				// Mejoramos al paciente una unidad
				listaCamas[i].mejorar();
				// Si está curado lo damos de alta
				if (listaCamas[i].getEstado() >= 6)
					darAltaPaciente(i);
		}
		}
	}
	
	/**
	 * Devuelve un String con la información de las camas del hospital.
	 * Por ejemplo,
	 * 1 María Medina 30 4
	 * 2 Pepe Pérez 46 5
	 * 3 libre
	 * 4 Juan López 50 1
	 * 5 libre
	 * ...
	 * 200 Andrés Sánchez 29 3
	 *
	 */
	public String toString() {
		String res = "";
		for (int i = 1; i < listaCamas.length-1; i++) {
			if (listaCamas[i] == null) {
				res += i + " libre\n";
			}else{
			res += i + " " + listaCamas[i].toString() + "\n";
			}
		}
		return res;
	}

	

}
