package br.com.modelo;

import java.util.ArrayList;
import java.util.Scanner;
import br.com.exception.*;

public class ProdutosDaLoja {
	static ArrayList <Produto> produtosExistentes = new ArrayList <Produto>();
	static void adicionarProdutos() {
		Scanner scan = new Scanner(System.in);
		int op=0;
		while(op!=5){
		System.out.println("\nQual produto você deseja adicionar?");
		System.out.println("1- Camiseta");
		System.out.println("2- Calça");
		System.out.println("3- Vestido");
		System.out.println("4- Bolsa");
		System.out.println("5- Sair");
		op = scan.nextInt();
		switch (op){
		case(1):
			produtosExistentes.add(Camiseta.adicionarCamiseta());
			break;
		case(2):
			produtosExistentes.add(Calça.adicionarCalça());
			break;
		case(3):
			produtosExistentes.add(Vestido.adicionarVestido());
			break;
		case(4):
			produtosExistentes.add(Bolsa.adicionarBolsa());
			break;
		case(5):
			break;
		default:
			try{
				throw new ProdutoInexistenteException();
			}catch(ProdutoInexistenteException e){
			} break;
		}
	}
	}
	static void removerProdutos(Produto produto,int quantidade){	
	}
	public static void main (String [] args){
		adicionarProdutos();
	}
}
