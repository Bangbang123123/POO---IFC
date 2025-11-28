
public class TV extends EquipamentoEletronico implements IControle {
	private String marca;
	private String modelo;
	private boolean estado;
	private int volume;
	private int canal;
	
	public boolean ligaDesliga() {
		estado = !estado;
		return estado;
	}
	public int alterarCanal(int canal) {
		if (canal <= 100 && canal >= 0) {
			this.canal = canal;
		}
		return canal;
	}
	public int canalMais() {
		if (canal < 100) {
			canal++;
		}
		return canal;
	}
	public int canalMenos() {
		if (canal > 0) {
			canal--;
		}
		return canal;
	}
	public int volumeMais() {
		if (volume < 100) {
			volume++;
		}
		return volume;
	}
	public int volumeMenos() {
		if (volume > 0) {
			volume--;
		}
		return volume;
	}
	
	
	
	
	public boolean getEstado() {
		return estado;
	}
	public int getVolume() {
		return volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TV [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", canal=");
		builder.append(canal);
		builder.append("]");
		return builder.toString();
	}
}
