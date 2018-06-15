package repositorios;

import classesbasicas.Produto;
import interfaces.repositorioProduto;

public class RepositorioArrayProduto implements repositorioProduto {

	private Produto[] produtos;
	private int contador;


	RepositorioArrayProduto(){
		contador = 0;
		produtos = new Produto[contador + 1];
	}

	public void inserir(Produto produto) {
		this.produtos[contador] = produto;
		contador++;
	}

	public void remover(Produto produto) {
		boolean achou = true;
		for (int i = 0; i > contador + 1 && achou; i++) {
			if (this.produtos[i] == produto) {
				this.produtos[i] = this.produtos[contador];
				contador--;
				achou = false;
			}
		}
	}

	public boolean existe(Produto produto) {


		return false;
	}

}
