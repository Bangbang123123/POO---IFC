
public class Retangulo {
	
	private int ladoA;
	private int ladoB;
	private String cor = "Roxo";
	
	public Retangulo(int ladoA, int ladoB, String cor) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.cor = cor;
	}
	public Retangulo() {
		
	}
	
	
	public int getLadoA() {
		return ladoA;
	}
	public int getLadoB() {
		return ladoB;
	}
	public String getCor() {
		return cor;
	}
	
	public void setLadoA(int ladoA) {
		if (ladoA > 0) {
			this.ladoA = ladoA;
		}
	}
	public void setLadoB(int ladoB) {
		if (ladoB > 0) {
			this.ladoB = ladoB;
		}
	}
	public void setCor(String cor) {
		if (cor.length() > 3) {
			this.cor = cor;
		}
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Retangulo [ladoA = ");
		builder.append(ladoA);
		builder.append(", ladoB = ");
		builder.append(ladoB);
		builder.append(", cor = ");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
