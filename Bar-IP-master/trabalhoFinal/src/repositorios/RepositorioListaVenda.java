package repositorios;
import classesbasicas.Venda;
import interfaces.repositorioVenda;

public class RepositorioListaVenda implements repositorioVenda {
	
	private Venda venda;
	private RepositorioListaVenda next;
	
	RepositorioListaVenda(){
		this.venda = null;
		this.next = null;
	}

	public void inserir(Venda venda) {
		if (this.venda == null) {
			this.venda = venda;
			this.next = new RepositorioListaVenda();
		} else {
			this.next.inserir(venda);
		}
	}

	public void remover(Venda venda) {
		if (this.venda.getNumero().equals(venda.getNumero())) {
			this.venda = this.next.venda;
			this.next = this.next.next;
		} else if (this.next.venda != null) {
			this.next.remover(venda);
		} else {
			//throw Exception
		}
		
	}
	
	 public boolean existe(String numero) { 
		 if(this.venda != null && this.venda.getNumero().equals(numero)) {
			 return true;
		 } else if (this.venda == null) {
			 return false;
		 } else {
	        return this.next.existe(numero);
	 }
	
}
}