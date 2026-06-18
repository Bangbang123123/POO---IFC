package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Cafeteria {
	private Map<Integer,Cafe> cafes = new HashMap<Integer,Cafe>();
	
	public void fazerPedido(String sabor, int mesa) {
		Cafe cafe = CafeFactory.getSaborCafe(sabor);
		this.cafes.put(mesa, cafe);
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		cafes.forEach((key, value) -> {
			builder.append(key);
			builder.append(": ");
			builder.append(value.toString());
			builder.append("\n");
		});
		
		return builder.toString();
	}
}
