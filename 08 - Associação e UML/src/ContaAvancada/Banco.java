package ContaAvancada;

public class Banco {
	private int codigo;
	private String nome;
	private int numeroAgencias;
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public int getNumeroAgencias() {
		return numeroAgencias;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumeroAgencias(int numeroAgencias) {
		this.numeroAgencias = numeroAgencias;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco:\n[codigo: ");
		builder.append(codigo);
		builder.append("]\n[nome: ");
		builder.append(nome);
		builder.append("]\n[numeroAgencias: ");
		builder.append(numeroAgencias);
		builder.append("]");
		return builder.toString();
	}
}
