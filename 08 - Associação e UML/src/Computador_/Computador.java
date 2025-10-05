package Computador_;

public class Computador extends EquipamentoEletronico {
	private String marca;
	private String modelo;
	protected Gabinete gabinete;
	protected Teclado teclado;
	protected Mouse mouse;
	protected Monitor monitor;
	
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Gabinete getGabinete() {
		return gabinete;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador:\n[marca: ");
		builder.append(marca);
		builder.append("]\n[modelo: ");
		builder.append(modelo);
		builder.append("]\n[gabinete: ");
		builder.append(gabinete);
		builder.append("]\n[teclado: ");
		builder.append(teclado);
		builder.append("]\n[mouse: ");
		builder.append(mouse);
		builder.append("]\n[monitor: ");
		builder.append(monitor);
		builder.append("]\n[toString(): ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
