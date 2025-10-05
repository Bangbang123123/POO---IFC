package ContaAvancada;

public class ContaEspecial extends ContaBancaria {
	private int diasSemJuros;
	private double limite;
	protected CartaoDeCredito cartao;
	
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public CartaoDeCredito getCartao() {
		return cartao;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial:\n[diasSemJuros: ");
		builder.append(diasSemJuros);
		builder.append("]\n[limite: ");
		builder.append(limite);
		builder.append("]\n[cartao: ");
		builder.append(cartao);
		builder.append("]\n[toString(): ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
