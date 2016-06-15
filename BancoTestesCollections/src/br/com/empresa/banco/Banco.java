package br.com.empresa.banco;

import java.util.List;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;

public class Banco {
	List<Conta> contas;
	private Map<String, Conta> contasMap;

	public void adicionar(Conta conta) {
		contas.add(conta);
		contasMap.put(conta.getNomeCliente(), conta);
	}

	public Conta pegar(int posicao) {
		return contas.get(posicao);
	}

	public int pegarQuantidadeDeContas() {
		return contas.size();
	}

	public Conta buscarPorNome(String nome) {
		return contasMap.get(nome);
	}
	
}
