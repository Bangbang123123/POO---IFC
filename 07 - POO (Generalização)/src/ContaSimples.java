
public class ContaSimples extends Conta{
	private double saldoPoupanca;
	
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public boolean depositoPoupanca(double valor) {
		setSaldoPoupanca(saldoPoupanca + valor);
		return true;
	}
	
	public boolean saquePoupanca(double valor) {
		if (saldoPoupanca - valor >= 0) {
			setSaldoPoupanca(saldoPoupanca - valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
