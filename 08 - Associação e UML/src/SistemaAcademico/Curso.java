package SistemaAcademico;
import java.util.List;

public class Curso {

	private String nome;
	private List<Fase> fases;
	
	public Curso(String nome, List<Fase> fases) {
		this.nome = nome;
		this.fases = fases;
	}
	
	public String getNome() {
		return nome;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void addFase(Fase fase) {
		this.fases.add(fase);
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso:\\n[nome: ");
		builder.append(nome);
		builder.append("]\\n[fases: ");
		builder.append(fases);
		builder.append("]");
		return builder.toString();
	}
}
