package SistemaAcademico;

public class Professor {
	private String nome;
	
	public Professor(String nome) {
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor:\n[nome: ");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
}
