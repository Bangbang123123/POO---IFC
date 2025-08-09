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
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			case 11:
				
				break;
		
		}
		
		// TODO Auto-generated method stub

	}

}
