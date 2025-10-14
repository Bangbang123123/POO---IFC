package Carros;

public class Pessoa {
	private String nome;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setNome(String nome) {
		if (nome.length() > 3) {
			this.nome = nome;
		}
	}
	public void setEndereco(String endereco) {
		if (endereco.length() > 5) {
			this.endereco = endereco;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa:\n[nome: ");
		builder.append(nome);
		builder.append("]\n[endereco: ");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
}
