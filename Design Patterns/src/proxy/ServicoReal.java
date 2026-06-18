package proxy;

public class ServicoReal implements Servico{

	@Override
	public void executar() {
		System.out.println("Executando serviço real");
	}
	
}
