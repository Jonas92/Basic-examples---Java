package br.com.empresa.lendoArquivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class BackupArquivoComClasseScanner {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(
				new FileInputStream(("arquivo.txt")));

		PrintStream printStream = new PrintStream("saida.txt");

		while (scanner.hasNextLine()) {
			printStream.println(scanner.nextLine());
		}
		
		printStream.println("Versão do doc: V");

		scanner.close();
		printStream.close();
	}
}
