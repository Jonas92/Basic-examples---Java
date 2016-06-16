package br.com.alura.gerenciadorDePagamentos.model;

import java.util.Map;

public class BalancoEmpresa {

	private ArmazenadorDeContas armazenadorDeContas;

	public BalancoEmpresa(ArmazenadorDeContas bancoDeDados) {
		this.armazenadorDeContas = bancoDeDados;
	}

	public void registra(Divida divida) {
		armazenadorDeContas.gravar(divida);
	}

	public void pagaDividaDo(Documento documento, Pagamento pagamento) {
		Divida divida = armazenadorDeContas.buscarPor(documento);;

		if (divida != null) {
			divida.registra(pagamento);
			armazenadorDeContas.gravar(divida);
		}
		else {
			System.out.println("Este documento não possui dívidas registradas!");
		}
	}

	public Divida buscarDividaPor(Documento documento) {
		return armazenadorDeContas.buscarPor(documento);
	}

	public Map<Documento, Divida> getDividas() {
		return armazenadorDeContas.recuperarTodas();
	}
}
