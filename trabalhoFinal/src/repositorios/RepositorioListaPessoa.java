package repositorios;
import classesbasicas.Pessoa;
import classesbasicas.Cliente;
import classesbasicas.Funcionario;
import exceptions.PessoaJaCadastradaException;
import exceptions.PessoaNaoEncontradaException;
import interfaces.repositorioPessoa;
 
public class RepositorioListaPessoa implements repositorioPessoa {
 
    private Pessoa pessoa;
    private RepositorioListaPessoa proximo;
 
    public RepositorioListaPessoa() {
        this.pessoa = null;
        this.proximo = null;
    }
 
    public Pessoa getPessoa() {
        return pessoa;
    }
 
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
 
    public RepositorioListaPessoa getProximo() {
        return proximo;
    }
 
    public void setProximo(RepositorioListaPessoa proximo) {
        this.proximo = proximo;
    }
 
    public void inserir(Pessoa pessoa) throws PessoaJaCadastradaException {
        if (!this.existe(pessoa.getId())) {
            if (this.proximo == null) {
                this.pessoa = pessoa;
                this.proximo = new RepositorioListaPessoa();
            } else {
                this.proximo.inserir(pessoa);
            }
        } else {
            throw new PessoaJaCadastradaException();
        }
    }
 
    public void remover(String id) throws PessoaNaoEncontradaException {
        if (this.existe(pessoa.getId())) {
            if (this.pessoa.getId().equals(id)) {
                this.pessoa = this.proximo.pessoa;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(id);
            }
        } else {
            throw new PessoaNaoEncontradaException();
        }
    }
 
    public void atualizar(Pessoa pessoa) {
       
        if (pessoa.getNome() != null) {
            this.pessoa.setNome(pessoa.getNome());
        }
        if (pessoa.getIdade() != null) {
            this.pessoa.setIdade(pessoa.getIdade());
        }
       
        if (pessoa instanceof Cliente) {   
            if (((Cliente)pessoa).getNumeroCartao() != null) {
                ((Cliente)this.pessoa).setNumeroCartao(((Cliente)pessoa).getNumeroCartao());
            }
            if (((Cliente)pessoa).getMesa() != null) { 
                ((Cliente)this.pessoa).setMesa(((Cliente)pessoa).getMesa());
            }
            if (((Cliente)pessoa).getSaldo() != null) {
                ((Cliente)this.pessoa).setSaldo(((Cliente)pessoa).getSaldo());
            }
        }
       
        if (pessoa instanceof Funcionario) {   
            if (((Funcionario)pessoa).getTelefone() != null) {
                ((Funcionario)this.pessoa).setTelefone(((Funcionario)pessoa).getTelefone());
            }
            if (((Funcionario)pessoa).getEmail() != null) {
                ((Funcionario)this.pessoa).setEmail(((Funcionario)pessoa).getEmail());
            }
        }
    }
 
    public boolean existe(String Id) {
        if (this.pessoa != null && this.pessoa.getId().equals(Id)) {
            return true;
        } else if (this.pessoa == null) {
            return false;
        } else {
            return this.proximo.existe(Id);
        }
    }
 
    public Pessoa procurar(String Id) throws PessoaNaoEncontradaException {
        if (this.existe(Id)) {
            if (this.pessoa.getId().equals(Id)) {
                return this.pessoa;
            } else {
                return this.proximo.procurar(Id);
            }
        } else {
            throw new PessoaNaoEncontradaException();
        }
    }
 
 
}