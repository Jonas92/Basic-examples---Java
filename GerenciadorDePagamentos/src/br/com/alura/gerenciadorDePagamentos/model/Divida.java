package br.com.alura.gerenciadorDePagamentos.model;

public class Divida {
	private double total;
	private String credor;
	private Documento documentoCredor;
	private Pagamentos pagamentos = new Pagamentos();

	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public double getValorPago() {
		return this.pagamentos.getValorPago();
	}

	public double valorAPagar() {
		return this.total - this.pagamentos.getValorPago();
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public Documento getDocumentoCredor() {
		return documentoCredor;
	}

	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}

}
