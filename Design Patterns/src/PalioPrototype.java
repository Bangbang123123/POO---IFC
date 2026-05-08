
public class PalioPrototype extends CarroPrototype{
	protected PalioPrototype(PalioPrototype palioPrototype) {
		this.valorCompra = palioPrototype.getValorCompra();
	}
	public PalioPrototype() {
		valorCompra = 0.0;
	}
	
	@Override
	public String exibirInfo() {
		return "Modelo: Palio // Montadora: Fiat // Valor: R$"+ getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new PalioPrototype(this);
	}
}
