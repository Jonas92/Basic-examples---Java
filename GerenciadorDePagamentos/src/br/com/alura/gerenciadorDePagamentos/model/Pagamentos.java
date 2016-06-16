package br.com.alura.gerenciadorDePagamentos.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class Pagamentos implements Iterable<Pagamento> {

	private double valorPago;
	private Collection<Pagamento> pagamentosEfetuados = new ArrayList<>();

	public void registra(Pagamento pagamento) {
		double valor = pagamento.getValor();
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
		this.pagamentosEfetuados.add(pagamento);
	}

	public Collection<Pagamento> pagamentosAntesDe(Calendar data) {
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Collection<Pagamento> pagamentosDo(Documento documento) {
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getDocumentoDoPagador().equals(documento)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Collection<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public double getValorPago() {
		return valorPago;
	}

	@Override
	public Iterator<Pagamento> iterator() {
		return this.pagamentosEfetuados.iterator();
	}
}
