package br.com.exception;

public class QuantidadeInvalidaException extends Exception{

	public QuantidadeInvalidaException() {
		System.out.println("Quantidade insuficiente para ser adicionada!");
	}

}
