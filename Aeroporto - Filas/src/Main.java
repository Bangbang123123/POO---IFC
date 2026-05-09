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
			
			System.out.println("-----------[[Antes]]-----------:\nFila pouso 1:\n"+ filaPouso1.ToString() +"\nFila pouso 2:\n"+ filaPouso2.ToString() +"\nFila decolagem 1:\n"+ filaDecolagem1.ToString() +"\nFila decolagem 2:\n"+ filaDecolagem2.ToString());
			
			// Diminuir combustível e remoção de aviões sem combustível
			filaPouso1.removerAvioesSemCombustivel();
			filaPouso2.removerAvioesSemCombustivel();
			
			
			// Selecionar decisão baseado nas prioridades
			if (filaPouso1.peek() != null && filaPouso1.peek().getCombustivel() < 3 || filaPouso1.getTamanho() > filaDecolagem1.getTamanho()) {
				filaPouso1.dequeue();
			} else {
				filaDecolagem1.dequeue();
			}
			
			
			if (filaPouso2.peek() != null && filaPouso2.peek().getCombustivel() < 3 || filaPouso2.getTamanho() > filaDecolagem2.getTamanho()) {
				filaPouso2.dequeue();
			} else {
				filaDecolagem2.dequeue();
			}
			
			System.out.println("-----------[[Depois]]-----------:\nFila pouso 1:\n"+ filaPouso1.ToString() +"\nFila pouso 2:\n"+ filaPouso2.ToString() +"\nFila decolagem 1:\n"+ filaDecolagem1.ToString() +"\nFila decolagem 2:\n"+ filaDecolagem2.ToString());
			
			tempoAtual++;
			
			System.out.print("Próxima unidade de tempo ['s' para continuar]: ");
			if (!input.nextLine().equals("s")) {
				break;
			}
		}
		input.close();
	}

}
