package br.com.alura.gerenciadorDePagamentos.model;

import java.util.Map;

public interface ArmazenadorDeContas {

	void gravar(Divida divida);

	Divida buscarPor(Documento documento);

	Map<Documento, Divida> recuperarTodas();

	void conectar();

	void desconectar();
}
