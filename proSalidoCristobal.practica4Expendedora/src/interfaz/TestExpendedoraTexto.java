package interfaz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import excepciones.AlcoholHorarioIlegal;
import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;
import modelo.Expendedora;
import modelo.Producto;

public class TestExpendedoraTexto {

	public static Scanner tec;

	public static void main(String[] args) {
		tec = new Scanner(System.in).useLocale(Locale.US);
		
		//Creamos una expendedora que vende 10 botellas de agua a 0.70
		// y con 5 euros de cambio
		Producto p = new Producto("AGUA_1.5L","Agua 1.5 litros", 0.0, 0.70, 10);
		Expendedora exp = new Expendedora(5,p);
		
		//añadimos la captura de excepción propagada, para interactuar con
		//el ususario si no se ha podido cargar el archivo y hacemos llamada
		//al metodo cargarEstado
		try {
			exp.cargarEstado2();
			System.out.println("Estado de la máquina cargado de fichero");
		}catch (IOException e) {
			System.out.println("Estado de la maquina por defecto");
		}finally {
			
		}
		//De forma repetitiva mostramos un men� al usuario, le dejamos elegir
		// una opci�n y actuamos en consecuencia
		String[] opcionesMenu = {"Introducir dinero", "Solicitar devoluci�n", "Comprar producto", "Reponer producto", "Salir"};
		int opcion;
		do {
			opcion = menu(opcionesMenu);
			switch (opcion) {
			case 1:
				introducirDinero(exp);
				mostrarEstado(exp);
				break;
			case 2:
				solicitarDevolucion(exp);
				mostrarEstado(exp);
				break;
			case 3:
				comprarProducto(exp);
				mostrarEstado(exp);
				break;
			case 4:
				reponerProducto(exp);
				mostrarEstado(exp);
				break;
			case 5:
				System.out.println("Gracias por sus compras");
				//añadimos la captura de excepción propagada, para interactuar con
				//el ususario si no se ha podido grabar el archivo y hacemos llamada
				//al metodo grabarEstado.
				try {
					exp.grabarEstado2();
				} catch (IOException e) {
					System.out.println("No se ha podido grabar el estado");
				}
			}
			
		} while(opcion != 5);
	}


	/**
	 * Muestra un men� con las opciones que se indican. Solicita al usuario
	 * que elija una opci�n. Devuelve el n�mero de opci�n que elije el usuario
	 * 
	 * @param opciones Array de String con las opciones que debe mostrar el men�
	 * @return El n�mero de opci�n elegido por el usuario. Ser� un valor entre 1 y 
	 * el tama�o del arrayo opciones
	 */
	public static int menu(String[] opciones) {
		int opcion;
		//Bucle hasta que introduzca una opcion correcta
		do{
			//Mostramos las opciones del men�
			for (int i = 0; i < opciones.length; i++) {
				System.out.println("\t" + (i+1) + ": " + opciones[i] );
			}
			
			//El usuario elije una opcion
			System.out.print("Elija una opci�n: ");
			opcion = leerInt();
			
			//Si la opcion es incorrecta, mensaje de error
			if(opcion < 1 || opcion > opciones.length){
				System.out.println("ERROR: Debe introducir una opcion entre 1 y " + opciones.length + "\n");
			}
		} while (opcion < 1 || opcion > opciones.length);
		return opcion;
	}

	/**
	 * Lee un entero de teclado. Es robusto a equ�vocos del usuario. Si el usuario
	 * no introduce un entero, se vuelve a leer
	 * @return el entero introducido por el usuario.
	 */
	public static int leerInt(){
		int num = 0;
		boolean ok = false;
		while(!ok){
			try{
				num = tec.nextInt();
				ok = true;
			}catch (InputMismatchException e){
				System.out.println("Debe introducir un numero entero");
			} finally{
				tec.nextLine();
			}
		}
		//para evitar resultados ilogicos como -1 euros o aumentar stock en -x unidades
		//devolveremos el valor absoluto del numero entero introducido
		return Math.abs(num);
	}

	/**
	 * Lee un numero double de teclado. Es robusto a equ�vocos del usuario. Si el usuario
	 * no introduce un n�mero, se vuelve a leer
	 * @return el entero introducido por el usuario.
	 */
	public static double leerDouble(){
		double num = 0;
		boolean ok = false;
		while(!ok){
			try{
				num = tec.nextDouble();
				ok = true;
			}catch (InputMismatchException e){
				System.out.println("Debe introducir un numero");
			} finally{
				tec.nextLine();
			}
		}
		//para evitar resultados ilogicos como -.50 euros
		//devolveremos el valor absoluto del numero entero introducido
		return Math.abs(num);
	}
	
	/**
	 * Acciones a realizar cuando el usuario elije introducir dinero
	 * @param e Maquina expendedora sobre la que se realiza la acci�n
	 */
	public static void introducirDinero(Expendedora e) {
		System.out.println("=======================");
		System.out.println("== Introducir dinero ==");
		System.out.println("=======================");
		System.out.print("Que importe desea introducir? ");
		double importe = leerDouble();
		e.introducirDinero(importe);
	}
	
	/**
	 * Acciones a realizar cuando el usuario elije comprar producto
	 * @param e Maquina expendedora sobre la que se realiza la acci�n
	 */
	private static void comprarProducto(Expendedora e) {
		try {
			double cambio = e.comprarProducto();
			mensajeYEsperar("Gracias por la compra. Su cambio: " + cambio + " euros");
		} catch (NoHayCambioException e1) {
			mensajeYEsperar("No hay cambio suficiente para devolverle. Introduzca importe exacto\n");
		} catch (NoHayProductoException e1) {
			mensajeYEsperar("Se ha agotado el producto. Disculpe las molestias");
		} catch (CreditoInsuficienteException e1) {
			mensajeYEsperar("Credito insuficiente. Debe introducir al menos " + e.getPrecio() + " euros");
		} catch (AlcoholHorarioIlegal e1) {
			mensajeYEsperar("Prohibida la venta de bebidas alcoh�licas de 22:00 a 9:00");
		}
	}
	
	/**
	 * Acciones a realizar cuando el usuario elije reponer producto
	 * @param e Maquina expendedora sobre la que se realiza la acci�n
	 */
	private static void reponerProducto(Expendedora e) {
		System.out.println("======================");
		System.out.println("== Reponer Producto ==");
		System.out.println("======================");
		System.out.println("Introduzca cantidad a reponer de " + e.getProducto().getNombre() + ": ");
		int cant=tec.nextInt();
		e.reponerArticulo(e.getProducto() , cant);
	}
	
	/**
	 * Acciones a realizar cuando el usuario elije solicitar devoluci�n del cr�dito
	 * @param e Maquina expendedora sobre la que se realiza la acci�n
	 */
	private static void solicitarDevolucion(Expendedora e) {
		double credito = e.getCredito();
		e.solicitarDevolucion();
		mensajeYEsperar("Le devolvemos su dinero: " + credito + " euros");
	}
	
	/**
	 * Muestra por pantalla los datos relevantes de la expendedora que se recibe.
	 * @param e Expendedora a mostrar.
	 */
	public static void mostrarEstado(Expendedora e){
		System.out.println("\n================ Estado de la expendedora ===============");
		System.out.println(e);
		System.out.println("=========================================================\n");
	}
	
	/**
	 * Muestra un mensaje por pantalla y espera a que el usuario pulse INTRO
	 * para continuar.
	 * @param s Texto a mostrar.
	 */
	public static void mensajeYEsperar(String s){
		System.out.println("\n"+s);
		System.out.println("Pulse INTRO para continuar ...\n");
		tec.nextLine();
	}

}
