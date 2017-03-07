package br.com.modelo;
import java.util.Locale;
import java.util.Scanner;
public class Cal�a extends Produto{
	public Cal�a(String nomeProduto, double valorProduto, String tamanhoProduto, String codigoProduto, String corProduto){
		super(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
	}
	public static Cal�a adicionarCal�a(){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		String nomeProduto;
		double valorProduto;
		String tamanhoProduto;
		String codigoProduto;
		String corProduto;
		System.out.println("Qual o nome da cal�a?");
		nomeProduto = scan.nextLine();
		System.out.println("Qual o valor da cal�a?");
		valorProduto = scan.nextDouble();
		System.out.println("Qual o tamanho da cal�a?");
		tamanhoProduto = scan.next();
		System.out.println("Qual o c�digo da cal�a?");
		codigoProduto = scan.next();
		System.out.println("Qual a cor da cal�a?");
		corProduto = scan.next();
		Cal�a cal�a = new Cal�a(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, corProduto);
		return cal�a;
	}
}