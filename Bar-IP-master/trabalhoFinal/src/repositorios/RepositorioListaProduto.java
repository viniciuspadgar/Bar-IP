package repositorios;
import classesbasicas.Produto;
import interfaces.repositorioProduto;

public class RepositorioListaProduto implements repositorioProduto {
	
	private Produto produto;
	private RepositorioListaProduto next;
	
	RepositorioListaProduto(){
		this.produto = null;
		this.next = null;
	}

	public void inserir(Produto produto) {
		if (this.produto == null) {
			this.produto = produto;
			this.next = new RepositorioListaProduto();
		} else if (this.produto == produto) {
			//throw Exception produto ja inserido
		} else {
			this.next.inserir(produto);
		}
	}

	public void remover(Produto produto) {
		if (this.produto.getCodigo().equals(produto.getCodigo())) {
			this.produto = this.next.produto;
			this.next = this.next.next;
		} else if (this.next.produto != null) {
			this.next.remover(produto);
		} else {
			//throw Exception
		}
		
	}

	public boolean existe(Produto produto) {
		
		
		
		return false;
	}

	
	
}
