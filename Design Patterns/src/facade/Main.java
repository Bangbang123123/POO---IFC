package facade;

public class Main {

	public static void main(String[] args) {
		CarroFacade facade = new CarroFacade();
		facade.construirCarro("Gol","VW","1.0","Branco");
		System.out.println(facade.toString());
	}

}
