package ContaAvancada;

public class ContaSimples extends ContaBancaria {
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		setSaldo(saldoPoupanca + valor);
		return true;
	}
	public boolean saquePoupanca(double valor) {
		if (saldoPoupanca - valor < 0) {
			return false;
		} else {
			setSaldo(saldoPoupanca - valor);
			return true;
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples:\n[saldoPoupanca: ");
		builder.append(saldoPoupanca);
		builder.append("]\n[toString(): ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
