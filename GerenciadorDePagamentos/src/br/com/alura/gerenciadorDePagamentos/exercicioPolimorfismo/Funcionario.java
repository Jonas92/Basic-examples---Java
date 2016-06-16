package br.com.alura.gerenciadorDePagamentos.exercicioPolimorfismo;

public class Funcionario implements Colaborador {

	private double salario;
	private double bonus;

	public double getSalario() {
		return salario;
	}

	public double getBonus() {
		return bonus;
	}

	private void depositaNaConta(double totalDeVencimentos) {}

	@Override
	public void receberVencimentosTotais() {
		depositaNaConta(salario + bonus);
	}

}
