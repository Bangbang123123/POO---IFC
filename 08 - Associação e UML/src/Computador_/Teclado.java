package Computador_;

public class Teclado {
	private String marca;
	private String tipo;
	
	
	public String getMarca() {
		return marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado:\\n[marca: ");
		builder.append(marca);
		builder.append("]\\n[tipo: ");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
}
