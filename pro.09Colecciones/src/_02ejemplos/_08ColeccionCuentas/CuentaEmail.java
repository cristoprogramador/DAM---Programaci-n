package _02ejemplos._08ColeccionCuentas;
/*
 * 						   -Requiere-
 * Arraylist
 * LinkedList ------------- equals
 * 
 * Treeset ---------------- Comparable
 * 
 * Hashset
 * LinkedHashset ---------- equals
 *                          hashCode
 */
public class CuentaEmail implements Comparable <CuentaEmail>{
	private String usuario;
	private String dominio;
	
	public CuentaEmail (String usuario, String dominio) {
		this.usuario = usuario;
		this.dominio = dominio;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof CuentaEmail)) return false;
		
		return this.dominio.equals(((CuentaEmail)o).dominio)
				&& this.usuario.equals(((CuentaEmail)o).usuario);		
	}
	
	@Override
	public int compareTo(CuentaEmail c){
		if(this.dominio.equals(c.dominio)){
			return this.usuario.compareTo(c.usuario);
		} else {
			return this.dominio.compareTo(c.dominio);
		}
	}
	
	@Override
	public int hashCode() {
//		return (usuario + "@" + dominio).hashCode();
		return toString().hashCode();
		
	}
	
	@Override
	public String toString() {
		return usuario+"@"+dominio;
	}
}
