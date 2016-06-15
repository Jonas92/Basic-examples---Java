package br.com.empresa.banco;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaContas {
	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		try {
			cc.depositar(-100);
		} catch (ValorInvalidoException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
