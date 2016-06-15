package br.com.empresa.mains;

public class TesteSplit {
	public static void main(String[] args) {
		String frase = "Tudo ao contrário";
		
		String[] invertendoFrase = frase.split(" ");
		
		for (int i = invertendoFrase.length - 1; i >= 0 ; i--) {
			System.out.print(invertendoFrase[i] + " ");
		}
	}
}
