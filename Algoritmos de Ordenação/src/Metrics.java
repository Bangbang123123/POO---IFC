
public class Metrics {
	private long time;
	private long comparisons = 0;
	private long swaps = 0;
	
	public void addComparison() {
		comparisons++;
	}
	public void addSwap() {
		swaps++;
	}
	public void startTime() {
		time = System.nanoTime();
	}
	public void stopTime() {
		time = System.nanoTime() - time;
	}
	
	public String toString() {
		// Divide o tempo em minutos, segundos, milissegundos e nanossegundos
		long nanoseconds = time;
		long miliseconds = nanoseconds/1000000;
		long seconds = miliseconds/1000;
		long minutes = seconds/60;
		
		nanoseconds -= miliseconds * 1000000;
		miliseconds -= seconds * 1000;
		seconds -= minutes * 60;
		
		// Retorna tempo, comparações e trocas
		return "Tempo: "+ minutes +"m "+ seconds +"s "+ miliseconds +"ms "+ nanoseconds +"ns // Comparações: "+ comparisons +" // Trocas: "+ swaps;
	}
}
