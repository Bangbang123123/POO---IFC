import java.util.Scanner;

public class Exercícios {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o número do exercício: ");
		int select = input.nextInt();
		
		
		switch(select) {
			default:
				System.out.print("Número inválido");
				break;
			case 1:
				System.out.println("Digite dois números: ");
				float num1 = input.nextFloat();
				float num2 = input.nextFloat();
				if (num1 > num2) {
					System.out.print("Maior número: "+ num1);
				}else {
					System.out.print("Maior número: "+ num2);
				}
				break;
			case 2:
				System.out.print("Digite um número: ");
				float n= input.nextFloat();
				if (n > 0) {
					System.out.print("É positivo");
				}else if (n < 0){
					System.out.print("É negativo");
				}else {
					System.out.print("É zero");
				}
				break;
			case 3:
				System.out.print("Informe o sexo (M/F): ");
				// clear enter input
				input.nextLine();
				char sexo = input.nextLine().charAt(0);
				if (sexo == 'M') {
					System.out.print("Masculino");
				}else if (sexo == 'F') {
					System.out.print("Feminino");
				}else {
					System.out.print("Inválido");
				}
				break;
			case 4:
				System.out.print("Informe uma letra: ");
				// clear enter input
				input.nextLine();
				char letra = input.nextLine().charAt(0);
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
					letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
					System.out.print("É vogal");
				}else {
					System.out.print("É consoante");
				}
				
				break;
			case 5:
				System.out.print("Informe um ano: ");
				int ano = input.nextInt();
				if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
					System.out.print("É um ano bissexto");
				}else {
					System.out.print("Não é um ano bissexto");
				}
				break;
			case 6:
				System.out.print("Informe um número: ");
				int num = input.nextInt();
				if (num % 2 == 0) {
					System.out.print("Esse número é par // "+ (num+1) +" é ímpar");
				}else {
					System.out.print("Esse número é ímpar // "+ (num+1) +" é par");
				}
				break;
			case 7:
				System.out.println("Informe 3 números: ");
				int[] list = {0,0,0};
				for(int i = 0; i < 3 ; i++) {
					list[i] = input.nextInt();
				}
				// bubble sorting
				boolean is_sorted = false;
				while(!is_sorted) {
					is_sorted = true;
					for (int i = 0; i<2 ; i++) {
						if (list[i] < list[i+1]) {
							int buffer = list[i+1];
							list[i+1] = list[i];
							list[i] = buffer;
							is_sorted = false;
						}
					}
				}
				System.out.print("A lista em ordem decrescente é: [ ");
				for(int i = 0;i<3;i++) {
					System.out.print(list[i]+" ");
				}
				System.out.print("]");
				break;
			case 8:
				// read2, get média, return aproved or not
				System.out.print("Informe 2 notas: ");
				float media = (input.nextFloat() + input.nextFloat())/2;
				if (media >= 7) {
					System.out.print("Aprovado com a média: "+ media);
				}else {
					System.out.print("Reprovado com a média: "+ media);
				}
				break;
			case 9:
				System.out.println("Informe sexo [M/F], altura e peso: ");
				double alt = input.nextDouble();
				double peso = input.nextDouble();
				input.nextLine();
				char sex = input.nextLine().charAt(0);
				
				double peso_ideal;
				if (sex == 'M'){
					peso_ideal = (72.7*alt) - 58;
				}else if (sex == 'F'){
					peso_ideal = (62.1*alt) - 44.7;
				}else {
					System.out.print("Sexo inválido");
					break;
				}
				
				if (peso_ideal > peso) {
					System.out.print("Está abaixo do peso ideal");
				}else if (peso_ideal < peso) {
					System.out.print("Está acima do peso ideal");
				}else {
					System.out.print("Está no peso ideal");
				}
				
				break;
			case 10:
				// read3, show maior and menor
				System.out.print("Informe 3 números: ");
				int[] list2 = {0,0,0};
				int maior = 0,menor = 0;
				for(int i = 0;i<3;i++) {
					list2[i] = input.nextInt();
					if (i == 0) {
						maior = list2[i];
						menor = list2[i];
					}else {
						if (maior < list2[i]) {
							maior = list2[i];
						}else if (menor > list2[i]) {
							menor = list2[i];
						}
					}
				}
				System.out.print("Maior: "+ maior +" // Menor: "+ menor);
				
				
				break;
			case 11:
				// read m-v-n, return a message
				break;
		
		}
		
		// 1-11 12-22 23-33

	}

}
