package test;

import java.util.List;

import model.Produto;
import repositorio.RepositorioProduto;

public class TestaInsereProduto {
	public static void main(String[] args) {
		RepositorioProduto repositorioProduto = new RepositorioProduto();
		
	/*	List<Produto> produtos = repositorioProduto.listarTodos();
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
		} */
		
		
	/*	Produto produto = repositorioProduto.obterPorId(2);
		produto.setNome("Beltrano");
		
		repositorioProduto.salvar(produto);
		
		System.out.println(produto.getNome());
		*/
		
		Produto produto = repositorioProduto.obterPorId(2);
		repositorioProduto.remover(produto);
		
	}
}
