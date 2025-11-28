package order1;

public class MainPagamento {

	public static void main(String[] args) {
		FolhaPagamento fp = new FolhaPagamento(1520.80f);
		
		Estagiario e = new Estagiario();
		Desenvolvedor d = new Desenvolvedor();
		Analista a = new Analista();
		Gerente g = new Gerente();
		Funcionario[] funcionarios = {e,d,a,g};
		
		for (Funcionario func : funcionarios) {
			System.out.print("\nFunc: "+ func.calculaSalarioLiquido(fp.getSalarioBruto()));
		}
	}
}
