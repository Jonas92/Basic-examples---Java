package br.com.empresa.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaOrdenacao {
	public static void main(String[] args) throws ValorInvalidoException {
		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.setNumero(3);
		cp1.setNomeCliente("Jonas");
		
		ContaPoupanca cp2 = new ContaPoupanca();
		cp2.setNumero(1);
		cp2.setNomeCliente("João");
		
		ContaPoupanca cp3 = new ContaPoupanca();
		cp3.setNumero(2);
		cp3.setNomeCliente("Nadir");
		
		List<ContaPoupanca> contasPoupanca = new LinkedList<ContaPoupanca>();
		contasPoupanca.add(cp2);
		contasPoupanca.add(cp1);
		contasPoupanca.add(cp3);
		
		for (ContaPoupanca contaPoupanca : contasPoupanca) {
			contaPoupanca.depositar(new Random().nextDouble() * 100);
		}
		
		Collections.sort(contasPoupanca);
		
		System.out.println("Ordenada:");
		System.out.println(contasPoupanca);
		
		Collections.reverse(contasPoupanca);
		System.out.println("\n\nInvertida:");
		System.out.println(contasPoupanca);
		
		Collections.shuffle(contasPoupanca);
		System.out.println("\n\nEmbaralhada:");
		System.out.println(contasPoupanca);
		
		Collections.rotate(contasPoupanca, 1);
		System.out.println("\n\nRotacionada:");
		System.out.println(contasPoupanca);
		
	}
}
