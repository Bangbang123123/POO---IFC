package SistemaAcademico;
import java.util.List;

public class Disciplina {

	private List<Frequencia> frequencias;
	private List<Avaliacao> avaliacoes;
	private List<Professor> professores;
	private List<Aluno> alunos;
	
	public Disciplina(List<Frequencia> frequencias, List<Avaliacao> avaliacoes, List<Professor> professores, List<Aluno> alunos) {
		this.frequencias = frequencias;
		this.avaliacoes = avaliacoes;
		this.professores = professores;
		this.alunos = alunos;
	}
	
	public List<Frequencia> getFrequencias() {
		return frequencias;
	}
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setFrequencias(List<Frequencia> frequencias) {
		this.frequencias = frequencias;
	}
	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina:\n[frequencias: ");
		builder.append(frequencias);
		builder.append("]\n[avaliacoes: ");
		builder.append(avaliacoes);
		builder.append("]\n[professores: ");
		builder.append(professores);
		builder.append("]\n[alunos: ");
		builder.append(alunos);
		builder.append("]");
		return builder.toString();
	}
}
