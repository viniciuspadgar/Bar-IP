package trabalhoFinal;

public abstract class Produto {
	private String codigo;
	private double preco;
	private String nome;
	private Integer estoque;

	public Produto(String codigo, double preco, String nome, Integer estoque){
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
		this.estoque = estoque;
	}

	public String getCodigo(){
		return codigo;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getEstoque(){
		return estoque;
	}
	
	public void setCodigo(String codigo){
		 this.codigo = codigo;
	}
	
	public void setPreco(double preco){
		 this.preco = preco;
	}
	
	public void setNome(String nome){
		 this.nome = nome;
	}

	public void setEstoque(int estoque){
		 this.estoque = estoque;
	}

	public void estocar(int qtd){
		this.estoque = this.estoque+qtd;
	}

	public void retirarEstoque(int qtd){
		this.estoque = this.estoque-qtd;
	}
	
}
