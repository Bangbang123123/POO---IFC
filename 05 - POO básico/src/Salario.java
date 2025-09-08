
public class Salario {
	private double horas;
	private double ganhoH;
	
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getGanhoH() {
		return ganhoH;
	}
	public void setGanhoH(double ganhoH) {
		this.ganhoH = ganhoH;
	}
	
	public String imposto() {
		StringBuilder text = new StringBuilder();
		
		double salario = ganhoH * horas;
		text.append("\nSalário bruto: R$ ");
		text.append(salario);
		text.append("\nIR: R$ ");
		text.append(salario * 0.11);
		text.append("\nINSS: R$ ");
		text.append(salario * 0.08);
		text.append("\nSindicato: R$ ");
		text.append(salario * 0.05);
		text.append("\nSalário líquido: R$ ");
		text.append(salario * 0.76);
		
		return text.toString();
	}
	
	
}
