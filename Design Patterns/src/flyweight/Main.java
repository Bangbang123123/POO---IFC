package flyweight;

public class Main {

	public static void main(String[] args) {
		Cafeteria cafeteria = new Cafeteria();
		
		cafeteria.fazerPedido("Cappuccino", 1);
		cafeteria.fazerPedido("Cappuccino", 2);
		cafeteria.fazerPedido("Espresso", 3);
		cafeteria.fazerPedido("Espresso", 4);
		cafeteria.fazerPedido("Cappuccino", 5);
		cafeteria.fazerPedido("Espresso", 6);
		
		System.out.println(cafeteria.toString() +"Sabores criados: "+ CafeFactory.getTotalSaboresFeitos());
	}

}
