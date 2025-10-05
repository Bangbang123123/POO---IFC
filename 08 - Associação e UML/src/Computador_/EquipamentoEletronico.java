package Computador_;

public class EquipamentoEletronico {
	private float tensao;
	private float consumo;
	
	
	public float getTensao() {
		return tensao;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setTensao(float tensao) {
		this.tensao = tensao;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentoEletronico:\n[tensao: ");
		builder.append(tensao);
		builder.append("]\n[consumo: ");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}
}
