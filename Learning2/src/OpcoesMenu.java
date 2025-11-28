
public enum OpcoesMenu {
	SELECT,TV,CONTROLE;
	
	private final int valor;
	OpcoesMenu(int valor) {
		this.valor = valor;
	}
	OpcoesMenu() {
		valor = 0;
	};
	
	public int getValor() {
		return valor;
	}
}
