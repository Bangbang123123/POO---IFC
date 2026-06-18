package bridge;

public class ArCondicionado implements ControleRemoto{

	@Override
	public void ligar() {
		System.out.println("Ar-condicionado ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Ar-condicionado desligado");
	}

	@Override
	public void aumentar() {
		System.out.println("Temperatura do ar-condicionado aumentado");
	}

	@Override
	public void diminuir() {
		System.out.println("Temperatura do ar-condicionado diminuído");
	}

}
