
public class Intervalo {
	private int n1 = 0;
	private int n2 = 0;
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public String retorneIntervalo() {
		String text = "";
		if (n1 > n2) {
			text += "< Valores invertidos >\n";
			int buffer = n1;
			n1 = n2;
			n2 = buffer;
		}
		for (int i = n1; i <= n2; i++) {
			text += "["+ i +"]";
		}
		
		return text;
	}
}
