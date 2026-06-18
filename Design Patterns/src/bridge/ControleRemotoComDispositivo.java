package bridge;

public class ControleRemotoComDispositivo implements ControleRemoto{
	private ControleRemoto dispositivo;
	
	public ControleRemotoComDispositivo(ControleRemoto dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public void ligar() {
		dispositivo.ligar();
	}

	@Override
	public void desligar() {
		dispositivo.desligar();
	}

	@Override
	public void aumentar() {
		dispositivo.aumentar();
	}

	@Override
	public void diminuir() {
		dispositivo.diminuir();
	}
	
	
}
