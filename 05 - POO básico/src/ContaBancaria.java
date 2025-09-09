
public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;
    private String senha;

    public ContaBancaria(int numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldoInicial;
    }
    public boolean verificar(String senha) {
    	if (this.senha == senha) {
    		return true;
    	}
    	return false;
    }
    
    
    public void setSenha(String senha, String senhaAntiga) {
    	if (verificar(senhaAntiga)) {
    		this.senha = senha;
    	}
    }
    public void setNome(String nome,String senha) {
    	this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public void deposito(double valor,String senha) {
    	if (verificar(senha)) {
    		this.saldo += valor;
    	}
    }
    public void saque(double valor,String senha) {
    	if (verificar(senha)) {
    		this.saldo -= valor;
    	}
    }
}
