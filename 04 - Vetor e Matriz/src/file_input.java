import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class file_input {

	public static void main(String[] args) {
		String[] file_input = readFile().split("/");
		int input_count = 0;
		String content = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Qualquer valor errado no input causará problemas"
						+ "\nEscolha um exercício [1-5]: ");
		switch(input.nextInt()) {
		case 1:
			int T;
			do {
				content += "Informe um tamanho de matriz ímpar entre 3 e 11: ";
				T = Integer.parseInt(file_input[input_count++]);
				content += T + "\n";
				if (T % 2 == 0) {
					System.out.print("Arquivo com input errado");
					System.exit(0);
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
					content += "Informe o ["+ i +"-"+ j +"]: ";
					matrix[i][j] = Integer.parseInt(file_input[input_count++]);
					content += matrix[i][j] + "\n";
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
			
			content += "\n• Soma dos elementos: "+ soma
							+"\n• Média dos elementos: "+ Math.round((soma*100.0)/(T*T))/100.0
							+"\n• Maior valor: "+ (matrix[max_i][max_j])
							+"\n• Menor valor: "+ (matrix[min_i][min_j])
							+"\n• Contador de pares: "+ par
							+"\n• Contador de ímpares: "+ (T*T - par)
							+"\n• Soma da diagonal principal: "+ diag_p
							+"\n• Soma da diagonal secundária: "+ diag_s;
			
			content += "\nMatriz:";
			for (int i = 0; i < T; i++) {
				content += "\n";
				for (int j = 0; j < T; j++) {
					content += "["+ matrix[i][j] +"]";
				}
			}
			break;
		case 2:
			float[][] sup_prod = new float[5][5];
			float soma_max = 0;
			float soma_min = 0;
			float[] media_p = new float[5];
			
			for (int i = 0; i < 5; i++) {
				content += "Supermercado ["+ (i+1) +"]:\n";
				
				for (int j = 0; j < 5; j++) {
					content += "Informe o Produto "+ (j+1) +": ";
					sup_prod[i][j] = Integer.parseInt(file_input[input_count++]);
					content += sup_prod[i][j] + "\n";
				}
			}
			
			content += "\nTabela supermercado\\produto:";
			for (int i = 0; i < 5; i++) {
				content += "\n";
				int soma_ = 0;
				for (int j = 0; j < 5; j++) {
					content += "["+ sup_prod[i][j] +"] ";
					media_p[j] += sup_prod[i][j]/5.0;
					soma_ += sup_prod[i][j];
				}
				if (soma_max < soma_ || i == 0) {
					soma_max = soma_;
				} else if (soma_min < soma_ || i == 0) {
					soma_min = soma_;
				}
				content += " // Valor total: R$ "+ soma_;
			}
			
			content += "\n• A média de preço por produto: R$ ";
			for (int j = 0; j < 5; j++) {
				content += "["+ media_p[j] +"] ";
			}
			
			content += "\n• Valor total mais barato: R$ "+ soma_min
							+"\n• Valor total mais caro: R$ "+ soma_max;
			break;
		case 3:
			content += "Informe o número de alunos da turma: ";
	        int ALUNOS = Integer.parseInt(file_input[input_count++]);
	        content += ALUNOS + "\n";
	        
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
	        	content += "\nAluno ["+ (i+1) +"]:\nNome: ";
	            nome[i] = file_input[input_count++];
	            content += nome[i] + "\n";
	            
	            for (int j = 0; j < 2; j++) {
	            	content += "Nota "+ (j+1) +": ";
	                nota[i][j] = Float.parseFloat(file_input[input_count++]);
	                content += nota[i][j] + "\n";
	                
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
	        	content += "\n\nAluno: " + nome[i]
	            				+"\nNota 1: " + nota[i][0]
	            				+"\nNota 2: " + nota[i][1]
	            				+"\nMédia : " + media[i];
	        }
	        
	        content += "\n\n• Maior nota: "+ nota[max_notai][max_notaj] +" // Aluno: "+ nome[max_notai]
					        +"\n• Menor nota: "+ nota[min_notai][min_notaj] +" // Aluno: "+ nome[min_notai]
					        +"\n• Maior média: "+ media[max_media] +" // Aluno: "+ nome[max_media]
					        +"\n• Maior média: "+ media[min_media] +" // Aluno: "+ nome[min_media]
					        +"\n• Média geral da turma: " + media_total;
					        
	        content += "\n• Alunos acima da média geral:";
	        for (int i = 0; i < ALUNOS; i++) {
	            if (media[i] > media_total) {
	            	content += "\n"+ nome[i] + " // Média: "+ media[i];
	            }
	        }
	        
	        content += "\n• Alunos abaixo da média geral:";
	        for (int i = 0; i < ALUNOS; i++) {
	            if (media[i] < media_total) {
	            	content += "\n"+ nome[i] + " // Média: "+ media[i] + "\n";
	            }
	        }
			break;
		case 4:
		    content += "Informe o número de atletas: ";
		    int N_atletas = Integer.parseInt(file_input[input_count++]);
		    content += N_atletas + "\n";
		    
		    String[] atletas = new String[N_atletas];
		    float[][] saltos = new float[N_atletas][5];
		    float[] saltosM = new float[N_atletas];
		    
		    int campeao = 0;
		    int ultimo = 0;
		    
		    for (int i = 0; i < N_atletas; i++) {
		        content += "\nAtleta [" + (i+1) + "]:\nNome: ";
		        atletas[i] = file_input[input_count++];
		        content += atletas[i] + "\n";
		        
		        int menor_salto = 0;
		        for (int j = 0; j < 5; j++) {
		            content += "Salto " + (j+1) + ": ";
		            saltos[i][j] = Float.parseFloat(file_input[input_count++]);
		            content += saltos[i][j] + "\n";
		            
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
		    	content += "\n• Atleta: "+ atletas[i] +" -- Saltos: ";
		        for (int j = 0; j < 5; j++) {
		        	content += "[" + saltos[i][j] + "] ";
		        }
		        content += "\nMédia final: "+ saltosM[i] +"\n\n";
		    }
		    
		    
		    content += "\n\n• Campeão: "+ atletas[campeao] +" // Média: " + saltosM[campeao]
		    				+"\n• Último lugar: "+ atletas[ultimo] +" // Média: " + saltosM[ultimo];
		    break;
		case 5:
			content += "Informe um número de cartelas: ";
			int count = Integer.parseInt(file_input[input_count++]);
			content += count + "\n";
			
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
			
			content += "\n- Coloque as cartelas em ordem decrescente -";
			int[][] respostas = new int[count][6];
			for (int i = 0; i < count; i++) {
				content += "\nCartela "+ i +":\n";
				for (int j = 0; j < 6; j++) {
					do {
						content += j +": ";
						respostas[i][j] = Integer.parseInt(file_input[input_count++]);
						content += respostas[i][j] + "\n";
						if ((respostas[i][j] < 1 || respostas[i][j] > 60) || (j != 0 && respostas[i][j-1] >= respostas[i][j])) {
							System.out.print("Inválido, deve estar nesse intervalo [1-60] em ordem crescente\n");
							System.out.print("\nArquivo com input incorreto");
							System.exit(0);
						}
					} while ((respostas[i][j] < 1 || respostas[i][j] > 60) || (j != 0 && respostas[i][j-1] >= respostas[i][j]));
				}
			}
			
			
			for (int i = 0; i < count; i++) {
				for (int l = 0; l < 6; l++) {
					content += "["+ cartelas[i][l] +"]";
				}
				content += "\n";
				for (int l = 0; l < 6; l++) {
					content += "["+ respostas[i][l] +"]";
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
				content += " - Acertos: "+ acertos +"\n\n";
			}
			break;
		}
		writeFile(content);
		input.close();
	}
	
	public static String readFile() {
		String caminho = ".\\Input.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
	        String linha;
	        String conteudo = "";
	        while ((linha = br.readLine()) != null) {
	            conteudo += linha + "/";
	        }
	        
	        return conteudo;//.split("/");
		} catch (IOException e) {
	        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
	        return "";
	    }
	}      
		
	public static void writeFile(String conteudo) {
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
