package Computador_;

public class Processador {
	private String marca;
	private String modelo;
	private float clock;
	private float cache;
	
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public float getClock() {
		return clock;
	}
	public float getCache() {
		return cache;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setClock(float clock) {
		this.clock = clock;
	}
	public void setCache(float cache) {
		this.cache = cache;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Processador:\n[marca: ");
		builder.append(marca);
		builder.append("]\n[modelo: ");
		builder.append(modelo);
		builder.append("]\n[clock: ");
		builder.append(clock);
		builder.append("]\n[cache: ");
		builder.append(cache);
		builder.append("]");
		return builder.toString();
	}
}
