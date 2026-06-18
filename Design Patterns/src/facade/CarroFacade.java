package facade;

public class CarroFacade {
	CarroModelo modelo;
	CarroMotor motor;
	CarroMarca marca;
	CarroCor cor;
	
	public CarroFacade() {
		modelo = new CarroModelo();
		motor = new CarroMotor();
		marca = new CarroMarca();
		cor = new CarroCor();
	}
	
	public void construirCarro(String modelo, String marca, String motor, String cor) {
		this.modelo.setModelo(modelo);
		this.motor.setMotor(motor);
		this.marca.setMarca(marca);
		this.cor.setCor(cor);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Modelo: ");
		builder.append(this.modelo.getModelo());
		builder.append("\nMarca: ");
		builder.append(this.marca.getMarca());
		builder.append("\nMotor: ");
		builder.append(this.motor.getMotor());
		builder.append("\nCor: ");
		builder.append(this.cor.getCor());
		
		return builder.toString();
	}
}
