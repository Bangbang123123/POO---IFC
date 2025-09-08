
public class Operacoes {
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
	
	
	public String calcule(char op) {
		switch (op) {
		default:
			return "Operação inválida";
		case '+':
			return "Soma: "+ (n1 + n2);
		case '-':
			return "Subtração: "+ (n1 - n2);
		case '*':
			return "Multiplicação: "+ (n1 * n2);
		case '/':
			if (n2 == 0) {
				return "Divisão por zero";
			}
			return "Divisão: "+ (n1 / n2);
		}
	}
}
