package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class MostraConta {
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.setNumero(1);
		cc.setNomeCliente("Jonas");
		
		Conta cp = new ContaPoupanca();
		cp.setNumero(1);
		cp.setNomeCliente("Jonas");
		
		System.out.println(cc.equals(cp));
		
		System.out.println(cc == cp);
	}
}
