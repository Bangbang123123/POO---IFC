
public class Sorting {
	public static Metrics bubbleSort(int[] array) {
		// Inicialização de métricas
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		boolean trocou;
		int k = array.length;
		
		int aux;
		// Para cada valor do array (certeza de ordenação)
		for (int i = 0; i < k-1; i++) {
			trocou = false;
			
			// Para cada valor do array
			for (int j = 0; j < k-1-i; j++) {
				
				// Compara se o próximo valor é menor que o atual
				metrics.addComparison();
				if (array[j] > array[j+1]) {
					
					// Troca se for
					metrics.addSwap();
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
					trocou = true;
				}
			}
			
			// Se está ordenado, pula
			if (!trocou) break;
		}
		
		// Fechamento e retorno de métricas
		metrics.stopTime();
		return metrics;
	}
	
	public static Metrics selectionSort(int[] vetor) {
		// Inicialização de métricas
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		int k = vetor.length;
		
		int temp;
		int menor;
		
		// Para cada valor do array (certeza de ordenação)
		for (int i = 0; i < k-1; i++) {
			menor = i;
			
			// Para cada valor do array
			for (int j = i; j < k; j++) {
				
				// Coleta o menor valor
				metrics.addComparison();
				if (vetor[menor] > vetor[j]) {
					menor = j;
				}
			}
			
			// Testa se o valor é menor que o i atual
			if (i != menor) {
				// Troca se necessário
				metrics.addSwap();
				temp = vetor[i];
				vetor[i] = vetor[menor];
				vetor[menor] = temp;
			}
			
		}
		
		// Fechamento e retorno de métricas
		metrics.stopTime();
		return metrics;
	}
	
	public static Metrics insertionSort(int[] vetor) {
		// Inicialização de métricas
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		int k = vetor.length;
		
		// Para cada valor do array
		for (int i = 1; i < k; i++) {
			int chave = vetor[i];
			int j = i - 1;
			
			// Testa para cada valor do array se a chave é menor
			while (j >= 0 && vetor[j] > chave) {
				// Se for, a chave continua indo para o início do array
				metrics.addComparison();
				metrics.addSwap();
				vetor[j+1] = vetor[j];
				j--;
			}
			metrics.addComparison();
			metrics.addSwap();
			
			vetor[j+1] = chave;
		}
		
		// Fechamento e retorno de métricas
		metrics.stopTime();
		return metrics;
	}
	
	public static Metrics quickSort(int[] array) {
		// Inicialização de métricas
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		// Retorna se array for nulo ou de tamanho menor que 1
		if (array == null || array.length <= 1) {
			metrics.stopTime();
			return metrics;
		}
		quickSortRec(array,0,array.length - 1,metrics);
		
		// Fechamento e retorno de métricas
		metrics.stopTime();
		return metrics;
	}
	
	private static void quickSortRec(int[] array, int inicio, int fim, Metrics metrics) {
		if (inicio < fim) {
			// Reparte o array em dois recursivamente
			int meio = particao(array,inicio,fim,metrics);
			
			quickSortRec(array,inicio,meio,metrics);
			quickSortRec(array,meio+1,fim,metrics);
		}
	}
	
	private static int particao(int[] array, int i, int j, Metrics metrics) {
		int meio = (i + j)/2;
		int pivo = array[meio];
		
		while (true) {
			// Encontra um valor maior que o pivô na esquerda
			while (array[i] < pivo) {
				metrics.addComparison();
				i++;
			}
			
			// Encontra um valor menor que o pivô na direita
			while (array[j] > pivo) {
				metrics.addComparison();
				j--;
			}
			
			// Para se os ponteiros da direita e esquerda se inverterem
			if (i >= j) {
				return j;
			}
			
			// Troca os valores maior e menor que o pivô encontrados
			metrics.addSwap();
			int aux = array[i];
			array[i] = array[j];
			array[j] = aux;
			i++;
			j--;
			
		}
	}
	
	
	public static Metrics mergeSort(int[] array) {
		// Inicialização de métricas
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		// Retorna se array for nulo ou de tamanho menor que 1
		if (array == null || array.length <= 1) {
			metrics.stopTime();
			return metrics;
		}
		mergeSortRec(array,0,array.length - 1,metrics);
		
		// Fechamento e retorno de métricas
		metrics.stopTime();
		return metrics;
	}
	
	private static void mergeSortRec(int[] array, int inicio, int fim, Metrics metrics) {
		if (inicio < fim) {
			// Divide o array em dois
			int meio = (inicio + fim)/2;
			mergeSortRec(array,inicio,meio,metrics);
			
			mergeSortRec(array,meio+1,fim,metrics);
			
			// Junta os arrays separados
			merge(array,inicio,meio,fim,metrics);
		}
	}
	
	private static void merge(int[] array, int inicio, int meio, int fim, Metrics metrics) {
		
		// Separa o array em dois
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
		
		// Enquanto os arrays não acabarem
		while (i < array_left.length && j < array_right.length) {
			metrics.addComparison();
			metrics.addComparison();
			
			// Seleciona o menor dos dois arrays e coloca no principal
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
		
		// Preenche o resto dos elementos faltantes no array principal
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
		// Inicialização de métricas
		Metrics metrics = new Metrics();
		metrics.startTime();
		
		// Retorna se o array for nulo ou de tamanho menor que 1
		if (array == null || array.length <= 1) {
			metrics.stopTime();
			return metrics;
		}
		
		// Procura o maior valor
		int maior = array[0];
		for (int i = 0; i < array.length; i++) {
			if (maior < array[i]) {
				maior = array[i];
			}
		}
		
		// Para cada dígito dos elementos (quantidade de iterações ditada pelo maior valor)
		int exp = 1;
		while (maior / exp > 0) {
			countingSort(array, exp, metrics);
			exp *= 10;
		}
		
		// Fechamento e retorno de métricas
		metrics.stopTime();
		return metrics;
	}
	
	private static void countingSort(int[] array, int exp, Metrics metrics) {
		// Inicialização da contagem
		int[] count = new int[10];
		int[] output = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			count[(array[i] / exp) % 10]++;
		}
		
		// Soma de uma contagem a outra para coletar o index final de cada dígito
		for (int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}
	    
		// Ordena dependendo do dígito
		for (int i = array.length - 1; i > -1; i--) {
			int digit = (array[i] / exp) % 10;
			
			metrics.addSwap();
	        output[count[digit] - 1] = array[i];
	        count[digit] -= 1;
		}
		
		// Retorna o output para o array original
		for (int i = 0; i < array.length; i++) {
			array[i] = output[i];
		}
	}
	
	private static void heapify(int[] array, int n, int i, Metrics metrics) {
		// Pega o valor e mais dois além no array
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Compara qual dos três valores é maior
        metrics.addComparison();
        metrics.addComparison();
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }
        metrics.addComparison();
        metrics.addComparison();
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Se o valor encontrado é diferente do principal
        if (largest != i) {
        	// Troca o nodo principal pelo maior
        	metrics.addSwap();
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Faz a mesma coisa no valor maior, para garantir a validade da árvore
            heapify(array, n, largest, metrics);
        }
    }
	
	public static Metrics heapSort(int[] array) {
		// Inicialização de métricas
		Metrics metrics = new Metrics();
		metrics.startTime();
		
        int n = array.length;

        // Cria um max-heap, onde o valor pai é sempre maior que o valor filho
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i, metrics);
        }

        // Ordena os valores criando heaps e movendo os itens menores para os nodos filhos e itens maiores para nodos pais
        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0, metrics);
        }
        
        // Fechamento e retorno de métricas
        metrics.stopTime();
		return metrics;
    }
}
