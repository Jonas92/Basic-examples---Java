package br.com.alura.gerenciadorDePagamentos.exercicioPolimorfismo;

public class Chefe implements Colaborador {

	private double salarioBase;
	private double bonificacao;

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	private void depositaNaConta(double totalDeVencimentos) {}

	@Override
	public void receberVencimentosTotais() {
		depositaNaConta(salarioBase + bonificacao);
	}

}
