package br.com.empresa.banco.conta;

public abstract class Conta {

	protected double saldo;
	protected int numero;
	private String NomeCliente;

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void depositar(double valor) throws ValorInvalidoException {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito efetuado com sucesso!");
		} else {
			throw new ValorInvalidoException("Valor inválido!");
		}

	}

	public abstract double atualizar(double taxa);

	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		return "Saldo R$ " + this.getSaldo();
	}

	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return compararPorNumeroDeConta(outraConta) && compararPorNomeCliente(outraConta);
	}

	private boolean compararPorNomeCliente(Conta outraConta) {
		return this.NomeCliente.equals(outraConta.NomeCliente);
	}

	private boolean compararPorNumeroDeConta(Conta outraConta) {
		return this.numero == outraConta.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNomeCliente(String nomeCliente) {
		this.NomeCliente = nomeCliente;
	}
	
	public String getNomeCliente() {
		return NomeCliente;
	}
}
