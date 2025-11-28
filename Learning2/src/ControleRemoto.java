
public class ControleRemoto extends EquipamentoEletronico implements IControle{
	private int cargaPilha;
	private TV tv;
	
	
	public ControleRemoto(TV tv) {
		this.tv = tv;
	}
	
	public boolean ligaDesliga() {
		return tv.ligaDesliga();
	}
	public int alterarCanal(int canal) {
		return tv.alterarCanal(canal);
	}
	public int canalMais() {
		return tv.canalMais();
	}
	public int canalMenos() {
		return tv.canalMenos();
	}
	public int volumeMais() {
		return tv.volumeMais();
	}
	public int volumeMenos() {
		return tv.volumeMenos();
	}
	
	
	public int getCargaPilha() {
		return cargaPilha;
	}
	public void setCargaPilha(int cargaPilha) {
		this.cargaPilha = cargaPilha;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ControleRemoto [cargaPilha=");
		builder.append(cargaPilha);
		builder.append("]");
		return builder.toString();
	}
}
