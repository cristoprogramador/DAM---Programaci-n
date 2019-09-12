package interfaz;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

import excepciones.AlcoholHorarioIlegal;
import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;
import modelo.Catalogo;
import modelo.ExpendedoraMultiproducto;
import modelo.Producto;

public class TestExpendedoraMultiproductoTexto {

	public static Scanner tec;

	public static void main(String[] args) {
		tec = new Scanner(System.in).useLocale(Locale.US);
		
		//Creamos una expendedora que vende 10 botellas de agua a 0.70
		// y con 5 euros de cambio
		//Producto p = new Producto("AGUA_1.5L","Agua 1.5 litros",0.0,0.70,10);
		Producto[] p = { 
				new Producto("001","Agua 1.5 litros",0.0,0.70,10), 
				new Producto("002","Cerveza 33 cl", 5.0, 1, 10),
				new Producto("003","Cocacola 33 cl", 0, 1, 10), 
				new Producto("004","Naranjada 33 cl", 0, 1, 10),
				new Producto("005","Limonada 33 cl", 0, 1, 10), 
				new Producto("006","Agua Tonica 33 cl", 0, 1,10),
				};
		Catalogo c = new Catalogo(p);
		ExpendedoraMultiproducto exp = new ExpendedoraMultiproducto(20,c);
		
		//De forma repetitiva mostramos un menu al usuario, le dejamos elegir
		// una opcion y actuamos en consecuencia
		String[] opcionesMenu = {"Introducir dinero", "Solicitar devolucion", "Comprar producto", "Reponer producto", "Salir"};
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
			}
			
		} while(opcion != 5);
	}

	/**
	 * Muestra un menu con las opciones que se indican. Solicita al usuario
	 * que elija una opcion. Devuelve el numero de opcion que elije el usuario
	 * 
	 * @param opciones Array de String con las opciones que debe mostrar el menu
	 * @return El numero de opcion elegido por el usuario. Sera un valor entre 1 y 
	 * el tamanyo del arrayo opciones
	 */
	public static int menu(String[] opciones) {
		int opcion;
		//Bucle hasta que introduzca una opcion correcta
		do{
			//Mostramos las opciones del menu
			for (int i = 0; i < opciones.length; i++) {
				System.out.println("\t" + (i+1) + ": " + opciones[i] );
			}
			System.out.println();
			//El usuario elije una opcion
			System.out.print("Elija una opcion: ");
			opcion = leerInt();
			
			//Si la opcion es incorrecta, mensaje de error
			if(opcion < 1 || opcion > opciones.length){
				System.out.println("ERROR: Debe introducir una opcion entre 1 y " + opciones.length + "\n");
			}
		} while (opcion < 1 || opcion > opciones.length);
		return opcion;
	}

	/**
	 * Lee un entero de teclado. Es robusto a equivocos del usuario. Si el usuario
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
		//en el acaso de querer reducir stock, implementaremos una opción y un metodo 
		//adecuado para que realice esta función.
		return Math.abs(num);
	}

	/**
	 * Lee un numero double de teclado. Es robusto a equivocos del usuario. Si el usuario
	 * no introduce un numero, se vuelve a leer
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
	 * @param exp Maquina expendedora sobre la que se realiza la accion
	 */
	public static void introducirDinero(ExpendedoraMultiproducto exp) {
		System.out.println("=======================");
		System.out.println("== Introducir dinero ==");
		System.out.println("=======================");
		System.out.print("Que importe desea introducir? ");
		double importe = leerDouble();
		exp.introducirDinero(importe);
	}
	
	/**
	 * Muestra al usuario el listado de productos de la maquina expendedora recivida
	 * para que el usuario elija uno sobre el cual se realizar� la opci�n indicada en
	 * el men�
	 * @param exp Maquina expendedora sobre la que se realiza la accion
	 * @return devuelve el codigo del producto seleccionado por el usuario
	 */
	private static String listarProductos (ExpendedoraMultiproducto exp) {
		StringTokenizer tokens = new StringTokenizer(exp.getCatalogo().toString(), "\n");
		int productos = tokens.countTokens();
		String[]submenu= new String[productos];
		for(int i= 0; tokens.hasMoreTokens(); i++) {
			submenu[i]=tokens.nextToken();
		}
		int option = menu(submenu)-1;
		String code = submenu[option].substring(0, submenu[option].indexOf(" "));
		return code;
	}
	
	/**
	 * Acciones a realizar cuando el usuario elije comprar producto
	 * @param exp Maquina expendedora sobre la que se realiza la accion
	 */
	private static void comprarProducto(ExpendedoraMultiproducto exp) {
		System.out.println("\t============================================================");
		System.out.println("\t===================== Comprar producto =====================");
		System.out.println("\t============================================================");
		//Listamos los productos de la expededora para que el usuario seleccione uno
		String code = listarProductos(exp);
		System.out.println("Ha seleccionado: " +exp.getProducto(code).getNombre());		
		try {
			double cambio = exp.comprarProducto(code);
			mensajeYEsperar("Gracias por la compra. Su cambio: " + cambio + " euros");
		} catch (NoHayCambioException e1) {
			mensajeYEsperar("No hay cambio suficiente para devolverle. Introduzca importe exacto\n");
		} catch (NoHayProductoException e1) {
			mensajeYEsperar("Se ha agotado el producto. Disculpe las molestias");
		} catch (CreditoInsuficienteException e1) {
			mensajeYEsperar("Credito insuficiente. Debe introducir al menos " + exp.getProducto(code).getPrecio() + " euros");
		} catch (AlcoholHorarioIlegal e1) {
			mensajeYEsperar("Prohibida la venta de bebidas alcoh�licas de 22:00 a 9:00");
		}
	}
	/**
	 * Acciones a realizar cuando el usuario elije reponer producto
	 * @param exp Maquina expendedora sobre la que se realiza la accion.
	 */
	private static void reponerProducto(ExpendedoraMultiproducto exp) {
		System.out.println("\t============================================================");
		System.out.println("\t===================== Reponer Producto =====================");
		System.out.println("\t============================================================");
		String code = listarProductos(exp);
		System.out.println("Introduzca cantidad a reponer de " + exp.getProducto(code).getNombre() + ": ");
		int cant=leerInt();
		exp.reponerArticulo(exp.getProducto(code) , cant);
	}
	
	/**
	 * Acciones a realizar cuando el usuario elije solicitar devolucion del credito
	 * @param exp Maquina expendedora sobre la que se realiza la accion
	 */
	private static void solicitarDevolucion(ExpendedoraMultiproducto exp) {
		double credito = exp.getCredito();
		exp.solicitarDevolucion();
		mensajeYEsperar("Le devolvemos su dinero: " + credito + " euros");
	}
	
	/**
	 * Muestra por pantalla los datos relevantes de la expendedora que se recibe.
	 * @param exp Expendedora a mostrar.
	 */
	public static void mostrarEstado(ExpendedoraMultiproducto exp){
		System.out.println("\n\t================ Estado de la expendedora ===============");
		System.out.println(exp);
		System.out.println("\t=========================================================\n");
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
