package factory_2;

public class Carro{
	// Attributes
	private double preco;
	private String dscMotor;
	private int anoDeFabricacao;
	private String modelo;
	private String montadora;
	
	
	// Constructor
	public Carro() {}
	
	
	// Getters
	public double getPreco() {
		return preco;
	}
	public String getDscMotor() {
		return dscMotor;
	}
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public String getModelo() {
		return modelo;
	}
	public String getMontadora() {
		return montadora;
	}
	
	// Setters
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setDscMotor(String dscMotor) {
		this.dscMotor = dscMotor;
	}
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [preco=");
		builder.append(preco);
		builder.append(", dscMotor=");
		builder.append(dscMotor);
		builder.append(", anoDeFabricacao=");
		builder.append(anoDeFabricacao);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", montadora=");
		builder.append(montadora);
		builder.append("]");
		return builder.toString();
	}
}
