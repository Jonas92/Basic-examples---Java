package br.com.empresa.lendoArquivos;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteEditorDeTexto {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		PrintStream printStream = new PrintStream("saida.txt");

		while (scanner.hasNextLine()) {
			
			printStream.println(scanner.nextLine());
		}

		printStream.println("Versão do doc: V - Digitada!");

		scanner.close();
		printStream.close();
	}
}
