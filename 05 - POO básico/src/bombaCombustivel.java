
public class bombaCombustivel {
	private String tipo;
	private double valor;
	private double litros;
	
	
	public double abastecerValor(double valor) {
		if (valor/this.valor > this.litros) {
			double buffer = this.litros;
			this.litros = 0;
			return buffer;
		}
		this.litros -= valor/this.valor;
		return valor/this.valor;
	}
	public double abastecerLitro(double litros) {
		if (litros > this.litros) {
			double buffer = this.litros;
			this.litros = 0;
			return buffer;
		}
		this.litros -= litros;
		return litros;
	}
	public void alterarValor(double valor) {
		this.valor = valor;
	}
	public void alterarTipo(String tipo) {
		this.tipo = tipo;
	}
	public void alterarLitros(double litros) {
		this.litros = litros;
	}
}
