package br.com.alura.gerenciadorDePagamentos.exercicioPolimorfismo;

public class Estagiario implements Colaborador {

	private double bolsa;
	private double auxilio;

	public double getBolsa() {
		return bolsa;
	}

	public double getAuxilio() {
		return auxilio;
	}

	private void paga(double totalDeVencimentos) {}

	@Override
	public void receberVencimentosTotais() {
		paga(auxilio + bolsa);
	}
}
