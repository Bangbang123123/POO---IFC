package Computador_;

public class Gabinete {
	private String modelo;
	private String tipo;
	private int baias;
	protected PlacaMae placaMae;
	
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public int getBaias() {
		return baias;
	}
	public PlacaMae getPlacaMae() {
		return placaMae;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setBaias(int baias) {
		this.baias = baias;
	}
	public void setPlacaMae(PlacaMae placaMae) {
		this.placaMae = placaMae;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gabinete:\n[modelo: ");
		builder.append(modelo);
		builder.append("]\n[tipo: ");
		builder.append(tipo);
		builder.append("]\n[baias: ");
		builder.append(baias);
		builder.append("]\n[placaMae: ");
		builder.append(placaMae);
		builder.append("]");
		return builder.toString();
	}
	
	
}
