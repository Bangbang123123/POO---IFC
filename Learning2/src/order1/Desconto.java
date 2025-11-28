package order1;

public enum Desconto {
	PADRAO(1.0f),ESTAGIARIO(1.2f),DESENVOLVEDOR(1.1f),ANALISTA(1.05f),GERENTE(1.01f);
	
	private float valor;
	private Desconto(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return valor;
	}
}
