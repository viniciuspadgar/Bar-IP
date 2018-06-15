package classesbasicas;

public class Venda {

	private Cliente comprador;
	private Funcionario vendedor;
	private Produto vendido;
	private String numero;

	Venda(Cliente comprador, Funcionario vendedor, Produto vendido, String numero){
	
	this.comprador = comprador;
	this.vendedor = vendedor;
	this.vendido = vendido;
	this.numero = numero;
		
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
	
	public Cliente getComprador(){
		return comprador;
	}
	
	public Produto getVendido(){
		return vendido;
	}
	
	public Funcionario getVendedor(){
		return vendedor;
	}
	
	public void setNumero(String numero){
		 this.numero = numero;
	}
	
	public String getNumero(){
		return numero;
	}
	
}