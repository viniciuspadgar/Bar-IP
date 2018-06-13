package interfaces;

import classesbasicas.Pessoa;

public interface repositorioPessoa {

	void inserir(Pessoa pessoa);
	void remover(String id);
	boolean existe (String id);	
	Pessoa procurar(String id);
	void atualizar(Pessoa pessoa, Pessoa pessoaAtualizada);
	
	
}
