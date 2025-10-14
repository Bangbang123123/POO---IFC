
public class Pessoa {
	private String nome;
	private String email;
	private String telefone;
	private String data_nascimento;
	
	public Pessoa(String nome, String email, String data_nascimento) {
		setNome(nome);
		setEmail(email);
		setData_nascimento(data_nascimento);
	}
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setNome(String nome) {
		if (nome.length() > 3) {
			this.nome = nome;
		}
	}
	public void setEmail(String email) {
		if (email.split("@").length == 2) {
			this.email = email;
		}
	}
	public void setTelefone(String telefone) {
		if (telefone.length() > 4) {
			this.telefone = telefone;
		}
	}
	public void setData_nascimento(String data_nascimento) {
		if (data_nascimento.split("/").length == 3) {
			this.data_nascimento = data_nascimento;
		}
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa:\n[nome: ");
		builder.append(nome);
		builder.append("]\n[email: ");
		builder.append(email);
		builder.append("]\n[telefone: ");
		builder.append(telefone);
		builder.append("]\n[data_nascimento: ");
		builder.append(data_nascimento);
		builder.append("]");
		return builder.toString();
	}
}
