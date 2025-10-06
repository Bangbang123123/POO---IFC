package SistemaAcademico;

public class Aluno {

	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
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
		builder.append("Aluno:\n[nome: ");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}

	
	
}
