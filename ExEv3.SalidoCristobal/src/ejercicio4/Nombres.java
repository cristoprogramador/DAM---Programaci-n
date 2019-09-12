package ejercicio4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Nombres {
	public static void main(String[] args) {
		Set<String> nombres = new HashSet<>();
		Scanner f = null;
		DataOutputStream fs = null;

		try {
			f = new Scanner(new File("nombres.txt"));
			fs = new DataOutputStream(new FileOutputStream (new File ("nombres.bin")));
			
			while (f.hasNextLine()) {
				nombres.add(f.next().toUpperCase());
			}
			for(String s: nombres) {
				//System.out.println(s);
				fs.writeUTF(s);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error de apertura");
		} catch (IOException e) {
			System.out.println("Error de escritura");
		} finally {
			if(fs !=null && f !=null) {
				try {
					f.close();
					fs.close();
				} catch (IOException e) {
				}
			}
		}
		
	}

}
