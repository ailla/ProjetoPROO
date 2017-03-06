package br.com.modelo;

import java.util.Scanner;

public class Vestido {
	private Vestido(String nomeProduto, double valorProduto, String tamanhoProduto, String codigoProduto, String corProduto) {
		Vestido vestidinho = new Vestido(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
	}
	
	public void adicionarVestido(){
		Scanner scan = new Scanner(System.in);
		String nomeProduto;
		double valorProduto;
		String tamanhoProduto;
		String codigoProduto;
		String corProduto;
		System.out.println("Qual o nome do vestido?");
		nomeProduto = scan.nextLine();
		System.out.println("Qual o valor do vestido?");
		valorProduto = scan.nextDouble();
		System.out.println("Qual o tamanho do vestido?");
		tamanhoProduto = scan.nextLine();
		System.out.println("Qual o código do vestido?");
		codigoProduto = scan.next();
		System.out.println("Qual a cor do vestido?");
		corProduto = scan.nextLine();
		Vestido vestidinho = new Vestido(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
	}
}
