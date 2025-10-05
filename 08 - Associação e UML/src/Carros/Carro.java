package Carros;

public class Carro {
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	protected Pessoa dono;
	protected Motor motor;
	
	
	public String getFabricante() {
		return fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	public int getAno() {
		return ano;
	}
	public Pessoa getDono() {
		return dono;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro:\\n[fabricante: ");
		builder.append(fabricante);
		builder.append("]\\n[modelo: ");
		builder.append(modelo);
		builder.append("]\\n[cor: ");
		builder.append(cor);
		builder.append("]\\n[ano: ");
		builder.append(ano);
		builder.append("]\\n[dono: ");
		builder.append(dono);
		builder.append("]\\n[motor: ");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
}
