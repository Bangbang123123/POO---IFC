import java.util.List;
import java.util.ArrayList;

public class ListaPessoas {
	private List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public boolean addPessoa(Pessoa p) {
		boolean verify = true;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equals(p.getNome())) {
				verify = false;
				break;
			}
		}
		if (verify) {
			lista.add(p);
		}
		
		return verify;
	}
	public String mesmoMes(String mes) {
		StringBuilder builder = new StringBuilder();
		builder.append("Mesmo mês [");
		builder.append(mes);
		builder.append("]:\n[lista: ");
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i).getData_nascimento().split("/")[1].equals(mes)) {
				builder.append("\n[");
				builder.append(lista.get(i).toString());
				builder.append("]");
			}
			
		}
		builder.append("\n]");
		return builder.toString();
	}
	
	public String mesmoDominio(String dominio) {
		StringBuilder builder = new StringBuilder();
		builder.append("Mesmo domínio [");
		builder.append(dominio);
		builder.append("]:\n[lista: ");
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i).getEmail().split("@")[1].equals(dominio)) {
				builder.append("\n[");
				builder.append(lista.get(i).toString());
				builder.append("]");
			}
			
			
		}
		builder.append("\n]");
		return builder.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaPessoas:\n[lista: ");
		for (int i = 0; i < lista.size(); i++) {
			builder.append("[Pessoa ");
			builder.append(i);
			builder.append(": ");
			builder.append(lista.get(i).toString());
			builder.append("]\n");
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
