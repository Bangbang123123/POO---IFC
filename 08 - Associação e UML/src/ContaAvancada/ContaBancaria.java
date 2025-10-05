package ContaAvancada;

public class ContaBancaria {
	protected Banco banco;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	private Pessoa correntista;
	
	
	public Banco getBanco() {
		return banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public Pessoa getCorrentista() {
		return correntista;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	
	
	public boolean deposito(double valor) {
		setSaldo(saldo + valor);
		return true;
	}
	public boolean saque(double valor) {
		if (saldo - valor < 0) {
			return false;
		} else {
			setSaldo(saldo - valor);
			return true;
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria:\n[banco: ");
		builder.append(banco);
		builder.append("]\n[agencia: ");
		builder.append(agencia);
		builder.append("]\n[numeroDaConta: ");
		builder.append(numeroDaConta);
		builder.append("]\n[saldo: ");
		builder.append(saldo);
		builder.append("]\n[correntista: ");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}
}
