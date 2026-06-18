package flyweight;

public class Cafe {
	private String sabor;
	private int preco;
	
	public Cafe(String sabor, int preco) {
		this.sabor = sabor;
		this.preco = preco;
	}
	
	public String getSabor() {
		return sabor;
	}
	public int getPreco() {
		return preco;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Café [sabor=");
		builder.append(sabor);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
}
