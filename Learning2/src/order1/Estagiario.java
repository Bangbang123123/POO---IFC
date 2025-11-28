package order1;

public class Estagiario extends Funcionario implements IControle{
	public Estagiario() {
		super.setDesconto(Desconto.ESTAGIARIO);
	}
	public float calculaSalarioLiquido(float salarioBruto) {
		float valor = salarioBruto * getDescontoValor();
		setSalarioLiquido(valor);
		return valor;
	}
}
