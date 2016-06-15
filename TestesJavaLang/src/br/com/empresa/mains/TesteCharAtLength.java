package br.com.empresa.mains;

public class TesteCharAtLength {

	public static void main(String[] args) {
		String nome = "Jonas";
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		StringBuffer nomeSB = new StringBuffer(nome);
		
		System.out.println(nomeSB.reverse());
	}
}
