package repositorios;
import interfaces.repositorioPessoa;
import classesbasicas.Pessoa;
import classesbasicas.Cliente;
import classesbasicas.Funcionario;
import exceptions.PessoaJaCadastradaException;
import exceptions.PessoaNaoEncontradaException;

public class RepositorioArrayPessoa implements repositorioPessoa {
	private Pessoa[] pessoas;
	private int contador;

	public RepositorioArrayPessoa() {
		this.pessoas = new Pessoa[100];
		this.contador = 0;
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

	public void atualizar(Pessoa pessoaAtualizada) {

		int indice = this.getIndice(pessoaAtualizada.getId());

		if(!(pessoaAtualizada.getNome() == null)) {

			this.pessoas[indice].setNome(pessoaAtualizada.getNome());

		}

		if(!(pessoaAtualizada.getIdade() == null)) {

			this.pessoas[indice].setIdade(pessoaAtualizada.getIdade());
		}

		if(pessoaAtualizada instanceof Cliente) {

			if(!(((Cliente)pessoaAtualizada).getNumeroCartao() == null)) {

				((Cliente)this.pessoas[indice]).setNumeroCartao(((Cliente)pessoaAtualizada).getNumeroCartao());

			}

			if(!(((Cliente)pessoaAtualizada).getMesa() == null)) {

				((Cliente)this.pessoas[indice]).setMesa(((Cliente)pessoaAtualizada).getMesa());

			}

			if(!(((Cliente)pessoaAtualizada).getSaldo() == -1.0)) {			//SETAR!!!!!!!!!!!!!!!!!!!! -1.0!!!!!!!!!!!!!!

				((Cliente)this.pessoas[indice]).setSaldo(((Cliente)pessoaAtualizada).getSaldo());

			}

		} else if(pessoaAtualizada instanceof Funcionario) {

			if(!(((Funcionario)pessoaAtualizada).getEmail() == null)) {

				((Funcionario)this.pessoas[indice]).setEmail(((Funcionario)pessoaAtualizada).getEmail());

			}

			if(!(((Funcionario)pessoaAtualizada).getTelefone() == null)) {

				((Funcionario)this.pessoas[indice]).setTelefone(((Funcionario)pessoaAtualizada).getTelefone());

			}

			if(!(((Funcionario)pessoaAtualizada).getGranaJuntada() == -1.0)) {			//SETAR!!!!!!!!!!!!!!!!!!!! -1.0!!!!!!!!!!!!!!

				((Funcionario)this.pessoas[indice]).setGranaJuntada(((Funcionario)pessoaAtualizada).getGranaJuntada());

			}

		}

	}
}