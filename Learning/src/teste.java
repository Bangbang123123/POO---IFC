
public class teste {
	
	public static void main(String[] args) {
		Familia.setSobrenome("Curvêllo");
		
		Familia rodrigo = new Familia();
		rodrigo.setNome("Rodrigo");
		
		Familia iran = new Familia();
		iran.setNome("Iran");
		
		System.out.print(rodrigo.getNome() + " " + Familia.getSobrenome()
						+ "\n" + iran.getNome() + " " + Familia.getSobrenome());
		
		System.out.print("\nTeste conta: "+ Conta.soma(20,40));
	}
	
}
