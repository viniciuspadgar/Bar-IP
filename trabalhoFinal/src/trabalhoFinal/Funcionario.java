package trabalhoFinal;

public class Funcionario extends Pessoa {

	//Atributos de Funcionarios
	private String email, telefone;
	private double salario;


	//Construtor de funcionarios
	public Funcionario(String nome, String id, String email, String telefone, Integer idade, double salario) {
		super (nome, id, idade);

		if(email.contains("@")) {
			this.email = email;

		} else {
			EnderecoEmailInvalidoException ozi;
			ozi = new EnderecoEmailInvalidoException();
			throw ozi;
			
		}

		if(telefone.length() == 9) {
			this.telefone = telefone;

		} else {
			NumeroTelefoneInvalidoException bad;
			bad = new NumeroTelefoneInvalidoException();
			throw bad;
			
		}

		//Metodos

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