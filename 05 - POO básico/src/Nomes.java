
public class Nomes {
	private String nome = "";
	private String sobrenome = "";
	
	public Nomes() {}
	public Nomes(String nome,String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
	}
	public Nomes(String nome) {
		setNome(nome);
		setSobrenome(nome);
	}
	
	public String juntar() {
		return nome+" "+sobrenome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
