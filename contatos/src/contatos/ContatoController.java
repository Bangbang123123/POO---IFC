package contatos;

import java.util.ArrayList;
import java.util.List;

public class ContatoController {
	// Attributes
	private List<Contato> lista_contatos = new ArrayList<Contato>();
	
	// Setters
	public void addContato(Contato contato) {
		lista_contatos.add(contato);
	}
	
	public void removeContato(Contato contato) {
		lista_contatos.remove(contato);
	}
	
	// Getters
	public List<Contato> getListaContatos() {
		return lista_contatos;
	}
}
