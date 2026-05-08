package abstract_factory;

public class Cliente {
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFiat();
		CarroSedan sedan = fabrica.criarCarroSedan();
		CarroPopular popular = fabrica.criarCarroPopular();
		sedan.exibirInfoSedan();
		popular.exibirInfoPopular();
		
		fabrica = new FabricaFord();
		sedan = fabrica.criarCarroSedan();
		popular = fabrica.criarCarroPopular();
		sedan.exibirInfoSedan();
		popular.exibirInfoPopular();
	}
}
