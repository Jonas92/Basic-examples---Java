package br.com.empresa.banco;

import java.util.HashSet;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		HashSet<Conta> contas = new HashSet<>();
		Conta conta = new ContaCorrente();
		conta.setNumero(1);

		Conta conta2 = new ContaCorrente();
		conta2.setNumero(1);

		contas.add(conta);
		contas.add(conta2);

		System.out.println(contas);
		System.out.println(contas.size());
	}
}
