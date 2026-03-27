
public class Banana {
	// Attributes
	private String tipo;
	private String origem;
	
	// Constructors
	public Banana() {}
	public Banana(String tipo,String origem) {
		setTipo(tipo);
		setOrigem(origem);
	}
	
	// Getters
	public String getTipo() {
		return tipo;
	}
	public String getOrigem() {
		return origem;
	}
	
	// Setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	// To String
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nBanana:\n<> Tipo: ");
		builder.append(tipo);
		builder.append("\n<> Origem: ");
		builder.append(origem);
		return builder.toString();
	}
}
