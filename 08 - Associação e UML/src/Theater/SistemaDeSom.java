package Theater;
public class SistemaDeSom extends EquipamentoEletronico {
	private String marca;
	private String modelo;
	private float potencia;
	
	public SistemaDeSom(String marca,String modelo,float potencia,float tensao,float consumo) {
		super(tensao,consumo);
		setMarca(marca);
		setModelo(modelo);
		setPotencia(potencia);
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeSom:\\n[marca: ");
		builder.append(marca);
		builder.append("]\\n[modelo: ");
		builder.append(modelo);
		builder.append("]\\n[potencia: ");
		builder.append(potencia);
		builder.append("]\\n[toString(): ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
