package SistemaAcademico;
import java.util.List;

public class Fase {

	private List<Disciplina> disciplinas;

	public Fase(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplina() {
		return disciplinas;
	}
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase:\n[disciplinas: ");
		builder.append(disciplinas);
		builder.append("]");
		return builder.toString();
	}
}
