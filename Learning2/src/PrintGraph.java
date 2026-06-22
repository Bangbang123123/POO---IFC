
public class PrintGraph {
	
	private static boolean equals(double f, double y) {
		return f >= y - 1.5 && f <= y + 1.5;
	}
	
	private static boolean testFunction(double x, double y) {
		return 
				equals(
						Math.sin(x/20)*20 + 20,y);
		
	}
	
	private static void printGraph(double x_bound, double y_bound) {
		for (double y = y_bound - 1; y >= 0; y -= 2) {
			for (double x = - x_bound/2; x < x_bound/2; x++) {
				if (testFunction(x,y)) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		printGraph(160,80);
	}
}
