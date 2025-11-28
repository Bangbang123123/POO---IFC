package order1;

public class Funcionario implements IControle{
	private float salarioLiquido;
	private Desconto desconto = Desconto.PADRAO;

	public float getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(float salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	
	public float calculaSalarioLiquido(float salarioBruto) {
		return salarioBruto;
	}
	
	public float getDescontoValor() {
		return desconto.getValor();
	}
	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}
	
}
