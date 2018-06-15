package classesbasicas;

public class Venda {
	private Cliente comprador;
	private Funcionario vendedor;
	private Produto vendido;
	private String id;

	Venda(Cliente comprador, Funcionario vendedor, Produto vendido, String id){
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.vendido = vendido;
		this.id = id;
	}

	public void setComprador(Cliente comprador){
		this.comprador = comprador;
	}

	public void setVendido(Produto vendido){
		this.vendido = vendido;
	}

	public void setVendedor(Funcionario vendedor){
		this.vendedor = vendedor;
	}
	
	public void setId(String id){
		this.id = id;
	}

	public Cliente getComprador(){
		return comprador;
	}

	public Produto getVendido(){
		return vendido;
	}

	public Funcionario getVendedor(){
		return vendedor;
	}

	public String getId(){
		return id;
	}

}