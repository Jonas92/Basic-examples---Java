package br.com.empresa.banco.conta;


public class ValorInvalidoException extends Exception{

	public ValorInvalidoException(String msgDeErro){
		super(msgDeErro);
	}
}
