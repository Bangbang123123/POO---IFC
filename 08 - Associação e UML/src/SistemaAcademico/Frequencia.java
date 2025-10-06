package SistemaAcademico;
import java.util.List;

public class Frequencia {

	private List<Boolean> presente;
	private List<Professor> professores;
	private List<Aluno> alunos;
	
	public Frequencia(List<Boolean> presente, List<Professor> professores, List<Aluno> alunos) {
		this.presente = presente;
		this.professores = professores;
		this.alunos = alunos;
	}
	
	public void addFrequencia(boolean presente, Professor professor, Aluno aluno) {
		this.presente.add(presente);
		this.professores.add(professor);
		this.alunos.add(aluno);
	}
	
	public List<Boolean> getPresente() {
		return presente;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia:\n[presente: ");
		builder.append(presente);
		builder.append("]\n[professores: ");
		builder.append(professores);
		builder.append("]\n[alunos: ");
		builder.append(alunos);
		builder.append("]");
		return builder.toString();
	}
}
