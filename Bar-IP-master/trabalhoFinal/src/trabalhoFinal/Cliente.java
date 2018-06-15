package trabalhoFinal;

public class Cliente extends Pessoa {

	private String numeroCartao;
	private String mesa;
	private double saldo;
	private Integer fichas;
	
	public Cliente(String nome, String id, Integer idade, String numeroCartao, String mesa, Integer saldo, Integer fichas){
		super (nome, id, idade);
		
		this.numeroCartao = numeroCartao;
		this.mesa = mesa;
		this.saldo = 0;
		this.fichas = 0;
		
	}
	
	// Metodos
	
	public void creditar() {
		
	}
	
	public void comprar() {
		
	}
	
	public void escolherMusica() {
		
	}
	
	public void comprarFicha() {
		this.fichas = this.fichas + 1;
		this.saldo = this.saldo - 0.5;
		
	}
	
	
}
