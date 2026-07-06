import java.util.Random;

public class Testing {

	public static void main(String[] args) {
		int[] data1 = {1,3,6,7,9,12,14,17,19,25,37,68,80,90};
		int[] data2 = {90,80,68,37,25,19,17,14,12,9,7,6,3,1};
		
		int constant = 1000;
		int[] data3 = new int[constant];
		Random rand = new Random();
		for (int i = 0; i < constant; i++) {
			data3[i] = rand.nextInt(0,constant);
		}
		
		constant = 10000;
		int[] data4 = new int[constant];
		for (int i = 0; i < constant; i++) {
			data4[i] = rand.nextInt(0,constant);
		}
		
		int[] clone1 = data1.clone();
		int[] clone2 = data2.clone();
		int[] clone3 = data3.clone();
		int[] clone4 = data4.clone();
		System.out.println("Bubble sort (ordenado): \n* "+ (Sorting.bubbleSort(clone1)).toString());
		System.out.println("Bubble sort (reverso): \n* "+ (Sorting.bubbleSort(clone2)).toString());
		System.out.println("Bubble sort (aleatório [100000]): \n* "+ (Sorting.bubbleSort(clone3)).toString());
		System.out.println("Bubble sort (aleatório [1000000]): \n* "+ (Sorting.bubbleSort(clone4)).toString() +"\n\n");
		
		clone1 = data1.clone();
		clone2 = data2.clone();
		clone3 = data3.clone();
		clone4 = data4.clone();

		System.out.println("Selection sort (ordenado): \n* "+ (Sorting.selectionSort(clone1)).toString());
		System.out.println("Selection sort (reverso): \n* "+ (Sorting.selectionSort(clone2)).toString());
		System.out.println("Selection sort (aleatório [100000]): \n* "+ (Sorting.selectionSort(clone3)).toString());
		System.out.println("Selection sort (aleatório [1000000]): \n* "+ (Sorting.selectionSort(clone4)).toString() +"\n\n");
		
		clone1 = data1.clone();
		clone2 = data2.clone();
		clone3 = data3.clone();
		clone4 = data4.clone();
		System.out.println("Insertion sort (ordenado): \n* "+ (Sorting.insertionSort(clone1)).toString());
		System.out.println("Insertion sort (reverso): \n* "+ (Sorting.insertionSort(clone2)).toString());
		System.out.println("Insertion sort (aleatório [100000]): \n* "+ (Sorting.insertionSort(clone3)).toString());
		System.out.println("Insertion sort (aleatório [1000000]): \n* "+ (Sorting.insertionSort(clone4)).toString() +"\n\n");
		
		clone1 = data1.clone();
		clone2 = data2.clone();
		clone3 = data3.clone();
		clone4 = data4.clone();

		System.out.println("Merge sort (ordenado): \n* "+ (Sorting.mergeSort(clone1)).toString());
		System.out.println("Merge sort (reverso): \n* "+ (Sorting.mergeSort(clone2)).toString());
		System.out.println("Merge sort (aleatório [100000]): \n* "+ (Sorting.mergeSort(clone3)).toString());
		System.out.println("Merge sort (aleatório [1000000]): \n* "+ (Sorting.mergeSort(clone4)).toString() +"\n\n");
		
		clone1 = data1.clone();
		clone2 = data2.clone();
		clone3 = data3.clone();
		clone4 = data4.clone();

		System.out.println("Quick sort (ordenado): \n* "+ (Sorting.quickSort(clone1)).toString());
		System.out.println("Quick sort (reverso): \n* "+ (Sorting.quickSort(clone2)).toString());
		System.out.println("Quick sort (aleatório [100000]): \n* "+ (Sorting.quickSort(clone3)).toString());
		System.out.println("Quick sort (aleatório [1000000]): \n* "+ (Sorting.quickSort(clone4)).toString());
		
		clone1 = data1.clone();
		clone2 = data2.clone();
		clone3 = data3.clone();
		clone4 = data4.clone();

		System.out.println("\n\nRadix sort (ordenado): \n* "+ (Sorting.radixSort(clone1)).toString());
		System.out.println("Radix sort (reverso): \n* "+ (Sorting.radixSort(clone2)).toString());
		System.out.println("Radix sort (aleatório [100000]): \n* "+ (Sorting.radixSort(clone3)).toString());
		System.out.println("Radix sort (aleatório [1000000]): \n* "+ (Sorting.radixSort(clone4)).toString());
		
		clone1 = data1.clone();
		clone2 = data2.clone();
		clone3 = data3.clone();
		clone4 = data4.clone();

		System.out.println("\n\nHeap sort (ordenado): \n* "+ (Sorting.heapSort(clone1)).toString());
		System.out.println("Heap sort (reverso): \n* "+ (Sorting.heapSort(clone2)).toString());
		System.out.println("Heap sort (aleatório [100000]): \n* "+ (Sorting.heapSort(clone3)).toString());
		System.out.println("Heap sort (aleatório [1000000]): \n* "+ (Sorting.heapSort(clone4)).toString());

		
	}

}
