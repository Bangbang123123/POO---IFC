import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FilaAviao filaPouso1 = new FilaAviao();
		FilaAviao filaPouso2 = new FilaAviao();
		FilaAviao filaDecolagem1 = new FilaAviao();
		FilaAviao filaDecolagem2 = new FilaAviao();
		
		int pousoID = 0;
		int decolagemID = 1;
		int tempoTotal = 0;
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		while (true) {
			
			int quantidade_avioes = rand.nextInt(3);
			for (int i = 0; i > quantidade_avioes; i++) {
				Aviao novoAviao = new Aviao(pousoID,(rand.nextInt(20)+1),tempoTotal);
				pousoID += 2;
				
				if (filaPouso1.getTamanho() > filaPouso2.getTamanho()) {
					filaPouso2.enqueue(novoAviao);
				} else {
					filaPouso1.enqueue(novoAviao);
				}
			}
			
			quantidade_avioes = rand.nextInt(3);
			for (int i = 0; i > quantidade_avioes; i++) {
				Aviao novoAviao = new Aviao(decolagemID,(rand.nextInt(20)+1),tempoTotal);
				decolagemID += 2;
				
				if (filaPouso1.getTamanho() > filaPouso2.getTamanho()) {
					filaPouso2.enqueue(novoAviao);
				} else {
					filaPouso1.enqueue(novoAviao);
				}
			}
	        
			
			
			
			
			if (input.nextLine().equals("s")) {
				break;
			}
		}
		input.close();
	}

}
