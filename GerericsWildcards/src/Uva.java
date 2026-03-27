
public class Uva {
	// Attributes
	private String cor;
	
	// Constructor
	public Uva(String cor) {
		setCor(cor);
	}
	
	// Getters
	public String getCor() {
		return cor;
	}
	
	// Setters
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	// To String
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Uva [cor=");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
