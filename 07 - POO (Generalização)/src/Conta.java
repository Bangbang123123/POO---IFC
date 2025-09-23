
public class Conta {
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	
	public String getBanco() {
		return banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean deposito(double valor) {
		setSaldo(saldo + valor);
		return true;
	}
	
	public boolean saque(double valor) {
		if (saldo - valor >= 0) {
			setSaldo(saldo - valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
}
