package SistemaAcademico;
import java.util.List;

public class Avaliacao {
	private String nome;
	private float nota;
	private List<Professor> professores;
	private List<Aluno> alunos;
	
	public Avaliacao(String nome, float nota, List<Professor> professores, List<Aluno> alunos) {
		this.nome = nome;
		this.nota = nota;
		this.professores = professores;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}
	public float getNota() {
		return nota;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public void addProfessor(Professor professor) {
		this.professores.add(professor);
	}
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Avaliacao:\n[nome: ");
		builder.append(nome);
		builder.append("]\n[nota: ");
		builder.append(nota);
		builder.append("]\n[professores: ");
		builder.append(professores);
		builder.append("]\n[alunos: ");
		builder.append(alunos);
		builder.append("]");
		return builder.toString();
	}
}
