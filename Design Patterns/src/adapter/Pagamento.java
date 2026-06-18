package adapter;
import java.text.DecimalFormat;

public class Pagamento implements SistemaPagamento {
	private float valor;
	
	public Pagamento(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public void processarPagamento() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Processando pagamento: R$ "+ df.format(this.getValor()));
	}

}
