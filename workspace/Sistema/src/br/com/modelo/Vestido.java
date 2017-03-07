package br.com.modelo;

import java.util.Locale;
import java.util.Scanner;

public class Vestido extends Produto{
	public Vestido(String nomeProduto, double valorProduto, String tamanhoProduto, String codigoProduto, String corProduto){
		super(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
	}
	
	public static Vestido adicionarVestido(){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
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
		tamanhoProduto = scan.next();
		System.out.println("Qual o código do vestido?");
		codigoProduto = scan.next();
		System.out.println("Qual a cor do vestido?");
		corProduto = scan.next();
		Vestido vestidinho = new Vestido(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
		return vestidinho;
	}
}
