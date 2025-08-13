import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exercícios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha um exercício [1-37]: ");
		switch(input.nextInt()) {
			default:
				System.out.print("Número inválido");
				break;
			case 1:
				int num = 0;
				do {
					System.out.print("Informe um número de 0 a 10: ");
					num = input.nextInt();
					if (num < 0 || num > 10) {
						System.out.println("Tente de novo");
					}
				}while(num < 0 || num > 10);
				System.out.print("Número informado: "+ num);
				break;
			case 2:
				String senha;
				String usuario;
				input.nextLine();
				do {
					System.out.print("Informe nome e senha: ");
					usuario = input.nextLine();
					senha = input.nextLine();
					if (usuario.equals(senha)) {
						System.out.println("Proibido nome e senha iguais");
					}
				}while(usuario.equals(senha));
				System.out.print("Nome: "+ usuario +"\nSenha: "+senha);
				break;
			case 3:
				String nome = "";
				int idade = 0;
				float salario = 0;
				char sexo = 'a';
				char est_civil = 'a';
				input.nextLine();
				
				int counter = 0;
				while(counter < 5) {
					switch(counter) {
						case 0:
							System.out.print("Informe seu nome (mais de 3 caracteres): ");
							nome = input.nextLine();
							if (nome.length() > 3) {
								counter++;
							}else {
								System.out.println("Input inválido: menos que 3 caracteres!");
							}
							break;
						case 1:
							System.out.print("Informe sua idade (entre 0 e 150 anos): ");
							idade = input.nextInt();
							input.nextLine();
							if (idade > 0 && idade < 150) {
								counter++;
							}else {
								System.out.println("Input inválido: idade fora do intervalo (0,150)!");
							}
							break;
						case 2:
							System.out.print("Informe seu salário (maior que 0): ");
							salario = input.nextFloat();
							input.nextLine();
							if (salario > 0) {
								counter++;
							}else {
								System.out.println("Input inválido: nulo ou negativo!");
							}
							break;
						case 3:
							System.out.print("Informe o sexo (f/m): ");
							sexo = input.nextLine().charAt(0);
							if (sexo == 'f' || sexo == 'm') {
								counter++;
							}else {
								System.out.println("Input inválido: f/m apenas!");
							}
							break;
						case 4:
							System.out.print("Informe o estado civil (s/c/v/d): ");
							est_civil = input.nextLine().charAt(0);
							if (est_civil == 's' || est_civil == 'c' || est_civil == 'v' || est_civil == 'd') {
								counter++;
							}else {
								System.out.println("Input inválido: s/c/v/d apenas!");
							}
							break;
					}
				}
				System.out.print("Informações:\nNome: "+nome+"\nIdade: "+idade+"\nSalário: R$ "+salario+"\nSexo: "+sexo+"\nEstado Civil: "+est_civil);
				break;
			case 4:
				int hab1;
				float tax1;
				int hab2;
				float tax2;
				do {
					System.out.println("Informe os habitantes e a taxa de crescimento (faça duas vezes): ");
					hab1 = input.nextInt();
					tax1 = input.nextFloat();
					hab2 = input.nextInt();
					tax2 = input.nextFloat();
					if (hab1 >= hab2 || tax1 <= tax2) {
						System.out.println("Resulta em infinito ou zero a diferença em anos dos hab.A e hab.B. Tente de novo.");
					}else {
						int anos = 0;
						while (hab1 < hab2) {
							anos++;
							hab1 *= tax1+1;
							hab2 *= tax2+1;
							System.out.print("Habitantes A: "+hab1+" // Habitantes B: "+hab2+" // Anos: ["+anos+"]\n");
						}
					}
					System.out.print("Repetir?[s/n]: ");
					input.nextLine();
				} while(input.nextLine().charAt(0) != 'n');	
				break;
			case 5:
				for (int i = 1; i <= 20;i++) {
					System.out.println("["+i+"]");
				}
				for (int i = 1; i <= 20;i++) {
					System.out.print("["+i+"] ");
				}
				
				break;
			case 6:
				for(int i = 1; i < 50; i += 2) {
					System.out.print("["+i+"]");
				}
				break;
			case 7:
				System.out.println("Informe 2 números: ");
				int begin = input.nextInt();
				int end = input.nextInt();
				
				if (begin >= end) {
					int buffer = end;
					end = begin;
					begin = buffer;
				}
				
				System.out.println("Valores entre ["+begin+"] e ["+end+"]:");
				for (int i = (begin+1); i < end; i++) {
					System.out.print("["+i+"]");
				}
				break;
			case 8:
				System.out.println("Informe 2 números: ");
				int begin_ = input.nextInt();
				int end_ = input.nextInt();
				
				if (begin_ >= end_) {
					int buffer = end_;
					end_ = begin_;
					begin_ = buffer;
				}
				int sum = 0;
				System.out.println("Valores entre ["+begin_+"] e ["+end_+"]:");
				for (int i = (begin_+1); i < end_; i++) {
					System.out.print("["+i+"]");
					sum += i;
				}
				System.out.print("\nSoma de todos acima: "+sum);
				break;
			case 9:
				System.out.print("Informe um número de 1 a 10: ");
				int base;
				do {
					base = input.nextInt();
					if (base < 1 || base > 10) {
						System.out.println("Deve ser um número de 1 a 10. Tente de novo");
					}
				}while(base < 1 || base > 10);
				
				System.out.println("Tabuada de "+ base);
				for (int i = 1; i <= 10; i++) {
					System.out.println(base +" * "+ i +" = "+ (base*i));
				}
				break;
			case 10:
				System.out.println("Informe um número e seu expoente:");
				float numero = input.nextFloat();
				int exp = input.nextInt();
				float result = 1;
				if (exp < 0) {
					exp = -exp;
					numero = 1/numero;
				}
				
				for (int i = 0; i < exp; i++) {
					result *= numero;
				}
				
				System.out.print("Resultado: "+ result);
				
				
				break;
			case 11:
				int par = 0;
				int impar = 0;
				for (int i = 1; i <= 10; i++) {
					System.out.print("Informe o "+ i +"° número: ");
					if (input.nextInt() % 2 == 0) {
						par++;
					}else {
						impar++;
					}
				}
				System.out.print("Quantidade de pares: "+ par +"\nQuantidade de ímpares: "+ impar);
				break;
			case 12:
				System.out.print("n número da sequência de fibonacci: ");
				int n = input.nextInt();
				int a = 0;
				int b = 1;
				System.out.println("Sequência:");
				for (int i = 0; i < n; i++) {
					System.out.print("["+ b +"]");
					int buffer = b;
					b += a;
					a = buffer;
				}
				break;
			case 13:
				System.out.print("Informe o fatorial: ");
				int fat = input.nextInt();
				int fatorial = 1;
				for (int i = 1; i <= fat;i++) {
					fatorial *= i;
				}
				System.out.print("Fatorial de "+ fat +": "+ fatorial);
				break;
			case 14:
				System.out.println("Informe um número de termos: ");
				int termos = input.nextInt();
				System.out.print("S = ");
				for (int i = 1; i <= termos; i++) {
					if (i != 1) {
						System.out.print(" + ");
					}
					System.out.print(i +"/"+ (2*i-1));
				}
				break;
			case 15:
				System.out.print("S = ");
				int series = 0;
				for (int i = 37; i >= 1; i--) {
					if (i != 37) {
						System.out.print(" + ");
					}
					System.out.print("("+ i +"*"+ (i+1) +")/"+ (38-i));
					series += i * (i+1)/(38-i);
				}
				System.out.print("\nTotal da soma: "+ series);
				break;
			case 16:
				System.out.print("Informe uma quantidade: ");
				int count = input.nextInt();
				int maior = 0;
				int menor = 0;
				int soma = 0;
				for (int i = 1; i <= count; i++) {
					System.out.print("Informe o "+ i +"° número: ");
					int temp = input.nextInt();
					if (i == 1) {
						menor = temp;
						maior = temp;
					} else {
						if (temp < menor) {
							menor = temp;
						} else if (temp > maior) {
							maior = temp;
						}
					}
					soma += temp;
				}
				System.out.print("\nSoma: "+ soma +"\nMaior: "+ maior +"\nMenor: "+ menor);
				
				break;
			case 17:
				System.out.print("Informe um número: ");
				int prim = input.nextInt();
				int div = 0;
				for (int i = 1; i <= prim; i++) {
					if (prim % i == 0) {
						div++;
					}
				}
				if (div == 2) {
					System.out.print("Esse número é primo.");
				} else {
					System.out.print("Esse número não é primo.");
				}
				break;
			case 18:
				System.out.print("Informe um número: ");
				int primo = input.nextInt();
				System.out.print("Divisores: ");
				int divisor = 0;
				for (int i = 1; i <= primo; i++) {
					if (primo % i == 0) {
						System.out.print("["+ i +"]");
						divisor++;
					}
				}
				if (divisor == 2) {
					System.out.print("\nEsse número é primo.");
				} else {
					System.out.print("\nEsse número não é primo.");
				}
				break;
			case 19:
				System.out.print("Informe um número: ");
				int p = input.nextInt();
				List<Integer> prime_list = new ArrayList<Integer>();
				
				boolean is_prime;
				int division_count = 0;
				System.out.print("Primos entre 1 e "+ p +": ");
				for (int i = 2; i <= p; i++) {
					is_prime = true;
					for (int divider : prime_list) {
						division_count++;
						if (i % divider == 0) {
							is_prime = false;
							break;
						}
					}
					if (is_prime) {
						prime_list.add(i);
						System.out.print("["+ i +"]");
					}
				}	
				System.out.print("\nQuantidade de divisões realizadas: "+ division_count);
				break;
			case 20:
				System.out.print("Informe a quantidade de notas e seus valores: ");
				int quantity = input.nextInt();
				float media = 0;
				for (int i = 0; i < quantity; i++) {
					media += input.nextInt();
				}
				media /= quantity;
				System.out.print("Média: "+ media);
				break;
			case 21:
				System.out.print("Informe a quantidade de alunos e suas idades: ");
				int alunos = input.nextInt();
				float idades = 0;
				for (int i = 0; i < alunos; i++) {
					idades += input.nextInt();
				}
				idades /= alunos;
				System.out.print("Média de idade: "+ idades +" // ");
				if (idades <= 25) {
					System.out.print("Turma jovem");
				} else if (idades <= 60) {
					System.out.print("Turma adulta");
				} else {
					System.out.print("Turma idosa");
				}
				
				break;
			case 22:
				System.out.print("Informe a quantidade de votantes: ");
				int votantes = input.nextInt();
				int[] cand = {0,0,0};
				for (int i = 0; i < votantes; i++) {
					System.out.print("Informe seu voto [1,2,3]: ");
					switch (input.nextInt()) {
					default:
						System.out.println("Inválido, não contabilizado");
						break;
					case 1:
						cand[0]++;
						break;
					case 2:
						cand[1]++;
						break;
					case 3:
						cand[2]++;
						break;
					}
				}
				for (int i = 0; i < 3; i++) {
					System.out.println("Candidato "+ (i+1) +": "+ cand[i] +" votos");
				}
				
				break;
			case 23:
				System.out.print("Informe a quantidade de turmas e a quantidade de alunos em cada: ");
				int turma = input.nextInt();
				float aluno = 0;
				int read;
				for (int i = 0; i < turma; i++) {
					do {
						read = input.nextInt();
						if (read <= 0 || read > 40) {
							System.out.print("Inválido, precisa ser menor que 40 e não negativo\n");
						}
					} while (read <= 0 || read > 40);
					aluno += read;
				}
				aluno /= turma;
				System.out.print("Média de alunos por turma: "+ aluno);
				break;
			case 24:
				System.out.print("Informe a quantidade de CDs e seus valores: ");
				int discos = input.nextInt();
				float preco_medio = 0;
				for (int i = 0; i < discos; i++) {
					preco_medio += input.nextInt();
				}
				System.out.print("Custo total: R$ "+ preco_medio +"\nCusto médio por disco: R$ "+ preco_medio/discos);
				break;
			case 25:
				System.out.print("Lojas Quase Dois - Tabela de preços:");
				for (int i = 1; i <= 50; i++) {
					System.out.print("\n"+ i +" - R$ "+ (i*1.99));
				}
				break;
			case 26:
				System.out.print("Informe o preço do pão: ");
				float pao = input.nextFloat();
				System.out.print("Preço do pão: R$ "+ pao +"\nPanificadora Pão de Ontem - Tabela de preços");
				for (int i = 1; i <= 50; i++) {
					System.out.print("\n"+ i +" - R$ "+ (i*pao));
				}
				break;
			case 27:
				while (true) {
					System.out.print("\nLojas Tabajara\n");
					int produtos = 0;
					float preco;
					float total = 0;
					do {
						produtos++;
						System.out.print("Produto "+ produtos +": R$ ");
						preco = input.nextFloat();
						total += preco;
					} while (preco != 0);
					System.out.println("Total: R$ "+ total);
					float dinheiro;
					do {
						System.out.print("Dinheiro: R$ ");
						dinheiro = input.nextFloat();
						if (dinheiro < preco) {
							System.out.println("Dinheiro insuficiente");
						}
					} while (dinheiro < preco);
					System.out.println("Troco: R$ "+ (dinheiro - total));
				}
			case 28:
				System.out.println("Informe as temperaturas (digite -999 para parar o programa):");
				int quantidade = 0;
				float temp_media = 0;
				float temp = input.nextInt();
				float maior_temp = temp;
				float menor_temp = temp;
				while (temp != -999) {
					quantidade++;
					temp_media += temp;
					if (temp > maior_temp) {
						maior_temp = temp;
					} else if (temp < menor_temp) {
						menor_temp = temp;
					}
					temp = input.nextInt();
					
				}
				if (quantidade > 0) {
					System.out.print("Maior temperatura: "+ maior_temp
								+ "\nMenor temperatura: "+ menor_temp
								+ "\nTemperatura média: "+ temp_media/quantidade);
				} else {
					System.out.print("Sem temperaturas");
				}
				break;
			case 29:
				System.out.print("Montar tabuada de: ");
				int tab = input.nextInt();
				System.out.print("Começar em: ");
				int inicio = input.nextInt();
				System.out.print("Terminar em: ");
				int fim = input.nextInt();
				if (fim < inicio) {
					int buffer = inicio;
					inicio = fim;
					fim = buffer;
					System.out.println("Valores invertidos");
				}
				System.out.println("\nVou montar a tabuada de "+ tab +" começando de "+ inicio +" e terminando em "+ fim +":");
				for (int i = inicio; i <= fim; i++) {
					System.out.println(tab +" x "+ i +" = "+ (tab*i));
				}
				
				break;
			case 30:
				
				break;
		
		
		}
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
