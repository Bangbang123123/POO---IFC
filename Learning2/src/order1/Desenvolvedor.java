package order1;

public class Desenvolvedor extends Funcionario{
	public Desenvolvedor() {
		super.setDesconto(Desconto.DESENVOLVEDOR);
	}
	public float calculaSalarioLiquido(float salarioBruto) {
		float valor = salarioBruto * getDescontoValor();
		setSalarioLiquido(valor);
		return valor;
	}
}
