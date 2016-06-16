package br.com.empresa.banco.conta;
import br.com.empresa.banco.sistema.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public double atualizar(double taxa) {
		return this.saldo += this.saldo * taxa *2;  
	}

	@Override
	public double calcularTributos() {
		return this.saldo *= 0.01;	
	}
}
