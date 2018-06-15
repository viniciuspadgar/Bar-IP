package interfaces;

import classesbasicas.Pessoa;
import exceptions.PessoaJaCadastradaException;
import exceptions.PessoaNaoEncontradaException;

public interface repositorioPessoa {

	void inserir(Pessoa pessoa) throws PessoaJaCadastradaException;
	void remover(String id) throws PessoaNaoEncontradaException;
	boolean existe (String id);	
	Pessoa procurar(String id) throws PessoaNaoEncontradaException;
	void atualizar(Pessoa pessoaAtualizada) throws PessoaNaoEncontradaException;
	
	
}
