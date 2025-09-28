package Pessoa;
public class PessoaMain {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Poggers","Rua X");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Poggers","Rua X","93845893467346","Casado");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Yummers","Rua X","82937598298032","Mecânica");
		System.out.println(pj);
	}
}
