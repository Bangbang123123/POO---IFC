import java.util.Scanner;
import java.util.Random;

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
			final String vog = "aeiou";
			final String con = "bcdfghjklmnpqrstvwxyz";
			int senha_tam;
			do {
				System.out.print("Informe o tamanho da senha: ");
				senha_tam = input.nextInt();
				if (senha_tam > 26) {
					System.out.print("Maior que 26, tente de novo\n");
				}
			} while (senha_tam > 26);
			
			Random rand = new Random();
			System.out.print("Senha: ");
			for (int i = 0; i < senha_tam; i++) {
				if (i % 2 == 0) {
					System.out.print(con.charAt(rand.nextInt(26)));
				} else {
					System.out.print(vog.charAt(rand.nextInt(5)));
				}
			}
			
			break;
		case 9:
			System.out.print("Informe um texto: ");
			input.nextLine();
			String text = input.nextLine();
			char[] text2 = new char[text.length()];
			for (int i = 0; i < text.length(); i++) {
				text2[i] = text.charAt(i);
				System.out.print("["+ text2[i] +"]");
			}
			
			break;
		case 10:
			System.out.print("Informe uma data (dd/mm/aaaa): ");
			input.nextLine();
			String[] data = input.nextLine().split("/");
			int[] data_int = new int[3];
			if (data.length == 3) {
				for (int i = 0; i < 3; i++) {
					data_int[i] = Integer.parseInt(data[i]);
				}
				System.out.print("Data: "+ data_int[0] +"/"+ data_int[1] +"/"+ data_int[2]);
			} else {
				System.out.print("Data inválida");
			}
			break;
		case 11:
			System.out.print("Informe uma lista de nomes separadas por ';' : ");
			input.nextLine();
			String[] nomes = input.nextLine().split(";");
			System.out.print("Nomes: ");
			for (int i = 0; i < nomes.length; i++) {
				System.out.print("["+ nomes[i] +"]");
			}
				
			break;
		case 12:
			float[] alt = new float[5];
			int[] idade = new int[5];
			
			int alto = 0;
			int baixo = 0;
			int velho = 0;
			int novo = 0;
			float med_idade = 0;
			float med_alt = 0;
			
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe a altura e idade da "+ (i+1) +"° pessoa: ");
				alt[i] = input.nextFloat();
				idade[i] = input.nextInt();
				if (alt[i] > alt[alto]) {
					alto = i;
				}
				if (alt[i] < alt[baixo]) {
					baixo = i;
				}
				if (idade[i] > idade[velho]) {
					velho = i;
				}
				if (idade[i] < idade[novo]) {
					novo = i;
				}
				med_idade += idade[i];
				med_alt += alt[i];
			}
			med_alt /= 5;
			med_idade /= 5;
			System.out.print("\nMédia de altura: "+ med_alt
							+"\nMédia de idade: "+ med_idade
							+"\nMais alto: Altura: "+ alt[alto] +" // Idade: "+ idade[alto]
							+"\nMais baixo: Altura: "+ alt[baixo] +" // Idade: "+ idade[baixo]
							+"\nMais velho: Altura: "+ alt[velho] +" // Idade: "+ idade[velho]
							+"\nMais novo: Altura: "+ alt[novo] +" // Idade: "+ idade[novo]
							+"\nVetor: ");
			for (int i = 0; i < 5; i++) {
				System.out.print("[Altura: "+ alt[i] +"// Idade: "+ idade[i] +"] ");
			}
			System.out.print("\nAcima da média (altura): ");
			for (int i = 0; i < 5; i++) {
				if (alt[i] > med_alt)
					System.out.print("[Altura: "+ alt[i] +"// Idade: "+ idade[i] +"] ");
			}
			System.out.print("\nAbaixo da média (altura): ");
			for (int i = 0; i < 5; i++) {
				if (alt[i] < med_alt)
					System.out.print("[Altura: "+ alt[i] +"// Idade: "+ idade[i] +"] ");
			}
			System.out.print("\nAcima da média (idade): ");
			for (int i = 0; i < 5; i++) {
				if (idade[i] > med_idade)
					System.out.print("[Altura: "+ alt[i] +"// Idade: "+ idade[i] +"] ");
			}
			System.out.print("\nAbaixo da média (idade): ");
			for (int i = 0; i < 5; i++) {
				if (idade[i] < med_idade)
					System.out.print("[Altura: "+ alt[i] +"// Idade: "+ idade[i] +"] ");
			}
			
			break;
		case 13:
			int[] v1 = new int[10];
			int[] v2 = new int[10];
			int[] v3 = new int[20];
			
			System.out.print("Informe os 20 números: ");
			for (int i = 0; i < 20; i++) {
				if (i <= 9) {
					v1[i] = input.nextInt();
				} else {
					v2[i-10] = input.nextInt();
				}
			}
			System.out.print("Vetor intercalado: ");
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0) {
					v3[i] = v1[i/2];
				} else {
					v3[i] = v2[(i-1)/2];
				}
				System.out.print("["+ v3[i] +"]");
			}
			
			break;
		case 14:
			float[] altura = new float[30];
			int[] id = new int[30];

			float med_id = 0;
			float med_altura = 0;
			
			for (int i = 0; i < 30; i++) {
				System.out.println("Informe a altura e idade da "+ (i+1) +"° pessoa: ");
				altura[i] = input.nextFloat();
				id[i] = input.nextInt();
				med_id += id[i];
				med_altura += altura[i];
			}
			med_altura /= 30;
			med_id /= 30;
			System.out.print("\nMédia de altura: "+ med_altura
							+"\nMédia de idade: "+ med_id
							+"\nMaiores de 13 anos com altura abaixo da média:\n");
			for (int i = 0; i < 30; i++) {
				if (id[i] > 13 && altura[i] < med_altura) {
					System.out.print("[Altura: "+ altura[i] +"// Idade: "+ id[i] +"] ");
				}
			}
			break;
		case 15:
			final int N = 5;
			int[] vetor = new int[N];
			
			int i = 0;
			while (i < N) {
				System.out.print("Informe o "+ (i+1) +"° número [0-20]: ");
				vetor[i] = input.nextInt();
				if (vetor[i] < 0 || vetor[i] > 20) {
					System.out.print("\nInválido, somente entre [0-20]\n\n");
				} else {
					i++;
				}
			}
			
			System.out.print("Gráfico:");
			for (int j = 0; j < N; j++) {
				System.out.print("\n"+ j +" : ");
				for (int h = 0; h < vetor[j]; h++) {
					System.out.print("#");
				}
			}
			
			break;
		}
		input.close();
	}
}
