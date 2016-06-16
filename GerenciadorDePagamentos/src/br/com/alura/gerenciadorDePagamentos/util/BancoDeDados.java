package br.com.alura.gerenciadorDePagamentos.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import br.com.alura.gerenciadorDePagamentos.model.ArmazenadorDeContas;
import br.com.alura.gerenciadorDePagamentos.model.Divida;
import br.com.alura.gerenciadorDePagamentos.model.Documento;

public class BancoDeDados implements ArmazenadorDeContas {

	private Map<Documento, Divida> dividas = new HashMap<>();
	private boolean conectado;

	@Override
	public void gravar(Divida divida) {
		verificarConexao();
		System.out.println("Divida gravada!");
		dividas.put(divida.getDocumentoCredor(), divida);

	}

	@Override
	public Divida buscarPor(Documento documento) {
		verificarConexao();
		System.out.println("Dados retornados!");
		return dividas.get(documento);
	}

	@Override
	public Map<Documento, Divida> recuperarTodas() {
		verificarConexao();
		return Collections.unmodifiableMap(dividas);
	}

	@Override
	public void conectar() {
		System.out.println("Conectou...");
		conectado = true;
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectou...");
		conectado = false;
	}

	private void verificarConexao() {
		if (!conectado) {
			throw new RuntimeException("Banco não conectado!");
		}
	}
}
