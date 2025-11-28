package contatos;

public class Contato {
	// Attributes
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String data_nascimento;
	
	// Getters
	public int getId() {
		return id;
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
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[\nId: ");
		builder.append(id);
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nEmail: ");
		builder.append(email);
		builder.append("\nTelefone: ");
		builder.append(telefone);
		builder.append("\nData de nascimento: ");
		builder.append(data_nascimento);
		builder.append("\n]");
		return builder.toString();
	}
}
