package _02ejemplos._08ColeccionCuentas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TestColeccionCuentas {

	public static void main(String[] args) {
		ArrayList<CuentaEmail> l = new ArrayList<>();
		TreeSet<CuentaEmail> ts = new TreeSet<>();
		HashSet<CuentaEmail> hs = new HashSet<>();

		l.add(new CuentaEmail("miguel", "matisse.es"));
		l.add(new CuentaEmail("ana", "matisse.es"));
		l.add(new CuentaEmail("rosa", "matisse.es"));
		l.add(new CuentaEmail("rosa", "matisse.es"));
		System.out.println(l);
		System.out.println(l.contains(new CuentaEmail("miguel", "matisse.es")));
		
		ts.add(new CuentaEmail("miguel", "matisse.es"));
		ts.add(new CuentaEmail("ana", "matisse.es"));
		ts.add(new CuentaEmail("rosa", "matisse.es"));
		ts.add(new CuentaEmail("rosa", "matisse.es"));
		System.out.println(ts);
		System.out.println(ts.contains(new CuentaEmail("miguel", "matisse.es")));
		
		hs.add(new CuentaEmail("miguel", "matisse.es"));
		hs.add(new CuentaEmail("ana", "matisse.es"));
		hs.add(new CuentaEmail("rosa", "matisse.es"));
		hs.add(new CuentaEmail("rosa", "matisse.es"));
		System.out.println(hs);
		System.out.println(hs.contains(new CuentaEmail("miguel", "matisse.es")));

	}

}
