package repositorios;
import classesbasicas.Pessoa;
import interfaces.repositorioPessoa;

public class RepositorioListaPessoa implements repositorioPessoa {

	private Pessoa pessoa;
	private RepositorioListaPessoa proximo;

	public RepositorioListaPessoa() {
		this.pessoa = null;
		this.proximo = null;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public RepositorioListaPessoa getProximo() {
		return proximo;
	}

	public void setProximo(RepositorioListaPessoa proximo) {
		this.proximo = proximo;
	}

	public void inserir(Pessoa pessoa) throws PessoaJaExisteException {
		if (!this.existe(pessoa.getId())) {
			if (this.proximo == null) {
				this.pessoa = pessoa;
				this.proximo = new RepositorioListaPessoa();
			} else {
				this.proximo.inserir(pessoa);
			}
		} else {
			throw new PessoaJaExisteException();
		}
	}

	public void remover(String id) throws PessoaNaoEncontradaException {
		if (this.existe(pessoa.getId())) {
			if (this.pessoa.getId().equals(id)) {
				this.pessoa = this.proximo.pessoa;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(id);
			}
		} else {
			throw new PessoaNaoEncontradaException();
		}
	}

	public void atualizar(Pessoa pessoa, Pessoa pessoaAtualizada) throws PessoaNaoEncontradaException {
		if (this.existe(pessoa.getId())) {
			if (this.pessoa.equals(pessoa)) {
				this.pessoa = pessoaAtualizada;
			} else {
				this.proximo.atualizar(pessoa, pessoaAtualizada);
			}
		} else {
			throw new PessoaNaoEncontradaException();
		}
	}

	public boolean existe(String Id) {
		boolean achou = false;
		if (this.pessoa != null) {
			if (this.pessoa.getId().equals(Id)) {
				achou = true;
			} else {
				this.proximo.existe(Id);
			}
		}
		return achou;
	}
	
	public Pessoa procurar(String Id) throws PessoaNaoEncontradaException {
		if (this.existe(Id)) {
			if (this.pessoa.getId().equals(Id)) {
				return this.pessoa;
			} else {
				return this.proximo.procurar(Id);
			}
		} else {
			throw new PessoaNaoEncontradaException();
		}
	}


}