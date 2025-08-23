import java.util.Scanner;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class exercicios {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha um exercício [1-20]: ");
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
			for (int i = 4; i >= 0; i--) {
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
			
			int w = 0;
			while (w < N) {
				System.out.print("Informe o "+ (w+1) +"° número [0-20]: ");
				vetor[w] = input.nextInt();
				if (vetor[w] < 0 || vetor[w] > 20) {
					System.out.print("\nInválido, somente entre [0-20]\n\n");
				} else {
					w++;
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
		case 16: // 2-1
			int T;
			do {
				System.out.print("Informe um tamanho de matriz ímpar entre 3 e 11: ");
				T = input.nextInt();
				if (T % 2 == 0) {
					System.out.print("Tente de novo\n");
				}
			} while (T % 2 == 0 || T < 3 || T > 11);
			
			int[][] matrix = new int[T][T];
			
			int soma = 0;
			int max_i = 0;
			int max_j = 0;
			int min_i = 0;
			int min_j = 0;
			int par = 0;
			int diag_p = 0;
			int diag_s = 0;
			
			for (int i = 0; i < T; i++) {
				for (int j = 0; j < T; j++) {
					System.out.print("Informe o ["+ i +"-"+ j +"]: ");
					matrix[i][j] = input.nextInt();
					soma += matrix[i][j];
					if (matrix[i][j] > matrix[max_i][max_j]) {
						max_i = i;
						max_j = j;
					} else if (matrix[i][j] < matrix[min_i][min_j]) {
						min_i = i;
						min_j = j;
					}
					if (matrix[i][j] % 2 == 0) {
						par++;
					}
					if (i == j) {
						diag_p += matrix[i][j];
					}
					if (i == (T-j-1)) {
						diag_s += matrix[i][j];
					}
				}
			}
			
			System.out.print("\n• Soma dos elementos: "+ soma
							+"\n• Média dos elementos: %.2f%n"+ Math.round((soma*100.0)/(T*T))/100.0
							+"\n• Maior valor: "+ (matrix[max_i][max_j])
							+"\n• Menor valor: "+ (matrix[min_i][min_j])
							+"\n• Contador de pares: "+ par
							+"\n• Contador de ímpares: "+ (T*T - par)
							+"\n• Soma da diagonal principal: "+ diag_p
							+"\n• Soma da diagonal secundária: "+ diag_s);
			
			System.out.print("\nMatriz:");
			for (int i = 0; i < T; i++) {
				System.out.print("\n");
				for (int j = 0; j < T; j++) {
					System.out.print("["+ matrix[i][j] +"]");
				}
			}
			break;
		case 17: // 2-2
			float[][] sup_prod = new float[5][5];
			float soma_max = 0;
			float soma_min = 0;
			float[] media_p = new float[5];
			
			for (int i = 0; i < 5; i++) {
				System.out.println("Supermercado ["+ (i+1) +"]:");
				
				for (int j = 0; j < 5; j++) {
					System.out.print("Informe o Produto "+ (j+1) +": ");
					sup_prod[i][j] = input.nextFloat();
				}
			}
			
			System.out.print("\nTabela supermercado\\produto:");
			for (int i = 0; i < 5; i++) {
				System.out.print("\n");
				int soma_ = 0;
				for (int j = 0; j < 5; j++) {
					System.out.print("["+ sup_prod[i][j] +"] ");
					media_p[j] += sup_prod[i][j]/5.0;
					soma_ += sup_prod[i][j];
				}
				if (soma_max < soma_ || i == 0) {
					soma_max = soma_;
				} else if (soma_min < soma_ || i == 0) {
					soma_min = soma_;
				}
				System.out.print(" // Valor total: R$ "+ soma_);
			}
			
			System.out.print("\n• A média de preço por produto: R$ ");
			for (int j = 0; j < 5; j++) {
				System.out.print("["+ media_p[j] +"] ");
			}
			
			System.out.print("\n• Valor total mais barato: R$ "+ soma_min
							+"\n• Valor total mais caro: R$ "+ soma_max);
			break;
		case 18: // 2-3
			System.out.print("Informe o número de alunos da turma: ");
	        int ALUNOS = input.nextInt();
	        
	        String[] nome = new String[ALUNOS];
	        float[][] nota = new float[ALUNOS][2];
	        float[] media = new float[ALUNOS];
	        
	        float media_total = 0;
	        int max_notai = 0;
	        int max_notaj = 0;
	        int min_notai = 0;
	        int min_notaj = 0;
	        
	        int max_media = 0;
	        int min_media = 0;
	        
	        for (int i = 0; i < ALUNOS; i++) {
	        	input.nextLine();
	            System.out.println("\nAluno ["+ (i+1) +"]:");
	            
	            System.out.print("Nome: ");
	            nome[i] = input.nextLine();
	            
	            for (int j = 0; j < 2; j++) {
	                System.out.print("Nota "+ (j+1) +": ");
	                nota[i][j] = input.nextFloat();
	                
                    if (nota[i][j] > nota[max_notai][max_notaj]) {
                        max_notai = i;
                        max_notaj = j;
                    }
                    if (nota[i][j] < nota[min_notai][min_notaj]) {
                    	min_notai = i;
                        min_notaj = j;
                    }
	            }
	            
	            media[i] = (nota[i][0] + nota[i][1]) / 2.0f;
	            media_total += media[i];
	            
	            if (media[i] > media[max_media]) {
	                    max_media = i;
	                }
                if (media[i] < media[min_media]) {
                    min_media = i;
                }
	        }
	        
	        media_total /= ALUNOS;
	        
	        for (int i = 0; i < ALUNOS; i++) {
	            System.out.print("\n\nAluno: " + nome[i]
	            				+"\nNota 1: " + nota[i][0]
	            				+"\nNota 2: " + nota[i][1]
	            				+"\nMédia : " + media[i]);
	        }
	        
	        System.out.print("\n• Maior nota: "+ nota[max_notai][max_notaj] +" // Aluno: "+ nome[max_notai]
					        +"\n• Menor nota: "+ nota[min_notai][min_notaj] +" // Aluno: "+ nome[min_notai]
					        +"\n• Maior média: "+ media[max_media] +" // Aluno: "+ nome[max_media]
					        +"\n• Maior média: "+ media[min_media] +" // Aluno: "+ nome[min_media]
					        +"\n• Média geral da turma: " + media_total);
					        
	        System.out.print("\n• Alunos acima da média geral:");
	        for (int i = 0; i < ALUNOS; i++) {
	            if (media[i] > media_total) {
	                System.out.println("\n"+ nome[i] + " // Média: "+ media[i]);
	            }
	        }
	        
	        System.out.print("\n• Alunos abaixo da média geral:");
	        for (int i = 0; i < ALUNOS; i++) {
	            if (media[i] < media_total) {
	                System.out.println("\n"+ nome[i] + " // Média: "+ media[i]);
	            }
	        }
			break;
		case 19: // 2-4
		    System.out.print("Informe o número de atletas: ");
		    int N_atletas = input.nextInt();
		    
		    String[] atletas = new String[N_atletas];
		    float[][] saltos = new float[N_atletas][5];
		    float[] saltosM = new float[N_atletas];
		    
		    int campeao = 0;
		    int ultimo = 0;
		    
		    for (int i = 0; i < N_atletas; i++) {
		        input.nextLine();
		        System.out.print("\nAtleta [" + (i+1) + "]:\nNome: ");
		        atletas[i] = input.nextLine();
		        
		        int menor_salto = 0;
		        for (int j = 0; j < 5; j++) {
		            System.out.print("Salto " + (j+1) + ": ");
		            saltos[i][j] = input.nextFloat();
		            
		            saltosM[i] += saltos[i][j];
		            
		            if (saltos[i][j] < saltos[i][menor_salto]) {
		                menor_salto = j;
		            }
		        }
		        
		        saltosM[i] = (saltosM[i] - saltos[i][menor_salto]) / 4;
		        
		        if (saltosM[i] > saltosM[campeao]) {
		            campeao = i;
		        }
		        if (saltosM[i] < saltosM[ultimo]) {
		            ultimo = i;
		        }
		    }
		    
		    
		    for (int i = 0; i < N_atletas; i++) {
		        System.out.print("\n• Atleta: "+ atletas[i] +" -- Saltos: ");
		        for (int j = 0; j < 5; j++) {
		            System.out.print("[" + saltos[i][j] + "] ");
		        }
		        System.out.println("\nMédia final: "+ saltosM[i] +"\n");
		    }
		    
		    
		    System.out.print("\n\n• Campeão: "+ atletas[campeao] +" // Média: " + saltosM[campeao]
		    				+"\n• Último lugar: "+ atletas[ultimo] +" // Média: " + saltosM[ultimo]);
		    break;
		case 20: // 2-5
			System.out.print("Informe um número de cartelas: ");
			int count = input.nextInt();
			
			int[][] cartelas = new int[count][6];
			Random random = new Random();
			for (int f = 0; f < count; f++) {
				for (int i = 0; i < 6; i++) {
					cartelas[f][i] = random.nextInt(59)+1;
					boolean again = false;
					for (int j = 0; j < i; j++) {
						if (cartelas[f][i] == cartelas[f][j]) {
							again = true;
							break;
						}
					}
					if (again) {
						i--;
					}
				}
				
				boolean sorted = false;
				while (!sorted) {
					sorted = true;
					for (int i = 0; i < 5; i++) {
						if (cartelas[f][i] > cartelas[f][i+1]) {
							sorted = false;
							int buffer = cartelas[f][i];
							cartelas[f][i] = cartelas[f][i+1];
							cartelas[f][i+1] = buffer;
						}
					}
				}
			}
			
			System.out.print("\n- Coloque as cartelas em ordem decrescente -");
			int[][] respostas = new int[count][6];
			for (int i = 0; i < count; i++) {
				System.out.print("\nCartela "+ i +":\n");
				for (int j = 0; j < 6; j++) {
					do {
						System.out.print(j +": ");
						respostas[i][j] = input.nextInt();
						if ((respostas[i][j] < 1 || respostas[i][j] > 60) || (j != 0 && respostas[i][j-1] >= respostas[i][j])) {
							System.out.print("Inválido, deve estar nesse intervalo [1-60] em ordem crescente\n");
						}
					} while ((respostas[i][j] < 1 || respostas[i][j] > 60) || (j != 0 && respostas[i][j-1] >= respostas[i][j]));
				}
			}
			
			
			for (int i = 0; i < count; i++) {
				for (int l = 0; l < 6; l++) {
					System.out.print("["+ cartelas[i][l] +"]");
				}
				System.out.println();
				for (int l = 0; l < 6; l++) {
					System.out.print("["+ respostas[i][l] +"]");
				}
				
				int j = 0;
				int k = 0;
				int acertos = 0;
				while (j < 6 && k < 6) {
					if (cartelas[i][j] == respostas[i][k]) {
						j++;
						k++;
						acertos++;
					} else if (cartelas[i][j] > respostas[i][k]) {
						k++;
					} else {
						j++;
					}
				}
				System.out.print(" - Acertos: "+ acertos +"\n\n");
			}
			break;
		}
		input.close();
	}
	
	
	
	
	
	public String[] readFile(String caminho) {
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            String conteudo = "";
            while ((linha = br.readLine()) != null) {
                conteudo += linha + "/";
            }
            
            return conteudo.split("/");
		} catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return new String[0];
        }
	}      
		
	public void writeFile(String conteudo) {
		File caminhoArquivo = new File("Output.text");

        try (FileWriter writer = new FileWriter(caminhoArquivo, false)) {
            writer.write(conteudo);
            System.out.println("Arquivo criado com sucesso!");

            if (caminhoArquivo.exists()) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) { 
                    Desktop.getDesktop().browse(caminhoArquivo.toURI());
                } else {
                    System.out.println("Ação BROWSE não é suportada neste ambiente.");
                }
            } else {
                System.out.println("Arquivo HTML não encontrado.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar/abrir o arquivo: " + e.getMessage());
        }
	}
       
}
