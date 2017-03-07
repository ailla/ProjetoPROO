package br.com.modelo;
import java.util.Locale;
import java.util.Scanner;
public class Calça extends Produto{
	public Calça(String nomeProduto, double valorProduto, String tamanhoProduto, String codigoProduto, String corProduto){
		super(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
	}
	public static Calça adicionarCalça(){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		String nomeProduto;
		double valorProduto;
		String tamanhoProduto;
		String codigoProduto;
		String corProduto;
		System.out.println("Qual o nome da calça?");
		nomeProduto = scan.nextLine();
		System.out.println("Qual o valor da calça?");
		valorProduto = scan.nextDouble();
		System.out.println("Qual o tamanho da calça?");
		tamanhoProduto = scan.next();
		System.out.println("Qual o código da calça?");
		codigoProduto = scan.next();
		System.out.println("Qual a cor da calça?");
		corProduto = scan.next();
		Calça calça = new Calça(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
		return calça;
	}
}