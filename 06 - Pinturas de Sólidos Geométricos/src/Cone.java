
public class Cone {
	private double raio;
	private double altura;
	private final double[] TIPO = {238.90,467.98,758.34};
	private final double PI = 3.14;
	private int tipo;
	
	public Cone() {}
	public Cone(double raio, double altura, int tipo) {
		setRaio(raio);
		setAltura(altura);
		setTipo(tipo);
	}
	
	
	public double getRaio() {
		return raio;
	}
	public double getAltura() {
		return altura;
	}
	public int getTipo() {
		return tipo;
	}
	public void setRaio(double raio) {
		if (raio > 0) {
			this.raio = raio;
		}
	}
	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	public void setTipo(int tipo) {
		if (tipo >= 1 && tipo <= 3) {
			this.tipo = tipo - 1;
		}
	}
	
	
	public double geratriz() {
		return Math.sqrt(raio * raio + altura * altura);
	}
	public double baseArea() {
		return raio * raio * PI;
	}
	public double lateralArea() {
		return raio * geratriz() * PI;
	}
	public double totalArea() {
		return baseArea() + lateralArea();
	}
	public double litrosTinta() {
		return totalArea() * 3.45;
	}
	public double latasTinta() {
		return Math.ceil(litrosTinta() / 18);
	}
	public double valorTotal() {
		return latasTinta() * TIPO[tipo];
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raio : ");
		builder.append(raio);
		builder.append("\nAltura : ");
		builder.append(altura);
		builder.append("\nNível : ");
		builder.append(tipo + 1);
		builder.append("\n—————————–\nGeratriz : ");
		builder.append(geratriz());
		builder.append("\n—————————–\nÁrea do Fundo : ");
		builder.append(baseArea());
		builder.append("\nÁrea Lateral Cone : ");
		builder.append(lateralArea());
		builder.append("\nÁrea Total : ");
		builder.append(totalArea());
		builder.append("\n—————————–\nLitros : ");
		builder.append(litrosTinta());
		builder.append("\nLatas: ");
		builder.append(latasTinta());
		builder.append("\n—————————–\nPreço Total : ");
		builder.append(valorTotal());
		return builder.toString();
	}
	
	
	
}
