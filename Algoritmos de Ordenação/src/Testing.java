import java.util.Random;

public class Testing {
	
	public static void printTests(int[] data) {
		int[] clone = data.clone();
		System.out.println("Bubble sort:    "+ Sorting.bubbleSort(clone).toString());
		
		clone = data.clone();
		System.out.println("Selection sort: "+ Sorting.selectionSort(clone).toString());
		
		clone = data.clone();
		System.out.println("Insertion sort: "+ Sorting.insertionSort(clone).toString());
		
		clone = data.clone();
		System.out.println("Quick sort:     "+ Sorting.quickSort(clone).toString());
		
		clone = data.clone();
		System.out.println("Merge sort:     "+ Sorting.mergeSort(clone).toString());
		
		clone = data.clone();
		System.out.println("Radix sort:     "+ Sorting.radixSort(clone).toString());
		
		clone = data.clone();
		System.out.println("Heap sort:      "+ Sorting.heapSort(clone).toString());
	}
	
	public static void allTests(int constant) {
		
		int[] data1 = new int[constant];
		int[] data2 = new int[constant];
		int[] data3 = new int[constant];
		
		Random rand = new Random();
		for (int i = 0; i < constant; i++) {
			data1[i] = i;
			data2[i] = constant - i - 1;
			data3[i] = rand.nextInt(0,constant);
		}
		
		System.out.println("* Ordenado ["+ constant +"]:\n");
		printTests(data1);
		System.out.println("\n* Reverso ["+ constant +"]:\n");
		printTests(data2);
		System.out.println("\n* Aleatório ["+ constant +"]:\n");
		printTests(data3);
	}

	public static void main(String[] args) {
		System.out.println("--- Teste com 100000 ---\n");
		allTests(100000);
		System.out.println("\n\n--- Teste com 1000000 ---\n");
		allTests(1000000);
	}

}
