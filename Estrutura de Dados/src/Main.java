
public class Main {

	public static void main(String[] args) {
		
		/*
		Lista list = new Lista();
		
		for (int i = 0; i < 10; i++) {
			list.add(new Nodo(i));
		}
		
		//list.set(6, 67);
		//list.add(new Nodo(100),6);
		//list.add(new Nodo(100),6);
		//System.out.print(list.toString());
		//list.removeTodos(100);
		
		System.out.print(list.toString());
		*/
		
		ListaCircular listC = new ListaCircular();
		
		
		for (int i = 0; i < 10; i++) {
			listC.addLast(i);
		}
		
		System.out.println(listC.toString());
		
		listC.batataQuente(10);
		
		
		System.out.println(listC.toString());
		System.out.println("Tamanho: "+ listC.tamanho());
		System.out.println("Meio: "+ listC.imprimirMeio().getDado());
		
	}
}
