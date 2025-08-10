import java.util.Scanner;


public class exercícios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o número do exercício: ");
		int select = input.nextInt();
		
		
		switch(select) {
			default:
				System.out.print("Número inválido");
				break;
			case 1:
				System.out.print("Alo mundo");
				break;
			case 2:
				System.out.print("Informe um número: ");
				System.out.print("O número informado foi: "+ input.nextInt());
				break;
			case 3:
				System.out.println("Informe dois números:");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				System.out.print("A soma dos números informados é: "+ (num1+num2));
				break;
			case 4:
				System.out.println("Informe as 4 notas: ");
				float media = 0;
				for (int i = 0; i < 4; i++) {
					media += input.nextFloat() / 4;
				}
				System.out.print("A média é: "+ media);
				break;
			case 5:
				System.out.print("Informe os metros: ");
				System.out.print("Isso em centímetros é: "+ (input.nextFloat() * 100));
				break;
			case 6:
				System.out.print("Informe o raio do círculo: ");
				float raio = input.nextFloat();
				System.out.print("A área do círculo é: "+ (raio * raio * Math.PI));
				break;
			case 7:
				System.out.print("Informe o lado do quadrado: ");
				System.out.print("A área do quadrado é: "+ (Math.pow(input.nextFloat(), 2)));
				break;
			case 8:
				System.out.print("Ganho por hora: ");
				float ganho = input.nextFloat();
				System.out.print("Horas trabalhadas nesse mês: ");
				float horas = input.nextFloat();
				System.out.print("O salário desse mês é de: "+ (ganho * horas));
				break;
			case 9:
				System.out.print("Informe os graus em Fahrenheit: ");
				System.out.print("Em celcius isso dá: "+ ((input.nextFloat()-32)*5/9));
				break;
			case 10:
				System.out.println("Informe 3 números:");
				int n1 = input.nextInt();
				int n2 = input.nextInt();
				float n3 = input.nextFloat();
				// Note: 2*n1 * n2/2 = n1*n2
				System.out.print("Resultados: "+ (n1*n2) +" // "+ (n1*3 + n3) +" // "+ (n3*n3*n3));
				break;
			case 11:
				System.out.print("Informe sua altura em metros: ");
				System.out.print("Seu peso ideal é: "+ ((72.7 * input.nextFloat()) - 58));
				break;
			case 12:
				System.out.print("Informe sua altura em metros: ");
				float altura = input.nextFloat();
				System.out.print("O peso ideal para mulheres é: "+ ((62.1 * altura) - 44.7) + "\nO peso ideal para homens é: "+ ((72.7 * altura) - 58));
				break;
			case 13:
				System.out.print("Informe a quantidade de peixes (Kg): ");
				float peixe = input.nextFloat();
				System.out.print("O excesso é de: "+ (peixe - 50) +"Kg\nE a multa é de: R$ "+ (peixe - 50)*4);
				break;
			case 14:
				System.out.print("Ganho por hora: ");
				float salario_bruto = input.nextFloat();
				System.out.print("Horas trabalhadas nesse mês: ");
				salario_bruto *= input.nextFloat();
				System.out.print("Salário Bruto: R$"+ salario_bruto
						+"\nImposto de renda: R$"+ (salario_bruto * 0.11)
						+"\nINSS: R$"+ (salario_bruto * 0.08)
						+"\nSindicato: R$"+ (salario_bruto * 0.05)
						+"\nSalário Líquido: R$"+ (salario_bruto * 0.76)
						);
				break;
			case 15:
				System.out.print("Informe a área em metros quadrados: ");
				double latas = Math.floor(input.nextDouble()/3/18 + 1);
				System.out.print("Latas a comprar: "+ latas + "\nPreço total: R$"+ (latas*80));
				break;
			case 16:
				System.out.print("Informe a área em metros quadrados: ");
				double litros = input.nextDouble()/6;
				double lata = Math.floor(litros/18+1);
				double galoes = Math.floor(litros/3.6+1);
				System.out.print("\nLatas a comprar: R$ "+ lata
						+ "\nPreço total: R$ "+ lata*80
						+ "\n\nGalões a comprar: R$ "+ galoes
						+ "\nPreço total: R$ "+ galoes*25
						);
				break;
		}
		input.close();
	}

}
