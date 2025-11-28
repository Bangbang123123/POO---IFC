import java.util.Scanner;

public class Enumerator {
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		TV tv = new TV();
		ControleRemoto cr = new ControleRemoto(tv);
		
		System.out.print("Selecione TV ou CR:");
		String tipo = input.nextLine();
		while (!tipo.equals("TV") || !tipo.equals("CR")) {
			System.out.print("\nTente novamente:");
			tipo = input.nextLine();
		}
		
		String resposta = "";
		while (!resposta.equals("exit")) {
			System.out.print("\n\n      [  TV  ]\n"
							+"Ligar/Desligar    [LD]\n"
							+"Selecionar Canal: [SC]\n"
							+"Canal:            [C+][C-]\n"
							+"Volume:           [V+][V-]\n"
							+"Sair:             [exit]"
							+"#: ");
			switch (resposta) {
			case "LD":
				System.out.print("Estado atual: "+ cr.ligaDesliga());
			case "SC":
			case "C+":
			case "C-":
			case "[V+]":
			case "[V-]":
			case "exit":
			default:
			}
		}
	}
}
