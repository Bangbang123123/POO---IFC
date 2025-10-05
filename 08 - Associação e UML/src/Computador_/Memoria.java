package Computador_;

public class Memoria {
	private String marca;
	private String modelo;
	private float capacidade;
	private float velocidade;
	
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public float getCapacidade() {
		return capacidade;
	}
	public float getVelocidade() {
		return velocidade;
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
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Memoria:\n[marca: ");
		builder.append(marca);
		builder.append("]\n[modelo: ");
		builder.append(modelo);
		builder.append("]\n[capacidade: ");
		builder.append(capacidade);
		builder.append("]\n[velocidade: ");
		builder.append(velocidade);
		builder.append("]\n[toString(): ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
