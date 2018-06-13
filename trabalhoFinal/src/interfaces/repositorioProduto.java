package interfaces;

import classesbasicas.Produto;
import classesbasicas.Produto;

public interface repositorioProduto {

	void inserir(Produto produto);
	void remover(Produto produto);
	boolean existe (Produto produto);	
	
}
