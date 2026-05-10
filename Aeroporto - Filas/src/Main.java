import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// Variáveis necessárias
		FilaAviao filaPouso1 = new FilaAviao();
		FilaAviao filaPouso2 = new FilaAviao();
		FilaAviao filaDecolagem1 = new FilaAviao();
		FilaAviao filaDecolagem2 = new FilaAviao();
		
		int pousoID = 1;
		int decolagemID = 0;
		int tempoAtual = 0;
		
		int qtdPouso = 0;
		int tempoTotalPouso = 0;
		int qtdDecolagem = 0;
		int tempoTotalDecolagem = 0;
		
		int pousoEmergencia = 0;
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		while (true) {
			
			// Entrada de aviões no pouso
			for (int i = 0; i < rand.nextInt(3); i++) {
				// Cria um avião com pousoID, combustível aleatório e adiciona o tempo de chegada (tempo atual)
				Aviao novoAviao = new Aviao(pousoID,(rand.nextInt(20)+1),tempoAtual);
				pousoID += 2;
				
				// Separa os aviões para priorizar a fila com menos aviões
				if (filaPouso1.getTamanho() < filaPouso2.getTamanho()) {
					filaPouso1.enqueue(novoAviao);
				} else {
					filaPouso2.enqueue(novoAviao);
				}
			}
			
			
			// Entrada de aviões na decolagem
			for (int i = 0; i < rand.nextInt(3); i++) {
				// Cria um avião com decolagemID e adiciona o tempo de chegada (tempo atual)
				Aviao novoAviao = new Aviao(decolagemID,0,tempoAtual);
				decolagemID += 2;
				
				// Separa os aviões para priorizar a fila com menos aviões
				if (filaDecolagem1.getTamanho() > filaDecolagem2.getTamanho()) {
					filaDecolagem2.enqueue(novoAviao);
				} else {
					filaDecolagem1.enqueue(novoAviao);
				}
			}
			
			// Parte 1 da saída do programa (listagem das filas na entrada de aviões)
			System.out.println("\n\n\n\n----------- Adicionando aviões -----------"
					+"\nFila pouso 1:\n"+ filaPouso1.ToString()
					+"\nFila pouso 2:\n"+ filaPouso2.ToString()
					+"\nFila decolagem 1:\n"+ filaDecolagem1.ToString()
					+"\nFila decolagem 2:\n"+ filaDecolagem2.ToString());
			
			
			// Diminuir combustível e remoção de aviões sem combustível
			filaPouso1.removerAvioesSemCombustivel();
			filaPouso2.removerAvioesSemCombustivel();
			
			
			// Selecionar decisão baseado nas prioridades
			if (filaPouso1.peek() != null && filaPouso1.peek().getCombustivel() < 3) {
				// Calcula o tempo de espera e contabiliza pouso + emergência
				tempoTotalPouso += tempoAtual - filaPouso1.dequeue().getTempo();
				qtdPouso++;
				pousoEmergencia++;
			} else if (filaPouso1.getTamanho() > filaDecolagem1.getTamanho()) {
				// Calcula o tempo de espera e contabiliza pouso
				tempoTotalPouso += tempoAtual - filaPouso1.dequeue().getTempo();
				qtdPouso++;
			} else if (filaDecolagem1.getTamanho() > 0){
				// Calcula o tempo de espera e contabiliza decolagem
				tempoTotalDecolagem += tempoAtual - filaDecolagem1.dequeue().getTempo();
				qtdDecolagem++;
			}
			
			if (filaPouso2.peek() != null && filaPouso2.peek().getCombustivel() < 3) {
				// Calcula o tempo de espera e contabiliza pouso + emergência
				tempoTotalPouso += tempoAtual - filaPouso2.dequeue().getTempo();
				qtdPouso++;
				pousoEmergencia++;
			} else if (filaPouso2.getTamanho() > filaDecolagem2.getTamanho()) {
				// Calcula o tempo de espera e contabiliza pouso
				tempoTotalPouso += tempoAtual - filaPouso2.dequeue().getTempo();
				qtdPouso++;
			} else if (filaDecolagem2.getTamanho() > 0){
				// Calcula o tempo de espera e contabiliza decolagem
				tempoTotalDecolagem += tempoAtual - filaDecolagem2.dequeue().getTempo();
				qtdDecolagem++;
			}
			tempoAtual++;
			
			
			// Parte 2 da saída do programa (fila depois da decisão e as estatísticas)
			System.out.println("----------- Selecionando decisão -----------"
					+ "\nFila pouso 1:\n"+ filaPouso1.ToString()
					+ "\nFila pouso 2:\n"+ filaPouso2.ToString()
					+ "\nFila decolagem 1:\n"+ filaDecolagem1.ToString()
					+ "\nFila decolagem 2:\n"+ filaDecolagem2.ToString()
					+ "\n\n----------- Estatísticas Gerais -----------");
			
			// if para evitar divisão por 0
			if (qtdDecolagem > 0) {
				System.out.println("Tempo médio de espera para decolagem: "+ ((double) tempoTotalDecolagem/qtdDecolagem));
			} else {
				System.out.println("Tempo médio de espera para decolagem: 0.0");
			}
			if (qtdPouso > 0) {
				System.out.println("Tempo médio de espera para aterrisagem: "+ ((double) tempoTotalPouso/qtdPouso));
			} else {
				System.out.println("Tempo médio de espera para aterrisagem: 0.0");
			}
			
			System.out.println("Aterrisagens de emergência (combustível < 3): "+ pousoEmergencia
							+ "\nTempo Atual: "+ tempoAtual +"\n\n");
			
			
			// Input do usuário para continuar ou não o programa
			System.out.print("Próxima unidade de tempo [enter para continuar, qualquer outro caracter para sair]: ");
			if (!input.nextLine().equals("")) {
				break;
			}
		}
		input.close();
	}

}
