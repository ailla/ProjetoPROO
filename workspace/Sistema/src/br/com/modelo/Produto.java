package br.com.modelo;

public abstract class Produto {
	private String nomeProduto;
	private double valorProduto;
	private char tamanhoProduto;
	private String codigoProduto;
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
	public char getTamanhoProduto() {
		return tamanhoProduto;
	}
	public void setTamanhoProduto(char tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
}