
public class Cliente {
	public static void main(String[] sgra) {
		PalioPrototype protPalio = new PalioPrototype();
		CarroPrototype palioNovo = protPalio.clonar();
		palioNovo.setValorCompra(27900.0);
		CarroPrototype palioUsado = protPalio.clonar();
		palioUsado.setValorCompra(21000.0);
		
		System.out.println(palioNovo.exibirInfo());
		System.out.println(palioUsado.exibirInfo());
	}
}
