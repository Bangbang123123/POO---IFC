package bridge;

public class Televisao implements ControleRemoto{

	@Override
	public void ligar() {
		System.out.println("Televisão ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Televisão desligada");
	}

	@Override
	public void aumentar() {
		System.out.println("Volume da televisão aumentado");
	}

	@Override
	public void diminuir() {
		System.out.println("Volume da televisão diminuído");
	}
	
}
