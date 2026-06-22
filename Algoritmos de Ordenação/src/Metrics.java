
public class Metrics {
	private long time;
	private int comparisons = 0;
	private int swaps = 0;
	
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
		return "Tempo: "+ time +" ms // Comparações: "+ comparisons +" // Trocas: "+ swaps;
	}
}
