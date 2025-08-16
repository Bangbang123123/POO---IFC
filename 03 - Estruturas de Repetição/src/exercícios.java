import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exercícios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha um exercício [1-38]: ");
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
						if (divider > Math.sqrt(i)) {
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
				List<Integer> codigo = new ArrayList<Integer>();
				List<Float> alturas = new ArrayList<Float>();
				List<Float> pesos = new ArrayList<Float>();
				
				int alto = 0;
				int baixo = 0;
				int gordo = 0;
				int magro = 0;
				int count_ = 0;
				float media_alt = 0;
				float media_peso = 0;
				do {
					System.out.print("Informe um código: ");
					codigo.add(input.nextInt());
					if (codigo.get(count_) == 0) {
						break;
					}
					System.out.print("Informe a altura: ");
					alturas.add(input.nextFloat());
					System.out.print("Informe o peso: ");
					pesos.add(input.nextFloat());
					
					// Get the highest and lowest
					if (alturas.get(count_) >= alturas.get(alto)) {
						alto = count_;
					}
					if (alturas.get(count_) <= alturas.get(baixo)) {
						baixo = count_;
					} 
					if (pesos.get(count_) >= pesos.get(gordo)) {
						gordo = count_;
					}
					if (pesos.get(count_) <= pesos.get(magro)) {
						magro = count_;
					}
					
					//  Get averages
					media_alt += alturas.get(count_);
					media_peso +=  pesos.get(count_);
					
					count_++;
				} while (true);
				// Calculate averages
				media_alt /= count_;
				media_peso /= count_;
				
				if (count_ != 0) {
					System.out.print("\n-- Mais alto --"
								+"\nAltura: "+ alturas.get(alto)
								+"\nPeso: "+ pesos.get(alto)
								+"\nCódigo: "+ codigo.get(alto)
								+"\n\n\n-- Mais baixo --\n"
								+"\nAltura: "+ alturas.get(baixo)
								+"\nPeso: "+ pesos.get(baixo)
								+"\nCódigo: "+ codigo.get(baixo)
								+"\n\n\n-- Mais gordo --\n"
								+"\nAltura: "+ alturas.get(gordo)
								+"\nPeso: "+ pesos.get(gordo)
								+"\nCódigo: "+ codigo.get(gordo)
								+"\n\n\n-- Mais magro --\n"
								+"\nAltura: "+ alturas.get(magro)
								+"\nPeso: "+ pesos.get(magro)
								+"\nCódigo: "+ codigo.get(magro)
								+"\n\nMédia de altura: "+ media_alt
								+"\nMédia de peso: "+ media_peso
								);
				} else {
					System.out.print("Nenhum membro informado");
				}
				break;
			case 31:
				int[] aluno_n = new int[10];
				float[] alt = new float[10];
				int maior_ = 0;
				int menor_ = 0;
				
				for (int i = 0; i < 10; i++) {
					System.out.print("Informe o número: ");
					aluno_n[i] = input.nextInt();
					System.out.print("Informe a altura: ");
					alt[i] = input.nextFloat();
					
					if (alt[i] > alt[maior_]) {
						maior_ = i;
					}
					if (alt[i] < alt[menor_]) {
						menor_ = i;
					}
				}
				System.out.print("\n-- Mais alto --"
								+ "\nNúmero: "+ aluno_n[maior_]
								+ "\nAltura: "+ alt[maior_]
								+ "\n\n-- Mais baixo --"
								+ "\nNúmero: "+ aluno_n[menor_]
								+ "\nAltura: "+ alt[menor_]
								);
				break;
			case 32:
				int[] cod_cid = new int[5];
				int[] veiculos = new int[5];
				int[] acidentes = new int[5];
				
				int indice_maior = 0;
				int indice_menor = 0;
				float media_veiculos = 0;
				float media_acidentes = 0;
				int acidente = 0;
				for (int i = 0; i < 5; i++) {
					System.out.print("Informe um código: ");
					cod_cid[i] = input.nextInt();
					System.out.print("Informe a quantidade de veículos: ");
					veiculos[i] = input.nextInt();
					System.out.print("Informe a quantidade de acidentes: ");
					acidentes[i] = input.nextInt();
					
					// Get the highest and lowest
					if (acidentes[i] > acidentes[indice_maior]) {
						indice_maior = i;
					}
					if (acidentes[i] < acidentes[indice_menor]) {
						indice_menor = i;
					} 
					
					//  Get averages
					media_veiculos += veiculos[i];
					if (veiculos[i] <= 2000) {
						media_acidentes += acidentes[i];
						acidente++;
					}
				}
				media_veiculos /= 5;
				if (acidente != 0) {
					media_acidentes /= acidente;
				}
				System.out.print("\n-- Maior índice --"
							+ "\nCódigo: "+ cod_cid[indice_maior]
							+ "\nAcidentes: "+ acidentes[indice_maior]
							+ "\n\n-- Menor índice --"
							+ "\nCódigo: "+ cod_cid[indice_menor]
							+ "\nAcidentes: "+ acidentes[indice_menor]
							+ "\n\nMédia de veículos: "+ media_veiculos
							+ "\nMédia de acidentes (cidades com menos de 2000 veículos de passeio): "+ media_acidentes
							);
				break;
			case 33:
				do {
					System.out.print("Informe o valor total: ");
					float divida = input.nextFloat();
					System.out.print("Informe a quantidade de parcelas [1,3,6,9,12]: ");
					int qnt = input.nextInt();
					float parcela = 0;
					switch (qnt) {
					default:
						System.out.println("Número inválido");
						break;
					case 1:
						parcela = divida;
						break;
					case 3:
						parcela = divida * 1.1f / 3;
						break;
					case 6:
						parcela = divida * 1.15f / 6;
						break;
					case 9:
						parcela = divida * 1.2f / 9;
						break;
					case 12:
						parcela = divida * 1.25f / 12;
						break;
					}
					if (parcela != 0 && divida != 0) {
						System.out.println("\nDívida: R$ "+ divida +" // Parcelas: "+ qnt +" // Valor da parcela: R$ "+ parcela);
					}
				} while (true);
			case 34:
				int interval1 = 0;
				int interval2 = 0;
				int interval3 = 0;
				int interval4 = 0;
				int number;
				do {
					// [0-25], [26-50], [51-75] e [76-100].
					System.out.print("Informe um número: ");
					number = input.nextInt();
					if (number <= 25) {
						interval1++;
					} else if (number <= 50) {
						interval2++;
					} else if (number <= 75) {
						interval3++;
					} else if (number <= 100) {
						interval4++;
					}			
				} while (number >= 0);
				System.out.print("\n-- Intervalos dos números informados --"
						+ "\n[0-25]: "+ interval1
						+ "\n[26-50]: "+ interval2
						+ "\n[51-75]: "+ interval3
						+ "\n[76-100]: "+ interval4);
				break;
			case 35:
				System.out.print("Especificação   Código   Preço\r\n"
							+ "Cachorro Quente    100 R$ 1,20\n"
							+ "Bauru Simples      101   R$ 1,30\n"
							+ "Bauru com ovo      102   R$ 1,50\n"
							+ "Hambúrguer         103   R$ 1,20\n"
							+ "Cheeseburguer      104   R$ 1,30\n"
							+ "Refrigerante       105   R$ 1,00\n"
							+ "Finalizar compra     0\n\n\n");
				
				int pedido;
				int qnt;
				float preco = 0;
				do {
					System.out.print("Informe um produto (código) e sua quantidade: ");
					pedido = input.nextInt();
					qnt = input.nextInt();
					switch (pedido) {
					default:
						System.out.print("Produto inválido");
						break;
					case 0:
						System.out.println("Finalizando pedido");
						break;
					case 100:
						preco += 1.2 * qnt;
						System.out.println("Produto: Cachorro Quente // Quantidade: "+ qnt +" // Preço: R$ "+ (1.2 * qnt));
						break;
					case 101:
						preco += 1.3 * qnt;
						System.out.println("Produto: Bauru Simples // Quantidade: "+ qnt +" // Preço: R$ "+ (1.3 * qnt));
						break;
					case 102:
						preco += 1.5 * qnt;
						System.out.println("Produto: Bauru com Ovo // Quantidade: "+ qnt +" // Preço: R$ "+ (1.5 * qnt));
						break;
					case 103:
						preco += 1.2 * qnt;
						System.out.println("Produto: Hambúrguer // Quantidade: "+ qnt +" // Preço: R$ "+ (1.2 * qnt));
						break;
					case 104:
						preco += 1.3 * qnt;
						System.out.println("Produto: Cheeseburguer // Quantidade: "+ qnt +" // Preço: R$ "+ (1.3 * qnt));
						break;
					case 105:
						preco += qnt;
						System.out.println("Produto: Refrigerante // Quantidade: "+ qnt +" // Preço: R$ "+ (1.0f * qnt));
						break;
					}
				} while (pedido != 0);
				System.out.print("Total da compra: R$ "+ preco);
				
				break;
			case 36:
				
				int[] votos = {0,0,0,0,0,0};
				int voto;
				System.out.print("Candidatos: João, José, Maria, Ana");
				do {
					System.out.print("Informe seu voto [1,2,3,4 - candidato] 5 - nulo // 6 - branco]: ");
					voto = input.nextInt();
					if (voto < 1 || voto > 6) {
						System.out.println("Voto não contabilizado\n");
					} else {
						votos[voto-1]++;
					}
				} while (voto != 0);
				int total_voto = votos[0] + votos[1] + votos[2] + votos[3] + votos[4] + votos[5];
				if (total_voto != 0) {
					System.out.print("\nCandidato João: "+ votos[0]
									+ "\nCandidato José: "+ votos[1]
									+ "\nCandidata Maria: "+ votos[2]
									+ "\nCandidata Ana: "+ votos[3]
									+ "\nNulos: "+ votos[4] +" ["+ ((votos[4]*100f)/total_voto) +" %]"
									+ "\nBrancos: "+ votos[5] +" ["+ ((votos[5]*100f)/total_voto) +" %]"
									);
				} else {
					System.out.print("Sem votos");
				}
				break;
			case 37:
				System.out.print("[Professor] Informe o gabarito: ");
				input.nextLine();
				String gabarito = input.nextLine();
				String resposta;
				int maior_acerto = 0;
				int menor_acerto = gabarito.length() + 1;
				int media_acerto = 0;
				int acerto = 0;
				int total_alunos = 0;
				do {
					System.out.print("[Aluno] Informe o gabarito inteiro (finalize tudo com 'sair'): ");
					resposta = input.nextLine();
					if (resposta.length() != gabarito.length()) {
						System.out.println("Resposta não contabilizada");
					} else {
						total_alunos++;
						for (int i = 0; i < gabarito.length(); i++) {
							if (resposta.charAt(i) == gabarito.charAt(i)) {
								acerto++;
							}
						}
						if (maior_acerto < acerto) {
							maior_acerto = acerto;
						}
						if (menor_acerto > acerto) {
							menor_acerto = acerto;
						}
						media_acerto += acerto;
					}
					acerto = 0;
				} while (! resposta.equals("sair"));
				if (total_alunos != 0) {
					media_acerto /= total_alunos;
					System.out.print("\nMaior Acerto: "+ maior_acerto 
							+"\nMenor Acerto: "+ menor_acerto
							+ "\nTotal de Alunos: "+ total_alunos
							+ "\nMédia das Notas: "+ media_acerto);
				} else {
					System.out.print("\nSem respostas computadas");
				}
			
				break;
			case 38:
				System.out.print("Informe um número: ");
				input.nextLine();
				String number_ = input.nextLine();
				System.out.print("Número invertido: ");
				for (int i = number_.length()-1; i >= 0; i--) {
					System.out.print(number_.charAt(i));
				}
				
				break;
		}
		input.close();
	}
}
