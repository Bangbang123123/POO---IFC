
public class NodoAviao {
	// Atributos
	private Aviao aviao;
	private NodoAviao prox;
	
	// Construtor
	public NodoAviao(Aviao aviao) {
		setAviao(aviao);
	}
	
	// Getters
	public Aviao getAviao() {
		return aviao;
	}
	public NodoAviao getProx() {
		return prox;
	}
	
	// Setters
	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	public void setProx(NodoAviao prox) {
		this.prox = prox;
	}
	
	
}
