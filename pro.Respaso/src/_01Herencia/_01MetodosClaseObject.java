package _01Herencia;

public class _01MetodosClaseObject {

	public static void main(String[] args) {
		MiClase mc = new MiClase();
		System.out.println("mc: " + mc);
		System.out.println("toString(): " + mc.toString());
		System.out.println("hashCode(): " + mc.hashCode());
		System.out.println("getClass(): " + mc.getClass());
		System.out.println("equals(): " + mc.equals(mc));
	}

}
