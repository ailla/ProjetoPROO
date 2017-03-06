package br.com.modelo;
import java.util.Scanner;
import br.com.exception.*;

public class Calça extends Produto{
	private String tipoCalça;
	private void tipoDeCalça(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Que tipo de calça você deseja adicionar?");
		System.out.println("1- Skinny");
		System.out.println("2- Saruel");
		System.out.println("3- Slim");
		System.out.println("4- Reta");
		int op = scan.nextInt();
		switch(op){
			case(1):
				tipoCalça="Skinny";
			case(2):
				tipoCalça="Saruel";
			case(3):
				tipoCalça="Slim";
			case(4):
				tipoCalça="Reta";
			default:
				System.out.println("Tipo de calça inválido!");
		}
	}
	private Calça(String nomeProduto, double valorProduto, String tamanhoProduto, String codigoProduto, String tipoCalça, String corProduto) {
		Calça calça = new Calça (nomeProduto, valorProduto, tamanhoProduto, codigoProduto, tipoCalça, corProduto);
	}
	public void adicionarCalça(){
		Scanner scan = new Scanner(System.in);
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
		tamanhoProduto = scan.nextLine();
		System.out.println("Qual o código da calça?");
		codigoProduto = scan.next();
		System.out.println("Qual a cor da calça?");
		corProduto = scan.nextLine();
		tipoDeCalça();
		Calça calça = new Calça(nomeProduto, valorProduto, tamanhoProduto, codigoProduto, tipoCalça, corProduto);
	}
}