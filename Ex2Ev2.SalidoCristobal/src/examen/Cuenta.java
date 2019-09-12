package examen;

public class Cuenta {
	public static int DEBIL = 0, NORMAL = 1, FUERTE = 2;
	private String usuario;
	private String dominio;
	private String password;
	private boolean admininstrador;

	public Cuenta(String usuario, String dominio, boolean administrador) {
		this.usuario = usuario;
		this.dominio = dominio;
		password = usuario;
		this.admininstrador = administrador;
	}

	public String toString() {
		String fortaleza = null;
		if (calcularFortaleza(password) == DEBIL)
			fortaleza = "Devil";
		else if (calcularFortaleza(password) == NORMAL)
			fortaleza = "Normal";
		else
			fortaleza = "Fuerte";

		if (admininstrador)
			return usuario + "@" + dominio + " (ADM) - FORTALEZA " + fortaleza;
		else
			return usuario + "@" + dominio + " - FORTALEZA " + fortaleza;
	}

	public static int calcularFortaleza(String pwd) {
		if (pwd.length() > 10 && pwd.matches(".*[0-9].*"))
			return FUERTE;
		else if (pwd.length() > 6 && pwd.matches(".*[0-9].*"))
			return NORMAL;
		else
			return DEBIL;

	}

	public void setPassword(String antigua, String nueva1, String nueva2) throws IllegalArgumentException {
		if (!password.equals(antigua))
			throw new IllegalArgumentException("Contraseña actual incorrecta");
		else if (!nueva1.equals(nueva2))
			throw new IllegalArgumentException("Las nuevas claves no coinciden");
		else if (admininstrador && calcularFortaleza(nueva1) != FUERTE)
				throw new IllegalArgumentException("La contraseña para el administrador ha de ser Fuerte");
		else password = nueva1;

	}
}
