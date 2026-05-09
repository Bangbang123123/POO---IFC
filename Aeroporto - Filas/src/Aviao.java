
public class Aviao {
	private int id;
	private int combustivel;
	private int tempo;
	
	public Aviao(int id, int combustivel, int tempo) {
		setId(id);
		setCombustivel(combustivel);
		setTempo(tempo);
	}
	
	
	public int getId() {
		return id;
	}
	public int getCombustivel() {
		return combustivel;
	}
	public int getTempo() {
		return tempo;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{[id:");
		builder.append(id);
		builder.append("],[combustível:");
		builder.append(combustivel);
		builder.append("],[tempo:");
		builder.append(tempo);
		builder.append("]}");
		return builder.toString();
	}
	
	
}
