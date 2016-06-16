package br.com.alura.gerenciadorDePagamentos.exercicioPolimorfismo;

public class TestaColaborador {

	public static void main(String[] args) {

		Colaborador estagiario = new Estagiario();
		Colaborador auxiliarDeProducao = new Funcionario();
		Colaborador chefe = new Chefe();

		estagiario.receberVencimentosTotais();
		auxiliarDeProducao.receberVencimentosTotais();
		chefe.receberVencimentosTotais();
	}
}
