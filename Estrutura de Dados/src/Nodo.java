
public class Nodo {
	// Attributes
	private int dado;
	private Nodo prox;
	
	// Constructor
	public Nodo(int dado) {
		this.dado = dado;
		this.prox = null;
	}
	
	// Getters
	public int getDado() {
		return dado;
	}
	public Nodo getProx() {
		return prox;
	}
	
	// Setters
	public void setDado(int dado) {
		this.dado = dado;
	}
	public void setProx(Nodo prox) {
		this.prox = prox;
	}
}
