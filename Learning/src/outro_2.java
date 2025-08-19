import java.util.Scanner;

public class outro_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int N = 4;
		int[][] numeros = new int[N][N];
		int soma = 0;
		int maior_i = 0;
		int maior_j = 0;
		int menor_i = 0;
		int menor_j = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Digite um número: ");
				numeros[i][j] = input.nextInt();
				soma += numeros[i][j];
				if (numeros[menor_i][menor_j] > numeros[i][j]) {
					menor_i = i;
					menor_j = j;
				} else if (numeros[maior_i][maior_j] < numeros[i][j]) {
					menor_i = i;
					menor_j = j;
				}
			}
		}
		
		System.out.println("\nMatriz:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("["+ numeros[i][j] +"]");
			}
			System.out.print("\n");
		}
		
		
		double media = soma/(1.0 * N * N);
		System.out.print("\nSoma: "+ soma
						+"\nMédia: "+ media
						+"\nMaior: "+ numeros[maior_i][maior_j]
						+"\nMenor: "+ numeros[menor_i][menor_j]);
		
		input.close();
	}

}
