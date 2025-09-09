
public class Televisao {
	private int[] canais = {101,102,103,104};
	private int atual = 101;
	private int volume = 0;
	
	public int getAtual() {
		return atual;
	}
	public void setAtual(int atual) {
		boolean temCanal = false;
		for (int i = 0; i < canais.length; i++) {
			if (atual == canais[i]) {
				temCanal = true;
				break;
			}
		}
		if (temCanal) {
			this.atual = atual;
		}
	}
	public int getVolume() {
		return volume;
	}
	public void aumentarVolume(int aum) {
		if (this.volume + aum > 100) {
			this.volume = 100;
		} else {
			this.volume += aum;
		}	
	}
	public void diminuirVolume(int dim) {
		if (this.volume - dim < 0) {
			this.volume = 0;
		} else {
			this.volume -= dim;
		}	
	}
}
