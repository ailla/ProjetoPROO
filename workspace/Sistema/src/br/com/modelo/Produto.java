package br.com.modelo;

import java.util.InputMismatchException;

import br.com.exception.ValorInvalidoException;

public abstract class Produto {
	private String nomeProduto;
	private double valorProduto;
	private String tamanhoProduto;
	private String codigoProduto;
	private String corProduto;
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getTamanhoProduto() {
		return tamanhoProduto;
	}
	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getCorProduto() {
		return corProduto;
	}
	public void setCorProduto(String corProduto) {
		this.corProduto = corProduto;
	}
	public Produto(String nomeProduto, double valorProduto, String tamanhoProduto, String codigoProduto, String corProduto) {
		this.nomeProduto = nomeProduto;
		try{
			this.valorProduto = valorProduto;
		} catch(InputMismatchException e){
			System.out.println("Digite um tipo v�lido para o pre�o!");
			System.out.println("Separe as casas decimais com v�rgula!");
		}
		this.tamanhoProduto = tamanhoProduto;
		this.codigoProduto = codigoProduto;
		this.corProduto = corProduto;
	}
}