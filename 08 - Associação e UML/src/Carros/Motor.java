package Carros;

public class Motor {
	private String marca;
	private float potencia;
	private int cilindros;
	private String combustivel;
	public String getMarca() {
		return marca;
	}
	public float getPotencia() {
		return potencia;
	}
	public int getCilindros() {
		return cilindros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor:\\n[marca: ");
		builder.append(marca);
		builder.append("]\\n[potencia: ");
		builder.append(potencia);
		builder.append("]\\n[cilindros: ");
		builder.append(cilindros);
		builder.append("]\\n[combustivel: ");
		builder.append(combustivel);
		builder.append("]");
		return builder.toString();
	}
}
