
public class Main {

	public static void main(String[] args) {
		
		Comunicador com = Comunicador.getInstance();
		
		System.out.print(com.does_things());
		
		Comunicador com2 = Comunicador.getInstance();
		
		System.out.print(com2.does_things());
		
	}

}
