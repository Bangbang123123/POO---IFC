package ContaAvancada;

public class CartaoDeCredito {
	private int numero;
	private String operadora;
	private double limite;
	private String tipoDeCartao;
	
	
	public int getNumero() {
		return numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public double getLimite() {
		return limite;
	}
	public String getTipoDeCartao() {
		return tipoDeCartao;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void setTipoDeCartao(String tipoDeCartao) {
		this.tipoDeCartao = tipoDeCartao;
	}
}
