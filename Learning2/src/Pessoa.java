
public class Pessoa {
	private String nome;

	public Pessoa(String nome) {
		setNome(nome);
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
}
