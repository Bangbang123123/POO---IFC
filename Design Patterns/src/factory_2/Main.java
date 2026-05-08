package factory_2;

public class Main {

	public static void main(String[] args) {
		CarroDirector carroDirector = new CarroDirector(new MarcaABuilder());
		carroDirector.construirCarro();
		Carro car1 = carroDirector.getCarro();
		
		carroDirector = new CarroDirector(new VolksBuilder());
		carroDirector.construirCarro();
		Carro car2 = carroDirector.getCarro();
		
		System.out.println(car1.toString() +"\n"+ car2.toString());

		
		Conexao abab = new Conexao().host(2900).porta(7000);
		
		Conexao abab2 = new Conexao();
		abab2.setHost(2900);
		abab2.setPorta(7000);
		
	}

}
