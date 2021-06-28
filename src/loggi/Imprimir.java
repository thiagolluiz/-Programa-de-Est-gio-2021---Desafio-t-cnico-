package loggi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Imprimir {

	
	public static boolean Write(String Caminho, String Texto) {
		try {
			FileWriter arq = new FileWriter(Caminho, true );
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.println(Texto);
			gravarArq.close();
			return true;
		}catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}