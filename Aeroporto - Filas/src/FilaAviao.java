

public class FilaAviao {
	private NodoAviao inicio;
	private NodoAviao fim;
	public int tamanho = 0;
	
	public int getTamanho() {
		return tamanho;
	}
	
	
	public Aviao peek() {
		return inicio.getAviao();
	}
	
	public Aviao dequeue() {
		if (inicio == null) {
			return null;
		}
		
		Aviao dado = inicio.getAviao();
		inicio = inicio.getProx();
		
		if (inicio == null) {
			fim = null;
		}
		
		tamanho--;
		return dado;
	}
	
	public void enqueue(Aviao aviao) {
		NodoAviao novoNodo = new NodoAviao(aviao);
		tamanho++;
		
		if (inicio == null) {
			inicio = novoNodo;
			fim = novoNodo;
			return;
		}
		
		fim.setProx(novoNodo);
		fim = novoNodo;
	}
	
}
