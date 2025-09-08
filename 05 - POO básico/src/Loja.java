
public class Loja {
	
	private double total = 0;
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}


	public double verificarPreco(int pedido, int quantidade) {
		switch (pedido) {
		default:
			return -1;
		case 100:
			total += quantidade * 1.2;
			return quantidade * 1.2;
		case 101:
			total += quantidade * 1.3;
			return quantidade * 1.3;
		case 102:
			total += quantidade * 1.5;
			return quantidade * 1.5;
		case 103:
			total += quantidade * 1.2;
			return quantidade * 1.2;
		case 104:
			total += quantidade * 1.3;
			return quantidade * 1.3;
		case 105:
			total += quantidade;
			return quantidade;
		}
	}
	
}
