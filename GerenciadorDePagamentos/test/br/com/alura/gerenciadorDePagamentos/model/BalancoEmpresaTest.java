package br.com.alura.gerenciadorDePagamentos.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.gerenciadorDePagamentos.util.BancoDeDados;

public class BalancoEmpresaTest {

	private BalancoEmpresa balancoEmpresa;
	private String nome;
	private Cnpj cnpj;
	private double valorDaDivida;
	private Divida divida;
	private Pagamento pagamento;
	private ArmazenadorDeContas bancoDeDados;

	@Before
	public void inicializaTeste() {
		preparaDependenciasDoCenario();
		balancoEmpresa = new BalancoEmpresa(bancoDeDados);
	}

	@After
	public void finalizaTeste() {
		bancoDeDados.desconectar();
	}

	@Test
	public void criarDivida() {

		balancoEmpresa.registra(divida);

		Divida dividaPesquisada = balancoEmpresa.buscarDividaPor(cnpj);

		assertEquals(1, balancoEmpresa.getDividas().size());
		assertEquals(nome, dividaPesquisada.getCredor());
		assertEquals(cnpj, dividaPesquisada.getDocumentoCredor());
		assertEquals(valorDaDivida, dividaPesquisada.getTotal(), 0.00001);
	}

	@Test
	public void naoConseguePagarDividaComCnpjInexistente() {
		balancoEmpresa.registra(divida);

		Cnpj cnpjInvalido = new Cnpj("00000");

		pagamento.setDocumentoDoPagador(new Cnpj("83928392839"));
		pagamento.setPagador(nome);
		pagamento.setValor(valorDaDivida);

		balancoEmpresa.pagaDividaDo(cnpjInvalido, pagamento);

		Divida dividaInexistente = balancoEmpresa.buscarDividaPor(cnpjInvalido);
		Divida dividaCriada = balancoEmpresa.buscarDividaPor(cnpj);

		assertNull("Pagou uma dívida que não existia", dividaInexistente);
		assertEquals(0, dividaCriada.getValorPago(), 0.00001);
		assertEquals(1, balancoEmpresa.getDividas().size());
	}

	@Test
	public void pagarDividaValida() {
		int valorPrestacao = 50;

		balancoEmpresa.registra(divida);

		pagamento.setDocumentoDoPagador(new Cnpj("83928392839"));
		pagamento.setPagador(nome);
		pagamento.setValor(valorPrestacao);

		balancoEmpresa.pagaDividaDo(cnpj, pagamento);

		Divida divida = balancoEmpresa.buscarDividaPor(cnpj);

		assertEquals(1, balancoEmpresa.getDividas().size());
		assertEquals(valorPrestacao, divida.getValorPago(), 0.00001);
	}

	private void preparaDependenciasDoCenario() {

		bancoDeDados = new BancoDeDados();
		bancoDeDados.conectar();

		nome = "Jonas";
		cnpj = new Cnpj("19289182918");
		valorDaDivida = 1000;

		divida = new Divida();
		divida.setDocumentoCredor(cnpj);
		divida.setCredor(nome);
		divida.setTotal(valorDaDivida);

		pagamento = new Pagamento();

	}
}
