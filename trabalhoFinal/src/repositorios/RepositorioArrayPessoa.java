package repositorios;
import interfaces.repositorioPessoa;
import classesbasicas.Pessoa;
import exceptions.PessoaJaCadastradaException;
import exceptions.PessoaNaoEncontradaException;

public class RepositorioArrayPessoa implements repositorioPessoa {
	private Pessoa[] pessoas;
	private int contador;

	public RepositorioArrayPessoa() {
		pessoas = new Pessoa[100];
		contador = 0;
	}

	public void inserir(Pessoa pessoa) throws PessoaJaCadastradaException {
		if(!this.existe(pessoa.getId())) {
			this.pessoas[contador] = pessoa;
			if(this.contador >= this.pessoas.length) {
				Pessoa[] pessoasNovo = new Pessoa[2*this.pessoas.length];
				for(int i = 0; i < pessoasNovo.length; i++) {
					pessoasNovo[i] = this.pessoas[i];
				}
				this.pessoas = pessoasNovo;
			}
			this.contador++;
		} else {
			throw new PessoaJaCadastradaException();
		}

	}

	public void remover(String id) throws PessoaNaoEncontradaException {
		if (this.existe(id)) {
			this.pessoas[this.getIndice(id)] = this.pessoas[this.contador - 1];
			this.contador -= 1;
		} else {
			throw new PessoaNaoEncontradaException();
		}
	}

	public boolean existe(String id) {
		for (int i = 0; i < this.contador; i++) {
			if (this.pessoas[i].getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public Pessoa procurar(String id) throws PessoaNaoEncontradaException {
		return this.pessoas[this.getIndice(id)];
	}

	public int getIndice(String id) throws PessoaNaoEncontradaException {
		for (int i = 0; i < this.contador; i++) {
			if (this.pessoas[i].getId().equals(id)) {
				return i;
			}
		}
		throw new PessoaNaoEncontradaException();
	}

	
	// escrever o metodo atualizar
	
	public void atualizar(Pessoa pessoa, Pessoa pessoaAtualizada) {
		// TODO Auto-generated method stub
		
	}


}