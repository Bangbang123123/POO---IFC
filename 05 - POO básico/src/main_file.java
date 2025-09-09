import java.util.Scanner;

public class main_file {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha um exercício [1-15]: ");
		
		switch(input.nextInt()) {
		default:
			System.out.print("Número inválido");
			break;
		case 1:
			Nomes nomes = new Nomes();
			
			System.out.print("Informe um nome: ");
			input.nextLine();
			nomes.setNome(input.nextLine());
			System.out.print("Informe um sobrenome: ");
			nomes.setSobrenome(input.nextLine());
			
			System.out.print("Nome completo: "+ nomes.juntar());
			
			break;
		case 2:
			Intervalo intervalo = new Intervalo();
			
			System.out.print("Informe 2 números:\n");
			intervalo.setN1(input.nextInt());
			intervalo.setN2(input.nextInt());
			
			System.out.print(intervalo.retorneIntervalo());
			
			break;
		case 3:
			Operacoes op = new Operacoes();
			
			System.out.print("Informe 2 números:\n");
			op.setN1(input.nextInt());
			op.setN2(input.nextInt());
			System.out.print("Informe a operação [+ - * /]: ");
			input.nextLine();
			System.out.print(op.calcule(input.nextLine().charAt(0)));
			
			break;
		case 4:
			Salario conta = new Salario();
			
			System.out.print("Informe o ganho por hora e as horas trabalhadas:\n");
			conta.setGanhoH(input.nextDouble());
			conta.setHoras(input.nextDouble());
			System.out.print(conta.imposto());
			
			break;
		case 5:
			Loja tabela = new Loja();
			int pedido;
			int qnt;
			double result;
			System.out.print("-- Tabela de preços --\n"
							+ "Cachorro Quente 100 R$ 1,20\n"
							+ "Bauru Simples 101 R$ 1,30\n"
							+ "Bauru com ovo 102 R$ 1,50\n"
							+ "Hambúrguer 103 R$ 1,20\n"
							+ "Cheeseburguer 104 R$ 1,30\n"
							+ "Refrigerante 105 R$ 1,00\n\n");
			
			do {
				System.out.print("\nInforme um produto (código) e sua quantidade [qualquer valor diferente dos códigos finaliza a compra]: ");
				pedido = input.nextInt();
				qnt = input.nextInt();
				result = tabela.verificarPreco(pedido, qnt);
				if (result == -1) {
					System.out.print("Finalizando pedido...\n\n");
				} else {
					System.out.print("Valor do item: R$"+ result);
				}
			} while (result != -1);
			System.out.print("Total da compra: R$ "+ tabela.getTotal());
			
			break;
		case 10:
			Televisao tv = new Televisao();
			input.nextLine();
			while (true) {
				System.out.print("\n\nO que fazer (mudar canal - (c) // aumentar volume - (+) // diminuir volume - (-))?");
				switch (input.nextLine().charAt(0)) {
				default:
					System.out.print("Input errado, tente de novo\n\n");
					break;
				case 'c':
					System.out.print("Qual canal? ");
					tv.setAtual(input.nextInt());
					input.nextLine();
					System.out.print("Canal: "+ tv.getAtual());
					break;
				case '+':
					tv.aumentarVolume(5);
					System.out.print("Volume: ["+ tv.getVolume() +"] ");
					for (int i = 0; i < tv.getVolume()/10; i++) {
						System.out.print("#");
					}
					break;
				case '-':
					tv.diminuirVolume(5);
					System.out.print("Volume: ["+ tv.getVolume() +"] ");
					for (int i = 0; i < tv.getVolume()/10; i++) {
						System.out.print("#");
					}
					break;
				}
			}

		}
		input.close();
	}
}