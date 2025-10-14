package Theater;
public class SistemaDeVideo extends EquipamentoEletronico {
	private String marca;
	private String modelo;
	private String tipo;
	private String resolucao;
	
	public SistemaDeVideo(String marca, String modelo, String tipo, String resolucao,float tensao, float consumo) {
		super(tensao, consumo);
		setMarca(marca);
		setModelo(modelo);
		setTipo(tipo);
		setResolucao(resolucao);
	}

	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public String getResolucao() {
		return resolucao;
	}
	public void setMarca(String marca) {
		if (marca.length() > 0) {
			this.marca = marca;
		}
	}
	public void setModelo(String modelo) {
		if (modelo.length() > 0) { 
			this.modelo = modelo;
		}
	}
	public void setTipo(String tipo) {
		if (tipo.length() > 0) { 
			this.tipo = tipo;
		}
	}
	public void setResolucao(String resolucao) {
		if (resolucao.length() > 0) { 
			this.resolucao = resolucao;
		}
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeVideo:\n[marca: ");
		builder.append(marca);
		builder.append("]\n[modelo: ");
		builder.append(modelo);
		builder.append("]\n[tipo: ");
		builder.append(tipo);
		builder.append("]\n[resolucao: ");
		builder.append(resolucao);
		builder.append("]\n[toString(): ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
