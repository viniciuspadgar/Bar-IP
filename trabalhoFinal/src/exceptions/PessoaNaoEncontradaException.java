package exceptions;

public class PessoaNaoEncontradaException extends Exception {
	
	public PessoaNaoEncontradaException() {
		super("Pessoa nao encontrada.");
	}

}

