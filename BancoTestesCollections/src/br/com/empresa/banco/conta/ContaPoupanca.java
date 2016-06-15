package br.com.empresa.banco.conta;


public class ContaPoupanca extends Conta implements Comparable<Conta>{

	public void depositar(double valor) throws ValorInvalidoException {
		super.depositar(valor - 0.10);
	}

	@Override
	public double atualizar(double taxa) {
		return this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(Conta contaParam) {
//		return this.numero - contaParam.numero;
		return this.getNomeCliente().compareToIgnoreCase(contaParam.getNomeCliente());
	}
}
