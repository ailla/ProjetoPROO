package br.com.exception;

public class ProdutoInexistenteException extends Exception{
	public ProdutoInexistenteException(){
		System.out.println("Produto inexistente! Tente adicionar novamente.");
	}

}
