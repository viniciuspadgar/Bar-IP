package interfaces;

import classesbasicas.Cliente;

public interface repositorioCliente {

	Cliente procurar(String id);
	void inserir(Cliente cliente);
	void remover(Cliente cliente);
	boolean existe (Cliente cliente);	
	
}
