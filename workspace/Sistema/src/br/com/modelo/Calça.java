package br.com.modelo;
import java.util.Scanner;
import br.com.exception.*;

public class Cal�a extends Produto{
	private String tipoCal�a;
	private void tipoDeCal�a(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Que tipo de cal�a voc� deseja adicionar?");
		System.out.println("1- Skinny");
		System.out.println("2- Saruel");
		System.out.println("3- Slim");
		System.out.println("4- Reta");
		int op = scan.nextInt();
		switch(op){
			case(1):
				tipoCal�a="Skinny";
			case(2):
				tipoCal�a="Saruel";
			case(3):
				tipoCal�a="Slim";
			case(4):
				tipoCal�a="Reta";
			default:
				System.out.println("Tipo de cal�a inv�lido!");
		}
	}
	private Cal�a(String nomeProduto, double valorProduto, String tamanhoProduto, String codigoProduto, String tipoCal�a, String corProduto) {
		Cal�a cal�a = new Cal�a (nomeProduto, valorProduto, tamanhoProduto, codigoProduto, tipoCal�a, corProduto);
	}
	public void adicionarCal�a(){
		Scanner scan = new Scanner(System.in);
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
		tamanhoProduto = scan.nextLine();
		System.out.println("Qual o c�digo da cal�a?");
		codigoProduto = scan.next();
		System.out.println("Qual a cor da cal�a?");
		corProduto = scan.nextLine();
		tipoDeCal�a();
		Cal�a cal�a = new Cal�a(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, tipoCal�a, corProduto);
	}
}