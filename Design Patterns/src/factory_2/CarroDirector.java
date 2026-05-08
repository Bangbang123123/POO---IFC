package factory_2;

public class CarroDirector {
	protected CarroBuilder carroBuilder;
	
	public CarroDirector(CarroBuilder carroBuilder) {
		this.carroBuilder = carroBuilder;
	}
	public void construirCarro() {
		carroBuilder.buildAnoDeFabricacao();
		carroBuilder.buildDscMotor();
		carroBuilder.buildModelo();
		carroBuilder.buildMontadora();
		carroBuilder.buildPreco();
	}
	public Carro getCarro() {
		return carroBuilder.getCarro();
	}
}
