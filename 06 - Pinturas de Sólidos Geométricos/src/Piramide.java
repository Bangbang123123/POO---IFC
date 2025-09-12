
public class Piramide {
	private double ab;
	private double h;
	private final double[] TIPO = {127.90,258.98,344.34};
	private int tipo;
	
	public Piramide() {}
	public Piramide(double ab, double h, int tipo) {
		setAb(ab);
		setH(h);
		setTipo(tipo);
	}
	
	
	public double getAb() {
		return ab;
	}
	public double getH() {
		return h;
	}
	public int getTipo() {
		return tipo;
	}
	public void setAb(double ab) {
		if (ab > 0) {
			this.ab = ab;
		}
	}
	public void setH(double h) {
		if (h > 0) {
			this.h = h;
		}
	}
	public void setTipo(int tipo) {
		if (tipo >= 1 && tipo <= 3) {
			this.tipo = tipo - 1;
		}
	}
	
	public double getAl() {
		return Math.sqrt(ab * ab + h * h);
	}
	public double triangArea() {
		return ab * getAl();
	}
	public double baseArea() {
		return ab * ab * 4;
	}
	public double totalArea() {
		return triangArea() * 4 + baseArea();
	}
	public double volume() {
		return baseArea() * h / 3;
	}
	public double litrosTinta() {
		return totalArea() / 4.76;
	}
	public double latasTinta() {
		return Math.ceil(litrosTinta() / 18);
	}
	public double valorTotal() {
		return latasTinta() * TIPO[tipo];
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ab : ");
		builder.append(ab);
		builder.append("\nh : ");
		builder.append(h);
		builder.append("\nal : ");
		builder.append(getAl());
		builder.append("\nÁrea Triângulo : ");
		builder.append(triangArea());
		builder.append("\nÁrea da Base : ");
		builder.append(baseArea());
		builder.append("\nÁrea Total : ");
		builder.append(totalArea());
		builder.append("\nTipo : ");
		builder.append(tipo + 1);
		builder.append("\nLitros : ");
		builder.append(litrosTinta());
		builder.append("\nLatas : ");
		builder.append(latasTinta());
		builder.append("\nPreço : ");
		builder.append(valorTotal());
		builder.append("\nVolume : ");
		builder.append(volume());
		return builder.toString();
	}
}
