package order1;

public class Gerente extends Funcionario{
	public Gerente() {
		super.setDesconto(Desconto.GERENTE);
	}
	public float calculaSalarioLiquido(float salarioBruto) {
		float valor = salarioBruto * getDescontoValor();
		setSalarioLiquido(valor);
		return valor;
	}
}
