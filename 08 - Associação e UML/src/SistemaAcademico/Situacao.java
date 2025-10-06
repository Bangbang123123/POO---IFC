package SistemaAcademico;
import java.util.List;

public class Situacao {

	private List<Aluno> alunos;
	private List<Disciplina> disciplinas;
	
	public Situacao(List<Aluno> alunos, List<Disciplina> disciplinas) {
		this.alunos = alunos;
		this.disciplinas = disciplinas;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void addSituacao(Aluno aluno, Disciplina disciplina) {
		this.alunos.add(aluno);
		this.disciplinas.add(disciplina);
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Situacao:\n[alunos: ");
		builder.append(alunos);
		builder.append("]\n[disciplinas: ");
		builder.append(disciplinas);
		builder.append("]");
		return builder.toString();
	}
}