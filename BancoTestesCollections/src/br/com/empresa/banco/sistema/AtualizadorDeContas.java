package br.com.empresa.banco.sistema;
import br.com.empresa.banco.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		// aqui você imprime o saldo anterior
		System.out.println("Saldo anterior: R$ " + c.getSaldo());

		// atualiza a conta com a taxa selic,
		c.atualizar(this.selic);

		// depois imprime o saldo final
		System.out.println("Saldo final: R$ " + c.getSaldo());

		// lembrando de somar o saldo final ao atributo saldoTotal
		this.saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

}
