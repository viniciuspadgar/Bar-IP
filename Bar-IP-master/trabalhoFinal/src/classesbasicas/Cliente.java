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
   
    //getters
 
    public String getNumeroCartao() {
        return this.numeroCartao;
    }
 
    public String getMesa() {
        return this.mesa;
    }
 
    public Double getSaldo() { 
        return this.saldo;
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
   
    // setters
   
    public void setNome(String nome) {
        super.setNome(nome);
    }
 
    public void setId(String id) {
        super.setId(id);
    }
 
    public void setIdade(Integer idade) {
        super.setIdade(idade);
    }
 
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
 
    public void setMesa(String mesa) {
        this.mesa = mesa;
    }
 
    public void setSaldo(Double saldo) {   
        this.saldo = saldo;
    }
}