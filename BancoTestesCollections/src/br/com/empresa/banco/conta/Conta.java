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
		return "\nSaldo R$: " + String.format("%.2f", this.getSaldo()) + " - Cliente: " + this.getNomeCliente() + " - Número: " + this.getNumero() + "\n";
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
}