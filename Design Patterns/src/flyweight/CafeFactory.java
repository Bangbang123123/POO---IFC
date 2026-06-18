package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CafeFactory {
	private static Map<String,Cafe> sabores = new HashMap<String,Cafe>();
	
	public static Cafe getSaborCafe(String sabor) {
		if (sabores.get(sabor) == null) {
			int preco = (int) (Math.random() * 10);
			sabores.put(sabor, new Cafe(sabor, preco));
		}
		return sabores.get(sabor);
	}
	
	public static int getTotalSaboresFeitos() {
		return sabores.size();
	}
}
