package _03ejercicios._04ListaDeEspera;

import java.util.LinkedList;

/**
 * 4. (paquete listaDeEspera) Deseamos mantener la lista de espera de pacientes de un hospital. Se 
 * quiere poder. Las listas de espera funcionan de la siguiente forma:
 * 
 * - Cuando se añade a alguien a la lista de espera, éste pasará a ser el último de la 
 * lista.
 * - Cuando el quirófano está libre, se atiende al primero de la lista y se le quita de la 
 * lista de espera, de forma que el segundo de la lista pasa a ser el primero y así 
 * sucesivamente…
 * 
 * a) Diseña la clase ListaEspera con un atributo que sea una Collection del tipo que estimes 
 * más conveniente para el tipo de organización que se ha descrito y la implementación 
 * de los siguientes métodos.
 * 
 * b) Añade los siguientes métodos:
 * - Constructor: Crea la lista de espera vacía.
 * 
 * - void ponerEnLista(String nombrePaciente): Añade a un paciente en la lista de 
 * espera.
 * 
 * - String atenderPaciente(): Atiende al primer paciente de la lista, de forma que lo 
 * elimina de la lista y devuelve el nombre del paciente atendido.
 * 
 * - boolean colarPaciente(String nombrePaciente): Atiende al paciente cuyo nombre 
 * se indica y lo quita de la lista de espera. Devuelve true si el paciente existía y false 
 * en caso contrario.
 * 
 * - toString(): Muestra a los pacientes de la lista.
 * 
 * c) Realiza un programa TestListaEspera para probar la clase del apartado anterior
 * 
 * @author alumno
 *
 */
public class ListaDeEspera {
	
	private LinkedList<String> lista;

	public ListaDeEspera(){
		lista = new LinkedList<>();
	}
	
	/**
	 * Añade un paciente al final de la lista
	 * de espera
	 * @param nombrePaciente
	 */
	public void ponerEnLista(String nombrePaciente) {
		lista.addLast(nombrePaciente);
	}
	
	/**
	 * Degvuelve el nombre del primer patciente y lo
	 * quita de la lista de espera
	 * @return
	 */
	public String atenderPaciente() {
		String paciente = lista.get(0);
		//String paciente = lista.getFirst();
		lista.remove(0);
		return paciente;
	}
	
	/**
	 * Quita de la lista al paciente cuyo nombre se indica
	 * @param nombre nombre del paciente a quitar
	 * @return ture si el paciente existe y false
	 * en caso contrario
	 */
	public boolean colarPaciente(String nombre) {
		int pos = lista.indexOf(nombre);
		if (pos == -1) {
			return false;
		} else {
			lista.remove(pos);
			return true;
		}
		
		//Otra opción con remove, mas corta y efectiva	
//		return lista.remove(nombre);
		
		//Otra opción pero mala elección por consumo de recursos
//		if (lista.contains(nombre)) {
//			boolean enc = false;
//			for(int i = 0; i< lista.size() && !enc; i++) {
//				if (lista.get(i) == nombre) {
//					lista.remove(i);
//					enc = true;
//				}					
//			}
//			return true;
//		}else
//			return false;
	}
	
	/**
	 * Devuelve un String con los paciente sde la lista
	 * @return Strign con los pacientes	
	 */
	@Override
	public String toString() {
		String listapacientes = "";
		for(String s: lista) {
			listapacientes += s+"\n";
		}
		return listapacientes;
	}
}	

