package Computador_;

public class Hd {
	private String marca;
	private String modelo;
	private float capacidade;
	private int rpm;
	
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public float getCapacidade() {
		return capacidade;
	}
	public int getRpm() {
		return rpm;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hd:\n[marca: ");
		builder.append(marca);
		builder.append("]\n[modelo: ");
		builder.append(modelo);
		builder.append("]\n[capacidade: ");
		builder.append(capacidade);
		builder.append("]\n[rpm: ");
		builder.append(rpm);
		builder.append("]");
		return builder.toString();
	}
}
