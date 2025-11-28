package order1;

public class Analista extends Funcionario{
	public Analista() {
		super.setDesconto(Desconto.ANALISTA);
	}
	public float calculaSalarioLiquido(float salarioBruto) {
		float valor = salarioBruto * getDescontoValor();
		setSalarioLiquido(valor);
		return valor;
	}
}
