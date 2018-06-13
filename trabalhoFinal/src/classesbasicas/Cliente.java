package classesbasicas;

public class Cliente extends Pessoa {

	private String numeroCartao;
	private String mesa;
	private double saldo;

	public Cliente(String nome, String id, Integer idade, String numeroCartao, double saldo, String mesa){
		super(nome, id, idade);

		this.numeroCartao = numeroCartao;
		this.mesa = mesa;
		this.saldo = 0;

	}

	// Metodos

	public void creditar() {

	}

	public void comprar() {

	}

	public void escolherMusica() {

	}


}
