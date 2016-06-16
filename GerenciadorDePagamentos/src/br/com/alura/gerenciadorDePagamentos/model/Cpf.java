package br.com.alura.gerenciadorDePagamentos.model;

public class Cpf implements Documento {

	private String valor;

	public Cpf(String valor) {
		this.valor = valor;
	}

	@Override
	public boolean ehValido() {
		return true;
	}

	@Override
	public String getValor() {
		return valor;
	}

}
