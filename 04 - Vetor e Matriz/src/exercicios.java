import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha um exercício [1-38]: ");
		switch(input.nextInt()) {
		default:
			System.out.print("Número inválido");
		case 1:
			int[] nums = new int[5];
			System.out.println("Informe 5 números:");
			for (int i = 0; i < 5; i++) {
				nums[i] = input.nextInt();
			}
			System.out.print("\nVetor: ");
			for (int i = 0; i < 5; i++) {
				System.out.print("["+ nums[i] +"]");
			}
			break;
		case 2:
			float[] num_r = new float[10];
			System.out.println("Informe 10 números:");
			for (int i = 0; i < 10; i++) {
				num_r[i] = input.nextFloat();
			}
			System.out.print("\nVetor: ");
			for (int i = 9; i >= 0; i--) {
				System.out.print("["+ num_r[i] +"]");
			}
			break;
		case 3:
			float[] notas = new float[4];
			System.out.println("Informe 4 notas:");
			float media_ = 0;
			for (int i = 0; i < 4; i++) {
				notas[i] = input.nextFloat();
				media_ += notas[i];
			}
			System.out.print("\nNotas: ");
			for (int i = 0; i < 4; i++) {
				System.out.print("["+ notas[i] +"]");
			}
			System.out.print("\nMédia: "+ (media_/4));
			break;
		case 4:
			System.out.print("Informe uma string de 10 caracteres: ");
			String cons;
			input.nextLine();
			do {
				cons = input.nextLine();
				if (cons.length() != 10) {
					System.out.print("Tente de novo\n\n");
				}
			} while (cons.length() != 10);
			
			int cons_count = 0;
			for (int i = 0; i < 10; i++) {
				if (cons.charAt(i) != 'a' && cons.charAt(i) != 'e' && cons.charAt(i) != 'i' && cons.charAt(i) != 'o' && cons.charAt(i) != 'u') {
					System.out.print("["+ cons.charAt(i) +"]");
					cons_count++;
				}
			}
			System.out.print("\nNúmero de consoantes: "+ cons_count);
			
			break;
		case 5:
			int[] im_par = new int[10];
			System.out.println("Informe 10 números:");
			int par_count = 0;
			int impar_count = 0;
			for (int i = 0; i < 10; i++) {
				im_par[i] = input.nextInt();
				if (im_par[i] % 2 == 0) {
					par_count++;
				} else {
					impar_count++;
				}
			}
			int[] pares = new int[par_count];
			int[] impares = new int[impar_count];
			int par_i = 0;
			int impar_i = 0;
			System.out.print("\nVetor inicial: ");
			for (int i = 0; i < 10; i++) {
				System.out.print("["+ im_par[i] +"]");
				if (im_par[i] % 2 == 0) {
					pares[par_i] = im_par[i];
					par_i++;
				} else {
					impares[impar_i] = im_par[i];
					impar_i++;
				}
			}
			
			System.out.print("\nVetor par: ");
			for (int i = 0; i < par_count; i++) {
				System.out.print("["+ pares[i] +"]");
			}
			
			System.out.print("\nVetor ímpar: ");
			for (int i = 0; i < impar_count; i++) {
				System.out.print("["+ impares[i] +"]");
			}
			
			break;
		case 6:
			float[] medias = new float[10];
			int acima_sete = 0;
			for (int i = 0; i < 10; i++) {
				float media = 0;
				for (int j = 0; j < 4; j++) {
					System.out.print("Informe a "+ (j+1) +"° nota do "+ (i+1) +"° aluno: ");
					media += input.nextFloat();
				}
				media /= 4;
				if (media >= 7) {
					acima_sete++;
				}
				medias[i] = media;
			}
			System.out.print("Alunos com a média acima de 7: "+ acima_sete);
			
			break;
		case 7:
			int[] n = new int[5];
			int sum = 0;
			int mult = 1;
			for (int i = 0; i < 5; i++) {
				System.out.print("Informe o "+ (i+1) +"° número: ");
				n[i] = input.nextInt();
				sum += n[i];
				mult *= n[i];
			}
			
			System.out.print("\nSoma: "+ sum
							+ "\nMultiplicação: "+ mult
							+ "\nVetor: ");
			for (int i = 0; i < 5; i++) {
				System.out.print("["+ n[i] +"]");
			}
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		case 10:
			
			break;
		case 11:
			
			break;
		case 12:
			
			break;
		case 13:
			
			break;
		case 14:
			
			break;
		case 15:
			
			break;

			
		}
		input.close();
	}
}
