package classesbasicas;

import exceptions.EnderecoEmailInvalidoException;
import exceptions.NumeroTelefoneInvalidoException;

public class Funcionario extends Pessoa {

	//Atributos de Funcionarios
	
	private String email, telefone;
	private double granaJuntada;


	//Construtor de funcionarios
	public Funcionario(String nome, String id, String email, String telefone, Integer idade, double salario) throws EnderecoEmailInvalidoException, NumeroTelefoneInvalidoException {
		super (nome, id, idade);

		if(email.contains("@")) {
			this.email = email;

		} else {
			throw new EnderecoEmailInvalidoException();
		}

		if(telefone.length() == 9) {
			this.telefone = telefone;

		} else {
			throw new NumeroTelefoneInvalidoException();
		}

	}
	
	
	//Metodos
	
	public void receberSalario() {
		this.granaJuntada += 954.0;
	}
	
	public String getTelefone() {
		return this.telefone;
	}

	public String getEmail() {
		return this.email;
	}

	public String getNome() {
		return super.getNome();
	}

	public String getId() {
		return super.getId();
	}

	public Integer getIdade() {
		return super.getIdade();
	}
}