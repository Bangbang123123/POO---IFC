
public class EquipamentoEletronico {
	private float tensao;
	private float consumo;
	private boolean estado;
	
	
	public float getTensao() {
		return tensao;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setTensao(float tensao) {
		if (tensao > 0) {
			this.tensao = tensao;
		}
	}
	public void setConsumo(float consumo) {
		if (consumo > 0) {
			this.consumo = consumo;
		}
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