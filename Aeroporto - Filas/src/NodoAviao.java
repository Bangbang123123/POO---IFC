
public class NodoAviao {
	private Aviao aviao;
	private NodoAviao prox;
	
	public NodoAviao(Aviao aviao) {
		setAviao(aviao);
	}
	
	
	public Aviao getAviao() {
		return aviao;
	}
	public NodoAviao getProx() {
		return prox;
	}
	
	
	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	public void setProx(NodoAviao prox) {
		this.prox = prox;
	}
	
	
}
