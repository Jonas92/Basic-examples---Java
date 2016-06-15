package br.com.empresa.lendoArquivos;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LendoDeArquivoExterno {
	public static void main(String[] args) throws IOException {
//		InputStream is = new FileInputStream("arquivo.txt");
//		InputStreamReader isr = new InputStreamReader(is);
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(("arquivo.txt"))));
				
		String linha;

		do {
			linha = br.readLine();
			if (linha != null) {
				System.out.println(linha);	
			}
			
		} while (linha != null);
		
		br.close();
	}
}
