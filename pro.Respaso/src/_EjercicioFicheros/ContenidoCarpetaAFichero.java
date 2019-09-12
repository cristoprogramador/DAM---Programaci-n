package _EjercicioFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ContenidoCarpetaAFichero {
	/**
	 * Programa que: Solicete al ususario el nombre de una carpeta. Solicite al
	 * ususario en nombre de un archivo. Escriva en el fichero (de texto) lo que
	 * contiene la carpeta: 
	 * - Priemro el nombre de todas las subcarpetas, cada una en una linea 
	 * - Segundo, una linea de guiones"-----------" 
	 * - Tercero, el nombre de cada fichero y su tamaño (el nombre en una linea y el tamaño en
	 * otra)
	 * 
	 * Extra.- hacer una versión pero guardando en un fichero binario. (Nota.- en un
	 * fichero binario e concepto de linea no existe)
	 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta a explorar: ");
		String nombreCarpeta = tec.next();
		File carpeta = new File(nombreCarpeta);

		if (!carpeta.exists() || !carpeta.isDirectory()) {
			System.out.println("Nombre de carpeta incorrecto");
		} else {
			System.out.println("Nombre de fichero de salida: ");
			String nombreFichero = tec.next();
			PrintWriter fs = null;
			try {
				fs = new PrintWriter(new File(nombreFichero));
				//Escribir información en el fichero
				escribirInfoCarpeta(fs, carpeta);
			} catch (FileNotFoundException e) {
				System.out.println("Error de apertura");
			} finally {
				if (fs != null) {
					fs.close();
				}
			}

		}

	}
	
	public static void escribirInfoCarpeta (PrintWriter fs, File carpeta) {
		File[] contenido = carpeta.listFiles();
		//Carpetas
		for(File f: contenido) {
			if(f.isDirectory()) {
				fs.println(f.getName());
			}
		}
		fs.println("-----------------------");
		//Ficheros
		for (File f : contenido) {
			if (f.isFile()) {
				fs.println(f.getName());
				fs.println(f.length());
			}
		}
	}
}
