package listas_lineares.pilha;

import listas_lineares.Nodo;

public class PilhaDinamica<T> implements IPilha{
	// Attributes
	private Nodo<T> topo;
	
	// Constructor
	public PilhaDinamica() {
		topo = null;
	}
	
	// Setter
	public void setTopo(Nodo<T> topo) {
		this.topo = topo;
	}
	
	// Getter
	public Nodo<T> getTopo() {
		return topo;
	}
	
	// Methods
	public void push(T dado) {
		Nodo<T> novo_nodo = new Nodo<T>(dado);
		novo_nodo.setProx(topo);
		topo = novo_nodo;
	}
	
	public T pop() {
		if (vazia()) {
			System.out.print("Pilha vazia");
			return -1;
		}
			
		T valor_removido = topo.getDado();
		topo = topo.getProx();
		
		return valor_removido;
	}
	
	public T peek() {
		if (vazia()) {
			System.out.print("Pilha vazia");
			return -1;
		}
		
		return topo.getDado();
	}
	
	public boolean vazia() {
		return topo == null;
	}
	
	public static String inverterTexto(String texto) {
		PilhaDinamica<Character> texto_pilha = new PilhaDinamica<Character>();
		
		for (Character c : texto.toCharArray()) {
			texto_pilha.push(c);
		}
		
		
		
		
		
	}
	
	
	
	public String ToString() {
		if (vazia()) {
			return "Pilha Vazia";
		}
		
		String content = "Pilha:\n";
		Nodo aux = topo;
		
		while (aux != null) {
			content += "* "+ aux.getDado() +"\n";
			aux = aux.getProx();
		}
		
		return content;
	}
}
