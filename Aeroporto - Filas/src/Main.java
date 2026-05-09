import java.util.Random;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
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
				Aviao novoAviao = new Aviao(pousoID,(rand.nextInt(20)+1),tempoAtual);
				pousoID += 2;
				
				if (filaPouso1.getTamanho() < filaPouso2.getTamanho()) {
					filaPouso1.enqueue(novoAviao);
				} else {
					filaPouso2.enqueue(novoAviao);
				}
			}
			
			
			// Entrada de aviões na decolagem
			for (int i = 0; i < rand.nextInt(3); i++) {
				Aviao novoAviao = new Aviao(decolagemID,0,tempoAtual);
				decolagemID += 2;
				
				if (filaDecolagem1.getTamanho() > filaDecolagem2.getTamanho()) {
					filaDecolagem2.enqueue(novoAviao);
				} else {
					filaDecolagem1.enqueue(novoAviao);
				}
			}
			
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
				tempoTotalPouso += tempoAtual - filaPouso1.dequeue().getTempo();
				qtdPouso++;
				pousoEmergencia++;
			} else if (filaPouso1.getTamanho() > filaDecolagem1.getTamanho()) {
				tempoTotalPouso = tempoAtual - filaPouso1.dequeue().getTempo();
				qtdPouso++;
			} else if (filaDecolagem1.getTamanho() > 0){
				tempoTotalDecolagem += tempoAtual - filaDecolagem1.dequeue().getTempo();
				qtdDecolagem++;
			}
			
			if (filaPouso2.peek() != null && filaPouso2.peek().getCombustivel() < 3) {
				tempoTotalPouso += tempoAtual - filaPouso2.dequeue().getTempo();
				qtdPouso++;
				pousoEmergencia++;
			} else if (filaPouso2.getTamanho() > filaDecolagem2.getTamanho()) {
				tempoTotalPouso = tempoAtual - filaPouso2.dequeue().getTempo();
				qtdPouso++;
			} else if (filaDecolagem2.getTamanho() > 0){
				tempoTotalDecolagem += tempoAtual - filaDecolagem2.dequeue().getTempo();
				qtdDecolagem++;
			}
			
			
			// Saída do programa
			System.out.println("----------- Selecionando decisão -----------"
					+ "\nFila pouso 1:\n"+ filaPouso1.ToString()
					+ "\nFila pouso 2:\n"+ filaPouso2.ToString()
					+ "\nFila decolagem 1:\n"+ filaDecolagem1.ToString()
					+ "\nFila decolagem 2:\n"+ filaDecolagem2.ToString()
					+ "\n\n----------- Estatísticas Gerais -----------");
			
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
			
			
			tempoAtual++;
			
			System.out.print("Próxima unidade de tempo [enter para continuar, qualquer outro caracter para sair]: ");
			if (!input.nextLine().equals("")) {
				break;
			}
		}
		input.close();
	}

}
