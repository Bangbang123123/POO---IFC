
public class Main {
	public static void main(String[] args) {
		Impressora imp = new Impressora();
		Documento doc = new Documento("Lorem Ipsum");
		
		imp.imprimir(doc);
	}

}
