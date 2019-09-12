package modelo;

import java.util.ArrayList;

public class Catalogo{
	private static ArrayList<Producto> listaProductos;

	/**
	 * Constructor de objetos tipo Catalogo
	 * @param p Array de objetos tipo Producto que formarán parte del catalogo
	 */
	public Catalogo(Producto p[]) {
		listaProductos = new ArrayList<>();
		for (int i = 0; i < p.length; i++) {
			Catalogo.listaProductos.add(p[i]);
		}	
	}
	
	/**
	 * Metodo para buscar un producto del catalogo por su codigo
	 * @param codigo String con el codigo del producto a buscar
	 * @return objeto tipo producto con el mismo codigo recibido o 
	 * en caso de no existir, valor null
	 */
	public static Producto bucarProducto(String codigo) {
		Producto p = new Producto(codigo, "", 0,0,0);
		try {
		return listaProductos.get(listaProductos.indexOf(p));
		}catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	/**
	 * String con la lista de productos del catalogo
	 */
	@Override
	public String toString(){
		String lista = "";
		for (Producto p: listaProductos)
		lista += p.getCodigo() + " - " + p.getNombre() + "     \t- " + p.getAlcohol() + "% alc. - " + p.getPrecio() + " ï¿½ - " + p.getStock() + " uds.\n";
		return lista;
	}

}
