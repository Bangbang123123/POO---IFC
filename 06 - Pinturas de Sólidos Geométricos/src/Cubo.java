
public class Cubo {
	private double lado;
	private double rendimento;
	private final double[] TIPO = {101.9,212.45,345.56};
	private int tipo;
	
	public Cubo() {}
	public Cubo(double lado,double rendimento,int tipo) {
		setLado(lado);
		setRendimento(rendimento);
		setTipo(tipo);
	}
		
	
	public double getLado() {
		return lado;
	}
	public double getRendimento() {
		return rendimento;
	}
	public int getTipo() {
		return tipo;
	}
	public void setLado(double lado) {
		if (lado > 0) {
			this.lado = lado;
		}
	}
	public void setRendimento(double rendimento) {
		if (rendimento > 0) {
			this.rendimento = rendimento;
		}
	}
	public void setTipo(int tipo) {
		if (tipo >= 1 && tipo <= 3) {
			this.tipo = tipo - 1;
		}
	}
	
	public double baseArea() {
		return lado * lado;
	}
	public double totalArea() {
		return lado * lado * 6;
	}
	public double volume() {
		return lado * lado * lado;
	}
	public double diagonal() {
		return Math.sqrt(3) * lado;
	}
	public double litrosTinta() {
		return totalArea() / rendimento;
	}
	public double latasTinta() {
		return Math.ceil(litrosTinta() / 18);
	}
	public double valorTotal() {
		return latasTinta() * TIPO[tipo];
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lado : ");
		builder.append(lado);
		builder.append("\nRendimento : ");
		builder.append(rendimento);
		builder.append("\nTipo de Tinta: ");
		builder.append(tipo + 1);
		builder.append("\n————————–\nÁrea da Base : ");
		builder.append(baseArea());
		builder.append("\nÁrea Total : ");
		builder.append(totalArea());
		builder.append("\nVolume : ");
		builder.append(volume());
		builder.append("\nDiagonal : ");
		builder.append(diagonal());
		builder.append("\nLitros de Tinta : ");
		builder.append(litrosTinta());
		builder.append("\nLatas de Tinta : ");
		builder.append(latasTinta());
		builder.append("\nValor Total : ");
		builder.append(valorTotal());
		return builder.toString();
	}
	
	
	
}
