package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaPerformance {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		int totalDeRegistros = 100000;
		String nomeDaEstrutura;
		Collection estrutura;		
		
		nomeDaEstrutura = "ArrayList";
		estrutura = new ArrayList<>();
		inserir(nomeDaEstrutura, estrutura, totalDeRegistros);
		pesquisar(nomeDaEstrutura, estrutura, totalDeRegistros);
		
		System.out.println("\n");
		
		nomeDaEstrutura = "Hashset";
		estrutura = new HashSet();
		inserir(nomeDaEstrutura, estrutura, totalDeRegistros);
		pesquisar(nomeDaEstrutura, estrutura, totalDeRegistros);
		
		System.out.println("\n");
		
		nomeDaEstrutura = "LinkedList";
		estrutura = new LinkedList<>();
		inserir(nomeDaEstrutura, estrutura, totalDeRegistros);
		pesquisar(nomeDaEstrutura, estrutura, totalDeRegistros);
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void inserir(String estruturaParaTeste, Collection collection, 
			int totalDeRegistros) {
		System.out.println("Iniciando "+ estruturaParaTeste +"...");
		Collection<Integer> teste = collection;
		long inicioInsercao = System.currentTimeMillis();

		for (int i = 0; i < totalDeRegistros; i++) {
			teste.add(i);
		}

		long fimInsercao = System.currentTimeMillis();
		long tempoInsercao = fimInsercao - inicioInsercao;
		System.out.println("Tempo para inserção: " + tempoInsercao);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void pesquisar(String estruturaParaTeste, Collection collection, 
			int totalDeRegistros) {
		Collection<Integer> teste = collection;
		long inicioPesquisa = System.currentTimeMillis();
		
		for (int i = 0; i < totalDeRegistros; i++) {
			teste.contains(i);
		}		
		
		long fimPesquisa = System.currentTimeMillis();
		long tempoPesquisa = fimPesquisa - inicioPesquisa;
		System.out.println("Tempo para pesquisa: " + tempoPesquisa);
	}
}
