package Bomba;

public class Bomba {
	private double totalLitros;
	private float valorLitro;
	
	
	public double getTotalLitros() {
		return totalLitros;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setTotalLitros(double totalLitros) {
		if (totalLitros >= 0) {
			this.totalLitros = totalLitros;
		}
	}
	public void setValorLitro(float valorLitro) {
		if (valorLitro >= 0) {
			this.valorLitro = valorLitro;
		}
	}
	
	
	public boolean abastecerPorLitro(int litros) {
		if (totalLitros >= litros) {
			setTotalLitros(totalLitros - litros);
			return true;
		}
		return false;
	}
	public boolean abastecerPorValor(double valor) {
		if (totalLitros >= valor/valorLitro) {
			setTotalLitros(totalLitros - valor/valorLitro);
			return true;
		}
		return false;
	}
}
