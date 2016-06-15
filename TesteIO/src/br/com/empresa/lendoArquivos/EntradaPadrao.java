package br.com.empresa.lendoArquivos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EntradaPadrao {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s;

		do {
			s = br.readLine();
			System.out.println(s);
		} while (s != null);

		br.close();
	}

}
