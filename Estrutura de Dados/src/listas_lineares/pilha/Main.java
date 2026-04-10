package listas_lineares.pilha;

public class Main {

	public static void main(String[] args) {
		IPilha pilha1 = new PilhaDinamica();
		pilha1.push(10);
		pilha1.push(20);
		pilha1.push(30);
		
		System.out.print(pilha1.ToString());
		
		

	}
	

}
