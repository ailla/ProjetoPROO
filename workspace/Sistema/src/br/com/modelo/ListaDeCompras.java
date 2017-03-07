package br.com.modelo;
import java.util.ArrayList;

import java.util.Scanner;
import br.com.exception.*;
import br.com.exception.SemComprasException;

public class ListaDeCompras {
	static ArrayList <Produto> compras = new ArrayList <Produto>();
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
				Camiseta camisa = Camiseta.adicionarCamiseta();
				System.out.println("Quantas camisetas você deseja adicionar?");
				int quantidade = scan.nextInt();
				for(int i=0;i<quantidade;i++){
					compras.add(camisa);
				}
				System.out.println("Produto adicionado!");
				break;
			case(2):
				Calça calça = Calça.adicionarCalça();
				System.out.println("Quantas calça você deseja adicionar?");
				int quant = scan.nextInt();
				for(int i=0;i<quant;i++){
					compras.add(calça);
				}
				System.out.println("Produto adicionado!");
				break;
			case(3):
				Vestido vestido = Vestido.adicionarVestido();
				System.out.println("Quantos vestidos você deseja adicionar?");
				int quantidades = scan.nextInt();
				for(int i=0;i<quantidades;i++){
					compras.add(vestido);
				}
				System.out.println("Produto adicionado!");
				break;
			case(4):
				Bolsa bolsa = Bolsa.adicionarBolsa();
				System.out.println("Quantas bolsas você deseja adicionar?");
				int qt = scan.nextInt();
				for(int i=0;i<qt;i++){
					compras.add(bolsa);
				}
				System.out.println("Produto adicionado!");
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
	static void listarProdutos(){
		for(int i = 0; i < compras.size(); i++){
			System.out.println("Produto "+ (i+1));
			System.out.println("Nome do Produto: " + compras.get(i).getNomeProduto());
			System.out.println("Valor do produto: " + compras.get(i).getValorProduto());
			System.out.println("Tamanho do Produto: " + compras.get(i).getTamanhoProduto());
			System.out.println("Código do Produto: " + compras.get(i).getCodigoProduto());
			System.out.println("Cor do Produto: " + compras.get(i).getCorProduto());
			System.out.println("\n");
		}
	}
	static void removerProdutos(){
		listarProdutos();
		System.out.println("Qual produto você deseja retirar?");
	}
	static double finalizarCompra(){
		double valorFinal=0;
		if(compras.isEmpty()){
			try {
				throw new SemComprasException();
			} catch (SemComprasException e) {
			}
		} else {
			for(int g = 0; g < compras.size(); g++){
				valorFinal+= compras.get(g).getValorProduto();
			}
			System.out.println("O valor total de suas compras deu : R$ " + valorFinal);
		} return valorFinal;
	}
	public static void main (String [] args){
		adicionarProdutos();
		listarProdutos();
		finalizarCompra();
	}
}