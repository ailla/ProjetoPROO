package br.com.modelo;

import java.util.Scanner;

public class Camiseta extends Produto{
	public Camiseta(String nomeProduto, double valorProduto, String tamanhoProduto, String codigoProduto, String corProduto){
		super(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
	}
	static  Camiseta adicionarCamiseta(){
		Scanner scan = new Scanner(System.in);
		String nomeProduto;
		double valorProduto;
		String tamanhoProduto;
		String codigoProduto;
		String corProduto;
		System.out.println("Qual o nome da camiseta?");
		nomeProduto = scan.nextLine();
		System.out.println("Qual o valor da camiseta?");
		valorProduto = scan.nextDouble();
		System.out.println("Qual o tamanho da camiseta?");
		tamanhoProduto = scan.next();
		System.out.println("Qual a cor da camiseta?");
		corProduto = scan.next();
		System.out.println("Qual o código da camiseta?");
		codigoProduto = scan.next();
		Camiseta camiseta = new Camiseta(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
		return camiseta;
	}
}
