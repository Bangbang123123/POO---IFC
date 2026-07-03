
public class Sorting {
	public static Metrics bubbleSort(int[] array) {
		
		Metrics metrics = new Metrics();
		metrics.startTime();
		boolean trocou;
		
		int k = array.length;
		
		int aux;
		for (int i = 0; i < k-1; i++) {
			trocou = false;
			for (int j = 0; j < k-1-i; j++) {
				metrics.addComparison();
				if (array[j] > array[j+1]) {
					metrics.addSwap();
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
					trocou = true;
				}
			}
			if (!trocou) break;
		}
		
		metrics.stopTime();
		return metrics;
	}
	
	public static Metrics selectionSort(int[] vetor) {
		
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		int k = vetor.length;
		
		int temp;
		int menor;
		for (int i = 0; i < k-1; i++) {
			menor = i;
			
			for (int j = i; j < k; j++) {
				metrics.addComparison();
				if (vetor[menor] > vetor[j]) {
					menor = j;
				}
			}
			
			if (i != menor) {
				metrics.addSwap();
				temp = vetor[i];
				vetor[i] = vetor[menor];
				vetor[menor] = temp;
			}
			
		}
		
		metrics.stopTime();
		return metrics;
	}
	
	public static Metrics insertionSort(int[] vetor) {
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		int k = vetor.length;
		
		for (int i = 1; i < k; i++) {
			int chave = vetor[i];
			int j = i - 1;
			while (j >= 0 && vetor[j] > chave) {
				metrics.addComparison();
				metrics.addSwap();
				vetor[j+1] = vetor[j];
				j--;
			}
			metrics.addComparison();
			metrics.addSwap();
			
			vetor[j+1] = chave;
		}
		
		metrics.stopTime();
		return metrics;
	}
	
	public static Metrics quickSort(int[] array) {
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		if (array == null || array.length <= 1) {
			metrics.stopTime();
			return metrics;
		}
		quickSortRec(array,0,array.length - 1,metrics);
		
		metrics.stopTime();
		return metrics;
	}
	
	private static void quickSortRec(int[] array, int inicio, int fim, Metrics metrics) {
		if (inicio < fim) {
			int meio = particao(array,inicio,fim,metrics);
			
			quickSortRec(array,inicio,meio,metrics);
			quickSortRec(array,meio+1,fim,metrics);
		}
	}
	
	private static int particao(int[] array, int i, int j, Metrics metrics) {
		int meio = (i + j)/2;
		int pivo = array[meio];
		
		while (true) {
			
			while (array[i] < pivo) {
				metrics.addComparison();
				i++;
			}
			while (array[j] > pivo) {
				metrics.addComparison();
				j--;
			}
			if (i >= j) {
				return j;
			}
			
			metrics.addSwap();
			int aux = array[i];
			array[i] = array[j];
			array[j] = aux;
			i++;
			j--;
			
		}
	}
	
	
	public static Metrics mergeSort(int[] array) {
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		if (array == null || array.length <= 1) {
			metrics.stopTime();
			return metrics;
		}
		mergeSortRec(array,0,array.length - 1,metrics);
		
		metrics.stopTime();
		return metrics;
	}
	
	private static void mergeSortRec(int[] array, int inicio, int fim, Metrics metrics) {
		if (inicio < fim) {
			int meio = (inicio + fim)/2;
			mergeSortRec(array,inicio,meio,metrics);
			
			mergeSortRec(array,meio+1,fim,metrics);
			
			merge(array,inicio,meio,fim,metrics);
		}
	}
	
	private static void merge(int[] array, int inicio, int meio, int fim, Metrics metrics) {
		
		int[] array_left = new int[meio - inicio + 1];
		int[] array_right = new int[fim - meio];
		
		for (int i = 0; i < array_left.length; i++) {
			metrics.addSwap();
			array_left[i] = array[inicio + i];
		}
		for (int i = 0; i < array_right.length; i++) {
			metrics.addSwap();
			array_right[i] = array[meio + 1 + i];
		}
		
		int i = 0;
		int j = 0;
		int k = inicio;
		
		while (i < array_left.length && j < array_right.length) {
			metrics.addComparison();
			metrics.addComparison();
			metrics.addComparison();
			if (array_left[i] <= array_right[j]) {
				metrics.addSwap();
				array[k] = array_left[i];
				i++;
			} else {
				metrics.addSwap();
				array[k] = array_right[j];
				j++;
			}
			k++;
		}
		
		while (i < array_left.length) {
			metrics.addComparison();
			metrics.addSwap();
			array[k] = array_left[i];
			i++;
			k++;
		}
		while (j < array_right.length) {
			metrics.addComparison();
			metrics.addSwap();
			array[k] = array_right[j];
			j++;
			k++;
		}
	}
	
	public static Metrics radixSort(int[] array) {
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		if (array == null || array.length <= 1) {
			metrics.stopTime();
			return metrics;
		}
		
		int maior = array[0];
		for (int i = 0; i < array.length; i++) {
			if (maior < array[i]) {
				maior = array[i];
			}
		}
		
		int exp = 1;
		while (maior / exp > 0) {
			countingSort(array, exp);
			exp *= 10;
		}
		
		metrics.stopTime();
		return metrics;
	}
	
	private static void countingSort(int[] array, int exp) {
		int[] count = new int[10];
		int[] output = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			count[(array[i] / exp) % 10]++;
		}
		
		for (int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}
	    
		for (int i = array.length - 1; i > -1; i--) {
			int digit = (array[i] / exp) % 10;
	        output[count[digit] - 1] = array[i];
	        count[digit] -= 1;
		}
		
		for (int i = 0; i < array.length; i++) {
			array[i] = output[i];
		}
	}
}
