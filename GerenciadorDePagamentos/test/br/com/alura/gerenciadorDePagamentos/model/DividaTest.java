package br.com.alura.gerenciadorDePagamentos.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DividaTest {

	@Test
	public void realizarPagamento() {
		int primeiraPrestacao = 100;

		Divida divida = new Divida();
		divida.setDocumentoCredor(new Cnpj("1212121212"));
		divida.setCredor("Jonas");
		divida.setTotal(300);

		Pagamento pagamento = new Pagamento();
		pagamento.setValor(primeiraPrestacao);

		divida.registra(pagamento);

		assertEquals(primeiraPrestacao, divida.getValorPago(), 0.00001);
	}

}
