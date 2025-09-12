
public class MainPinturas {

	public static void main(String[] args) {
		Cone cn = new Cone(6,8,1);
		System.out.print("Cone // Exemplo 1:\n"+ cn.toString());
		cn = new Cone(3.5,9,2);
		System.out.print("\n\n\n\nCone // Exemplo 2:\n"+ cn.toString());
		cn = new Cone(20,13.9,2);
		System.out.print("\n\n\n\nCone // Exemplo 3:\n"+ cn.toString());
		cn = new Cone(37.78,16.53,3);
		System.out.print("\n\n\n\nCone // Exemplo 4:\n"+ cn.toString());
		
		Cubo cb = new Cubo(4,2,1);
		System.out.print("\n\n\n\nCubo // Exemplo 1:\n"+ cb.toString());
		cb = new Cubo(13.56,1.5,3);
		System.out.print("\n\n\n\nCubo // Exemplo 2:\n"+ cb.toString());
		cb = new Cubo(107.45,12.5,2);
		System.out.print("\n\n\n\nCubo // Exemplo 3:\n"+ cb.toString());
		
		Piramide pi = new Piramide(13.89,41.87,3);
		System.out.print("\n\n\n\nPirâmide // Exemplo 1:\n"+ pi.toString());
		pi = new Piramide(3.56,23.18,1);
		System.out.print("\n\n\n\nPirâmide // Exemplo 2:\n"+ pi.toString());
		pi = new Piramide(85.34,56.09,2);
		System.out.print("\n\n\n\nPirâmide // Exemplo 3:\n"+ pi.toString());
		pi = new Piramide(8.56,5.79,1);
		System.out.print("\n\n\n\nPirâmide // Exemplo 4:\n"+ pi.toString());
		pi = new Piramide(1,2,1);
		System.out.print("\n\n\n\nPirâmide // Exemplo 5:\n"+ pi.toString());
		pi = new Piramide(10,10,3);
		System.out.print("\n\n\n\nPirâmide // Exemplo 6:\n"+ pi.toString());
		pi = new Piramide(1,10,1);
		System.out.print("\n\n\n\nPirâmide // Exemplo 7:\n"+ pi.toString());
		pi = new Piramide(10,1,2);
		System.out.print("\n\n\n\nPirâmide // Exemplo 8:\n"+ pi.toString());
	}

}
