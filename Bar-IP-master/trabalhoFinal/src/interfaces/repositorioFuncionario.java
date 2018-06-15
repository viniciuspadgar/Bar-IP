package interfaces;

import classesbasicas.Funcionario;

public interface repositorioFuncionario {

	void inserir(Funcionario funcionario);
	void remover(Funcionario funcionario);
	boolean existe (Funcionario funcionario);	
	Funcionario procurar(String id);
	
}
