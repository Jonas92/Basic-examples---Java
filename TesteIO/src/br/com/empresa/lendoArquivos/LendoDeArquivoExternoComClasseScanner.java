package br.com.empresa.lendoArquivos;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LendoDeArquivoExternoComClasseScanner {
	public static void main(String[] args) throws IOException {
		
//		InputStream inputStream = new FileInputStream("arquivo.txt");
//		Scanner scanner = new Scanner(inputStream);
		
		Scanner scanner = new Scanner(new FileInputStream("arquivo.txt"));
		
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		scanner.close();
	}
}
