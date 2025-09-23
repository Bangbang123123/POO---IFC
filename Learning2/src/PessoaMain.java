
public class PessoaMain {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Poggers");
		System.out.println(p);;
		
		PessoaFisica pf = new PessoaFisica("Poggers","93845893467346");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Yummers","82937598298032");
		System.out.println(pj);
	}
}
