package adapter;

public class AdaptadorPagamento implements SistemaPagamento {
	
	private SistemaPagamentoTerceiros spt;
	
	public AdaptadorPagamento(SistemaPagamentoTerceiros spt) {
		this.spt = spt;
	}
	
	
	@Override
	public void processarPagamento() {
		this.spt.processarPagamento();
	}

}
