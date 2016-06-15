package br.com.empresa.mains;

public class TesteTrim {
	public static void main(String[] args) {
	
		String nomeComEspaco = " Jonas Medeiros Ferreira";
		
		System.out.println(nomeComEspaco);
		
		String nomeSemEspaco = nomeComEspaco.trim();
		
		System.out.println(nomeSemEspaco);
	}
}
