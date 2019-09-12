package modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

import excepciones.AlcoholHorarioIlegal;
import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;

public class Expendedora {
	
	// Cantidad de dinero introducido por el comprador para hacer frente a la
	// compra
	private double credito;

	// Cambio del que dispone la m�quina para devolver al comprador lo que le
	// sobra de la compra
	private double cambio;

	// Importe de las ventas realizadas
	private double importeVendido;

	// Producto que vende la expendedora.
	private Producto producto;
	
	// Calendario del sistema
	Calendar calendario = new GregorianCalendar();
	/**
	 * Crea una Expendedora con el cambio y producto indicados
	 * @param cambio Euros disponibles para devolver cambio
	 * @param producto El Producto que vende la m�quina
	 */
	public Expendedora(double cambio, Producto producto) {
		this.cambio = cambio;
		this.producto = producto;

		// El importe introducido por el comprador, inicialmente es cero.
		this.credito = 0;
		// El importe de las ventas realizadas, inicialmente es cero.
		this.importeVendido = 0;
	}

	public double getCredito() {
		return credito;
	}

	public int getStock() {
		return producto.getStock();
	}

	public double getPrecio() {
		return producto.getPrecio();
	}

	public double getCambio() {
		return cambio;
	}

	public double getImporteVendido() {
		return importeVendido;
	}
	
	public Producto getProducto() {
		return producto;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Credito: %.2f euros " + 
				"\nCambio: %.2f euros " + 
				"\nVentas: %.2f euros" + 
				"\nProducto: %s",
				credito, cambio, importeVendido, producto.toString());
	}

	/**
	 * El comprador introduce dinero en la m�quina para comprar.
	 * El importe introducido se agrega al credito.
	 * @param importe Cantidad introducida por el comprador.
	 */
	public void introducirDinero(double importe) {
		this.credito += importe;
	}

	/**
	 * El comprador quiere que se le devuelva el dinero sin hacer la compra
	 */
	public void solicitarDevolucion() {
		credito = 0;
	}
	
	/**
	 * Se ordena la compra de una unidad del producto.
	 * @return el importe que hay que devolver al comprador (el dinero que le sobra)
	 * @throws NoHayCambioException si no hay cambio suficiente para devolverle
	 * @throws NoHayProductoException si el producto est� agotado
	 * @throws CreditoInsuficienteException si no ha introducido suficiente dinero para poder comprar
	 * @throws AlcoholHorarioIlegal 
	 */
	public double comprarProducto() throws NoHayCambioException, NoHayProductoException, CreditoInsuficienteException, AlcoholHorarioIlegal {
		//Comprobamos si se puede hacer la venta
		double dineroADevolver = credito - producto.getPrecio();
		if (producto.getStock() == 0)
			throw new NoHayProductoException();
		else if (credito < producto.getPrecio())
			throw new CreditoInsuficienteException();
		else if (dineroADevolver > cambio)
			throw new NoHayCambioException();
		else if (producto.getAlcohol() != 0 && (calendario.get(Calendar.HOUR_OF_DAY) > 21 || calendario.get(Calendar.HOUR_OF_DAY) < 9))
			throw new AlcoholHorarioIlegal();
		else {
			//Realizamos la venta
			//El stock del producto comprado se reduce en 1 unidad
			producto.setStock(producto.getStock()-1);
			//El cr�dito pasa a ser cero
			credito = 0;
			//El importe de las ventas se incrementa en el precio de lo vendido
			importeVendido += producto.getPrecio();
			//El cambio 
			cambio = cambio - dineroADevolver;
			
			return dineroADevolver;
		}
	}
	
	/**
	 * Agrega la cantidad indicada al producto deseado
	 * @param p Producto del cual se va a incrementar el stock
	 * @param cant numero de unidades a incrementar el stock del producto
	 */
	public void reponerArticulo(Producto p, int cant) {
		p.setStock(p.getStock()+cant);
	}
	
	/**
	 * Guarda el estado de los datos en nuestro fichero de texto
	 * @throws FileNotFoundException 
	 */
	public void grabarEstado() throws FileNotFoundException{
		//No añadimos catch, para propagar la excepción y que el interface
		//sepa si se ha podido o no trabajar con el fichero
		PrintWriter f = null;
		try{
			f= new PrintWriter(new File("estado.txt"));
			f.println(producto.getCodigo());
			f.println(producto.getNombre());
			f.println(producto.getAlcohol());
			f.println(producto.getPrecio());
			f.println(producto.getStock());
			f.println(cambio);
			f.println(importeVendido);
		}finally {
			if (f!= null){
				f.close();
			}
		}
	}
	
	/**
	 * Guarda el estado de los datos en nuestro fichero Binario
	 * @throws FileNotFoundException 
	 */
	public void grabarEstado2() throws FileNotFoundException, IOException{
		//No añadimos catch, para propagar la excepción y que el interface
		//sepa si se ha podido o no trabajar con el fichero
		DataOutputStream f = null;
		try{
			f= new DataOutputStream(new FileOutputStream (new File("estado.txt")));
			f.writeUTF(producto.getCodigo());
			f.writeUTF(producto.getNombre());
			f.writeDouble(producto.getAlcohol());
			f.writeDouble(producto.getPrecio());
			f.writeInt(producto.getStock());
			f.writeDouble(cambio);
			f.writeDouble(importeVendido);
		}finally {
			if (f!= null){
				f.close();
			}
		}
	}
	
	/**
	 * Carga el estado de los datos en nuestro fichero de texto
	 * @throws FileNotFoundException 
	 */
	public void cargarEstado() throws FileNotFoundException, IOException{
		//No añadimos catch, para propagar la excepción y que el interface
		//sepa si se ha podido o no trabajar con el fichero
		Scanner f = null;
		try {
			f = new Scanner(new File("estado.txt")).useLocale(Locale.US);
			//necesitamos añadir el locale, por usar el punto en double
			String cod = f.nextLine();
			String n = f.nextLine();
			double a = f.nextDouble();
			double p = f.nextDouble();
			int s = f.nextInt();
			double c = f.nextDouble();
			double i = f.nextDouble();
			
			producto = new Producto(cod, n, a, p, s);
			cambio = c;
			importeVendido = i;
		}finally {
			if (f!= null) {
				f.close();
			}
		}
	}
	/**
	 * Carga el estado de los datos en nuestro fichero Binario
	 * @throws FileNotFoundException 
	 */
	public void cargarEstado2() throws FileNotFoundException, IOException{
		//No añadimos catch, para propagar la excepción y que el interface
		//sepa si se ha podido o no trabajar con el fichero
		DataInputStream f = null;
		try {
			f = new DataInputStream( new FileInputStream (new File("estado.txt")));
			//necesitamos añadir el locale, por usar el punto en double
			String cod = f.readUTF();
			String n = f.readUTF();
			double a = f.readDouble();
			double p = f.readDouble();
			int s = f.readInt();
			double c = f.readDouble();
			double i = f.readDouble();
			
			producto = new Producto(cod, n, a, p, s);
			cambio = c;
			importeVendido = i;
		}finally {
			if (f!= null) {
				f.close();
			}
		}
	}
}
