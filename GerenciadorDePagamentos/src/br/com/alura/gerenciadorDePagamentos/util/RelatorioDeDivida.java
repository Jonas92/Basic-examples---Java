package br.com.alura.gerenciadorDePagamentos.util;

import java.text.NumberFormat;

import br.com.alura.gerenciadorDePagamentos.model.Divida;

public class RelatorioDeDivida {

	private Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formato) {
		System.out.println("Credor: " + divida.getCredor());
		System.out.println("CNPJ: " + divida.getDocumentoCredor());
		System.out.println("Valor total: " + formato.format(divida.getTotal()));
		System.out.println("Valor à pagar: " + formato.format(divida.valorAPagar()));
	}

}
