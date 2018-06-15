package repositorios;

import classesbasicas.Venda;
//import exceptions.PessoaJaCadastradaException;
//import exceptions.PessoaNaoEncontradaException;
import interfaces.repositorioVenda;

public class RepositorioArrayVenda implements repositorioVenda {
	private Venda[] vendas;
	private int contador;

	public RepositorioArrayVenda() {
		this.vendas = new Venda[100];
		this.contador = 0;
	}

	public void inserir(Venda venda) throws PessoaJaCadastradaException {
		if(!this.existe(venda.getId())) {
			this.vendas[contador] = venda;
			if(this.contador >= this.vendas.length) {
				Venda[] vendasNovo = new Venda[2*this.vendas.length];
				for(int i = 0; i < vendasNovo.length; i++) {
					vendasNovo[i] = this.vendas[i];
				}
				this.vendas = vendasNovo;
			}
			this.contador++;
		} else {
			throw new PessoaJaCadastradaException();
		}

	}

	public void remover(String id) throws PessoaNaoEncontradaException {
		if (this.existe(id)) {
			this.vendas[this.getIndice(id)] = this.vendas[this.contador - 1];
			this.contador -= 1;
		} else {
			throw new PessoaNaoEncontradaException();
		}
	}

	public boolean existe(String id) {
		for (int i = 0; i < this.contador; i++) {
			if (this.vendas[i].getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public Venda procurar(String id) throws PessoaNaoEncontradaException {

		return this.vendas[this.getIndice(id)];
	}

	public int getIndice(String id) throws PessoaNaoEncontradaException {
		for (int i = 0; i < this.contador; i++) {
			if (this.vendas[i].getId().equals(id)) {
				return i;
			}
		}
		throw new PessoaNaoEncontradaException();
	}


	// escrever o metodo atualizar

	public void atualizar(Venda vendaAtualizada) throws PessoaNaoEncontradaException {
		int indice = this.getIndice(vendaAtualizada.getId());
		if(!(vendaAtualizada.getComprador() == null)) {
			this.vendas[indice].setComprador(vendaAtualizada.getComprador());
		}
		if(!(vendaAtualizada.getVendedor() == null)) {
			this.vendas[indice].setVendedor(vendaAtualizada.getVendedor());
		}
		if(!(vendaAtualizada.getVendido() == null)) {
			this.vendas[indice].setVendido(vendaAtualizada.getVendido());
		}

	}
}