
public class FilaAviao {
	private NodoAviao inicio;
	private NodoAviao fim;
	private int tamanho = 0;
	
	public int getTamanho() {
		return tamanho;
	}
	public NodoAviao getInicio() {
		return inicio;
	}
	public NodoAviao getFim() {
		return fim;
	}
	
	
	public Aviao peek() {
		if (inicio == null) {
			return null;
		}
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
	
	public void removerAvioesSemCombustivel() {
		FilaAviao novaFila = new FilaAviao();
		
		while (inicio != null) {
			Aviao aviao = this.dequeue();
			aviao.setCombustivel(aviao.getCombustivel()-1);
			
			if (aviao.getCombustivel() >= 0) {
				novaFila.enqueue(aviao);
			} else {
				System.out.println("\n\nAvião Caído\n\n");
			}
			
		}
		
		inicio = novaFila.getInicio();
		fim = novaFila.getFim();
		tamanho = novaFila.getTamanho();
	}
	
	
	public String ToString() {
		if (inicio == null) {
			return "* Fila vazia\n";
		}
		
		String conteudo = "";
		
		NodoAviao aux = inicio;
		while (aux != null) {
			conteudo += aux.getAviao().toString() +"\n";
			
			aux = aux.getProx();
		}
		
		return conteudo;
	}
	
}
