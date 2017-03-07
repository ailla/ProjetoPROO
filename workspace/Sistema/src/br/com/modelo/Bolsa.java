package br.com.modelo;

import java.util.Locale;
import java.util.Scanner;

public class Bolsa extends Produto{
	public Bolsa(String nomeProduto, double valorProduto, String tamanhoProduto, String codigoProduto, String corProduto){
		super(nomeProduto,valorProduto, null, codigoProduto, corProduto);
	}
	public static Bolsa adicionarBolsa(){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		String nomeProduto;
		double valorProduto;
		String codigoProduto;
		String corProduto;
		System.out.println("Qual o nome da bolsa?");
		nomeProduto = scan.nextLine();
		System.out.println("Qual o valor da bolsa?");
		valorProduto = scan.nextDouble();
		System.out.println("Qual o código da bolsa?");
		codigoProduto = scan.next();
		System.out.println("Qual a cor da bolsa?");
		corProduto = scan.next();
		Bolsa bolsa = new Bolsa(nomeProduto, valorProduto, null, codigoProduto, corProduto);
		return bolsa;
	}
}
