package br.com.empresa.lendoArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackupArquivo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(("arquivo.txt"))));

		String linha;

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("saida.txt")));

		do {
			linha = br.readLine();
			if (linha != null) {
				bw.write(linha);
				bw.newLine();
			}

		} while (linha != null);
		
		bw.write("Versão do doc: IIII");

		br.close();
		bw.close();
	}
}
